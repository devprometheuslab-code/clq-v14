#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
check_cashable.py
=================

Verifie en Python la meme logique que `Question.isCashable()` en Kotlin,
sur toutes les questions du projet, et affiche :
  - Combien de questions sont marquees NON cashables (CASH bloque)
  - Repartition par fichier
  - Echantillon des questions bloquees (pour validation manuelle)
  - Echantillon des reponses qui seraient OK mais qui ressemblent a un cas
    limite (pour detecter d'eventuels faux negatifs)

Usage : python check_cashable.py
"""

import re
from pathlib import Path
from collections import Counter, defaultdict

SCRIPT_DIR = Path(__file__).resolve().parent
EXPANSIONS = SCRIPT_DIR.parent / "app" / "src" / "main" / "java" / "com" / "prometheus" / "clq" / "data"

# === Reproduction des regex Kotlin de Question.isCashable() ===
NON_CASHABLE_PATTERNS = [
    # Quantite explicite
    re.compile(r"^tous les (deux|trois|quatre|cinq)\b"),
    re.compile(r"^toutes les (deux|trois|quatre|cinq)\b"),
    re.compile(r"^les (deux|trois|quatre|cinq)$"),
    # Reference aux autres options
    re.compile(r"^tous les (précédents|precedents|suivants|cités|cites|énoncés|enonces)\b"),
    re.compile(r"^toutes les (précédentes|precedentes|suivantes|citées|citees|énoncées|enoncees)\b"),
    re.compile(r"^tous ces (animaux|éléments|elements|exemples|choix|cas|points)\b"),
    re.compile(r"^toutes ces (réponses|reponses|propositions|options)\b"),
    # "Aucun" — strict pour ne pas bloquer "Aucune defaite en 300 matchs"
    re.compile(r"^aucun(e)?\s*$"),
    re.compile(r"^aucun(e)?\s+(de|des)\s+(ces|trois|deux|quatre|cinq|propositions|choix|réponses|reponses)\b"),
    re.compile(r"^aucun(e)?\s+(de|des)\s*$"),
    # Lettres
    re.compile(r"^[abcd] et [abcd]$"),
    re.compile(r"^[abcd], [abcd] et [abcd]$"),
    # Indetermines purs
    re.compile(r"^plusieurs( de ces| des)?\b"),
    re.compile(r"^toutes( ces| les)?$"),
    re.compile(r"^tous$"),
]


def is_cashable(correct_answer: str) -> bool:
    s = correct_answer.strip().lower()
    if not s:
        return False
    return not any(p.search(s) for p in NON_CASHABLE_PATTERNS)


# === Parser Kotlin (string-aware) — copie/colle leger du gros script ===

QUESTION_RE = re.compile(r"\bQuestion\s*\(")


def find_matching_paren(text, open_idx):
    depth = 0; i = open_idx; n = len(text); in_str = False
    while i < n:
        c = text[i]
        if in_str:
            if c == "\\" and i + 1 < n:
                i += 2; continue
            if c == '"': in_str = False
        else:
            if c == '"': in_str = True
            elif c == "(": depth += 1
            elif c == ")":
                depth -= 1
                if depth == 0: return i
        i += 1
    return -1


def split_args(s):
    out, cur = [], []
    depth = 0; in_str = False; i = 0; n = len(s)
    while i < n:
        c = s[i]
        if in_str:
            cur.append(c)
            if c == "\\" and i + 1 < n:
                cur.append(s[i+1]); i += 2; continue
            if c == '"': in_str = False
        else:
            if c == '"': in_str = True; cur.append(c)
            elif c in "([{": depth += 1; cur.append(c)
            elif c in ")]}": depth -= 1; cur.append(c)
            elif c == "," and depth == 0:
                out.append("".join(cur).strip()); cur = []
            else: cur.append(c)
        i += 1
    if cur: out.append("".join(cur).strip())
    return out


def kt_str(s):
    s = s.strip()
    if not (s.startswith('"') and s.endswith('"')): return s
    s = s[1:-1]
    return s.replace('\\"', '"').replace("\\\\", "\\")


def parse_listof(s):
    m = re.match(r"\s*listOf\s*\((.*)\)\s*", s, re.DOTALL)
    if not m: return []
    return [kt_str(p) for p in split_args(m.group(1))]


# === MAIN ===

def main():
    files = sorted(EXPANSIONS.glob("QuestionsExpansion*.kt"))
    total = 0
    blocked = 0
    blocked_by_file = Counter()
    blocked_samples = defaultdict(list)
    suspect_passes = []  # reponses qui ressemblent mais passent — a checker

    SUSPECT_RE = re.compile(r"^(tous|toutes|les|aucun|plusieurs)\b", re.IGNORECASE)

    for f in files:
        text = f.read_text(encoding="utf-8")
        for m in QUESTION_RE.finditer(text):
            close = find_matching_paren(text, m.end() - 1)
            if close < 0: continue
            args = split_args(text[m.end():close])
            if len(args) < 6: continue
            try:
                qid = int(args[0].strip())
                question = kt_str(args[1])
                answers = parse_listof(args[2])
                idx = int(args[3].strip())
            except Exception:
                continue
            if not (0 <= idx < len(answers)): continue
            correct = answers[idx]
            total += 1

            if not is_cashable(correct):
                blocked += 1
                blocked_by_file[f.name] += 1
                if len(blocked_samples[f.name]) < 3:
                    blocked_samples[f.name].append((qid, correct, question[:60]))
            else:
                # detecte les faux negatifs potentiels
                if SUSPECT_RE.match(correct):
                    suspect_passes.append((f.name, qid, correct, question[:60]))

    print(f"=== RAPPORT isCashable() ===")
    print(f"Total questions parsees     : {total}")
    print(f"Questions CASH bloquees     : {blocked} ({100*blocked/total:.1f}%)")
    print(f"Questions CASH disponibles  : {total - blocked}")
    print()
    print("=== Bloquees par fichier ===")
    for fname, n in sorted(blocked_by_file.items(), key=lambda x: -x[1]):
        print(f"  {fname:35s} {n:4d}")
    print()
    print("=== ECHANTILLON DE REPONSES BLOQUEES (CASH desactive) ===")
    for fname in sorted(blocked_samples.keys())[:6]:
        print(f"\n  -- {fname} --")
        for qid, correct, q in blocked_samples[fname]:
            print(f"    Q{qid}: «{correct}»  [Question: {q}...]")
    print()
    if suspect_passes:
        print(f"=== {len(suspect_passes)} CAS LIMITES (passent CASH mais commencent par tous/toutes/les/aucun/plusieurs) ===")
        print("    Verifie qu'aucun de ces cas ne devrait etre bloque :")
        for fname, qid, correct, q in suspect_passes[:30]:
            print(f"    Q{qid}: «{correct}»  [Q: {q}...]")
        if len(suspect_passes) > 30:
            print(f"    ... et {len(suspect_passes)-30} autres")
    else:
        print("=== Aucun cas limite detecte. ===")


if __name__ == "__main__":
    main()
