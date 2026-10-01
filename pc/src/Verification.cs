using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace CLQPC {
public static class Verification {
    static List<string> checks = new List<string>();
    static void Check(bool passed, string name) { if (!passed) throw new Exception("FAIL: " + name); checks.Add("PASS: " + name); }
    static Engine Sample(Bank bank, string mode, string difficulty, string response) {
        var e = new Engine(bank); e.Game = new Session { mode = mode, players = new List<Player> { new Player("Éloïse | test"), new Player("Quentin") }, questionsPerPlayer = 5 };
        e.Pick(difficulty, false); e.Game.question = new Question { id = 1, text = "Capitale ?", answers = new List<string> { "Paris", "Lyon", "Lille", "Nice" }, correctIndex = 0, category = "Test", difficulty = difficulty };
        e.Game.order = new List<int> { 2, 0, 3, 1 }; e.Choose(response); return e;
    }
    public static int Run(Bank bank, string output) {
        try {
            Check(bank.questions.Count == 9667, "Same 9667 playable questions as Android");
            Check(bank.questions.Select(q => q.category).Distinct().Count() == 17, "17 categories");
            Check(bank.questions.All(q => q.answers.Count >= 2 && q.correctIndex >= 0 && q.correctIndex < q.answers.Count), "Valid answer indices throughout bank");
            var crab = bank.questions.First(q => q.text == "Combien de pattes a un crabe?");
            Check(crab.answers[crab.correctIndex] == "10", "Corrected crab question retained");
            var wrong = new string[0];
            Check(Cash.Matches("USA", "États-Unis", bank.aliases, wrong), "Country aliases with normalized hyphens");
            Check(Cash.Matches("Einsten", "Albert Einstein", bank.aliases, wrong), "Known surname with typo");
            Check(Cash.Matches("coeur", "Le cœur", bank.aliases, wrong), "Accents, ligatures and articles");
            Check(!Cash.Matches("Victor Hugo", "Victor Fleming", bank.aliases, wrong), "Common first name cannot validate another person");
            Check(!Cash.Matches("Victor", "Victor Fleming", bank.aliases, wrong), "Partial name rejected");
            Check(!Cash.Matches("11", "10", bank.aliases, wrong), "Different number rejected");
            Check(!Cash.Matches("3", "-3", bank.aliases, wrong), "Negative sign preserved");
            Check(!Cash.Matches("35", "3,5", bank.aliases, wrong), "Decimal value distinguished");
            Check(Cash.Matches("3.50", "3,5", bank.aliases, wrong), "Equivalent decimal formats");
            Check(Cash.Matches("1000", "1 000", bank.aliases, wrong), "Thousands separator");
            Check(!Cash.Matches("10 ou 20", "10", bank.aliases, wrong), "Multiple numeric guesses rejected");
            Check(!Cash.Matches("10 miles", "10 km", bank.aliases, wrong), "Units distinguished");
            Check(!Cash.Matches("Iran", "Irak", bank.aliases, new[] { "Iran" }), "Offered wrong answer rejected");
            Check(Cash.Matches("Einstein", "Albert Einstein (1879–1955)", bank.aliases, wrong), "Context annotations omitted safely");
            Check(!Cash.Matches("!!!", "Paris", bank.aliases, wrong), "Empty normalized answer rejected");
            int[] expected = { 1, 2, 3, 2, 3, 5, 3, 5, 8, 5, 8, 12 }; int cell = 0;
            foreach (string difficulty in Engine.Difficulties) foreach (string response in new[] { "Duo", "Carré", "Cash" }) {
                var scored = Sample(bank, "Classique", difficulty, response); scored.Answer(true);
                Check(scored.Current.score == expected[cell++], difficulty + " " + response + " scoring");
            }
            var e = Sample(bank, "Classique", "MEDIUM", "Carré"); e.Game.tripled = true; e.Answer(true);
            Check(e.Current.score == 9, "Triple reward"); e.Answer(true); Check(e.Current.correct == 1, "Repeated answer counted once");
            e = Sample(bank, "Classique", "MEDIUM", "Carré"); e.Current.score = 20; e.Game.tripled = true; e.Answer(false);
            Check(e.Current.score == 17, "Triple penalty");
            e = Sample(bank, "Classique", "MEDIUM", "Carré"); e.Current.chain = true; e.Current.streak = 4; e.Answer(false);
            Check(e.Current.streak == 4 && !e.Current.chain && e.Current.wrong == 1, "Chain consumes once and tracks wrong answer");
            e = Sample(bank, "Glou", "MEDIUM", "Carré"); e.Answer(true); e.Advance();
            Check(e.Game.turn == 0 && e.Game.pendingDamage == 2, "Pending Glou damage blocks next turn");
            e.ApplyDamage(0); Check(e.Game.pendingDamage == 2, "Glou cannot target source");
            e.ApplyDamage(1); Check(e.Game.players[1].pv == 28 && e.Game.pendingDamage == 0, "Exact Glou damage");
            e.Advance(); Check(e.Game.turn == 1 && e.Game.playerIndex == 1, "Player alternation after damage");
            e.Game.players[0].score = 100; e.Game.players[0].pv = 0; e.Game.players[1].score = 1;
            Check(e.Ranking()[0].name == "Quentin", "Surviving Glou player ranks first");
            e = Sample(bank, "Classique", "EASY", "Duo"); e.Game.remaining = 12.345; e.Game.cashText = "Éléphant"; e.Game.freezeRemaining = 2.3;
            var saved = Json.Read<Session>(Json.Write(e.Game)); var resumed = new Engine(bank);
            Check(resumed.Restore(saved) && resumed.Game.duo.SequenceEqual(e.Game.duo) && resumed.Game.order.SequenceEqual(e.Game.order), "Duo and answer order survive serialization");
            Check(resumed.Game.remaining == 12.345 && resumed.Game.cashText == "Éléphant" && resumed.Game.freezeRemaining == 2.3 && resumed.Game.paused, "Clock, input, freeze and pause restored");
            Check(resumed.Current.name == "Éloïse | test", "Unicode player name retained");
            resumed.Current.spins = 1; resumed.Spin(); string second = resumed.Spin(); Check(resumed.Current.spins == 0 && second == "", "Wheel reward cannot be reused");
            var invalid = Json.Read<Session>(Json.Write(e.Game)); invalid.version = 99;
            Check(!resumed.Restore(invalid), "Unknown save version rejected");
            string directory = Path.Combine(Path.GetDirectoryName(Path.GetFullPath(output)), "pc_test_data"); var store = new Store(directory);
            Check(store.Save("game.json", e.Game), "Actual save file written");
            e.Game.remaining = 9; Check(store.Save("game.json", e.Game) && store.Load<Session>("game.json").remaining == 9, "Atomic save replacement read back");
            Check(store.ClearGame() && store.Load<Session>("game.json") == null, "Abandon clears save and backup");
            File.WriteAllText(Path.Combine(directory, "game.json"), "{broken"); Check(store.Load<Session>("game.json") == null, "Corrupt save handled safely"); store.ClearGame();
            e = new Engine(bank); e.Game = new Session { players = new List<Player> { new Player("A") }, questionsPerPlayer = 5 };
            for (int i = 0; i < 5; i++) { Check(e.Pick("EASY", false), "Playable turn " + (i + 1)); e.Choose("Carré"); e.Answer(true); while (e.Current.spins > 0) e.Spin(); e.Advance(); }
            Check(e.Finished && e.Current.correct == 5 && e.Game.turn == 5, "Full five-question game completes");
            checks.Add("SUCCESS: " + checks.Count + " checks passed."); File.WriteAllLines(output, checks, Encoding.UTF8); return 0;
        } catch (Exception error) { checks.Add(error.ToString()); File.WriteAllLines(output, checks, Encoding.UTF8); return 1; }
    }
}
}
