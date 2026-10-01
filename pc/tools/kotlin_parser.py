"""Parser retained from the project audit for the shared question bank."""
import re, unicodedata

def read_str(s, i):
    assert s[i] == '"', (s[i:i+30])
    i += 1; out = []
    while True:
        c = s[i]
        if c == '\\':
            n = s[i+1]
            if n == 'u':
                out.append(chr(int(s[i+2:i+6], 16))); i += 6; continue
            out.append({'n': '\n', 't': '\t', '"': '"', '\\': '\\', '$': '$', "'": "'"}.get(n, n)); i += 2; continue
        if c == '"':
            return ''.join(out), i+1
        out.append(c); i += 1

def skip_ws(s, i):
    while s[i] in ' \t': i += 1
    return i

def expect(s, i, tok):
    i = skip_ws(s, i)
    assert s.startswith(tok, i), (tok, s[i:i+40])
    return i + len(tok)

def parse_line(line):
    m = re.match(r'^(\s*)Question\(\s*(\d+)\s*,', line)
    assert m, line[:80]
    indent, qid = m.group(1), int(m.group(2))
    i = m.end(); i = skip_ws(line, i)
    text, i = read_str(line, i)
    i = expect(line, i, ','); i = expect(line, i, 'listOf(')
    answers = []
    while True:
        i = skip_ws(line, i)
        if line[i] == ')': i += 1; break
        a, i = read_str(line, i); answers.append(a)
        i = skip_ws(line, i)
        if line[i] == ',': i += 1
    i = expect(line, i, ',')
    i = skip_ws(line, i); m2 = re.match(r'(\d+)', line[i:]); ci = int(m2.group(1)); i += len(m2.group(1))
    i = expect(line, i, ','); i = skip_ws(line, i)
    cat, i = read_str(line, i)
    i = expect(line, i, ','); i = expect(line, i, 'Difficulty.')
    m3 = re.match(r'([A-Z]+)', line[i:]); diff = m3.group(1); i += len(diff)
    expl = None
    i = skip_ws(line, i)
    if line.startswith(', explanation =', i) or line.startswith(',explanation =', i):
        i = line.index('=', i) + 1; i = skip_ws(line, i)
        expl, i = read_str(line, i)
    i = expect(line, i, ')')
    tail = line[i:]
    return dict(indent=indent, id=qid, text=text, answers=answers, correctIndex=ci, category=cat,
                difficulty=diff, explanation=expl, tail=tail)

def norm(s):
    s = unicodedata.normalize('NFD', s.lower())
    s = ''.join(c for c in s if unicodedata.category(c) != 'Mn')
    return re.sub(r'[^a-z0-9]+', ' ', s).strip()