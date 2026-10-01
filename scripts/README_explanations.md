# Generateur d'explications CLQ

Genere une explication courte pour chaque `Question(...)` des fichiers
`QuestionsExpansion*.kt` via DeepSeek ou Claude, et injecte le champ
`explanation = "..."` directement dans le code Kotlin.

## Volume actuel

**8 063 questions** reparties sur 21 fichiers `QuestionsExpansion*.kt`.

## Installation

```bash
pip install requests tqdm
```

Les clés sont lues depuis les variables d’environnement `DEEPSEEK_API_KEY`
et `ANTHROPIC_API_KEY`. Configurer uniquement celle du fournisseur utilisé
dans la session locale. Ne jamais mettre une clé réelle dans le code ou
dans un fichier destiné au dépôt public.

## Architecture du script

Le script tourne en **3 phases** :

1. **PARSE** : on lit tous les fichiers, on detecte chaque `Question(...)`
   et on liste celles qui n'ont pas encore d'`explanation`.
2. **GENERATE** : on appelle l'API en **parallele** (8 workers par defaut).
   Le cache JSON est sauve toutes les 20 reponses, donc Ctrl+C est safe.
3. **WRITE** : on reecrit chaque fichier source en injectant les
   explications a la fin de chaque constructeur `Question(...)`.

## Workflow recommande

### 1. Test sec (0 appel API, 0 ecriture)

Permet de voir ce qui sera fait + l'estimation cout/duree :

```bash
cd D:\Prometheus\Projects\ChampionLeagueQuizz\CLQ_v11\scripts
python generate_explanations.py --all --dry-run
```

Tu devrais voir un truc du genre :
```
[PARSE] 8063 Question(...) sans explanation detectees
[TODO]  8063 explications a appeler via l'API
[ESTIM] Cout approximatif : ~$1.05 (deepseek)
[ESTIM] Duree approximative : ~25.0 min (8 workers)
```

### 2. Run de validation sur 20 questions

Pour verifier la qualite avant de tout lancer :

```bash
python generate_explanations.py --file QuestionsExpansion1.kt --limit 20
```

Ouvre `app/src/main/java/com/prometheus/clq/data/QuestionsExpansion1.kt`
et regarde les explications ajoutees. Si le ton ne te plait pas, modifie
`SYSTEM_PROMPT` dans le script avant le run final.

Pour tout annuler proprement, restaure le `.bak` :
```powershell
Get-ChildItem app\src\main\java\com\prometheus\clq\data\QuestionsExpansion*.kt.bak |
  ForEach-Object { Move-Item $_.FullName $_.FullName.Replace('.bak','') -Force }
```

Et vide le cache :
```bash
del scripts\cache\explanations.json
```

### 3. Run complet

```bash
python generate_explanations.py --all
```

Avec **8 workers**, compte ~25 min pour 8000 questions.
Avec **16 workers** (`--workers 16`), ~12 min.

## Reprise apres Ctrl+C

Le cache est sauve toutes les 20 reponses, atomic-write
(`scripts/cache/explanations.json`). Tu peux Ctrl+C puis relancer la meme
commande, le script reprendra ou il en etait.

Si tu as deja genere les explications et que tu veux juste reecrire les
fichiers a partir du cache (sans aucun appel API) :

```bash
python generate_explanations.py --all --write-only
```

## Choix du provider

| Provider   | Cout total estime | Vitesse | Qualite     |
|------------|-------------------|---------|-------------|
| `deepseek` | ~$1               | rapide  | tres bon    |
| `claude`   | ~$3.5             | moyen   | excellent   |

```bash
# Defaut DeepSeek :
python generate_explanations.py --all

# Claude Haiku 3.5 si tu veux le top de la qualite :
python generate_explanations.py --all --provider claude
```

## Securites

- Backup `.bak` cree pour chaque fichier modifie (sauf si `--no-backup`)
- Si une question a deja `explanation = "..."`, on n'y touche pas
- Le parser respecte les chaines/escapes Kotlin (pas une regex naive)
- Atomic write du cache (tmp + rename) — pas de cache corrompu meme si crash
- Retries exponentiels sur 429 / 5xx
- Les questions qui plantent au parsing sont skippees, pas de crash

## Restaurer les `.bak`

PowerShell :
```powershell
cd D:\Prometheus\Projects\ChampionLeagueQuizz\CLQ_v11\app\src\main\java\com\prometheus\clq\data
Get-ChildItem QuestionsExpansion*.kt.bak | ForEach-Object {
    Move-Item $_.FullName $_.FullName.Replace('.bak','') -Force
}
```

Bash :
```bash
cd app/src/main/java/com/prometheus/clq/data
for f in QuestionsExpansion*.kt.bak; do mv "$f" "${f%.bak}"; done
```

## Tweak du prompt

Si les explications generees sont trop longues / trop techniques / pas
assez fun, modifie `SYSTEM_PROMPT` en haut du script. Vide ensuite le
cache et relance, sinon les anciennes explications seront reutilisees :

```bash
del scripts\cache\explanations.json
python generate_explanations.py --all
```
