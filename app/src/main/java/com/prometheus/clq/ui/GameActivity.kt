package com.prometheus.clq.ui

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import com.google.gson.Gson
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.prometheus.clq.R
import com.prometheus.clq.audio.SoundManager
import com.prometheus.clq.data.AvatarManager
import com.prometheus.clq.data.Commentary
import com.prometheus.clq.data.SavedGameStore
import com.prometheus.clq.databinding.ActivityGameBinding
import com.prometheus.clq.game.AnswerResult
import com.prometheus.clq.game.GameEngine
import com.prometheus.clq.model.*
import com.prometheus.clq.model.SpellType
import com.prometheus.clq.model.SpellWheelConfig

class GameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameBinding
    private lateinit var engine: GameEngine
    private var config: GameConfig = GameConfig(players = emptyList())
    private val isGlou: Boolean get() = config.mode == GameMode.GLOU
    private val isSolo: Boolean get() = config.players.size <= 1
    private lateinit var soundManager: SoundManager
    private var timer: CountDownTimer? = null
    private var timeLeft = 30
    private var answered = false
    private var gameId = java.util.UUID.randomUUID().toString()
    private var finishingGame = false
    private var clockRemainingMs = 0L
    private var clockDeadline = 0L
    private var freezeRemainingMs = 0L
    private var freezeDeadline = 0L
    private var infiniteTime = false
    private var paused = false
    private var pauseDialog: AlertDialog? = null
    private var choosingGlouTarget = false
    private var wheelApplied = false
    private val savedGames by lazy { SavedGameStore(this) }
    private var restoringSession = false

    // For DUO mode: maps displayed button index to real answer index
    private var duoMapping: List<Int> = emptyList()

    // Track last answer for pass phone screen
    private var lastAnswerResult: AnswerResult? = null

    // Player bar views cache
    private data class PlayerBarViews(
        val root: View,
        val avatar: ImageView,
        val name: TextView,
        val score: TextView,
        val pvBar: ProgressBar,
        val activeGlow: View,
        val eliminated: TextView,
        val miniStreak: TextView,
        val miniWP: TextView
    )
    private val playerBarMap = mutableMapOf<Int, PlayerBarViews>()

    private val answerButtons get() = listOf(
        binding.btnAnswer0, binding.btnAnswer1,
        binding.btnAnswer2, binding.btnAnswer3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        soundManager = SoundManager(this)
        val session = savedInstanceState?.getString("session_snapshot")?.let {
            runCatching { GameSessionSnapshot.decode(it) }.getOrNull()
        } ?: if (intent.getBooleanExtra("resume_saved_game", false)) savedGames.load() else null
        if (intent.getBooleanExtra("resume_saved_game", false) && session == null) {
            android.widget.Toast.makeText(this, R.string.resume_failed, android.widget.Toast.LENGTH_LONG).show()
            finish()
            return
        }
        if (session != null) {
            engine = GameEngine.restore(session.engineSnapshot)
            config = engine.getState().config
            gameId = session.gameId
        } else {
            config = buildConfig()
            engine = GameEngine(config)
            engine.startGame()
            soundManager.startMusic()
            soundManager.playGameStart()
        }

        setupListeners()
        buildPlayersBar()
        if (session != null) {
            restoringSession = true
            restoreScreen(session)
            restoringSession = false
        } else if (engine.getState().currentQuestion != null) showDifficultySelection()
        else {
            android.widget.Toast.makeText(this, "Aucune question disponible dans cette catégorie.", android.widget.Toast.LENGTH_LONG).show()
            finish()
            return
        }
        saveSession()
        overridePendingTransition(R.anim.fade_in_scale, R.anim.fade_out_scale)
    }

    private fun buildConfig(): GameConfig {
        val json = intent.getStringExtra("config_players_json")
        val parsed = json?.let { runCatching { Gson().fromJson(it, Array<Player>::class.java).toList() }.getOrNull() }
        val players = parsed?.takeIf { it.isNotEmpty() }?.take(6)?.mapIndexed { index, player ->
            player.copy(id = index, name = player.name.trim().take(16).ifBlank { "Joueur ${index + 1}" })
        } ?: (intent.getStringArrayExtra("config_players") ?: arrayOf("0|Joueur 1|1")).take(6).mapIndexed { index, value ->
            val parts = value.split("|")
            Player(id = index, name = parts.getOrNull(1)?.take(16)?.ifBlank { "Joueur ${index + 1}" } ?: "Joueur ${index + 1}",
                avatarId = parts.getOrNull(3) ?: "avatar_robot",
                profileId = parts.getOrNull(4)?.takeIf { it.isNotBlank() && it != "null" })
        }.ifEmpty { listOf(Player(0, "Joueur 1")) }
        return GameConfig(
            players = players,
            questionsPerPlayer = intent.getIntExtra("config_qpp", 10).coerceIn(5, 30),
            timePerQuestion = intent.getIntExtra("config_time", 30).coerceIn(10, 60),
            categories = listOf(intent.getStringExtra("config_category") ?: "ALL"),
            mode = GameMode.fromName(intent.getStringExtra("config_mode") ?: "CLASSIC")
        )
    }

    private var freezeTimer: CountDownTimer? = null

    private fun setupListeners() {
        setupBonusTooltips()
        binding.btnPause.setOnClickListener { showPause() }
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() { showPause() }
        })
        // Difficulty selection buttons (NOUVEAU) — haptic on tap
        binding.btnDiffEasy.setOnClickListener { GameJuice.vibrateModeSelect(this); onDifficultySelected(Difficulty.EASY); saveSession() }
        binding.btnDiffMedium.setOnClickListener { GameJuice.vibrateModeSelect(this); onDifficultySelected(Difficulty.MEDIUM); saveSession() }
        binding.btnDiffHard.setOnClickListener { GameJuice.vibrateModeSelect(this); onDifficultySelected(Difficulty.HARD); saveSession() }
        binding.btnDiffExpert.setOnClickListener { GameJuice.vibrateModeSelect(this); onDifficultySelected(Difficulty.EXPERT); saveSession() }

        // Wheel buttons (NOUVEAU) — spin has its own haptic
        binding.btnSpin.setOnClickListener { GameJuice.vibrateSpin(this); onSpinWheel(); saveSession() }
        binding.btnWheelContinue.setOnClickListener { GameJuice.vibrateTap(this); onWheelContinue(); saveSession() }

        // Mode selection buttons — satisfying mode select haptic
        binding.btnModeDuo.setOnClickListener { GameJuice.vibrateModeSelect(this); onModeSelected(ResponseMode.DUO); saveSession() }
        binding.btnModeCarre.setOnClickListener { GameJuice.vibrateModeSelect(this); onModeSelected(ResponseMode.CARRE); saveSession() }
        binding.btnModeCash.setOnClickListener { GameJuice.vibrateModeSelect(this); onModeSelected(ResponseMode.CASH); saveSession() }

        // Answer buttons — light tap on press (correct/wrong haptic handled in onAnswer)
        answerButtons.forEachIndexed { i, btn ->
            btn.setOnClickListener { GameJuice.vibrateTap(this); onAnswer(i); saveSession() }
        }

        // Cash submit — tap
        binding.btnCashSubmit.setOnClickListener { GameJuice.vibrateTap(this); onCashSubmit(); saveSession() }
        binding.etCashAnswer.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) { GameJuice.vibrateTap(this); onCashSubmit(); saveSession(); true } else false
        }

        // Bonus buttons — bonus activation haptic
        binding.btnBonusSwitch.setOnClickListener { GameJuice.vibrateBonus(this); onBonusSwitch(); saveSession() }
        binding.btnBonusRemove.setOnClickListener { GameJuice.vibrateBonus(this); onBonusRemove(); saveSession() }
        binding.btnBonusDouble.setOnClickListener { GameJuice.vibrateBonus(this); onBonusDouble(); saveSession() }
        binding.btnBonusFreeze.setOnClickListener { GameJuice.vibrateBonus(this); onBonusFreeze(); saveSession() }
        binding.btnBonusSteal.setOnClickListener { GameJuice.vibrateBonus(this); onBonusSteal(); saveSession() }
        binding.btnBonusBoost.setOnClickListener { GameJuice.vibrateBonus(this); onBonusBoost(); saveSession() }
        binding.btnBonusSabotage.setOnClickListener { GameJuice.vibrateBonus(this); onBonusSabotage(); saveSession() }
        binding.btnBonusChain.setOnClickListener { GameJuice.vibrateBonus(this); onBonusChain(); saveSession() }
        binding.btnBonusDoubleDown.setOnClickListener { GameJuice.vibrateBonus(this); onBonusDoubleDown(); saveSession() }

        // Next button — light tap
        binding.btnNext.setOnClickListener { GameJuice.vibrateTap(this); onNext(); saveSession() }

        // Pass phone ready button — light tap
        binding.btnPassPhoneReady.setOnClickListener { GameJuice.vibrateTap(this); onPassPhoneReady(); saveSession() }

        // Dropdown explication — clic sur le header pour ouvrir/fermer
        binding.layoutExplanationHeader.setOnClickListener {
            GameJuice.vibrateTap(this)
            toggleExplanation()
        }
    }

    /** Ouvre/ferme le menu déroulant d'explication. */
    private fun toggleExplanation() {
        val isOpen = binding.tvExplanationContent.visibility == View.VISIBLE
        binding.tvExplanationContent.visibility = if (isOpen) View.GONE else View.VISIBLE
        binding.tvExplanationArrow.text = if (isOpen) "▼" else "▲"
        binding.layoutExplanationHeader.contentDescription = if (isOpen) "Afficher l’explication" else "Masquer l’explication"
    }

    // ===== PLAYERS BAR =====

    private fun buildPlayersBar() {
        if (config.players.size <= 1) {
            binding.scrollPlayersBar.visibility = View.GONE
            return
        }

        binding.scrollPlayersBar.visibility = View.VISIBLE
        binding.layoutPlayersBar.removeAllViews()
        playerBarMap.clear()

        val inflater = LayoutInflater.from(this)

        config.players.forEach { player ->
            val itemView = inflater.inflate(R.layout.item_player_bar, binding.layoutPlayersBar, false)

            val views = PlayerBarViews(
                root = itemView,
                avatar = itemView.findViewById(R.id.ivMiniAvatar),
                name = itemView.findViewById(R.id.tvMiniName),
                score = itemView.findViewById(R.id.tvMiniScore),
                pvBar = itemView.findViewById(R.id.progressMiniPV),
                activeGlow = itemView.findViewById(R.id.viewActiveGlow),
                eliminated = itemView.findViewById(R.id.tvMiniEliminated),
                miniStreak = itemView.findViewById(R.id.tvMiniStreak),
                miniWP = itemView.findViewById(R.id.tvMiniWP)
            )

            // Set player name
            views.name.text = player.name

            // Load avatar with HP state
            val hpState = if (config.mode == GameMode.GLOU) {
                AvatarManager.getHpState(player.pv, config.glouStartPV)
            } else {
                AvatarManager.HpState.NORMAL
            }
            AvatarManager.loadAvatar(views.avatar, player.avatarId, hpState, circleCrop = true)

            // Show PV bar in Glou mode
            if (config.mode == GameMode.GLOU) {
                views.pvBar.visibility = View.VISIBLE
                views.pvBar.max = config.glouStartPV
                views.pvBar.progress = player.pv
                views.score.text = "${player.pv} PV"
            } else {
                views.pvBar.visibility = View.GONE
                views.score.text = "${player.score} pts"
            }

            playerBarMap[player.id] = views
            binding.layoutPlayersBar.addView(itemView)
        }
    }

    private fun updatePlayersBar(currentPlayerId: Int? = null) {
        config.players.forEach { player ->
            val views = playerBarMap[player.id] ?: return@forEach

            // Highlight active player
            val isActive = player.id == currentPlayerId
            views.root.setBackgroundResource(
                if (isActive) R.drawable.bg_player_item_active else R.drawable.bg_player_item
            )
            views.activeGlow.visibility = if (isActive) View.VISIBLE else View.GONE
            if (isActive) {
                GameJuice.startNeonGlow(views.activeGlow, Color.parseColor("#FFD700"))
            } else {
                GameJuice.stopNeonGlow(views.activeGlow)
            }

            // Update HP state on avatar
            val hpState = if (config.mode == GameMode.GLOU) {
                AvatarManager.getHpState(player.pv, config.glouStartPV)
            } else {
                AvatarManager.HpState.NORMAL
            }
            AvatarManager.applyHpFilter(views.avatar, hpState)

            // Update score / PV
            if (config.mode == GameMode.GLOU) {
                views.pvBar.visibility = View.VISIBLE
                views.pvBar.max = config.glouStartPV
                views.pvBar.progress = player.pv
                AvatarManager.updatePvBar(views.pvBar, player.pv, config.glouStartPV)
                views.score.text = "${player.pv} PV"
                views.score.setTextColor(when {
                    player.pv > config.glouStartPV * 0.6 -> Color.parseColor("#00E676")
                    player.pv > config.glouStartPV * 0.3 -> Color.parseColor("#FF9100")
                    else -> Color.parseColor("#FF1744")
                })
            } else {
                views.score.text = "${player.score} pts"
                views.score.setTextColor(Color.parseColor("#FFD700"))
            }

            // Eliminated state
            if (player.isEliminated) {
                views.eliminated.visibility = View.VISIBLE
                views.avatar.alpha = 0.3f
                views.name.setTextColor(Color.parseColor("#555555"))
                views.score.setTextColor(Color.parseColor("#555555"))
            } else {
                views.eliminated.visibility = View.GONE
                views.avatar.alpha = 1f
                views.name.setTextColor(Color.WHITE)
            }

            // Streak indicator
            if (player.streak >= 3 && !player.isEliminated) {
                val streakInfo = GameJuice.getStreakInfo(player.streak)
                if (streakInfo != null) {
                    views.name.text = "${streakInfo.emoji} ${player.name}"
                } else {
                    views.name.text = player.name
                }
                views.miniStreak.text = "\uD83D\uDD25 x${player.streak}"
                views.miniStreak.visibility = View.VISIBLE
            } else {
                views.name.text = player.name
                views.miniStreak.visibility = View.GONE
            }

            // Wheel Points mini indicator
            if (player.wheelPoints > 0) {
                views.miniWP.text = "\uD83C\uDFA1 ${player.wheelPoints} WP"
                views.miniWP.visibility = View.VISIBLE
            } else {
                views.miniWP.visibility = View.GONE
            }
        }
    }

    // ===== SHOW QUESTION (Phase 1) =====

    // ===== DIFFICULTY SELECTION (NOUVEAU) =====

    private fun showDifficultySelection() {
        val state = engine.getState()
        val player = state.currentPlayer ?: return
        answered = false
        stopTimers()
        clockRemainingMs = 0L
        infiniteTime = false
        binding.tvTimer.text = "À toi de choisir"
        binding.tvTimer.textSize = 14f
        binding.progressTimer.progress = 0
        binding.scrollQuestion.scrollTo(0, 0)
        duoMapping = emptyList()

        // Update players bar — highlight current player
        updatePlayersBar(player.id)

        // Stop previous avatar pulse
        GameJuice.stopAvatarPulse()

        // Header
        val qNum = state.currentQuestionIndex + 1
        binding.tvProgress.text = "Q $qNum / ${state.totalQuestions}"
        binding.tvCurrentPlayer.text = player.name
        binding.tvScore.text = "${player.score} pts"

        // Avatar display with HP state
        val hpState = if (config.mode == GameMode.GLOU) {
            AvatarManager.getHpState(player.pv, config.glouStartPV)
        } else {
            AvatarManager.HpState.NORMAL
        }
        AvatarManager.loadAvatar(binding.ivPlayerAvatar, player.avatarId, hpState, circleCrop = false)
        GameJuice.startAvatarPulse(binding.ivPlayerAvatar)

        // Wheel Points HUD (NOUVEAU)
        val nextThreshold = SpellWheelConfig.getNextThreshold(player.wheelPoints)
        binding.tvWheelPoints.text = "\uD83C\uDFA1 ${player.wheelPoints}" +
            if (nextThreshold != null) "/$nextThreshold WP" else " WP (MAX)"
        if (player.wheelSpinsAvailable > 0) {
            binding.tvSpinsAvailable.text = "\uD83C\uDFB0 ${player.wheelSpinsAvailable} spin(s)!"
            binding.tvSpinsAvailable.visibility = View.VISIBLE
        } else {
            binding.tvSpinsAvailable.visibility = View.GONE
        }
        if (player.spells.isNotEmpty()) {
            binding.tvSpellCount.text = "\u2728 ${player.spells.size} sort(s)"
            binding.tvSpellCount.visibility = View.VISIBLE
        } else {
            binding.tvSpellCount.visibility = View.GONE
        }

        // Streak display
        if (player.streak >= 2) {
            val streakInfo = GameJuice.getStreakInfo(player.streak)
            if (streakInfo != null) {
                binding.tvStreak.text = "${streakInfo.emoji} Série x${player.streak}"
                binding.tvStreak.setTextColor(streakInfo.color)
            } else {
                binding.tvStreak.text = "Série : ${player.streak}"
                binding.tvStreak.setTextColor(Color.parseColor("#00E5FF"))
            }
            binding.tvStreak.visibility = View.VISIBLE
        } else {
            binding.tvStreak.visibility = View.GONE
        }

        // Combo
        val comboMult = engine.getCategoryComboMultiplier()
        if (comboMult > 1.0f) {
            binding.tvCombo.text = String.format("COMBO x%.1f", comboMult)
            binding.tvCombo.visibility = View.VISIBLE
        } else {
            binding.tvCombo.visibility = View.GONE
        }

        // Glou PV
        if (config.mode == GameMode.GLOU) {
            binding.layoutPvBar.visibility = View.VISIBLE
            binding.tvGlouPV.text = "${player.pv} / ${config.glouStartPV} PV"
            AvatarManager.updatePvBar(binding.progressPV, player.pv, config.glouStartPV)
        } else {
            binding.layoutPvBar.visibility = View.GONE
        }

        // Show difficulty selection, hide everything else
        binding.layoutDifficultySelection.visibility = View.VISIBLE
        binding.tvQuestion.visibility = View.GONE
        binding.layoutModeSelection.visibility = View.GONE
        binding.layoutAnswers.visibility = View.GONE
        binding.layoutCashInput.visibility = View.GONE
        binding.layoutGlouEvent.visibility = View.GONE
        binding.btnNext.visibility = View.GONE
        binding.tvResult.visibility = View.GONE
        binding.layoutBonusBar.visibility = View.GONE
        binding.tvRevealHint.visibility = View.GONE
        // Cacher l'explication et le commentaire de la question précédente
        binding.layoutExplanation.visibility = View.GONE
        binding.tvExplanationContent.visibility = View.GONE
        binding.tvExplanationArrow.text = "▼"
        binding.tvFunnyComment.visibility = View.GONE
        binding.tvCategory.text = "Choisis ta difficulté"
        updateDifficultyButtons()
    }

    private fun onDifficultySelected(difficulty: Difficulty) {
        if (paused || engine.getState().phase != GamePhase.DIFFICULTY_SELECTION) return
        soundManager.playSelect()
        engine.selectDifficulty(difficulty)
        if (engine.getCurrentDifficulty() != difficulty) {
            android.widget.Toast.makeText(this, "Ce niveau est épuisé : barème adapté à la question proposée.", android.widget.Toast.LENGTH_LONG).show()
        }

        // Animate the selected button
        when (difficulty) {
            Difficulty.EASY -> GameJuice.punchSelect(binding.btnDiffEasy)
            Difficulty.MEDIUM -> GameJuice.punchSelect(binding.btnDiffMedium)
            Difficulty.HARD -> GameJuice.punchSelect(binding.btnDiffHard)
            Difficulty.EXPERT -> GameJuice.punchSelect(binding.btnDiffExpert)
        }

        binding.layoutDifficultySelection.visibility = View.GONE
        showQuestion()
    }

    /**
     * Mappe une categorie de question vers le drawable de background d'arene.
     * Si la categorie est inconnue, on retourne le BG par defaut.
     */
    private fun resolveCategoryBackground(category: String): Int {
        val key = category.lowercase().trim()
        return when {
            key.contains("cinema") || key.contains("cinéma") || key.contains("film") -> R.drawable.cat_cinema
            key.contains("culture") || key.contains("littér") || key.contains("philo") -> R.drawable.cat_culture
            key.contains("gastro") || key.contains("cuisine") || key.contains("food") -> R.drawable.cat_gastronomie
            key.contains("géo") || key.contains("geo") || key.contains("monde") || key.contains("pays") -> R.drawable.cat_geographie
            key.contains("histoire") || key.contains("histor") -> R.drawable.cat_histoire
            key.contains("musique") || key.contains("music") -> R.drawable.cat_musique
            key.contains("nature") || key.contains("animal") -> R.drawable.cat_nature
            key.contains("science") || key.contains("physique") || key.contains("chimie") || key.contains("math") -> R.drawable.cat_science
            key.contains("sport") || key.contains("foot") || key.contains("jeux olym") -> R.drawable.cat_sport
            key.contains("tech") || key.contains("info") || key.contains("ordi") -> R.drawable.cat_tech
            else -> R.drawable.bg_main
        }
    }

    private fun showQuestion(restoring: Boolean = false) {
        val state = engine.getState()
        val question = state.currentQuestion ?: return
        val player = state.currentPlayer ?: return

        // Background d'arene selon la categorie de la question
        try {
            binding.ivCategoryBg.setImageResource(resolveCategoryBackground(question.category))
        } catch (_: Exception) { }

        // Header
        val qNum = state.currentQuestionIndex + 1
        binding.tvProgress.text = "Q $qNum / ${state.totalQuestions}"
        binding.tvCurrentPlayer.text = player.name
        binding.tvScore.text = "${player.score} pts"

        // Difficulty label
        val turnDiff = engine.getCurrentDifficulty()
        val diffEmoji = when (turnDiff) {
            Difficulty.EASY -> "\uD83D\uDFE2"
            Difficulty.MEDIUM -> "\uD83D\uDFE1"
            Difficulty.HARD -> "\uD83D\uDD34"
            Difficulty.EXPERT -> "\uD83D\uDC80"
        }
        binding.tvCategory.text = "${question.category} $diffEmoji ${turnDiff.label}"

        // Wheel Points HUD
        val nextThreshold = SpellWheelConfig.getNextThreshold(player.wheelPoints)
        binding.tvWheelPoints.text = "\uD83C\uDFA1 ${player.wheelPoints}" +
            if (nextThreshold != null) "/$nextThreshold WP" else " WP (MAX)"

        // Show question text
        binding.tvQuestion.visibility = View.VISIBLE
        binding.tvQuestion.text = question.text
        GameJuice.revealQuestion(binding.tvQuestion)
        soundManager.playReveal()

        // Reveal spell active?
        if (player.spellReveal && !restoring) {
            val correctAnswer = question.answers.getOrElse(question.correctIndex) { "?" }
            binding.tvRevealHint.text = "\uD83D\uDC41\uFE0F R\u00C9V\u00C9LATION : $correctAnswer"
            binding.tvRevealHint.visibility = View.VISIBLE
            player.spellReveal = false
        } else {
            binding.tvRevealHint.visibility = View.GONE
        }

        // Show mode selection, hide answers
        showModeSelection(player)
        binding.layoutDifficultySelection.visibility = View.GONE
        binding.layoutAnswers.visibility = View.GONE
        binding.layoutCashInput.visibility = View.GONE
        binding.layoutGlouEvent.visibility = View.GONE
        binding.btnNext.visibility = View.GONE
        binding.tvResult.visibility = View.GONE

        // Show bonus bar
        showBonusBar(player)

        binding.tvTimer.textSize = 20f
        binding.scrollQuestion.scrollTo(0, 0)
        if (restoring) return
        // Timer (check if freeze spell active)
        infiniteTime = player.spellFreezeTimer
        if (player.spellFreezeTimer) {
            timeLeft = config.timePerQuestion + 999 // effectively frozen
            player.spellFreezeTimer = false
            binding.tvTimer.text = "\u2744\uFE0F GEL\u00C9"
            binding.tvTimer.setTextColor(Color.parseColor("#00B4FF"))
            binding.progressTimer.max = config.timePerQuestion
            binding.progressTimer.progress = config.timePerQuestion
            // Don't start timer — it's frozen!
        } else {
            timeLeft = config.timePerQuestion
            startTimer()
        }
    }

    private fun showModeSelection(player: Player) {
        val available = player.availableModes()
        val preview = engine.getPointsPreview()
        val turnDiff = engine.getCurrentDifficulty()

        binding.layoutModeSelection.visibility = View.VISIBLE

        // DUO — afficher gain/perte
        val (duoWin, duoLoss) = preview[ResponseMode.DUO] ?: Pair(1, 0)
        binding.btnModeDuo.isEnabled = ResponseMode.DUO in available
        binding.btnModeDuo.text = "DUO"
        binding.btnModeDuo.alpha = if (ResponseMode.DUO in available) 1f else 0.3f
        val duoLossText = if (duoLoss > 0) " / -$duoLoss" else ""
        binding.tvDuoPoints.text = "2 choix · +$duoWin$duoLossText"

        // CARRÉ — afficher gain/perte
        val (carreWin, carreLoss) = preview[ResponseMode.CARRE] ?: Pair(2, 0)
        binding.btnModeCarre.isEnabled = ResponseMode.CARRE in available
        binding.btnModeCarre.text = "CARRÉ"
        binding.btnModeCarre.alpha = if (ResponseMode.CARRE in available) 1f else 0.3f
        val carreLossText = if (carreLoss > 0) " / -$carreLoss" else ""
        binding.tvCarrePoints.text = "4 choix · +$carreWin$carreLossText"

        // CASH — afficher gain/perte
        // Securite : desactive le mode CASH si la bonne reponse est de type
        // "Tous les trois", "Aucun", etc. — impossible a deviner sans voir les options.
        val currentQuestion = engine.getState().currentQuestion
        val cashable = currentQuestion?.isCashable() ?: true
        val cashAvailable = ResponseMode.CASH in available && cashable

        val (cashWin, cashLoss) = preview[ResponseMode.CASH] ?: Pair(3, 0)
        binding.btnModeCash.isEnabled = cashAvailable
        binding.btnModeCash.text = if (!cashable) "CASH 🚫" else "CASH"
        binding.btnModeCash.alpha = if (cashAvailable) 1f else 0.3f
        val cashLossText = if (cashLoss > 0) " / -$cashLoss" else ""
        binding.tvCashPoints.text = if (!cashable) "indisponible ici" else "à taper · +$cashWin$cashLossText"

        binding.layoutPointsPreview.visibility = View.VISIBLE
    }

    private fun showBonusBar(player: Player) {
        binding.layoutBonusBar.visibility = View.VISIBLE

        // Existing bonuses
        binding.btnBonusSwitch.text = "🔄 (${player.bonusSwitchQuestion})"
        binding.btnBonusSwitch.isEnabled = player.hasBonusSwitchQuestion()
        binding.btnBonusSwitch.alpha = if (player.hasBonusSwitchQuestion()) 1f else 0.4f

        binding.btnBonusRemove.text = "❌ (${player.bonusRemoveAnswer})"
        binding.btnBonusRemove.isEnabled = player.hasBonusRemoveAnswer()
        binding.btnBonusRemove.alpha = if (player.hasBonusRemoveAnswer()) 1f else 0.4f

        binding.btnBonusDouble.text = "x2 (${player.bonusDoublePoints})"
        binding.btnBonusDouble.isEnabled = player.hasBonusDoublePoints()
        binding.btnBonusDouble.alpha = if (player.hasBonusDoublePoints()) 1f else 0.4f

        // FREEZE bonus (one-time use per game)
        val freezeEnabled = engine.freezeAvailable && !infiniteTime
        binding.btnBonusFreeze.text = "❄️ Freeze"
        binding.btnBonusFreeze.isEnabled = freezeEnabled
        binding.btnBonusFreeze.alpha = if (freezeEnabled) 1f else 0.4f

        // STEAL bonus — Glou multi only (needs an opponent to steal from)
        val stealVisible = isGlou && !isSolo
        val stealEnabled = engine.stealAvailable && stealVisible
        binding.btnBonusSteal.text = "🎯 Steal"
        binding.btnBonusSteal.isEnabled = stealEnabled
        binding.btnBonusSteal.alpha = if (stealEnabled) 1f else 0.4f
        binding.btnBonusSteal.visibility = if (stealVisible) View.VISIBLE else View.GONE

        // NEW: BOOST bonus — works solo
        binding.btnBonusBoost.text = "🚀 x1.5 (${player.bonusBoost})"
        binding.btnBonusBoost.isEnabled = player.hasBonusBoost()
        binding.btnBonusBoost.alpha = if (player.hasBonusBoost()) 1f else 0.4f

        // SABOTAGE bonus — Glou multi only (needs next player to sabotage)
        val sabotageVisible = isGlou && !isSolo
        binding.btnBonusSabotage.text = "⏱️ -5s (${player.bonusSabotage})"
        binding.btnBonusSabotage.isEnabled = player.hasBonusSabotage() && sabotageVisible
        binding.btnBonusSabotage.alpha = if (player.hasBonusSabotage() && sabotageVisible) 1f else 0.4f
        binding.btnBonusSabotage.visibility = if (sabotageVisible) View.VISIBLE else View.GONE

        // NEW: CHAIN bonus
        binding.btnBonusChain.text = "⛓️ Série (${player.bonusChain})"
        binding.btnBonusChain.isEnabled = player.hasBonusChain()
        binding.btnBonusChain.alpha = if (player.hasBonusChain()) 1f else 0.4f

        // NEW: DOUBLE DOWN bonus
        binding.btnBonusDoubleDown.text = "🎰 x3 (${player.bonusDoubleDown})"
        binding.btnBonusDoubleDown.isEnabled = player.hasBonusDoubleDown()
        binding.btnBonusDoubleDown.alpha = if (player.hasBonusDoubleDown()) 1f else 0.4f
    }

    // ===== MODE SELECTED (Phase 2) =====

    private fun onModeSelected(mode: ResponseMode) {
        if (paused || answered || engine.getState().selectedMode != null) return
        soundManager.playModeSelect()
        engine.selectResponseMode(mode)

        // Punch animation for selected mode
        when (mode) {
            ResponseMode.DUO -> GameJuice.punchSelect(binding.btnModeDuo)
            ResponseMode.CARRE -> GameJuice.punchSelect(binding.btnModeCarre)
            ResponseMode.CASH -> GameJuice.punchSelect(binding.btnModeCash)
        }

        binding.layoutModeSelection.visibility = View.GONE

        when (mode) {
            ResponseMode.DUO -> showDuoAnswers()
            ResponseMode.CARRE -> showCarreAnswers()
            ResponseMode.CASH -> showCashInput()
        }
    }

    private fun showDuoAnswers(savedMapping: List<Int> = emptyList()) {
        val question = engine.getState().currentQuestion ?: return
        val (answers, indices) = if (savedMapping.size == 2 && savedMapping.all { it in question.answers.indices }) {
            savedMapping.map { question.answers[it] } to savedMapping
        } else engine.getDuoAnswers()
        binding.layoutAnswers.visibility = View.VISIBLE
        duoMapping = indices

        val visibleButtons = mutableListOf<View>()
        answerButtons.forEachIndexed { i, btn ->
            if (i < 2) {
                btn.visibility = View.VISIBLE
                btn.text = answerLabel(i, answers[i])
                btn.isEnabled = true
                btn.alpha = 1f
                btn.setBackgroundColor(Color.parseColor("#1A1A35"))
                btn.setTextColor(Color.parseColor("#EEEEEE"))
                visibleButtons.add(btn)
            } else {
                btn.visibility = View.GONE
            }
        }
        // Slide-in animation + swoosh
        GameJuice.slideInAnswers(visibleButtons)
        soundManager.playSwooshIn()
    }

    private fun showCarreAnswers() {
        val question = engine.getState().currentQuestion ?: return
        binding.layoutAnswers.visibility = View.VISIBLE
        duoMapping = emptyList()

        val visibleButtons = mutableListOf<View>()
        answerButtons.forEachIndexed { i, btn ->
            val state = engine.getState()
            btn.visibility = if (i < question.answers.size) View.VISIBLE else View.GONE
            btn.text = if (i == state.removedAnswerIndex) answerLabel(i, "—") else answerLabel(i, question.answers.getOrElse(i) { "" })
            btn.isEnabled = i != state.removedAnswerIndex
            btn.alpha = if (i == state.removedAnswerIndex) 0.2f else 1f
            btn.setBackgroundColor(Color.parseColor("#1A1A35"))
            btn.setTextColor(Color.parseColor("#EEEEEE"))
            visibleButtons.add(btn)
        }
        // Slide-in animation + swoosh
        GameJuice.slideInAnswers(visibleButtons)
        soundManager.playSwooshIn()
    }

    private fun showCashInput() {
        binding.layoutCashInput.visibility = View.VISIBLE
        binding.etCashAnswer.text?.clear()
        binding.etCashAnswer.requestFocus()

        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(binding.etCashAnswer, InputMethodManager.SHOW_IMPLICIT)
    }

    // ===== ANSWER HANDLING =====

    private fun onAnswer(displayIndex: Int) {
        if (answered || paused || finishingGame) return
        answered = true
        stopTimers()

        val realIndex = if (duoMapping.isNotEmpty() && displayIndex < duoMapping.size) {
            duoMapping[displayIndex]
        } else {
            displayIndex
        }

        val result = engine.submitAnswer(realIndex, timeLeft)
        val question = engine.getState().currentQuestion!!
        val correctIndex = question.correctIndex

        // Colorize buttons
        if (duoMapping.isNotEmpty()) {
            answerButtons.take(2).forEachIndexed { i, btn ->
                btn.isEnabled = false
                val realIdx = duoMapping[i]
                when {
                    realIdx == correctIndex -> {
                        btn.setBackgroundColor(Color.parseColor("#00E676"))
                        btn.setTextColor(Color.BLACK)
                        GameJuice.highlightAnswerButton(btn, true)
                    }
                    i == displayIndex && !result.isCorrect -> {
                        btn.setBackgroundColor(Color.parseColor("#FF1744"))
                        btn.setTextColor(Color.WHITE)
                        GameJuice.highlightAnswerButton(btn, false)
                    }
                    else -> btn.setBackgroundColor(Color.parseColor("#333355"))
                }
            }
        } else {
            answerButtons.forEachIndexed { i, btn ->
                btn.isEnabled = false
                when {
                    i == correctIndex -> {
                        btn.setBackgroundColor(Color.parseColor("#00E676"))
                        btn.setTextColor(Color.BLACK)
                        GameJuice.highlightAnswerButton(btn, true)
                        // Sparkles on correct button for extra juice
                        if (result.isCorrect) {
                            GameJuice.showSparkles(binding.overlayContainer, Color.parseColor("#00E676"), count = 6)
                        }
                    }
                    i == displayIndex && !result.isCorrect -> {
                        btn.setBackgroundColor(Color.parseColor("#FF1744"))
                        btn.setTextColor(Color.WHITE)
                        GameJuice.highlightAnswerButton(btn, false)
                    }
                    else -> btn.setBackgroundColor(Color.parseColor("#333355"))
                }
            }
            // Révélation compacte : on ne garde que la bonne réponse et celle choisie,
            // sinon le bandeau résultat cachait la bonne réponse en bas d'écran.
            answerButtons.forEachIndexed { i, btn ->
                if (i != correctIndex && i != displayIndex && btn.visibility == View.VISIBLE) {
                    btn.animate().alpha(0f).setDuration(180).withEndAction { btn.visibility = View.GONE; btn.alpha = 1f }.start()
                }
            }
        }

        showResult(result)
    }

    private fun onCashSubmit() {
        if (answered || paused || finishingGame) return
        val text = binding.etCashAnswer.text?.toString()?.trim() ?: ""
        if (text.isEmpty()) { binding.etCashAnswer.error = "Saisis ta réponse"; return }

        answered = true
        stopTimers()

        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.etCashAnswer.windowToken, 0)

        val result = engine.submitCashAnswer(text, timeLeft)
        binding.layoutCashInput.visibility = View.GONE
        showResult(result)
    }

    private fun showResult(result: AnswerResult) {
        lastAnswerResult = result
        binding.tvTimer.text = "Terminée"
        binding.tvResult.visibility = View.VISIBLE
        binding.layoutBonusBar.visibility = View.GONE

        if (result.isCorrect) {
            // === BONNE RÉPONSE — JUICE ===
            soundManager.playCorrect()
            GameJuice.vibrateCorrect(this)

            // Score text with streak bonus detail + wheel points
            val streakText = if (result.streakBonus > 0) " (+${result.streakBonus} série)" else ""
            val timeText = if (result.timeBonus > 0) " (+${result.timeBonus} vitesse)" else ""
            val wpText = if (result.wheelPointsGained > 0) " | +${result.wheelPointsGained} WP" else ""
            val spinText = if (result.wheelSpinsEarned > 0) " \uD83C\uDFA1 SPIN!" else ""
            binding.tvResult.text = "+${result.pointsDelta} pts$streakText$timeText$wpText$spinText"
            binding.tvResult.setTextColor(Color.parseColor("#00E676"))

            // Bounce the result text
            GameJuice.bounceView(binding.tvResult)

            // Score popup floating up
            GameJuice.showScorePopup(binding.overlayContainer, result.pointsDelta)

            // Correct answer overlay flash
            GameJuice.flashCorrectOverlay(binding.overlayContainer)

            // Flash banner green
            GameJuice.flashBanner(binding.layoutPlayerBanner, true)

            // Combo fire particles if active
            if (result.comboMultiplier > 1.0f) {
                GameJuice.showComboFire(binding.overlayContainer, result.comboMultiplier)
                soundManager.playSparkle()
            }

            // === STREAK EFFECTS ===
            val streakInfo = GameJuice.getStreakInfo(result.streakCount)
            if (streakInfo != null) {
                soundManager.playStreakLevel(result.streakCount)
                GameJuice.vibrateStreak(this)
                GameJuice.showStreakOverlay(binding.overlayContainer, streakInfo)

                // Confetti for big streaks!
                if (result.streakCount >= 5) {
                    GameJuice.showConfetti(binding.overlayContainer,
                        count = when {
                            result.streakCount >= 10 -> 60
                            result.streakCount >= 7 -> 45
                            else -> 30
                        }
                    )
                }

                // Update streak display with fire
                binding.tvStreak.text = "${streakInfo.emoji} Série x${result.streakCount}"
                binding.tvStreak.setTextColor(streakInfo.color)
                binding.tvStreak.visibility = View.VISIBLE
                GameJuice.bounceView(binding.tvStreak)
            }

        } else {
            // === MAUVAISE RÉPONSE — JUICE ===
            soundManager.playWrong()
            GameJuice.vibrateWrong(this)

            val correctText = result.correctAnswer
            // Show lose streak warning if applicable
            val loseStreakText = if (result.loseStreakCount >= 3) {
                val emoji = when {
                    result.loseStreakCount >= 6 -> "💀"
                    result.loseStreakCount >= 5 -> "🌊"
                    result.loseStreakCount >= 4 -> "🔥"
                    else -> "💨"
                }
                "\n$emoji LOSE STREAK x${result.loseStreakCount} — Attention à tes points !"
            } else if (result.loseStreakCount >= 2) {
                "\n⚠️ Série de défaites x${result.loseStreakCount}..."
            } else ""

            binding.tvResult.text = "Raté ! Réponse : $correctText$loseStreakText"
            binding.tvResult.setTextColor(Color.parseColor("#FF1744"))

            // Screen shake + red flash — more intense for lose streaks
            GameJuice.shakeView(binding.layoutGameContent)
            GameJuice.flashWrongOverlay(binding.overlayContainer)
            GameJuice.flashBanner(binding.layoutPlayerBanner, false)

            if (result.loseStreakCount >= 3) {
                // Dramatic lose streak overlay with sound
                GameJuice.showLoseStreakOverlay(binding.overlayContainer, result.loseStreakCount)
                GameJuice.vibrateStreak(this)
                soundManager.playGlouApocalypse()

                // Damage numbers if Glou mode
                if (config.mode == GameMode.GLOU) {
                    val penaltyAmount = when {
                        result.loseStreakCount >= 6 -> 3
                        result.loseStreakCount >= 4 -> 2
                        else -> 1
                    }
                    GameJuice.showDamageNumber(binding.overlayContainer, penaltyAmount)
                }
            }

            // Hide streak display
            binding.tvStreak.visibility = View.GONE
        }

        // Update score display with animation
        val oldScore = (engine.getState().currentPlayer?.score ?: 0) - result.pointsDelta
        val newScore = engine.getState().currentPlayer?.score ?: 0
        if (result.isCorrect && result.pointsDelta > 0) {
            GameJuice.animateScoreCounter(binding.tvScore, oldScore, newScore)
        } else {
            binding.tvScore.text = "${newScore} pts"
        }

        // Glou events with specific sounds
        if (result.glouEvents.isNotEmpty()) {
            val mainEvent = result.glouEvents.first()
            when (mainEvent.type) {
                GlouEventType.HEAL, GlouEventType.BOUCLIER, GlouEventType.BUNKER -> {
                    soundManager.playGlouHeal()
                    if (mainEvent.amount > 0) GameJuice.showHealNumber(binding.overlayContainer, mainEvent.amount)
                }
                GlouEventType.APOCALYPSE, GlouEventType.ROULETTE_RUSSE -> {
                    soundManager.playGlouApocalypse()
                    if (mainEvent.amount > 0) GameJuice.showDamageNumber(binding.overlayContainer, mainEvent.amount)
                    GameJuice.wobbleView(binding.layoutGameContent)
                }
                GlouEventType.COUP_TRIPLE, GlouEventType.DERNIER_SOUFFLE -> {
                    soundManager.playGlouEvent()
                    if (mainEvent.amount > 0) GameJuice.showDamageNumber(binding.overlayContainer, mainEvent.amount)
                }
                else -> soundManager.playGlouEvent()
            }
            showGlouEvents(result.glouEvents)
        }

        // Check elimination in Glou + update avatar HP state + PV bar
        val player = engine.getState().currentPlayer
        if (config.mode == GameMode.GLOU && player != null) {
            binding.tvGlouPV.text = "${player.pv} / ${config.glouStartPV} PV"
            AvatarManager.updatePvBar(binding.progressPV, player.pv, config.glouStartPV)
            val newHpState = AvatarManager.getHpState(player.pv, config.glouStartPV)
            AvatarManager.applyHpFilter(binding.ivPlayerAvatar, newHpState)

            if (player.isEliminated) {
                soundManager.playElimination()
                binding.tvGlouPV.text = "ÉLIMINÉ"
                binding.tvGlouPV.setTextColor(Color.parseColor("#FF1744"))
                AvatarManager.applyEliminatedEffect(binding.ivPlayerAvatar)
                // Dramatic elimination effect
                GameJuice.showEliminationEffect(binding.overlayContainer, player.name)
                GameJuice.shakeView(binding.layoutGameContent)
                GameJuice.vibrateElimination(this)
            }
        }

        player?.let {
            val nextThreshold = SpellWheelConfig.getNextThreshold(it.wheelPoints)
            binding.tvWheelPoints.text = "🎡 ${it.wheelPoints}" +
                if (nextThreshold != null) "/$nextThreshold WP" else " WP (MAX)"
        }

        // Update players bar after result (scores/PV changed)
        updatePlayersBar(engine.getState().currentPlayer?.id)

        // === MENU DÉROULANT EXPLICATION + COMMENTAIRE DRÔLE ===
        showExplanationAndCommentary(result)

        binding.btnNext.visibility = View.VISIBLE
        binding.btnNext.text = when {
            engine.pendingGlouDamage > 0 -> "Choisir une cible"
            engine.getState().currentPlayer?.wheelSpinsAvailable?.let { it > 0 } == true -> "Tourner la roue"
            engine.getState().currentQuestionIndex + 1 >= engine.getState().totalQuestions -> "Voir les résultats"
            isSolo -> "Question suivante"
            else -> "Joueur suivant"
        }
        GameJuice.bounceView(binding.btnNext)
        saveSession()
    }

    /**
     * Affiche le menu déroulant d'explication (replié par défaut)
     * et un commentaire drôle si une série de victoires/défaites se déclenche.
     */
    private fun showExplanationAndCommentary(result: AnswerResult) {
        // 1) Explication — repliée si c'est juste, ouverte d'office si c'est faux (on apprend quelque chose)
        val question = engine.getState().currentQuestion
        if (question != null) {
            binding.tvExplanationContent.text = Commentary.buildExplanation(question)
            val openIt = !result.isCorrect
            binding.tvExplanationContent.visibility = if (openIt) View.VISIBLE else View.GONE
            binding.tvExplanationArrow.text = if (openIt) "▲" else "▼"
            binding.layoutExplanation.visibility = View.VISIBLE
        }

        // 2) Commentaire drole — combine streak + difficulte de la question
        val turnDifficulty = engine.getCurrentDifficulty()
        val msg = Commentary.pickComment(
            isCorrect = result.isCorrect,
            difficulty = turnDifficulty,
            winStreak = result.streakCount,
            loseStreak = result.loseStreakCount
        )
        binding.tvFunnyComment.text = msg
        binding.tvFunnyComment.visibility = View.VISIBLE
        GameJuice.bounceView(binding.tvFunnyComment)
    }

    private fun showGlouEvents(events: List<GlouEvent>) {
        if (events.isEmpty()) return
        binding.layoutGlouEvent.visibility = View.VISIBLE

        val mainEvent = events.first()
        binding.tvGlouEventEmoji.text = mainEvent.type.emoji
        binding.tvGlouEventTitle.text = mainEvent.type.label
        binding.tvGlouEventDesc.text = events.joinToString("\n") { it.message }

        // Bounce the event display
        GameJuice.bounceView(binding.layoutGlouEvent)
    }

    // ===== TIME =====

    /** Arrête le chrono principal ET la pause « Freeze » éventuelle. */
    private fun stopTimers() {
        timer?.cancel()
        timer = null
        freezeTimer?.cancel()
        freezeTimer = null
        freezeRemainingMs = 0L
        clockRemainingMs = 0L
    }

    /** Couleur du chrono + de sa barre selon le temps restant. */
    private fun applyTimerColor(seconds: Int) {
        val c = when {
            seconds <= 5 -> Color.parseColor("#FF1744")
            seconds <= 10 -> Color.parseColor("#FF9100")
            else -> Color.parseColor("#00FFE0")
        }
        binding.tvTimer.setTextColor(c)
        binding.progressTimer.progressTintList = android.content.res.ColorStateList.valueOf(c)
    }

    /**
     * @param resumeSeconds si non null, reprend le chrono à cette valeur (après un Freeze)
     * au lieu de repartir de zéro — avant, le Freeze remettait le chrono au maximum.
     */
    private fun startTimer(resumeMillis: Long? = null) {
        stopTimers()

        // Check sabotage: réduit le temps du joueur (seulement au début de la question)
        val sabotageReduction = if (resumeMillis == null) engine.checkSabotage() else 0
        val duration = resumeMillis ?: (config.timePerQuestion - sabotageReduction).coerceAtLeast(5) * 1000L
        clockRemainingMs = duration.coerceAtLeast(1L)
        clockDeadline = SystemClock.elapsedRealtime() + clockRemainingMs
        val effectiveTime = ((clockRemainingMs + 999) / 1000).toInt()
        timeLeft = effectiveTime
        binding.tvTimer.text = "$timeLeft s"
        applyTimerColor(effectiveTime)
        if (sabotageReduction > 0) {
            binding.tvTimer.text = "⏱️ SABOTÉ ! -${sabotageReduction}s"
            binding.tvTimer.setTextColor(Color.parseColor("#FF1744"))
            soundManager.playTimeWarning()
        }

        binding.progressTimer.max = config.timePerQuestion
        binding.progressTimer.progress = effectiveTime

        timer = object : CountDownTimer(clockRemainingMs, 100) {
            override fun onTick(ms: Long) {
                clockRemainingMs = ms
                val seconds = ((ms + 999) / 1000).toInt()
                if (seconds == timeLeft) return
                timeLeft = seconds
                binding.progressTimer.progress = timeLeft
                binding.tvTimer.text = "${timeLeft}s"
                applyTimerColor(timeLeft)

                if (timeLeft <= 3) {
                    binding.tvTimer.setTextColor(Color.parseColor("#FF1744"))
                    soundManager.playTimerCritical()
                    GameJuice.timerCritical(binding.tvTimer)
                    GameJuice.vibrateTimerCritical(this@GameActivity)
                } else if (timeLeft <= 5) {
                    binding.tvTimer.setTextColor(Color.parseColor("#FF1744"))
                    soundManager.playTick()
                    GameJuice.pulseTimer(binding.tvTimer)
                    GameJuice.vibrateTick(this@GameActivity)
                }
            }

            override fun onFinish() {
                if (!answered) onTimeUp()
            }
        }.start()
    }

    private fun onTimeUp() {
        if (answered || finishingGame) return
        answered = true
        stopTimers()
        val state = engine.getState()
        if (state.selectedMode == null) engine.selectResponseMode(ResponseMode.CARRE)
        val result = if (state.selectedMode == ResponseMode.CASH) engine.submitCashAnswer("", 0)
            else engine.submitAnswer(-1, 0)
        (getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager)
            .hideSoftInputFromWindow(binding.etCashAnswer.windowToken, 0)
        binding.layoutModeSelection.visibility = View.GONE
        binding.layoutCashInput.visibility = View.GONE
        revealAnswersOnTimeout()
        showResult(result)
        binding.tvResult.text = "Temps écoulé ! Réponse : ${result.correctAnswer}"
        binding.tvResult.setTextColor(Color.parseColor("#FFB74D"))
        binding.tvTimer.text = "0 s"
        binding.progressTimer.progress = 0
    }

    // ===== UI HELPERS =====

    /** « A  Réponse » avec la lettre en couleur : plus lisible, et on peut dire « c'est la B ! » à voix haute. */
    private fun answerLabel(index: Int, text: String): CharSequence {
        val letter = "ABCD".getOrElse(index) { '?' }.toString()
        val sb = android.text.SpannableStringBuilder()
        sb.append(letter)
        sb.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD), 0, 1, 0)
        sb.setSpan(android.text.style.ForegroundColorSpan(Color.parseColor("#FFD700")), 0, 1, 0)
        sb.append("   ").append(text)
        return sb
    }

    /** Boutons de difficulté : on affiche ce que ça rapporte (Duo / Carré / Cash) et ce que ça coûte. */
    private fun updateDifficultyButtons() {
        fun label(d: Difficulty, name: String): CharSequence {
            val r = ScoringTable.getRow(d)
            val malus = if (r.wrongPenalty > 0) "  ·  faux −${r.wrongPenalty}" else "  ·  sans risque"
            val sb = android.text.SpannableStringBuilder(name)
            sb.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD), 0, name.length, 0)
            sb.setSpan(android.text.style.RelativeSizeSpan(1.1f), 0, name.length, 0)
            val start = sb.length
            sb.append("\nDuo +${r.duo} · Carré +${r.carre} · Cash +${r.cash}$malus")
            sb.setSpan(android.text.style.RelativeSizeSpan(0.78f), start, sb.length, 0)
            return sb
        }
        binding.btnDiffEasy.text = label(Difficulty.EASY, "FACILE")
        binding.btnDiffMedium.text = label(Difficulty.MEDIUM, "MOYEN")
        binding.btnDiffHard.text = label(Difficulty.HARD, "DIFFICILE")
        binding.btnDiffExpert.text = label(Difficulty.EXPERT, "EXPERT")
    }

    /** Appui long sur un bonus = explication (avant, il fallait deviner ce que voulaient dire les icônes). */
    private fun setupBonusTooltips() {
        val tips = listOf(
            binding.btnBonusSwitch to "🔄 Changer de question (même difficulté)",
            binding.btnBonusRemove to "❌ Retire une mauvaise réponse (mode Carré)",
            binding.btnBonusDouble to "x2 Double les points de cette question",
            binding.btnBonusFreeze to "❄️ Met le chrono en pause 5 secondes",
            binding.btnBonusSteal to "🎯 Vole des points à un adversaire",
            binding.btnBonusBoost to "🚀 x1,5 sur ta prochaine bonne réponse",
            binding.btnBonusSabotage to "⏱️ Le joueur suivant aura 5 s de moins",
            binding.btnBonusChain to "⛓️ Protège ta série une fois en cas d'erreur",
            binding.btnBonusDoubleDown to "🎰 Quitte ou double : x3 si juste, malus x3 si faux"
        )
        tips.forEach { (btn, tip) ->
            androidx.appcompat.widget.TooltipCompat.setTooltipText(btn, tip)
            btn.contentDescription = tip
        }
    }

    /** Au temps écoulé, on montre quand même la bonne réponse parmi les propositions affichées. */
    private fun revealAnswersOnTimeout() {
        val question = engine.getState().currentQuestion ?: return
        if (binding.layoutAnswers.visibility != View.VISIBLE) return
        answerButtons.forEachIndexed { i, btn ->
            if (btn.visibility != View.VISIBLE) return@forEachIndexed
            btn.isEnabled = false
            val realIdx = if (duoMapping.isNotEmpty()) duoMapping.getOrElse(i) { -1 } else i
            if (realIdx == question.correctIndex) {
                btn.setBackgroundColor(Color.parseColor("#00E676"))
                btn.setTextColor(Color.BLACK)
            } else {
                btn.setBackgroundColor(Color.parseColor("#333355"))
            }
        }
    }

    // ===== BONUS =====

    private fun onBonusSwitch() {
        if (engine.useBonusSwitchQuestion()) {
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusSwitch)
            showQuestion()
        }
    }

    private fun onBonusRemove() {
        if (duoMapping.isNotEmpty() || binding.layoutCashInput.visibility == View.VISIBLE) {
            android.widget.Toast.makeText(this, "❌ Ce bonus ne sert qu'en mode Carré (ou avant de choisir ton mode)", android.widget.Toast.LENGTH_SHORT).show()
            return
        }
        val removed = engine.useBonusRemoveAnswer()
        if (removed >= 0) {
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusRemove)
            if (binding.layoutAnswers.visibility == View.VISIBLE && duoMapping.isEmpty()) {
                answerButtons.getOrNull(removed)?.let { btn ->
                    btn.isEnabled = false
                    btn.alpha = 0.2f
                    btn.text = answerLabel(removed, "—")
                }
            }
            engine.getState().currentPlayer?.let { showBonusBar(it) }
        }
    }

    private fun onBonusDouble() {
        if (engine.useBonusDoublePoints()) {
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusDouble)
            engine.getState().currentPlayer?.let { showBonusBar(it) }
            // Visual feedback — flash the score
            GameJuice.bounceView(binding.tvScore)
        }
    }

    private fun onBonusFreeze() {
        if (answered || paused || infiniteTime) return
        if (engine.activateFreeze()) {
            clockRemainingMs = (clockDeadline - SystemClock.elapsedRealtime()).coerceAtLeast(1L)
            timer?.cancel(); timer = null
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusFreeze)
            engine.getState().currentPlayer?.let { showBonusBar(it) }
            startFreeze(5000L)
        }
    }

    private fun startFreeze(duration: Long) {
        freezeRemainingMs = duration
        freezeDeadline = SystemClock.elapsedRealtime() + duration
        freezeTimer = object : CountDownTimer(duration, 100) {
            override fun onTick(ms: Long) {
                freezeRemainingMs = ms
                binding.tvTimer.text = "Gel : ${(ms + 999) / 1000} s"
                binding.tvTimer.setTextColor(Color.parseColor("#00B4FF"))
            }
            override fun onFinish() {
                freezeTimer = null
                freezeRemainingMs = 0L
                if (!answered && !paused) startTimer(clockRemainingMs)
            }
        }.start()
    }

    private fun onBonusSteal() {
        val currentPlayer = engine.getState().currentPlayer ?: return
        val allPlayers = config.players
        val victim = engine.activateSteal(currentPlayer, allPlayers)

        if (victim != null) {
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusSteal)
            engine.getState().currentPlayer?.let { showBonusBar(it) }

            // Show toast notification
            val stealAmount = engine.getLastStealAmount(victim)
            android.widget.Toast.makeText(
                this,
                "🎯 Volé $stealAmount pts à ${victim.name} !",
                android.widget.Toast.LENGTH_SHORT
            ).show()

            // Update score display for current player
            binding.tvScore.text = "${currentPlayer.score} pts"
            GameJuice.bounceView(binding.tvScore)
        }
    }

    // ===== NEW BONUS HANDLERS =====

    private fun onBonusBoost() {
        if (engine.activateBoost()) {
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusBoost)
            engine.getState().currentPlayer?.let { showBonusBar(it) }
            android.widget.Toast.makeText(this, "🚀 BOOST ! x1.5 sur ta prochaine bonne réponse !", android.widget.Toast.LENGTH_SHORT).show()
        }
    }

    private fun onBonusSabotage() {
        if (engine.activateSabotage()) {
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusSabotage)
            engine.getState().currentPlayer?.let { showBonusBar(it) }
            android.widget.Toast.makeText(this, "⏱️ SABOTAGE ! Le prochain joueur aura -5s !", android.widget.Toast.LENGTH_SHORT).show()
        }
    }

    private fun onBonusChain() {
        if (engine.activateChain()) {
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusChain)
            engine.getState().currentPlayer?.let { showBonusBar(it) }
            android.widget.Toast.makeText(this, "⛓️ CHAÎNE ! Ton streak est protégé une fois !", android.widget.Toast.LENGTH_SHORT).show()
        }
    }

    private fun onBonusDoubleDown() {
        if (engine.activateDoubleDown()) {
            soundManager.playBonus()
            GameJuice.bonusUsedEffect(binding.btnBonusDoubleDown)
            engine.getState().currentPlayer?.let { showBonusBar(it) }
            android.widget.Toast.makeText(this, "🎰 QUITTE OU DOUBLE ! x3 si correct, x3 malus si faux !", android.widget.Toast.LENGTH_SHORT).show()
        }
    }

    // ===== NAVIGATION =====

    private fun onNext() {
        if (paused || finishingGame || !answered) return
        if (engine.pendingGlouDamage > 0 && engine.getGlouTargets().isNotEmpty()) {
            choosingGlouTarget = true
            showPassPhoneScreen(engine.getState())
            binding.tvPassPhoneTitle.text = "Choisis ta cible"
            binding.tvPassPhonePlayer.text = engine.pendingGlouSource?.name
            return
        }
        // Check if player has pending wheel spins BEFORE advancing
        val currentPlayer = engine.getState().currentPlayer
        if (currentPlayer != null && currentPlayer.wheelSpinsAvailable > 0) {
            showWheelOverlay(currentPlayer)
            return
        }

        advanceToNextTurn()
    }

    private fun advanceToNextTurn() {
        binding.btnNext.visibility = View.GONE
        engine.nextTurn()
        duoMapping = emptyList()
        val randomEvent = engine.getState().lastRandomEvent
        if (randomEvent != null) {
            try { androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("${randomEvent.emoji} ${randomEvent.title}")
                .setMessage(randomEvent.description).setPositiveButton("OK", null).setCancelable(false).show()
            } catch (e: Exception) {}
            engine.getState().lastRandomEvent = null
        }
        val state = engine.getState()
        if (state.isFinished) {
            goToResults()
        } else {
            // Show pass phone screen if multiplayer
            if (config.players.size > 1) {
                showPassPhoneScreen(state)
            } else {
                showDifficultySelection()
            }
        }
    }

    // ===== WHEEL OVERLAY (NOUVEAU) =====

    private fun showWheelOverlay(player: Player) {
        engine.getState().phase = GamePhase.WHEEL_SPIN
        binding.layoutWheelOverlay.visibility = View.VISIBLE
        binding.btnSpin.visibility = View.VISIBLE
        binding.layoutWheelResult.visibility = View.GONE
        binding.tvWheelTitle.text = "\uD83C\uDFA1 ROUE MAGIQUE ! (${player.wheelSpinsAvailable} spin)"

        // Setup wheel based on player streak
        binding.spinWheel.setupWheel(player.streak)

        // Bounce animation
        GameJuice.bounceView(binding.layoutWheelOverlay)
        soundManager.playBonus()
    }

    private fun onSpinWheel() {
        val player = engine.getState().currentPlayer ?: return
        val spell = player.useWheelSpin() ?: return
        engine.getState().lastWheelSpell = spell
        wheelApplied = false

        binding.btnSpin.visibility = View.GONE

        // Spin the wheel to the result
        binding.spinWheel.onSpinComplete = { resultSpell ->
            showWheelResult(player, resultSpell)
        }
        binding.spinWheel.spin(spell)
        soundManager.playSelect() // Will play wheel sound later
    }

    private fun showWheelResult(player: Player, spell: SpellType) {
        binding.btnSpin.visibility = View.GONE
        binding.layoutWheelResult.visibility = View.VISIBLE
        binding.tvWheelResultEmoji.text = spell.emoji
        binding.tvWheelResultName.text = spell.label

        val rarityLabel = spell.rarity.label
        binding.tvWheelResultDesc.text = "$rarityLabel — ${spell.description}"

        // Color by rarity
        val rarityColor = when (spell.rarity) {
            SpellRarity.COMMON -> Color.parseColor("#90CAF9")
            SpellRarity.UNCOMMON -> Color.parseColor("#66BB6A")
            SpellRarity.RARE -> Color.parseColor("#AB47BC")
            SpellRarity.EPIC -> Color.parseColor("#FFB300")
            SpellRarity.LEGENDARY -> Color.parseColor("#FF1744")
        }
        binding.tvWheelResultName.setTextColor(rarityColor)

        // Apply immediate spells right away
        if (!wheelApplied) when (spell) {
            SpellType.BONUS_1PT, SpellType.BONUS_2PT,
            SpellType.STEAL_3, SpellType.HEAL_5PV,
            SpellType.NUKE_2, SpellType.APOCALYPSE -> {
                engine.applyImmediateSpell(player, spell)
                // Remove from spells list since it was already applied
                player.spells.remove(spell)
                binding.tvScore.text = "${player.score} pts"
                updatePlayersBar(player.id)
            }
            else -> {
                // Passive spell — activate for later use
                player.activateSpell(spell)
            }
        }

        wheelApplied = true
        saveSession()
        // Confetti for rare+ spells
        if (spell.rarity.ordinal >= SpellRarity.RARE.ordinal) {
            GameJuice.showConfetti(binding.overlayContainer, count = 40)
        }
        GameJuice.bounceView(binding.layoutWheelResult)
        soundManager.playSparkle()

        // If more spins available, show spin button again
        if (player.wheelSpinsAvailable > 0) {
            binding.btnWheelContinue.text = "Spin suivant (${player.wheelSpinsAvailable})"
        } else {
            binding.btnWheelContinue.text = "Continuer"
        }
    }

    private fun onWheelContinue() {
        val player = engine.getState().currentPlayer
        if (player != null && player.wheelSpinsAvailable > 0) {
            // More spins — reset and spin again
            engine.getState().lastWheelSpell = null
            wheelApplied = false
            binding.layoutWheelResult.visibility = View.GONE
            binding.btnSpin.visibility = View.VISIBLE
            binding.tvWheelTitle.text = "\uD83C\uDFA1 ROUE MAGIQUE ! (${player.wheelSpinsAvailable} spin)"
            binding.spinWheel.setupWheel(player.streak)
        } else {
            // No more spins — continue game
            binding.layoutWheelOverlay.visibility = View.GONE
            onNext()
        }
    }

    // ===== PASS PHONE SCREEN =====

    private fun showPassPhoneScreen(state: GameState) {
        val nextPlayer = state.currentPlayer ?: return

        // Update players bar to highlight next player
        updatePlayersBar(nextPlayer.id)

        // Hide game content, show pass phone overlay
        binding.layoutGameContent.visibility = View.GONE
        binding.layoutPassPhone.visibility = View.VISIBLE

        // Flip-in animation + whoosh sound
        GameJuice.flipIn(binding.layoutPassPhone)
        soundManager.playWhoosh()

        binding.tvPassPhonePlayer.text = "Au tour de ${nextPlayer.name}"

        // Show glou target choice if there's pending damage
        if (config.mode == GameMode.GLOU && engine.pendingGlouDamage > 0) {
            binding.layoutGlouTargetSection.visibility = View.VISIBLE
            binding.tvGlouTargetAmount.text = "${engine.pendingGlouDamage} Glou à distribuer !"
            binding.btnPassPhoneReady.visibility = View.GONE // Hidden until target chosen

            populateGlouTargetButtons()
        } else {
            binding.layoutGlouTargetSection.visibility = View.GONE
            binding.btnPassPhoneReady.visibility = View.VISIBLE
        }

        // Show lose streak warning for next player
        val nextLoseStreak = engine.getLoseStreak(nextPlayer.id)
        if (nextLoseStreak >= 2) {
            binding.tvLoseStreakWarning.visibility = View.VISIBLE
            val warningEmoji = when {
                nextLoseStreak >= 5 -> "\uD83D\uDC80"
                nextLoseStreak >= 4 -> "\uD83D\uDD25"
                nextLoseStreak >= 3 -> "\uD83D\uDE30"
                else -> "\u26A0\uFE0F"
            }
            binding.tvLoseStreakWarning.text = "$warningEmoji ${nextPlayer.name} a rat\u00e9 ${nextLoseStreak}x de suite !"
        } else {
            binding.tvLoseStreakWarning.visibility = View.GONE
        }

        val lastResult = lastAnswerResult
        if (lastResult != null && lastResult.loseStreakCount >= 3) {
            binding.tvPassPhoneEmoji.text = when {
                lastResult.loseStreakCount >= 5 -> "\uD83D\uDC80"
                lastResult.loseStreakCount >= 4 -> "\uD83D\uDD25"
                else -> "\uD83D\uDCA8"
            }
            binding.tvPassPhoneTitle.text = "MAL\u00c9DICTION !"
            binding.tvPassPhoneTitle.setTextColor(Color.parseColor("#FF1744"))
            GameJuice.shakeView(binding.layoutPassPhone)
        } else {
            binding.tvPassPhoneEmoji.text = "\uD83D\uDCF1"
            binding.tvPassPhoneTitle.text = "Passe le t\u00e9l\u00e9phone !"
            binding.tvPassPhoneTitle.setTextColor(Color.parseColor("#FFD740"))
        }
    }

    private fun populateGlouTargetButtons() {
        binding.layoutGlouTargetButtons.removeAllViews()
        val targets = engine.getGlouTargets()

        targets.forEach { target ->
            val btn = MaterialButton(this).apply {
                text = "\uD83C\uDF7A ${target.name} (${target.pv} PV)"
                textSize = 16f
                setTextColor(Color.WHITE)
                setBackgroundColor(Color.parseColor("#FF6D00"))
                cornerRadius = 24
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply { bottomMargin = 12 }
            }
            btn.setOnClickListener { GameJuice.vibrateBonus(this); onGlouTargetChosen(target); saveSession() }
            binding.layoutGlouTargetButtons.addView(btn)
        }

        val allButtons = (0 until binding.layoutGlouTargetButtons.childCount).map {
            binding.layoutGlouTargetButtons.getChildAt(it)
        }
        GameJuice.pulseTargetButtons(allButtons)

        if (targets.size > 1) {
            val btnAll = MaterialButton(this).apply {
                text = "\uD83D\uDCA5 Tout le monde !"
                textSize = 14f
                setTextColor(Color.parseColor("#FF9100"))
                setBackgroundColor(Color.parseColor("#1A1A35"))
                cornerRadius = 24
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply { topMargin = 8 }
            }
            btnAll.setOnClickListener { GameJuice.vibrateBonus(this); onGlouTargetAll(); saveSession() }
            binding.layoutGlouTargetButtons.addView(btnAll)
        }
    }

    private fun onGlouTargetChosen(target: Player) {
        val event = engine.applyGlouToTarget(target)
        if (event != null) {
            soundManager.playGlouEvent()
            GameJuice.shakeView(binding.layoutPassPhone)
            GameJuice.showDamageNumber(binding.overlayContainer, event.amount)
            android.widget.Toast.makeText(
                this, "\uD83C\uDF7A ${target.name} prend ${event.amount} Glou !",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        }
        binding.layoutGlouTargetSection.visibility = View.GONE
        binding.btnPassPhoneReady.visibility = View.VISIBLE
        binding.btnPassPhoneReady.text = "Continuer"
        updatePlayersBar(engine.getState().currentPlayer?.id)
        GameJuice.bounceView(binding.btnPassPhoneReady)
    }

    private fun onGlouTargetAll() {
        val events = engine.applyGlouToAll()
        if (events.isNotEmpty()) {
            soundManager.playGlouApocalypse()
            GameJuice.shakeView(binding.layoutPassPhone)
            events.forEachIndexed { i, ev ->
                binding.overlayContainer.postDelayed({
                    GameJuice.showDamageNumber(binding.overlayContainer, ev.amount)
                }, i * 200L)
            }
        }
        binding.layoutGlouTargetSection.visibility = View.GONE
        binding.btnPassPhoneReady.visibility = View.VISIBLE
        binding.btnPassPhoneReady.text = "Continuer"
        updatePlayersBar(engine.getState().currentPlayer?.id)
        GameJuice.bounceView(binding.btnPassPhoneReady)
    }

    private fun onPassPhoneReady() {
        soundManager.playSwooshIn()
        binding.layoutPassPhone.visibility = View.GONE
        binding.layoutGameContent.visibility = View.VISIBLE
        if (choosingGlouTarget) {
            choosingGlouTarget = false
            onNext()
        } else showDifficultySelection()
    }

    private fun goToResults() {
        soundManager.playCelebration()
        GameJuice.showConfetti(binding.overlayContainer, count = 80)
        GameJuice.showSparkles(binding.overlayContainer, Color.parseColor("#FFD700"), 20)

        finishToResults()
    }

    private fun finishToResults() {
        if (finishingGame) return
        finishingGame = true
        engine.getState().phase = GamePhase.FINISHED
        stopTimers()
        GameJuice.vibrateVictory(this)
        soundManager.stopMusic()
        val ranking = engine.rankedPlayers()
        val resultIntent = Intent(this, ResultsActivity::class.java)
        resultIntent.putExtra("ranking_players_json", Gson().toJson(ranking))
        resultIntent.putExtra("winner_ids", engine.winners().map { it.id }.toIntArray())
        resultIntent.putExtra("game_id", gameId)
        resultIntent.putExtra("game_mode", config.mode.name)
        resultIntent.putExtra("total_questions", ranking.sumOf { it.totalQuestionsAnswered })
        startActivity(resultIntent)
        finish()
    }

    private fun pauseClocks() {
        if (timer != null) clockRemainingMs = (clockDeadline - SystemClock.elapsedRealtime()).coerceAtLeast(1L)
        if (freezeTimer != null) freezeRemainingMs = (freezeDeadline - SystemClock.elapsedRealtime()).coerceAtLeast(1L)
        timer?.cancel(); timer = null
        freezeTimer?.cancel(); freezeTimer = null
        soundManager.pauseMusic()
        paused = true
    }

    private fun resumeClocks() {
        paused = false
        if (!answered && !infiniteTime && engine.getState().phase != GamePhase.DIFFICULTY_SELECTION) {
            if (freezeRemainingMs > 0) startFreeze(freezeRemainingMs)
            else if (clockRemainingMs > 0) startTimer(clockRemainingMs)
        }
        soundManager.resumeMusic()
    }

    private fun showPause() {
        if (finishingGame || isFinishing || pauseDialog?.isShowing == true) return
        pauseClocks()
        saveSession()
        pauseDialog = AlertDialog.Builder(this)
            .setTitle(R.string.pause_title)
            .setMessage(R.string.pause_message)
            .setPositiveButton(R.string.resume_game) { _, _ -> resumeClocks() }
            .setNeutralButton(R.string.save_and_home) { _, _ ->
                if (saveSession()) {
                    finishingGame = true
                    startActivity(Intent(this, MainActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP))
                    finish()
                } else {
                    android.widget.Toast.makeText(this, R.string.save_failed, android.widget.Toast.LENGTH_LONG).show()
                    binding.root.post { showPause() }
                }
            }
            .setNegativeButton(R.string.abandon_game) { _, _ ->
                AlertDialog.Builder(this).setTitle(R.string.abandon_title)
                    .setMessage(R.string.abandon_message)
                    .setPositiveButton(R.string.abandon_game) { _, _ ->
                        finishingGame = true
                        savedGames.clear()
                        finish()
                    }
                    .setNegativeButton(R.string.resume_game) { _, _ -> resumeClocks() }
                    .setCancelable(false).show()
            }.setCancelable(false).show()
    }

    override fun onPause() {
        if (::engine.isInitialized && !finishingGame) {
            pauseClocks()
            saveSession()
        }
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        if (paused && ::engine.isInitialized && !finishingGame) binding.root.post { if (!isFinishing) showPause() }
    }

    private fun captureSession(): GameSessionSnapshot = GameSessionSnapshot(
        gameId = gameId,
        engineSnapshot = engine.snapshot(),
        answered = answered,
        clockRemainingMs = if (timer != null) (clockDeadline - SystemClock.elapsedRealtime()).coerceAtLeast(1) else clockRemainingMs,
        freezeRemainingMs = if (freezeTimer != null) (freezeDeadline - SystemClock.elapsedRealtime()).coerceAtLeast(1) else freezeRemainingMs,
        infiniteTime = infiniteTime,
        choosingGlouTarget = choosingGlouTarget,
        passPhone = binding.layoutPassPhone.visibility == View.VISIBLE,
        wheel = binding.layoutWheelOverlay.visibility == View.VISIBLE,
        wheelApplied = wheelApplied,
        lastResult = lastAnswerResult,
        cashText = binding.etCashAnswer.text?.toString().orEmpty().take(256),
        revealHint = binding.tvRevealHint.text.toString().takeIf { binding.tvRevealHint.visibility == View.VISIBLE },
        duoMapping = duoMapping,
        explanationOpen = binding.tvExplanationContent.visibility == View.VISIBLE
    )

    private fun saveSession(): Boolean {
        if (!::engine.isInitialized || finishingGame || restoringSession) return false
        return savedGames.save(captureSession())
    }

    override fun onSaveInstanceState(out: Bundle) {
        super.onSaveInstanceState(out)
        if (!::engine.isInitialized || finishingGame) return
        pauseClocks()
        out.putString("session_snapshot", captureSession().encode())
    }

    private fun restoreScreen(saved: GameSessionSnapshot) {
        val state = engine.getState()
        answered = saved.answered
        clockRemainingMs = saved.clockRemainingMs
        freezeRemainingMs = saved.freezeRemainingMs
        infiniteTime = saved.infiniteTime
        choosingGlouTarget = saved.choosingGlouTarget
        wheelApplied = saved.wheelApplied
        lastAnswerResult = saved.lastResult
        duoMapping = saved.duoMapping
        if (state.phase == GamePhase.DIFFICULTY_SELECTION && !saved.passPhone) {
            showDifficultySelection()
        } else if (saved.passPhone) {
            showPassPhoneScreen(state)
            if (choosingGlouTarget) { binding.tvPassPhoneTitle.text = "Choisis ta cible"; binding.tvPassPhonePlayer.text = state.currentPlayer?.name }
        } else {
            showQuestion(restoring = true)
            AvatarManager.loadAvatar(binding.ivPlayerAvatar, state.currentPlayer?.avatarId ?: "avatar_robot", circleCrop = false)
            saved.revealHint?.let { binding.tvRevealHint.text = it; binding.tvRevealHint.visibility = View.VISIBLE }
            if (answered) {
                binding.layoutModeSelection.visibility = View.GONE
                lastAnswerResult?.let { showResult(it) }
                binding.tvTimer.text = "Terminée"
                binding.tvExplanationContent.visibility = if (saved.explanationOpen) View.VISIBLE else View.GONE
                binding.tvExplanationArrow.text = if (saved.explanationOpen) "▲" else "▼"
            } else when (state.selectedMode) {
                ResponseMode.DUO -> { binding.layoutModeSelection.visibility = View.GONE; showDuoAnswers(saved.duoMapping) }
                ResponseMode.CARRE -> { binding.layoutModeSelection.visibility = View.GONE; showCarreAnswers() }
                ResponseMode.CASH -> {
                    binding.layoutModeSelection.visibility = View.GONE
                    binding.layoutCashInput.visibility = View.VISIBLE
                    binding.etCashAnswer.setText(saved.cashText)
                }
                null -> Unit
            }
            if (saved.wheel) {
                showWheelOverlay(state.currentPlayer!!)
                state.lastWheelSpell?.let { showWheelResult(state.currentPlayer!!, it) }
            }
        }
        timeLeft = ((clockRemainingMs + 999) / 1000).toInt()
        if (!answered && state.phase != GamePhase.DIFFICULTY_SELECTION) {
            binding.tvTimer.text = if (infiniteTime) "Gelé" else "$timeLeft s"
            binding.progressTimer.max = config.timePerQuestion
            binding.progressTimer.progress = timeLeft.coerceAtMost(config.timePerQuestion)
        }
        paused = true
    }

    override fun onDestroy() {
        super.onDestroy()
        stopTimers()
        if (::soundManager.isInitialized) soundManager.release()
        if (::binding.isInitialized) {
            GameJuice.stopAvatarPulse()
            playerBarMap.values.forEach { GameJuice.stopNeonGlow(it.activeGlow) }
            binding.spinWheel.onSpinComplete = null
        }
    }
}
