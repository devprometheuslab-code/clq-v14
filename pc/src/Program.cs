using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Media;
using System.Threading;
using System.Windows.Forms;

[assembly: System.Reflection.AssemblyVersion("1.0.2.0")]
[assembly: System.Reflection.AssemblyProduct("Champion League Quizz Windows")]

namespace CLQPC {
public class QuizForm : Form {
    readonly Color ink = Color.FromArgb(12, 15, 29), card = Color.FromArgb(25, 31, 52), gold = Color.FromArgb(255, 211, 60), cyan = Color.FromArgb(89, 221, 234);
    readonly FlowLayoutPanel page = new FlowLayoutPanel();
    readonly System.Windows.Forms.Timer timer = new System.Windows.Forms.Timer { Interval = 100 };
    readonly Stopwatch watch = new Stopwatch();
    readonly Engine engine;
    readonly Store store;
    readonly bool preview;
    readonly bool testing;
    Records records;
    Label clock;
    ProgressBar progress;
    double lastTick;
    bool activeGame, sound = true;
    protected override bool ShowWithoutActivation { get { return preview || testing; } }
    public QuizForm(Bank bank, string directory, bool isPreview, bool isTesting = false) {
        preview = isPreview; testing = isTesting; engine = new Engine(bank); store = new Store(directory);
        records = store.Load<Records>("records.json") ?? new Records();
        Text = "Champion League Quizz · Windows v14.2";
        ClientSize = new Size(1100, 800); MinimumSize = new Size(900, 650);
        StartPosition = FormStartPosition.CenterScreen; BackColor = ink; ForeColor = Color.White;
        Font = new Font("Segoe UI", 12); AutoScaleMode = AutoScaleMode.Dpi;
        var header = new Panel { Dock = DockStyle.Top, Height = 76, BackColor = card, Padding = new Padding(28, 12, 28, 12) };
        var brand = new Label { Text = "CLQ  /  CHAMPION LEAGUE QUIZZ", Dock = DockStyle.Fill, TextAlign = ContentAlignment.MiddleLeft,
            ForeColor = gold, Font = new Font("Segoe UI", 19, FontStyle.Bold) };
        var menu = Button("Accueil", delegate { ToHome(); }, false); menu.Dock = DockStyle.Right; menu.Width = 126;
        header.Controls.Add(brand); header.Controls.Add(menu);
        page.Dock = DockStyle.Fill; page.FlowDirection = FlowDirection.TopDown; page.WrapContents = false; page.AutoScroll = true;
        page.Padding = new Padding(36, 28, 36, 28); page.BackColor = ink;
        Controls.Add(page); Controls.Add(header);
        page.SizeChanged += delegate { ResizePage(); };
        timer.Tick += Tick;
        Deactivate += delegate { if (activeGame && engine.Game != null && !engine.Game.answered) Pause(); };
        Activated += delegate { if (activeGame && engine.Game != null && engine.Game.paused) RenderGame(); };
        FormClosing += delegate(object sender, FormClosingEventArgs e) {
            if (preview || !activeGame || engine.Game == null) return;
            Pause(); if (!Save()) { e.Cancel = true; MessageBox.Show(this, "La sauvegarde a échoué. Libère de l’espace puis réessaie.", "Sauvegarde"); }
        };
        Home();
    }
    Button Button(string text, Action action, bool primary) {
        var button = new Button { Text = text, Height = 58, Width = 235, FlatStyle = FlatStyle.Flat,
            BackColor = primary ? gold : card, ForeColor = primary ? ink : Color.White,
            Font = new Font("Segoe UI", 13, FontStyle.Bold), Margin = new Padding(0, 0, 12, 12), Cursor = Cursors.Hand };
        button.FlatAppearance.BorderColor = primary ? gold : Color.FromArgb(68, 85, 117); button.FlatAppearance.BorderSize = 1;
        button.Click += delegate { action(); }; return button;
    }
    void Clear() {
        page.SuspendLayout(); foreach (Control control in page.Controls.Cast<Control>().ToArray()) { page.Controls.Remove(control); control.Dispose(); }
    }
    void Done() { ResizePage(); page.ResumeLayout(true); }
    void ResizePage() {
        int width = Math.Max(760, page.ClientSize.Width - page.Padding.Horizontal - 24);
        foreach (Control control in page.Controls) { control.Width = width; var label = control as Label;
            if (label != null) label.MaximumSize = new Size(width, 0); }
    }
    Label TextBlock(string text, float size, Color color) {
        var label = new Label { Text = text, AutoSize = true, MaximumSize = new Size(980, 0), ForeColor = color,
            Font = new Font("Segoe UI", size, size >= 22 ? FontStyle.Bold : FontStyle.Regular), Margin = new Padding(0, 0, 0, 12), Padding = new Padding(0, 3, 0, 3) };
        page.Controls.Add(label); return label;
    }
    FlowLayoutPanel Row() {
        var row = new FlowLayoutPanel { AutoSize = true, AutoSizeMode = AutoSizeMode.GrowAndShrink, WrapContents = true,
            FlowDirection = FlowDirection.LeftToRight, Margin = new Padding(0, 0, 0, 10) }; page.Controls.Add(row); return row;
    }
    void Action(string text, Action action, bool primary) { var button = Button(text, action, primary); page.Controls.Add(button); }
    void ToHome() {
        if (activeGame) { Pause(); if (!Save()) { MessageBox.Show(this, "Sauvegarde impossible. Réessaie après avoir libéré de l’espace."); return; } }
        activeGame = false; timer.Stop(); Home();
    }
    void Home() {
        activeGame = false; timer.Stop(); Clear();
        TextBlock("UN QUIZ. TON DÉFI.", 12, cyan);
        TextBlock("Champion\nLeague Quizz", 42, gold);
        TextBlock("Joue seul ou à plusieurs, directement sur ton PC.", 17, Color.White);
        TextBlock(engine.Bank.questions.Count.ToString("N0") + " questions  ·  17 catégories  ·  Hors ligne", 13, Color.LightSteelBlue);
        var saved = store.Load<Session>("game.json");
        if (engine.Restore(saved)) {
            TextBlock("Partie en cours : " + saved.mode + "  ·  " + saved.players.Count + " joueur(s)  ·  Question " + (saved.turn + 1) + "/" + engine.Total, 15, cyan);
            Action("Reprendre la partie", delegate { activeGame = true; engine.Game.paused = true; if (engine.Finished) Results(); else RenderGame(); }, true);
        }
        Action("Nouvelle partie", Setup, true);
        var links = Row(); links.Controls.Add(Button("Records", ShowRecords, false)); links.Controls.Add(Button("Règles du jeu", Rules, false));
        links.Controls.Add(Button(sound ? "Sons : activés" : "Sons : désactivés", delegate { sound = !sound; Home(); }, false));
        if (records.games > 0) TextBlock(records.games + " partie(s) terminée(s)  ·  " + records.questions + " réponses", 13, Color.LightSteelBlue);
        Done();
    }
    void Setup() {
        Clear(); TextBlock("À vous de jouer", 30, gold); TextBlock("Une partie à ton rythme, de 1 à 6 joueurs.", 16, Color.White);
        TextBlock("Joueurs — un nom par ligne", 14, cyan);
        var names = new TextBox { Multiline = true, Height = 94, Text = "Joueur 1", MaxLength = 120, BackColor = card, ForeColor = Color.White, Font = Font };
        page.Controls.Add(names);
        TextBlock("Mode de jeu", 14, cyan);
        var mode = Combo(new[] { "Classique", "Glou" }); page.Controls.Add(mode);
        TextBlock("Catégorie", 14, cyan);
        var categories = new[] { "Toutes" }.Concat(engine.Bank.questions.Select(q => q.category).Distinct().OrderBy(s => s)).ToArray();
        var category = Combo(categories); page.Controls.Add(category);
        var controls = Row();
        var qpp = new NumericUpDown { Minimum = 5, Maximum = 30, Value = 10, Width = 100, Font = Font, BackColor = card, ForeColor = Color.White };
        var duration = new NumericUpDown { Minimum = 10, Maximum = 60, Value = 30, Increment = 5, Width = 100, Font = Font, BackColor = card, ForeColor = Color.White };
        controls.Controls.Add(new Label { Text = "Questions / joueur", AutoSize = true, Margin = new Padding(0, 6, 12, 0) }); controls.Controls.Add(qpp);
        controls.Controls.Add(new Label { Text = "   Secondes / question", AutoSize = true, Margin = new Padding(16, 6, 12, 0) }); controls.Controls.Add(duration);
        Action("Lancer la partie", delegate {
            var players = names.Lines.Select(n => n.Trim()).Where(n => n.Length > 0).ToArray();
            if (players.Length < 1 || players.Length > 6 || players.Any(n => n.Length > 16)) { MessageBox.Show(this, "Entre 1 à 6 noms, de 16 caractères maximum chacun."); return; }
            if (mode.Text == "Glou" && players.Length < 2) { MessageBox.Show(this, "Le mode Glou se joue à partir de deux joueurs."); return; }
            if (store.Load<Session>("game.json") != null && MessageBox.Show(this, "La nouvelle partie remplacera la sauvegarde actuelle. Continuer ?", "Nouvelle partie", MessageBoxButtons.OKCancel) != DialogResult.OK) return;
            engine.Game = new Session { players = players.Select(n => new Player(n)).ToList(), mode = mode.Text, category = category.Text,
                questionsPerPlayer = (int)qpp.Value, timePerQuestion = (int)duration.Value };
            activeGame = true; Save(); RenderGame();
        }, true);
        Done();
    }
    ComboBox Combo(string[] values) {
        var combo = new ComboBox { DropDownStyle = ComboBoxStyle.DropDownList, Height = 34, Font = Font, Margin = new Padding(0, 0, 0, 16) };
        combo.Items.AddRange(values); combo.SelectedIndex = 0; return combo;
    }
    bool Save() { return preview || store.Save("game.json", engine.Game); }
    void Pause() {
        if (engine.Game == null) return; timer.Stop(); engine.Game.paused = true; Save();
    }
    void Resume() {
        engine.Game.paused = false; RenderGame();
    }
    void StartClock() { lastTick = 0; watch.Restart(); timer.Start(); }
    void Tick(object sender, EventArgs args) {
        var game = engine.Game;
        if (!activeGame || game == null || game.paused || game.answered || game.phase != "question") { timer.Stop(); return; }
        double elapsed = watch.Elapsed.TotalSeconds, delta = elapsed - lastTick; lastTick = elapsed;
        if (game.freezeRemaining > 0) game.freezeRemaining = Math.Max(0, game.freezeRemaining - delta);
        else if (!engine.Current.frozenQuestion) game.remaining = Math.Max(0, game.remaining - delta);
        if (clock != null) { clock.Text = game.freezeRemaining > 0 ? "Freeze · " + Math.Ceiling(game.freezeRemaining) + " s" : engine.Current.frozenQuestion ? "Chrono gelé" : Math.Ceiling(game.remaining) + " s";
            clock.ForeColor = game.remaining <= 5 ? Color.Salmon : cyan; }
        if (progress != null) progress.Value = Math.Min(progress.Maximum, Math.Max(0, (int)Math.Ceiling(game.remaining)));
        if (game.remaining <= 0) Submit(false);
    }
    void RenderGame() {
        timer.Stop(); var game = engine.Game; Clear();
        TextBlock("QUESTION " + (game.turn + 1) + " / " + engine.Total + "   ·   " + game.mode.ToUpperInvariant(), 12, cyan);
        TextBlock(engine.Current.name + "   ·   " + engine.Current.score + " points", 27, gold);
        TextBlock(String.Join("   /   ", game.players.Select(p => p.name + " : " + p.score + " pts" + (game.mode == "Glou" ? " · " + p.pv + " PV" : ""))), 12, Color.LightSteelBlue);
        if (game.paused) Action("Partie en pause · Reprendre", Resume, true);
        var navigation = Row(); navigation.Controls.Add(Button("Sauvegarder et accueil", ToHome, false));
        navigation.Controls.Add(Button("Abandonner", delegate {
            Pause(); if (MessageBox.Show(this, "Effacer la sauvegarde de cette partie ?", "Abandonner", MessageBoxButtons.YesNo) == DialogResult.Yes) {
                if (!store.ClearGame()) { MessageBox.Show(this, "Impossible d’effacer la sauvegarde."); return; } activeGame = false; Home();
            } else RenderGame();
        }, false));
        if (game.phase == "difficulty") {
            TextBlock("Choisis ta difficulté", 23, Color.White);
            TextBlock("Chaque joueur choisit son niveau à chaque tour.", 14, Color.LightSteelBlue);
            var row = Row();
            for (int i = 0; i < 4; i++) { int level = i;
                var button = Button(Engine.DifficultyNames[i] + "\nDuo +" + Engine.Points[i, 0] + " · Carré +" + Engine.Points[i, 1] + " · Cash +" + Engine.Points[i, 2], delegate {
                    if (!engine.Pick(Engine.Difficulties[level], false)) { MessageBox.Show(this, "Plus de questions disponibles dans cette catégorie."); ToHome(); return; }
                    Save(); RenderGame();
                }, i == 0); button.Height = 80; button.Enabled = !game.paused; row.Controls.Add(button);
            }
            Done(); return;
        }
        TextBlock(game.question.category + "  ·  " + Engine.DifficultyNames[engine.Difficulty] + "  ·  " + engine.Current.wheelPoints + " WP  ·  Série " + engine.Current.streak, 13, cyan);
        TextBlock(game.question.text, 24, Color.White);
        if (game.phase == "targets") {
            TextBlock(game.pendingDamage + " Glou à distribuer : choisis une cible", 20, gold);
            var targets = Row();
            for (int i = 0; i < game.players.Count; i++) { int target = i;
                if (i == game.pendingSource || game.players[i].pv <= 0) continue;
                targets.Controls.Add(Button(game.players[i].name + " · " + game.players[i].pv + " PV", delegate { engine.ApplyDamage(target); game.phase = "result"; Save(); RenderGame(); }, false));
            }
            Done(); return;
        }
        if (game.answered) {
            TextBlock(game.result, 22, game.resultCorrect ? Color.LightGreen : Color.Salmon);
            TextBlock("Bonne réponse : " + game.question.answers[game.question.correctIndex], 17, Color.White);
            if (!String.IsNullOrWhiteSpace(game.question.explanation)) TextBlock(game.question.explanation, 14, Color.LightSteelBlue);
            if (!String.IsNullOrWhiteSpace(game.wheelResult)) TextBlock("Roue magique : " + game.wheelResult, 19, gold);
            if (game.pendingDamage > 0 && game.players.Any(p => p != engine.Current && p.pv > 0)) Action("Choisir une cible", delegate { game.phase = "targets"; Save(); RenderGame(); }, true);
            else if (engine.Current.spins > 0) Action("Tourner la roue · " + engine.Current.spins + " tour(s)", delegate { game.wheelResult = engine.Spin(); Save(); RenderGame(); }, true);
            else Action(game.turn + 1 >= engine.Total ? "Voir les résultats" : "Question suivante", Next, true);
            Done(); return;
        }
        clock = TextBlock(Math.Ceiling(game.remaining) + " s", 20, cyan);
        progress = new ProgressBar { Height = 9, Maximum = game.timePerQuestion, Value = Math.Max(0, Math.Min(game.timePerQuestion, (int)Math.Ceiling(game.remaining))), Margin = new Padding(0, 0, 0, 20) };
        page.Controls.Add(progress);
        if (game.response == null) {
            var modes = Row();
            foreach (string value in new[] { "Duo", "Carré", "Cash" }) { string selected = value; int index = value == "Duo" ? 0 : value == "Cash" ? 2 : 1;
                var button = Button(value + "   +" + Engine.Points[engine.Difficulty, index] + " pts", delegate { engine.Choose(selected); Save(); RenderGame(); }, value == "Cash");
                button.Enabled = !game.paused && (value != "Cash" || engine.Cashable()); modes.Controls.Add(button);
            }
        } else if (game.response == "Cash") {
            var input = new TextBox { Text = game.cashText, Font = new Font("Segoe UI", 19), MaxLength = 256, BackColor = card, ForeColor = Color.White, Enabled = !game.paused, Margin = new Padding(0, 0, 0, 16) };
            page.Controls.Add(input); input.TextChanged += delegate { game.cashText = input.Text; };
            Action submit = delegate { if (String.IsNullOrWhiteSpace(input.Text)) { input.Focus(); return; }
                Submit(Cash.Matches(input.Text, game.question.answers[game.question.correctIndex], engine.Bank.aliases,
                    game.question.answers.Where((a, index) => index != game.question.correctIndex))); };
            var button = Button("Valider la réponse", submit, true); button.Enabled = !game.paused; page.Controls.Add(button);
            input.KeyDown += delegate(object sender, KeyEventArgs e) { if (e.KeyCode == Keys.Enter) { e.SuppressKeyPress = true; submit(); } };
            if (!game.paused) input.Focus();
        } else {
            var answers = game.response == "Duo" ? game.duo : game.order;
            for (int i = 0; i < answers.Count; i++) { int actual = answers[i];
                var button = Button(((char)('A' + i)) + "   " + game.question.answers[actual], delegate { Submit(actual == game.question.correctIndex); }, false);
                button.AutoSize = true; button.MinimumSize = new Size(760, 60); button.MaximumSize = new Size(Math.Max(760, page.Width - 100), 0);
                button.Enabled = !game.paused && actual != game.removed; page.Controls.Add(button);
            }
        }
        if (!game.paused) Bonuses();
        Done(); if (!game.paused && !preview) StartClock();
    }
    void Bonuses() {
        var game = engine.Game; var p = engine.Current;
        TextBlock("Tes bonus", 13, cyan); var bonuses = Row();
        if (p.switches > 0) bonuses.Controls.Add(Button("Changer (" + p.switches + ")", delegate { if (engine.Pick(game.question.difficulty, true)) p.switches--; Save(); RenderGame(); }, false));
        if (p.removes > 0 && game.response != "Duo" && game.response != "Cash" && game.removed < 0) bonuses.Controls.Add(Button("Retirer un choix", delegate { game.removed = game.order.First(i => i != game.question.correctIndex); p.removes--; Save(); RenderGame(); }, false));
        if (p.doubles > 0 && !game.doubled) bonuses.Controls.Add(Button("Points ×2", delegate { game.doubled = true; p.doubles--; Save(); RenderGame(); }, false));
        if (p.freezes > 0) bonuses.Controls.Add(Button("Freeze · 5 s", delegate { game.freezeRemaining = 5; p.freezes--; Save(); RenderGame(); }, false));
        if (p.boosts > 0 && !p.boost) bonuses.Controls.Add(Button("Boost ×1,5", delegate { p.boost = true; p.boosts--; Save(); RenderGame(); }, false));
        if (p.chains > 0 && !p.chain) bonuses.Controls.Add(Button("Protéger la série", delegate { p.chain = true; p.chains--; Save(); RenderGame(); }, false));
        if (p.risks > 0 && !game.tripled) bonuses.Controls.Add(Button("Risque ×3", delegate { game.tripled = true; p.risks--; Save(); RenderGame(); }, false));
        var pause = Button("Pause", delegate { Pause(); RenderGame(); }, false); bonuses.Controls.Add(pause);
    }
    void Submit(bool correct) {
        if (engine.Game.paused || engine.Game.answered) return;
        timer.Stop(); engine.Answer(correct); engine.Current.frozenQuestion = false;
        if (sound && !preview) { if (correct) SystemSounds.Asterisk.Play(); else SystemSounds.Hand.Play(); }
        Save(); RenderGame();
    }
    void Next() {
        var game = engine.Game;
        if (!game.players.Any(p => p != engine.Current && p.pv > 0)) game.pendingDamage = 0;
        engine.Advance();
        if (engine.Finished) Results(); else { Save(); RenderGame(); }
    }
    void Results() {
        timer.Stop(); var game = engine.Game;
        if (!records.gameIds.Contains(game.id)) {
            var updated = Json.Read<Records>(Json.Write(records));
            updated.games++; updated.questions += game.players.Sum(p => p.correct + p.wrong);
            updated.bestScore = Math.Max(updated.bestScore, game.players.Max(p => p.score));
            updated.bestStreak = Math.Max(updated.bestStreak, game.players.Max(p => p.bestStreak)); updated.gameIds.Add(game.id);
            if (!preview && !store.Save("records.json", updated)) { MessageBox.Show(this, "Les résultats n’ont pas pu être enregistrés. La sauvegarde est conservée."); ToHome(); return; }
            records = updated;
        }
        if (!preview && !store.ClearGame()) { MessageBox.Show(this, "Les résultats sont enregistrés. La sauvegarde n’a pas pu être effacée."); }
        activeGame = false; Clear(); TextBlock("Partie terminée", 35, gold);
        var ranking = engine.Ranking(); var best = ranking[0];
        var winners = ranking.Where(p => p.score == best.score && (game.mode != "Glou" || p.pv == best.pv)).ToArray();
        TextBlock(game.players.Count == 1 ? "Bien joué, " + best.name + " !" : winners.Length > 1 ? "Égalité : " + String.Join(" & ", winners.Select(p => p.name)) : best.name + " remporte la partie !", 24, cyan);
        int rank = 1;
        foreach (var player in ranking) {
            int total = player.correct + player.wrong, accuracy = total == 0 ? 0 : player.correct * 100 / total;
            TextBlock((rank++) + ".  " + player.name + "   ·   " + player.score + " points" + (game.mode == "Glou" ? "   ·   " + player.pv + " PV" : ""), 21, Color.White);
            TextBlock(player.correct + "/" + total + " bonnes réponses  ·  " + accuracy + " %  ·  Meilleure série : " + player.bestStreak, 14, Color.LightSteelBlue);
        }
        Action("Rejouer", Setup, true); Action("Retour à l’accueil", Home, false); Done();
    }
    void ShowRecords() {
        Clear(); TextBlock("Tes records", 32, gold);
        TextBlock(records.games + " parties terminées\n" + records.questions + " questions jouées\nMeilleur score : " + records.bestScore + " points\nMeilleure série : " + records.bestStreak, 21, Color.White);
        Action("Retour", Home, false); Done();
    }
    void Rules() {
        Clear(); TextBlock("Comment jouer", 32, gold);
        TextBlock("Choisis ta difficulté à chaque tour, puis ton mode de réponse.\nDuo : deux propositions. Carré : quatre propositions. Cash : tape ta réponse.\nLe chrono commence dès l’affichage de la question. La pause arrête le temps.", 17, Color.White);
        TextBlock("Difficulté          Duo / Carré / Cash          Malus\nFacile                 1 / 2 / 3                         0\nMoyen                  2 / 3 / 5                         −1\nDifficile              3 / 5 / 8                         −2\nExpert                  5 / 8 / 12                       −3", 16, cyan);
        TextBlock("Les séries de réussites et les bonnes réponses dans une même catégorie ajoutent des points. Une erreur brise la série et retire ses bonus accumulés, sauf protection.\nLes WP débloquent des tours de roue : points, bonus ou protection.\nEn Glou, chaque joueur commence avec 30 PV. Une réussite permet d’infliger 1 à 4 dégâts. Une erreur fait perdre des PV. La survie et les PV passent avant les points au classement.", 16, Color.White);
        TextBlock("La sauvegarde se fait après tes actions, lors d’une pause ou quand tu quittes la fenêtre. Android et Windows conservent chacun leurs parties et leurs records sur l’appareil utilisé.", 14, Color.LightSteelBlue);
        Action("Retour", Home, false); Done();
    }
    public void Preview(string folder) {
        Directory.CreateDirectory(folder); CapturePreview(Path.Combine(folder, "pc_home.png")); Setup(); CapturePreview(Path.Combine(folder, "pc_setup.png"));
        engine.Game = new Session { players = new List<Player> { new Player("Quentin"), new Player("Éloïse") }, questionsPerPlayer = 5 };
        activeGame = true; engine.Pick("MEDIUM", false); engine.Choose("Carré"); RenderGame(); CapturePreview(Path.Combine(folder, "pc_question.png"));
        engine.Answer(true); RenderGame(); CapturePreview(Path.Combine(folder, "pc_answer.png")); Results(); CapturePreview(Path.Combine(folder, "pc_results.png"));
        ClientSize = new Size(920, 650); Home(); CapturePreview(Path.Combine(folder, "pc_small.png"));
    }
    void CapturePreview(string path) {
        if (!Visible) { Opacity = 0; ShowInTaskbar = false; Show(); }
        Application.DoEvents();
        CreateControl(); PerformLayout(); page.PerformLayout();
        using (var bitmap = new Bitmap(Width, Height)) { DrawToBitmap(bitmap, new Rectangle(Point.Empty, Size)); bitmap.Save(path, System.Drawing.Imaging.ImageFormat.Png); }
    }
    Button FindButton(string prefix) {
        Func<Control, IEnumerable<Control>> descendants = null;
        descendants = parent => parent.Controls.Cast<Control>().SelectMany(child => new[] { child }.Concat(descendants(child)));
        return descendants(page).OfType<Button>().First(b => b.Text.StartsWith(prefix, StringComparison.Ordinal));
    }
    void ClickButton(string prefix) { FindButton(prefix).PerformClick(); Application.DoEvents(); }
    public void VerifyUiFlow(string output) {
        var checks = new List<string>();
        Action<bool, string> check = delegate(bool passed, string label) { if (!passed) throw new Exception("FAIL: " + label); checks.Add("PASS: " + label); };
        sound = false; Opacity = 0; ShowInTaskbar = false; Show(); Application.DoEvents();
        ClickButton("Nouvelle partie");
        page.Controls.OfType<TextBox>().First().Text = "Test Windows";
        var numbers = page.Controls.OfType<FlowLayoutPanel>().SelectMany(row => row.Controls.OfType<NumericUpDown>()).ToArray();
        numbers[0].Value = 5; numbers[1].Value = 60;
        ClickButton("Lancer la partie"); check(engine.Game.phase == "difficulty" && engine.Total == 5, "Setup button starts configured game");
        ClickButton("Facile"); string question = engine.Game.question.text;
        ClickButton("Carré"); check(engine.Game.response == "Carré", "Response button selects Carré");
        string id = engine.Game.id; var order = engine.Game.order.ToArray();
        System.Threading.Thread.Sleep(220); Tick(this, EventArgs.Empty);
        check(engine.Game.remaining < 60 && engine.Game.remaining > 58, "Live clock decreases");
        ClickButton("Pause"); double remaining = engine.Game.remaining;
        System.Threading.Thread.Sleep(150); Tick(this, EventArgs.Empty);
        check(engine.Game.paused && engine.Game.remaining == remaining, "Pause stops clock");
        ClickButton("Sauvegarder et accueil");
        check(store.Load<Session>("game.json").id == id, "Home action persists actual game file");
        ClickButton("Reprendre la partie"); ClickButton("Partie en pause");
        check(engine.Game.id == id && engine.Game.question.text == question && engine.Game.order.SequenceEqual(order), "Resume button restores same game and choices");
        int correctPosition = engine.Game.order.IndexOf(engine.Game.question.correctIndex);
        ClickButton(((char)('A' + correctPosition)) + "   ");
        check(engine.Current.correct == 1 && engine.Game.answered, "Answer button scores exactly once");
        check(page.Controls.OfType<Label>().Any(label => label.Text.Contains("1 WP")), "Wheel HUD refreshed after answer");
        ClickButton("Sauvegarder et accueil"); ClickButton("Reprendre la partie"); ClickButton("Partie en pause");
        check(engine.Current.correct == 1 && engine.Game.answered, "Revealed answer survives relaunch without rescoring");
        for (int i = 1; i < 5; i++) {
            ClickButton("Question suivante"); ClickButton("Facile"); ClickButton("Carré");
            correctPosition = engine.Game.order.IndexOf(engine.Game.question.correctIndex);
            ClickButton(((char)('A' + correctPosition)) + "   ");
        }
        ClickButton("Voir les résultats");
        check(!activeGame && records.games == 1 && records.questions == 5, "Results button records complete game once");
        check(store.Load<Session>("game.json") == null, "Completed game save removed");
        ClickButton("Retour à l’accueil"); check(!page.Controls.OfType<Button>().Any(b => b.Text == "Reprendre la partie"), "Completed game no longer offered");
        ClickButton("Nouvelle partie"); ClickButton("Lancer la partie"); ClickButton("Facile");
        engine.Game.question = new Question { id = 1, text = "Capitale de la France ?", answers = new List<string> { "Paris", "Lyon", "Lille", "Nice" }, correctIndex = 0, category = "Géographie", difficulty = "EASY" };
        RenderGame(); ClickButton("Cash"); page.Controls.OfType<TextBox>().First().Text = "Pariss";
        ClickButton("Sauvegarder et accueil"); ClickButton("Reprendre la partie"); ClickButton("Partie en pause");
        check(page.Controls.OfType<TextBox>().First().Text == "Pariss", "Cash text box restored from disk");
        ClickButton("Freeze"); remaining = engine.Game.remaining; System.Threading.Thread.Sleep(180); Tick(this, EventArgs.Empty);
        check(engine.Game.freezeRemaining > 4 && engine.Game.remaining == remaining, "Freeze button holds clock");
        ClickButton("Valider la réponse"); check(engine.Current.correct == 1, "Cash submit button validates typo");
        ToHome(); checks.Add("SUCCESS: " + checks.Count + " UI checks passed."); File.WriteAllLines(output, checks);
    }
}
public static class Program {
    [STAThread] public static int Main(string[] args) {
        try {
            Bank bank = Bank.Load();
            if (args.Length > 0 && args[0] == "--self-test") return Verification.Run(bank, args.Length > 1 ? args[1] : "pc_tests.txt");
            Application.EnableVisualStyles(); Application.SetCompatibleTextRenderingDefault(false);
            if (args.Length > 1 && args[0] == "--ui-test") {
                using (var form = new QuizForm(bank, Path.Combine(Path.GetDirectoryName(Path.GetFullPath(args[1])), "pc_ui_test_data", Guid.NewGuid().ToString()), false, true)) form.VerifyUiFlow(args[1]); return 0;
            }
            if (args.Length > 1 && args[0] == "--preview") {
                using (var form = new QuizForm(bank, Path.Combine(args[1], "test_data"), true)) form.Preview(args[1]); return 0;
            }
            bool created;
            using (var mutex = new Mutex(true, "Local\\CLQWindowsV14", out created)) {
                if (!created) { MessageBox.Show("Champion League Quizz est déjà ouvert."); return 0; }
                Application.Run(new QuizForm(bank, Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "CLQWindows"), false));
            }
            return 0;
        } catch (Exception error) {
            if (args.Length > 1) File.WriteAllText(args[1] + ".error.txt", error.ToString());
            else MessageBox.Show("Impossible de lancer CLQ : " + error.Message, "CLQ"); return 1;
        }
    }
}
}
