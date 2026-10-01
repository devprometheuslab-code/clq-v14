"""Export the playable French Android bank and its Cash aliases for the Windows app."""
import gzip
import json
import re
import runpy
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
DATA = ROOT / "app/src/main/java/com/prometheus/clq/data"
sys.dont_write_bytecode = True
helpers = runpy.run_path(str(Path(__file__).with_name("kotlin_parser.py")))
parse_line, norm, read_str = (helpers[k] for k in ("parse_line", "norm", "read_str"))
source = (DATA / "QuestionBank.kt").read_text(encoding="utf-8")
category_block = source.split("private val categoryAliases", 1)[1].split("private fun normalizeKey", 1)[0]
categories = dict(re.findall(r'"([^"]+)"\s+to\s+"([^"]+)"', category_block))
questions, seen = [], set()
files = [DATA / "QuestionBank.kt"] + [DATA / f"QuestionsExpansion{i}.kt" for i in range(1, 22)]
for path in files:
    for line in path.read_text(encoding="utf-8").splitlines():
        if not re.match(r"\s*Question\(\d+", line):
            continue
        q = parse_line(line)
        if len(q["answers"]) < 2 or q["correctIndex"] not in range(len(q["answers"])):
            continue
        key = norm(q["text"])
        if key in seen:
            continue
        seen.add(key)
        q["category"] = categories.get(q["category"], q["category"])
        item = {k: q[k] for k in ("id", "text", "answers", "correctIndex", "category", "difficulty", "explanation")}
        item["sourceId"] = item["id"]
        item["id"] = len(questions) + 1
        questions.append(item)
aliases = {}
for line in (DATA / "CashAliases.kt").read_text(encoding="utf-8").splitlines():
    if " to listOf(" not in line:
        continue
    key, end = read_str(line, line.index('"'))
    rest = line[line.index("listOf(", end) + 7:]
    values = []
    while '"' in rest:
        value, end = read_str(rest, rest.index('"'))
        values.append(value)
        rest = rest[end:]
    aliases[key] = values
assert len(questions) == 9667, len(questions)
assert len({q["category"] for q in questions}) == 17
payload = {"version": "v14.2", "questions": questions, "aliases": aliases}
out = ROOT / "pc/data"
out.mkdir(parents=True, exist_ok=True)
raw = json.dumps(payload, ensure_ascii=False, separators=(",", ":")).encode("utf-8")
(out / "questions.json.gz").write_bytes(gzip.compress(raw, mtime=0))
print(f"Exported {len(questions)} questions, 17 categories, {len(aliases)} alias groups")
