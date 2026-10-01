using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.IO.Compression;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Text.RegularExpressions;
using System.Web.Script.Serialization;

namespace CLQPC {
public class Question {
    public int id;
    public string text, category, difficulty, explanation;
    public List<string> answers;
    public int correctIndex;
}
public class Bank {
    public string version;
    public List<Question> questions;
    public Dictionary<string, List<string>> aliases;
    public static Bank Load() {
        using (var resource = Assembly.GetExecutingAssembly().GetManifestResourceStream("questions.gz"))
        using (var gzip = new GZipStream(resource, CompressionMode.Decompress))
        using (var reader = new StreamReader(gzip, Encoding.UTF8)) return Json.Read<Bank>(reader.ReadToEnd());
    }
}
public static class Json {
    public static JavaScriptSerializer Serializer() { return new JavaScriptSerializer { MaxJsonLength = 16000000, RecursionLimit = 100 }; }
    public static T Read<T>(string text) { return Serializer().Deserialize<T>(text); }
    public static string Write(object value) { return Serializer().Serialize(value); }
}
public class Player {
    public string name;
    public int score, correct, wrong, streak, bestStreak, streakBonus, combo, wheelPoints, spins;
    public string lastCategory;
    public int pv = 30;
    public int switches = 2, removes = 2, doubles = 1, freezes = 1, boosts = 1, chains = 1, risks = 1;
    public bool boost, chain, nextDouble, frozenQuestion;
    public Player() { }
    public Player(string value) { name = value; }
}
public class Session {
    public int version = 1;
    public string id = Guid.NewGuid().ToString();
    public List<Player> players = new List<Player>();
    public string mode = "Classique", category = "Toutes", phase = "difficulty", response, result, wheelResult, cashText = "";
    public int questionsPerPlayer = 10, timePerQuestion = 30, turn, playerIndex, removed = -1, pendingDamage, pendingSource;
    public List<int> used = new List<int>(), order = new List<int>(), duo = new List<int>();
    public Question question;
    public double remaining = 30, freezeRemaining;
    public bool paused, answered, doubled, tripled, resultCorrect;
    public int delta;
}
public class Records {
    public int games, questions, bestScore, bestStreak;
    public List<string> gameIds = new List<string>();
}
public class Store {
    readonly string directory;
    public Store(string path) { directory = path; }
    public T Load<T>(string name) where T : class {
        try { return Json.Read<T>(File.ReadAllText(Path.Combine(directory, name), Encoding.UTF8)); }
        catch (IOException) { return null; }
        catch (ArgumentException) { return null; }
        catch (InvalidOperationException) { return null; }
        catch (UnauthorizedAccessException) { return null; }
    }
    public bool Save(string name, object value) {
        try {
            Directory.CreateDirectory(directory);
            string path = Path.Combine(directory, name), temp = path + ".tmp";
            byte[] bytes = Encoding.UTF8.GetBytes(Json.Write(value));
            using (var stream = new FileStream(temp, FileMode.Create, FileAccess.Write, FileShare.None)) {
                stream.Write(bytes, 0, bytes.Length); stream.Flush(true);
            }
            if (File.Exists(path)) File.Replace(temp, path, path + ".bak"); else File.Move(temp, path);
            return true;
        } catch (IOException) { return false; } catch (UnauthorizedAccessException) { return false; }
    }
    public bool ClearGame() {
        try {
            foreach (string suffix in new[] { "", ".bak", ".tmp" }) {
                string path = Path.Combine(directory, "game.json" + suffix);
                if (File.Exists(path)) File.Delete(path);
            }
            return true;
        } catch (IOException) { return false; } catch (UnauthorizedAccessException) { return false; }
    }
}
public class Engine {
    public readonly Bank Bank;
    public Session Game;
    readonly Random random = new Random();
    public static readonly string[] Difficulties = { "EASY", "MEDIUM", "HARD", "EXPERT" };
    public static readonly string[] DifficultyNames = { "Facile", "Moyen", "Difficile", "Expert" };
    public static readonly int[,] Points = { { 1, 2, 3 }, { 2, 3, 5 }, { 3, 5, 8 }, { 5, 8, 12 } };
    public static readonly int[] Thresholds = { 8, 12, 16, 20, 25, 30, 36, 42, 50, 60, 72, 86, 100 };
    public Engine(Bank bank) { Bank = bank; }
    public Player Current { get { return Game.players[Game.playerIndex]; } }
    public int Total { get { return Game.players.Count * Game.questionsPerPlayer; } }
    public bool Finished { get { return Game.turn >= Total || (Game.mode == "Glou" && Game.players.Count(p => p.pv > 0) <= 1); } }
    public int Difficulty { get { return Math.Max(0, Array.IndexOf(Difficulties, Game.question.difficulty)); } }
    public bool Restore(Session saved) {
        if (saved == null || saved.version != 1 || saved.players == null || saved.players.Count < 1 || saved.players.Count > 6 ||
            saved.players.Any(p => p == null || String.IsNullOrWhiteSpace(p.name)) || saved.playerIndex < 0 || saved.playerIndex >= saved.players.Count ||
            saved.turn < 0 || saved.questionsPerPlayer < 5 || saved.questionsPerPlayer > 30 || saved.timePerQuestion < 10 || saved.timePerQuestion > 60 ||
            saved.order == null || saved.duo == null || saved.used == null || saved.remaining < 0 || saved.remaining > 60) return false;
        if (String.IsNullOrWhiteSpace(saved.id) || !new[] { "Classique", "Glou" }.Contains(saved.mode) ||
            !new[] { "difficulty", "question", "result", "targets" }.Contains(saved.phase) ||
            saved.turn > saved.players.Count * saved.questionsPerPlayer || Double.IsNaN(saved.remaining) || Double.IsInfinity(saved.remaining)) return false;
        if (saved.phase != "difficulty" && (saved.question == null || saved.question.answers == null ||
            saved.question.correctIndex < 0 || saved.question.correctIndex >= saved.question.answers.Count ||
            saved.order.Any(i => i < 0 || i >= saved.question.answers.Count))) return false;
        Game = saved; Game.paused = true; return true;
    }
    public bool Pick(string difficulty, bool switching) {
        var pool = Bank.questions.Where(q => (Game.category == "Toutes" || q.category == Game.category) && !Game.used.Contains(q.id)).ToList();
        var preferred = pool.Where(q => q.difficulty == difficulty).ToList();
        if (preferred.Count > 0) pool = preferred;
        if (pool.Count == 0) return false;
        Game.question = pool[random.Next(pool.Count)];
        Game.used.Add(Game.question.id);
        Game.order = Enumerable.Range(0, Game.question.answers.Count).OrderBy(i => random.Next()).ToList();
        Game.duo.Clear(); Game.response = null; Game.removed = -1;
        Game.phase = "question"; Game.answered = false; Game.paused = false; Game.cashText = "";
        Game.remaining = Game.timePerQuestion; Game.freezeRemaining = 0;
        if (!switching) { Game.doubled = false; Game.tripled = false; }
        return true;
    }
    public void Choose(string response) {
        if (Game.answered || Game.response != null) return;
        Game.response = response;
        if (response == "Duo") {
            int wrong = Game.order.First(i => i != Game.question.correctIndex && i != Game.removed);
            Game.duo = new[] { wrong, Game.question.correctIndex }.OrderBy(i => random.Next()).ToList();
        }
    }
    public bool Cashable() {
        string answer = Cash.Normalize(Game.question.answers[Game.question.correctIndex]);
        return !Regex.IsMatch(answer, @"^(tous|toutes|les deux|les trois|les quatre|aucun|aucune|plusieurs)($| )");
    }
    public void Answer(bool correct) {
        if (Game.answered) return;
        Player p = Current;
        int before = p.score, difficulty = Difficulty;
        Game.answered = true; Game.phase = "result"; Game.resultCorrect = correct;
        if (correct) {
            p.correct++; p.streak++; p.bestStreak = Math.Max(p.bestStreak, p.streak);
            p.combo = p.lastCategory == Game.question.category ? p.combo + 1 : 1;
            p.lastCategory = Game.question.category;
            int streak = p.streak >= 15 ? 15 : p.streak >= 10 ? 12 : p.streak >= 7 ? 8 : p.streak >= 5 ? 5 : p.streak >= 3 ? 2 : 0;
            int mode = Game.response == "Duo" ? 0 : Game.response == "Cash" ? 2 : 1;
            double combo = p.combo >= 4 ? 2 : p.combo == 3 ? 1.5 : p.combo == 2 ? 1.2 : 1;
            int points = (int)((Points[difficulty, mode] + streak) * combo);
            if (p.boost) { points = (int)(points * 1.5); p.boost = false; }
            if (Game.doubled || p.nextDouble) { points *= 2; p.nextDouble = false; }
            if (Game.tripled) points *= 3;
            p.score += points; p.streakBonus += streak;
            int previous = p.wheelPoints; p.wheelPoints += difficulty + 1;
            p.spins += Thresholds.Count(t => t > previous && t <= p.wheelPoints);
            if (Game.mode == "Glou") { Game.pendingDamage = difficulty + 1; Game.pendingSource = Game.playerIndex; }
            Game.result = "Bonne réponse !  +" + points + " points";
        } else {
            p.wrong++; p.combo = 0;
            if (p.chain) p.chain = false;
            else { p.streak = 0; p.score = Math.Max(0, p.score - p.streakBonus); p.streakBonus = 0; p.wheelPoints /= 2; }
            p.score = Math.Max(0, p.score - difficulty * (Game.tripled ? 3 : 1));
            if (Game.mode == "Glou") p.pv = Math.Max(0, p.pv - Math.Max(1, difficulty));
            Game.result = "Réponse : " + Game.question.answers[Game.question.correctIndex];
        }
        Game.delta = p.score - before;
    }
    public void ApplyDamage(int target) {
        if (Game.pendingDamage <= 0 || target == Game.pendingSource || target < 0 || target >= Game.players.Count || Game.players[target].pv <= 0) return;
        Game.players[target].pv = Math.Max(0, Game.players[target].pv - Game.pendingDamage); Game.pendingDamage = 0;
    }
    public void Advance() {
        if (!Game.answered || Game.pendingDamage > 0 || Current.spins > 0) return;
        Game.turn++;
        for (int attempt = 0; attempt < Game.players.Count; attempt++) {
            Game.playerIndex = (Game.playerIndex + 1) % Game.players.Count;
            if (Game.mode != "Glou" || Current.pv > 0) break;
        }
        Game.phase = "difficulty"; Game.question = null; Game.answered = false; Game.response = null;
        Game.doubled = false; Game.tripled = false; Game.duo.Clear(); Game.order.Clear(); Game.wheelResult = null;
    }
    public string Spin() {
        Player p = Current;
        if (p.spins <= 0) return "";
        p.spins--;
        switch (random.Next(7)) {
            case 0: p.score++; return "+1 point";
            case 1: p.score += 2; return "+2 points";
            case 2: p.nextDouble = true; return "Prochaine bonne réponse ×2";
            case 3: p.chain = true; return "Série protégée contre une erreur";
            case 4: p.freezes++; return "Un bonus Freeze supplémentaire";
            case 5: if (Game.mode == "Glou") { p.pv = Math.Min(30, p.pv + 5); return "+5 PV"; } p.boost = true; return "Boost ×1,5 sur la prochaine réussite";
            default: p.switches++; return "Un changement de question supplémentaire";
        }
    }
    public List<Player> Ranking() {
        return Game.mode == "Glou" ? Game.players.OrderByDescending(p => p.pv > 0).ThenByDescending(p => p.pv).ThenByDescending(p => p.score).ToList() :
            Game.players.OrderByDescending(p => p.score).ToList();
    }
}
public static class Cash {
    static readonly HashSet<string> Articles = new HashSet<string>(new[] { "le", "la", "les", "l", "un", "une", "des", "de", "du", "d" });
    static readonly Regex Numbers = new Regex(@"[+-]?\d+(?:[.,]\d+)?");
    public static string Normalize(string text) {
        var builder = new StringBuilder();
        foreach (char c in text.ToLowerInvariant().Replace("œ", "oe").Replace("æ", "ae").Normalize(NormalizationForm.FormKD))
            if (CharUnicodeInfo.GetUnicodeCategory(c) != UnicodeCategory.NonSpacingMark) builder.Append(c);
        return Regex.Replace(builder.ToString(), "[^a-z0-9]+", " ").Trim();
    }
    static string Core(string text) { return Regex.Replace(text, @"\s+\([^)]*\)|\s+\[[^]]*\]", " ").Trim(); }
    static string[] Values(string text) {
        text = Regex.Replace(text, @"(?<=\d)[ \u00a0\u202f](?=\d{3}\b)", "");
        return Numbers.Matches(text).Cast<Match>().Select(m => {
            decimal value; return Decimal.TryParse(m.Value.Replace(',', '.'), NumberStyles.AllowLeadingSign | NumberStyles.AllowDecimalPoint,
                CultureInfo.InvariantCulture, out value) ? value.ToString("G29", CultureInfo.InvariantCulture) : m.Value;
        }).ToArray();
    }
    static string[] Words(string text) {
        text = Regex.Replace(Core(text), @"(?i)^\s*(je pense que|c['’]est|la reponse est)\s+", "");
        return Normalize(text).Split(' ').Where(w => w.Length > 0 && !Articles.Contains(w)).ToArray();
    }
    static int Distance(string a, string b) {
        int[] previous = Enumerable.Range(0, b.Length + 1).ToArray();
        for (int i = 0; i < a.Length; i++) {
            int[] current = new int[b.Length + 1]; current[0] = i + 1;
            for (int j = 0; j < b.Length; j++) current[j + 1] = Math.Min(Math.Min(current[j] + 1, previous[j + 1] + 1), previous[j] + (a[i] == b[j] ? 0 : 1));
            previous = current;
        }
        return previous[b.Length];
    }
    public static bool Matches(string input, string correct, Dictionary<string, List<string>> aliases, IEnumerable<string> wrong) {
        if (String.IsNullOrWhiteSpace(input) || input.Length > 256 || Normalize(input).Length == 0) return false;
        var candidates = new List<string> { correct };
        foreach (var group in aliases) if (Normalize(group.Key) == Normalize(Core(correct))) candidates.AddRange(group.Value);
        if (wrong.Any(w => Normalize(w) == Normalize(input)) && !candidates.Any(c => Normalize(c) == Normalize(input))) return false;
        foreach (string candidate in candidates) {
            if (!Values(Core(input)).SequenceEqual(Values(Core(candidate)))) continue;
            string[] a = Words(input), b = Words(candidate);
            if (a.Length == 0 || b.Length == 0) continue;
            if (a.SequenceEqual(b)) return true;
            if (Values(Core(candidate)).Length > 0 && Numbers.Replace(Core(candidate), "").Trim().Length == 0) return true;
            if (a.Length != b.Length) continue;
            bool matched = true;
            for (int i = 0; i < a.Length; i++) {
                if (a[i] == b[i]) continue;
                int tolerance = Math.Min(a[i].Length, b[i].Length) < 4 ? 0 : b[i].Length < 9 ? 1 : 2;
                if (a[i].Any(Char.IsDigit) || b[i].Any(Char.IsDigit) || Distance(a[i], b[i]) > tolerance) { matched = false; break; }
            }
            if (matched) return true;
        }
        return false;
    }
}
}
