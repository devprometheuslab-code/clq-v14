#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
generate_explanations.py
========================

Genere des explications courtes pour les ~8000 Questions du projet CLQ_v11
via DeepSeek (par defaut) ou Claude, et les injecte directement dans les
fichiers QuestionsExpansion*.kt sous la forme d'un champ
`explanation = "..."`.

Le script tourne en 3 phases :
  1) PARSE : on detecte toutes les Question(...) et on liste celles qui
     n'ont pas encore d'explication (cache + code source).
  2) GENERATE : on appelle l'API en PARALLELE (8 workers par defaut).
     Le cache est sauve regulierement, donc Ctrl+C est safe.
  3) WRITE   : on reecrit chaque fichier en injectant les explications.

Usage :
    pip install requests tqdm

    # Test sec, 0 appel API, 0 ecriture :
    python generate_explanations.py --all --dry-run

    # 20 questions reelles pour valider la qualite avant de tout lancer :
    python generate_explanations.py --file QuestionsExpansion1.kt --limit 20

    # Run complet (~10-15 min en parallele) :
    python generate_explanations.py --all

    # Vitesse max (DeepSeek payant accepte beaucoup) :
    python generate_explanations.py --all --workers 16

    # Reprise apres Ctrl+C : il suffit de relancer la meme commande,
    # le cache evite de regenerer ce qui est deja fait.
"""

import argparse
import json
import os
import re
import sys
import threading
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from dataclasses import dataclass, field
from pathlib import Path
from typing import List, Optional

try:
    import requests
except ImportError:
    print("[ERREUR] Module 'requests' manquant. Installe : pip install requests tqdm")
    sys.exit(1)

try:
    from tqdm import tqdm
except ImportError:
    print("[WARN] Module 'tqdm' manquant — pas de barre de progression. (pip install tqdm)")
    def tqdm(iterable, **kwargs):
        return iterable


# ============================================================
#                   CONFIG
# ============================================================

DEEPSEEK_API_KEY = os.environ.get("DEEPSEEK_API_KEY", "")
DEEPSEEK_URL = "https://api.deepseek.com/chat/completions"
DEEPSEEK_MODEL = "deepseek-chat"

CLAUDE_API_KEY = os.environ.get("ANTHROPIC_API_KEY", "")
CLAUDE_URL = "https://api.anthropic.com/v1/messages"
CLAUDE_MODEL = "claude-3-5-haiku-20241022"

SCRIPT_DIR = Path(__file__).resolve().parent
PROJECT_ROOT = SCRIPT_DIR.parent
EXPANSIONS_DIR = PROJECT_ROOT / "app" / "src" / "main" / "java" / "com" / "prometheus" / "clq" / "data"
CACHE_DIR = SCRIPT_DIR / "cache"
CACHE_FILE = CACHE_DIR / "explanations.json"

MAX_RETRIES = 4
SAVE_CACHE_EVERY = 20  # nombre d'explications generees avant chaque save


# ============================================================
#                   PROMPT
# ============================================================

SYSTEM_PROMPT = (
    "Tu es un assistant qui ecrit des explications COURTES et factuelles "
    "pour un jeu de quiz francais. Style : 1 a 2 phrases maximum, ton "
    "naturel, factuel, sans introduction ni conclusion, sans guillemets. "
    "Ne reformule pas la question, donne juste le contexte/le pourquoi de "
    "la bonne reponse. Pas d'emojis. Maximum 280 caracteres."
)


def build_user_prompt(question_text: str, correct_answer: str, category: str) -> str:
    return (
        f"Question (categorie : {category}) :\n"
        f"{question_text}\n\n"
        f"Bonne reponse : {correct_answer}\n\n"
        "Ecris une explication courte (1 a 2 phrases) qui contextualise cette "
        "bonne reponse. N'ecris rien d'autre que l'explication."
    )


# ============================================================
#                   API CALLS
# ============================================================

def _call_deepseek(question_text: str, correct_answer: str, category: str) -> str:
    headers = {
        "Authorization": f"Bearer {DEEPSEEK_API_KEY}",
        "Content-Type": "application/json",
    }
    payload = {
        "model": DEEPSEEK_MODEL,
        "messages": [
            {"role": "system", "content": SYSTEM_PROMPT},
            {"role": "user", "content": build_user_prompt(question_text, correct_answer, category)},
        ],
        "temperature": 0.5,
        "max_tokens": 200,
    }
    r = requests.post(DEEPSEEK_URL, headers=headers, json=payload, timeout=60)
    r.raise_for_status()
    return r.json()["choices"][0]["message"]["content"].strip()


def _call_claude(question_text: str, correct_answer: str, category: str) -> str:
    headers = {
        "x-api-key": CLAUDE_API_KEY,
        "anthropic-version": "2023-06-01",
        "Content-Type": "application/json",
    }
    payload = {
        "model": CLAUDE_MODEL,
        "system": SYSTEM_PROMPT,
        "max_tokens": 200,
        "messages": [
            {"role": "user", "content": build_user_prompt(question_text, correct_answer, category)},
        ],
    }
    r = requests.post(CLAUDE_URL, headers=headers, json=payload, timeout=60)
    r.raise_for_status()
    return r.json()["content"][0]["text"].strip()


def call_api_with_retry(provider: str, question_text: str, correct_answer: str, category: str) -> Optional[str]:
    """Appel avec retries exponentiels. Renvoie None si echec definitif."""
    fn = _call_deepseek if provider == "deepseek" else _call_claude
    for attempt in range(MAX_RETRIES):
        try:
            text = fn(question_text, correct_answer, category)
            return clean_explanation(text)
        except requests.HTTPError as e:
            status = e.response.status_code if e.response is not None else 0
            # 429/5xx => retry avec backoff
            if status == 429 or 500 <= status < 600:
                wait = (2 ** attempt) + 0.5
                time.sleep(wait)
                continue
            # autre erreur HTTP => abandon
            return None
        except Exception:
            wait = (2 ** attempt) + 0.5
            time.sleep(wait)
    return None


def clean_explanation(text: str) -> str:
    text = text.strip()
    if (text.startswith('"') and text.endswith('"')) or (text.startswith("«") and text.endswith("»")):
        text = text[1:-1].strip()
    text = re.sub(r"\s+", " ", text)
    if len(text) > 400:
        text = text[:397] + "..."
    return text


# ============================================================
#                   PARSER KOTLIN (string-aware)
# ============================================================

QUESTION_START_RE = re.compile(r"\bQuestion\s*\(")


def find_matching_paren(text: str, open_idx: int) -> int:
    """Index de la ')' fermante associee a '(' a `open_idx`. Gere les chaines."""
    depth = 0
    i = open_idx
    n = len(text)
    in_string = False
    while i < n:
        c = text[i]
        if in_string:
            if c == "\\" and i + 1 < n:
                i += 2
                continue
            if c == '"':
                in_string = False
        else:
            if c == '"':
                in_string = True
            elif c == "(":
                depth += 1
            elif c == ")":
                depth -= 1
                if depth == 0:
                    return i
        i += 1
    return -1


def split_top_level_args(args_text: str) -> List[str]:
    args = []
    current = []
    depth = 0
    in_string = False
    i = 0
    n = len(args_text)
    while i < n:
        c = args_text[i]
        if in_string:
            current.append(c)
            if c == "\\" and i + 1 < n:
                current.append(args_text[i + 1])
                i += 2
                continue
            if c == '"':
                in_string = False
        else:
            if c == '"':
                in_string = True
                current.append(c)
            elif c in "([{":
                depth += 1
                current.append(c)
            elif c in ")]}":
                depth -= 1
                current.append(c)
            elif c == "," and depth == 0:
                args.append("".join(current).strip())
                current = []
            else:
                current.append(c)
        i += 1
    if current:
        args.append("".join(current).strip())
    return args


def kotlin_string_to_python(s: str) -> str:
    s = s.strip()
    if not (s.startswith('"') and s.endswith('"')):
        return s
    s = s[1:-1]
    s = s.replace('\\"', '"').replace("\\\\", "\\").replace("\\n", "\n").replace("\\t", "\t")
    return s


def python_to_kotlin_string(s: str) -> str:
    s = s.replace("\\", "\\\\").replace('"', '\\"').replace("\n", " ").replace("\r", " ")
    return f'"{s}"'


def parse_listof(args_text: str) -> List[str]:
    m = re.match(r"\s*listOf\s*\((.*)\)\s*", args_text, re.DOTALL)
    if not m:
        return []
    return [kotlin_string_to_python(p) for p in split_top_level_args(m.group(1))]


# ============================================================
#                   DATACLASSES
# ============================================================

@dataclass
class QuestionRef:
    """Une Question detectee dans un fichier source."""
    file_path: Path
    start: int          # position du 'Q' de Question(
    open_paren: int
    close_paren: int
    qid: int
    question_text: str
    correct_answer: str
    category: str


@dataclass
class FileWork:
    """Travail a faire pour un fichier (positions a injecter)."""
    file_path: Path
    original_text: str
    refs: List[QuestionRef] = field(default_factory=list)


# ============================================================
#                   PHASE 1 : PARSE
# ============================================================

def parse_file(file_path: Path) -> FileWork:
    text = file_path.read_text(encoding="utf-8")
    work = FileWork(file_path=file_path, original_text=text)

    for m in QUESTION_START_RE.finditer(text):
        open_paren = m.end() - 1
        close_paren = find_matching_paren(text, open_paren)
        if close_paren < 0:
            continue

        args_text = text[open_paren + 1 : close_paren]
        args = split_top_level_args(args_text)
        if len(args) < 6:
            continue

        # Skip si une explanation est deja la
        if any(re.match(r"\s*explanation\s*=", a) for a in args):
            continue

        try:
            qid = int(args[0].strip())
            question_text = kotlin_string_to_python(args[1])
            answers = parse_listof(args[2])
            correct_index = int(args[3].strip())
            category = kotlin_string_to_python(args[4])
        except Exception:
            continue

        if not (0 <= correct_index < len(answers)):
            continue

        work.refs.append(QuestionRef(
            file_path=file_path,
            start=m.start(),
            open_paren=open_paren,
            close_paren=close_paren,
            qid=qid,
            question_text=question_text,
            correct_answer=answers[correct_index],
            category=category,
        ))

    return work


# ============================================================
#                   PHASE 2 : GENERATE EN PARALLELE
# ============================================================

def generate_all(
    refs_to_do: List[QuestionRef],
    cache: dict,
    cache_lock: threading.Lock,
    provider: str,
    workers: int,
) -> int:
    """Genere les explications manquantes en parallele. Retourne le nb de succes."""
    if not refs_to_do:
        return 0

    success = 0
    fail = 0
    save_counter = 0

    def task(ref: QuestionRef):
        return ref, call_api_with_retry(provider, ref.question_text, ref.correct_answer, ref.category)

    with ThreadPoolExecutor(max_workers=workers) as pool:
        futures = [pool.submit(task, r) for r in refs_to_do]

        with tqdm(total=len(refs_to_do), desc="API calls", unit="q") as pbar:
            for fut in as_completed(futures):
                ref, expl = fut.result()
                pbar.update(1)
                if expl is None:
                    fail += 1
                    continue
                with cache_lock:
                    cache[str(ref.qid)] = expl
                    success += 1
                    save_counter += 1
                    if save_counter >= SAVE_CACHE_EVERY:
                        save_cache(cache)
                        save_counter = 0

    # Sauvegarde finale
    with cache_lock:
        save_cache(cache)

    print(f"[GEN] {success} reussites — {fail} echecs")
    return success


# ============================================================
#                   PHASE 3 : INJECTION DANS LES FICHIERS
# ============================================================

def write_file(work: FileWork, cache: dict, dry_run: bool, backup: bool) -> int:
    """Reecrit le fichier en injectant les explications. Retourne nb d'injections."""
    if not work.refs:
        return 0

    text = work.original_text
    # On injecte de la fin vers le debut pour preserver les offsets
    sorted_refs = sorted(work.refs, key=lambda r: r.close_paren, reverse=True)

    injected = 0
    for ref in sorted_refs:
        expl = cache.get(str(ref.qid))
        if not expl:
            continue
        injection = f", explanation = {python_to_kotlin_string(expl)}"
        text = text[: ref.close_paren] + injection + text[ref.close_paren :]
        injected += 1

    if injected == 0:
        return 0

    if dry_run:
        print(f"  [DRY-RUN] {work.file_path.name}: {injected} injections (rien ecrit)")
        return injected

    if backup:
        backup_path = work.file_path.with_suffix(work.file_path.suffix + ".bak")
        if not backup_path.exists():
            backup_path.write_text(work.original_text, encoding="utf-8")

    work.file_path.write_text(text, encoding="utf-8")
    print(f"  [OK] {work.file_path.name}: {injected} injections")
    return injected


# ============================================================
#                   CACHE
# ============================================================

def load_cache() -> dict:
    if CACHE_FILE.exists():
        try:
            return json.loads(CACHE_FILE.read_text(encoding="utf-8"))
        except json.JSONDecodeError:
            print("[WARN] Cache corrompu, on repart de zero.")
    return {}


def save_cache(cache: dict) -> None:
    CACHE_DIR.mkdir(parents=True, exist_ok=True)
    tmp = CACHE_FILE.with_suffix(".tmp")
    tmp.write_text(json.dumps(cache, ensure_ascii=False, indent=2), encoding="utf-8")
    tmp.replace(CACHE_FILE)


# ============================================================
#                   ESTIMATION
# ============================================================

def print_estimate(n_to_generate: int, provider: str, workers: int) -> None:
    """Estime cout + duree pour le batch."""
    if n_to_generate == 0:
        return

    # Tokens approximatifs : ~150 input + ~80 output par question
    in_tok = n_to_generate * 150
    out_tok = n_to_generate * 80

    # Tarifs ($/1M tokens) — approximatif, novembre 2024
    if provider == "deepseek":
        cost = (in_tok / 1e6) * 0.27 + (out_tok / 1e6) * 1.10
    else:  # claude haiku 3.5
        cost = (in_tok / 1e6) * 0.80 + (out_tok / 1e6) * 4.00

    # Duree : ~1.5s par appel / workers
    duration_min = (n_to_generate * 1.5) / max(workers, 1) / 60

    print(f"[ESTIM] {n_to_generate} questions a generer")
    print(f"[ESTIM] Cout approximatif : ~${cost:.2f} ({provider})")
    print(f"[ESTIM] Duree approximative : ~{duration_min:.1f} min ({workers} workers)")


# ============================================================
#                   MAIN
# ============================================================

def main():
    p = argparse.ArgumentParser(description="Generation batch d'explications CLQ.")
    p.add_argument("--file", help="Un seul fichier (ex: QuestionsExpansion1.kt)")
    p.add_argument("--all", action="store_true", help="Tous les QuestionsExpansion*.kt")
    p.add_argument("--provider", choices=["deepseek", "claude"], default="deepseek")
    p.add_argument("--workers", type=int, default=8, help="Nb de threads parallele (defaut 8)")
    p.add_argument("--dry-run", action="store_true", help="Ne fait AUCUN appel API ni ecriture")
    p.add_argument("--limit", type=int, help="Limite le nb total de questions traitees (test)")
    p.add_argument("--no-backup", action="store_true", help="Pas de fichier .bak")
    p.add_argument("--write-only", action="store_true",
                   help="Saute la phase API, n'utilise QUE le cache pour reecrire les fichiers")
    args = p.parse_args()

    if not args.file and not args.all:
        print("[ERREUR] Specifie --file <nom> ou --all")
        sys.exit(1)

    if not args.dry_run and not args.write_only:
        key = DEEPSEEK_API_KEY if args.provider == "deepseek" else CLAUDE_API_KEY
        if not key.strip():
            variable = "DEEPSEEK_API_KEY" if args.provider == "deepseek" else "ANTHROPIC_API_KEY"
            print(f"[ERREUR] Configure la variable locale {variable} avant la generation.")
            sys.exit(1)

    # Liste des fichiers
    if args.all:
        files = sorted(EXPANSIONS_DIR.glob("QuestionsExpansion*.kt"))
    else:
        f = EXPANSIONS_DIR / args.file
        if not f.exists():
            print(f"[ERREUR] Fichier introuvable : {f}")
            sys.exit(1)
        files = [f]

    print(f"[INFO] Provider : {args.provider}")
    print(f"[INFO] Workers  : {args.workers}")
    print(f"[INFO] Fichiers : {len(files)}")
    print(f"[INFO] Dry-run  : {args.dry_run}")
    print(f"[INFO] Cache    : {CACHE_FILE}")
    print()

    cache = load_cache()
    cache_lock = threading.Lock()
    print(f"[CACHE] {len(cache)} entrees deja generees")

    # === PHASE 1 : PARSE ===
    print()
    print("=== PHASE 1 : PARSE ===")
    works = []
    total_refs = 0
    for f in tqdm(files, desc="Parsing", unit="file"):
        w = parse_file(f)
        works.append(w)
        total_refs += len(w.refs)
    print(f"[PARSE] {total_refs} Question(...) sans explanation detectees")

    # Refs a generer = celles non presentes dans le cache
    refs_to_do = []
    for w in works:
        for r in w.refs:
            if str(r.qid) not in cache:
                refs_to_do.append(r)

    if args.limit:
        refs_to_do = refs_to_do[: args.limit]
        print(f"[LIMIT] On limite a {args.limit} questions")

    print(f"[TODO] {len(refs_to_do)} explications a appeler via l'API")
    print(f"[SKIP] {total_refs - len(refs_to_do)} deja en cache (rien a faire)")
    print()

    print_estimate(len(refs_to_do), args.provider, args.workers)
    print()

    if args.dry_run:
        print("[DRY-RUN] Pas d'appel API, pas d'ecriture. Fin.")
        return

    # === PHASE 2 : GENERATE ===
    if not args.write_only and refs_to_do:
        print("=== PHASE 2 : GENERATE (parallele) ===")
        t0 = time.time()
        generate_all(refs_to_do, cache, cache_lock, args.provider, args.workers)
        elapsed = time.time() - t0
        print(f"[GEN] Termine en {elapsed/60:.1f} min")
        print()

    # === PHASE 3 : WRITE ===
    print("=== PHASE 3 : WRITE ===")
    total_inj = 0
    for w in works:
        n = write_file(w, cache, dry_run=False, backup=not args.no_backup)
        total_inj += n

    print()
    print(f"[FINI] {total_inj} explications injectees dans {len(files)} fichiers.")
    print(f"[CACHE] {len(cache)} entrees au total dans {CACHE_FILE.name}")


if __name__ == "__main__":
    main()
