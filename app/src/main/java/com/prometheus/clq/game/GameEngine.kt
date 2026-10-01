package com.prometheus.clq.game

import com.prometheus.clq.data.QuestionBank
import com.prometheus.clq.model.*
import kotlin.math.min
import com.google.gson.Gson

class GameEngine(private val config: GameConfig) {

    private lateinit var state: GameState
    private val glouBonusPool = mutableListOf<GlouEventType>()

    // ===== TIEBREAKER / SUDDEN DEATH =====
    private var suddenDeathActive = false

    // Bonus and protections belong to the current player, never to the table.
    val freezeAvailable: Boolean get() = state.currentPlayer?.bonusFreeze?.let { it > 0 } == true
    val stealAvailable: Boolean get() = state.currentPlayer?.bonusSteal?.let { it > 0 } == true
    val mirrorAvailable: Boolean get() = state.currentPlayer?.bonusMirror?.let { it > 0 } == true
    private var bouclierActive: Boolean
        get() = state.currentPlayer?.glouShield == true
        set(value) { state.currentPlayer?.glouShield = value }
    private var lastStealAmount = 0
    private var lastAnswer: AnswerResult? = null

    // ===== LOSE STREAK TRACKING =====
    private val loseStreaks = mutableMapOf<Int, Int>()

    // ===== PENDING GLOU DAMAGE (player chooses target) =====
    var pendingGlouDamage: Int = 0
        private set
    var pendingGlouSource: Player? = null
        private set

    fun startGame(): GameState {
        require(config.players.isNotEmpty()) { "La partie doit contenir au moins un joueur." }
        val totalQuestions = config.questionsPerPlayer * config.players.size

        // Sélection de questions avec MIX aléatoire de difficultés
        val questions = if (config.difficulty != null) {
            QuestionBank.getForGame(totalQuestions, config.categories, config.difficulty)
        } else {
            // Mix aléatoire de toutes les difficultés
            QuestionBank.getRandomMix(totalQuestions, config.categories)
        }

        // Initialize Glou PV
        if (config.mode == GameMode.GLOU) {
            config.players.forEach { it.pv = config.glouStartPV; it.isEliminated = false }
            initGlouBonusPool()
        }

        // Reset all player states
        config.players.forEach {
            it.score = 0; it.correctAnswers = 0; it.wrongAnswers = 0
            it.streak = 0; it.bestStreak = 0
            it.duoUsed = 0; it.carreUsed = 0; it.cashUsed = 0; it.cashCorrect = 0
            it.totalQuestionsAnswered = 0
            it.bonusSwitchQuestion = 1; it.bonusRemoveAnswer = 1; it.bonusDoublePoints = 1
            it.bonusSecondChance = 1; it.bonusSpy = 1
            it.bonusBoost = 1; it.bonusSabotage = 1; it.bonusChain = 1; it.bonusDoubleDown = 1
            it.lastCategory = ""
            it.bonusFreeze = 1; it.bonusSteal = 1; it.bonusMirror = 1
            it.chainProtection = false; it.mirrorProtection = false; it.boostNext = false
            it.glouShield = false; it.comboCategory = ""; it.comboCount = 0
            it.duoCorrect = 0; it.carreCorrect = 0
            it.categoryResults.clear(); it.pointMilestones.clear()
            it.wheelPoints = 0; it.wheelSpinsAvailable = 0; it.spells.clear(); it.totalSpins = 0
            it.spellFreezeTimer = false; it.spellShield = false; it.spellDoubleNext = false
            it.spellTripleNext = false; it.spellReveal = false; it.spellStreakShield = 0
            it.streakBonusAccumulated = 0
        }

        loseStreaks.clear()
        lastAnswer = null
        pendingGlouDamage = 0
        pendingGlouSource = null
        suddenDeathActive = false

        state = GameState(
            config = config,
            questions = questions.toMutableList(),
            timeAttackTimeLeft = config.timeAttackDuration,
            currentTurnDifficulty = Difficulty.MEDIUM,
            phase = GamePhase.DIFFICULTY_SELECTION
        )
        return state
    }

    /** Difficulté du tour courant (choisie par le joueur) */
    fun getCurrentDifficulty(): Difficulty = state.currentTurnDifficulty

    /** Aperçu des points pour chaque mode à la difficulté du tour */
    fun getPointsPreview(): Map<ResponseMode, Pair<Int, Int>> {
        return ScoringTable.getPointsPreview(state.currentTurnDifficulty)
    }

    // ===== DIFFICULTY SELECTION (NOUVEAU) =====

    /** Le joueur choisit sa difficulte — une question de ce niveau est selectionnee */
    fun selectDifficulty(difficulty: Difficulty) {
        if (state.currentQuestion == null || state.phase != GamePhase.DIFFICULTY_SELECTION) return
        state.currentTurnDifficulty = difficulty
        // Essayer de trouver une question de cette difficulte dans la pile restante
        val remaining = state.questions.subList(
            state.currentQuestionIndex,
            state.questions.size
        )
        val matchIdx = remaining.indexOfFirst { it.difficulty == difficulty }
        if (matchIdx > 0) {
            // Swap avec la question courante
            val temp = state.questions[state.currentQuestionIndex]
            state.questions[state.currentQuestionIndex] = remaining[matchIdx]
            remaining[matchIdx] = temp
        } else if (matchIdx < 0) {
            // Aucune question de ce niveau dans la pile : on en tire une nouvelle,
            // sinon le joueur serait payé au tarif EXPERT pour une question FACILE (ou l'inverse).
            val used = state.questions.map { it.text }.toSet()
            QuestionBank.drawOne(config.categories, difficulty, used)?.let {
                state.questions[state.currentQuestionIndex] = it
            }
        }
        // If a category has no remaining question at this level, score the actual question fairly.
        state.currentTurnDifficulty = state.currentQuestion?.difficulty ?: difficulty
        // Passer a la phase question
        state.phase = GamePhase.QUESTION
    }

    // ===== WHEEL SYSTEM (NOUVEAU) =====

    /** Calcule les wheel points gagnes pour une bonne reponse */
    fun calculateWheelPoints(difficulty: Difficulty): Int {
        return when (difficulty) {
            Difficulty.EASY -> 1
            Difficulty.MEDIUM -> 2
            Difficulty.HARD -> 3
            Difficulty.EXPERT -> 4
        }
    }

    /** Applique un spell immediat (sorts a effet direct) */
    fun applyImmediateSpell(player: Player, spell: SpellType) {
        when (spell) {
            SpellType.BONUS_1PT -> player.score += 1
            SpellType.BONUS_2PT -> player.score += 2
            SpellType.STEAL_3 -> {
                val leader = config.players
                    .filter { it.id != player.id && !it.isEliminated }
                    .maxByOrNull { it.score }
                if (leader != null) {
                    val stolen = minOf(3, leader.score)
                    leader.losePoints(stolen)
                    player.score += stolen
                }
            }
            SpellType.HEAL_5PV -> {
                if (config.mode == GameMode.GLOU) player.heal(5)
                else player.score += 3  // Equivalent en mode non-Glou
            }
            SpellType.NUKE_2 -> {
                config.players.filter { it.id != player.id && !it.isEliminated }.forEach {
                    if (config.mode == GameMode.GLOU) it.takeDamage(2) else it.losePoints(2)
                }
            }
            SpellType.APOCALYPSE -> {
                config.players.filter { it.id != player.id && !it.isEliminated }.forEach {
                    if (config.mode == GameMode.GLOU) it.takeDamage(5) else it.losePoints(5)
                }
            }
            else -> { /* Sorts passifs deja geres par player.activateSpell() */ }
        }
    }

    // ===== MODE SELECTION =====

    fun selectResponseMode(mode: ResponseMode) {
        if (state.selectedMode != null || state.phase !in listOf(GamePhase.QUESTION, GamePhase.MODE_SELECTION)) return
        state.selectedMode = mode


        when (mode) {
            ResponseMode.CASH -> state.phase = GamePhase.CASH_INPUT
            else -> state.phase = GamePhase.ANSWERING
        }
    }

    // ===== ANSWERING (DUO / CARRÉ) =====

    fun submitAnswer(answerIndex: Int, timeLeft: Int = 30): AnswerResult {
        lastAnswer?.let { return it }
        val question = state.currentQuestion ?: return AnswerResult(false, 0, 0, "")
        val player = state.currentPlayer ?: return AnswerResult(false, 0, 0, "")
        val mode = state.selectedMode ?: ResponseMode.CARRE
        val isCorrect = answerIndex == question.correctIndex

        return processAnswer(player, question, mode, isCorrect, timeLeft).also { lastAnswer = it }
    }

    // ===== CASH ANSWER (free text with Levenshtein) =====

    fun submitCashAnswer(text: String, timeLeft: Int = 30): AnswerResult {
        lastAnswer?.let { return it }
        val question = state.currentQuestion ?: return AnswerResult(false, 0, 0, "")
        val player = state.currentPlayer ?: return AnswerResult(false, 0, 0, "")

        val correctAnswer = question.cashAnswer.ifBlank {
            question.answers.getOrElse(question.correctIndex) { "" }
        }
        val isCorrect = validateCashAnswer(text, correctAnswer)

        if (isCorrect) player.cashCorrect++

        return processAnswer(player, question, ResponseMode.CASH, isCorrect, timeLeft).also { lastAnswer = it }
    }

    // ===== CORE SCORING (basé sur la DIFFICULTÉ de la question) =====

    private fun processAnswer(
        player: Player,
        question: Question,
        mode: ResponseMode,
        isCorrect: Boolean,
        timeLeft: Int
    ): AnswerResult {
        player.trackResponseMode(mode)
        val previousCategory = player.categoryResults[question.category] ?: (0 to 0)
        player.categoryResults[question.category] =
            (previousCategory.first + if (isCorrect) 1 else 0) to (previousCategory.second + 1)
        if (isCorrect && mode == ResponseMode.DUO) player.duoCorrect++
        if (isCorrect && mode == ResponseMode.CARRE) player.carreCorrect++
        val scoreBefore = player.score
        var points = 0
        val glouEvents = mutableListOf<GlouEvent>()
        val correctAnswer = question.answers.getOrElse(question.correctIndex) { "" }

        var streakBonus = 0
        var timeBonus = 0
        var comboMultiplier = 1.0f
        var loseStreakCount = 0

        // Utiliser la difficulté du TOUR (aléatoire) au lieu de celle de la question
        val turnDifficulty = state.currentTurnDifficulty

        if (isCorrect) {
            // Reset lose streak
            loseStreaks[player.id] = 0

            // Points de base selon DIFFICULTÉ DU TOUR + mode choisi
            points = ScoringTable.getPoints(turnDifficulty, mode)

            // ===== CATEGORY COMBO SYSTEM =====
            comboMultiplier = updateCategoryCombo(question.category)
            player.lastCategory = question.category

            // Bonus streak progressif
            val currentStreak = player.streak + 1
            streakBonus = when {
                currentStreak >= 15 -> 15   // DIVIN
                currentStreak >= 10 -> 12   // LÉGENDAIRE
                currentStreak >= 7 -> 8     // INARRÊTABLE
                currentStreak >= 5 -> 5     // EN FEU
                currentStreak >= 3 -> 2     // Série
                else -> 0
            }
            points += streakBonus

            // Apply combo multiplier to base points
            points = (points * comboMultiplier).toInt()

            // Bonus Boost: x1.5
            if (player.boostNext) {
                points = (points * 1.5f).toInt()
                player.boostNext = false
            }

            // Bonus double points actif
            if (state.doublePointsActive) {
                points *= 2
                streakBonus *= 2
            }

            if (state.doubleDownActive) points *= 3

            // Time Attack bonus temps
            if (config.mode == GameMode.TIME_ATTACK) {
                timeBonus = (timeLeft / 5).coerceAtMost(3)
                points += timeBonus
            }

            // Apply spell multipliers BEFORE addPoints
            if (player.spellDoubleNext) {
                points *= 2
                player.spellDoubleNext = false
            }
            if (player.spellTripleNext) {
                points *= 3
                player.spellTripleNext = false
            }

            player.addPoints(points)
            if (streakBonus > 0) player.addStreakBonus(streakBonus)

            // ===== WHEEL POINTS (NOUVEAU) =====
            val wpGained = calculateWheelPoints(turnDifficulty)
            val newSpins = player.addWheelPoints(wpGained)
            if (newSpins > 0) {
                state.pendingWheelSpins = newSpins
            }

            // Glou: store pending Glou — player will CHOOSE the target
            if (config.mode == GameMode.GLOU) {
                val glouToInflict = when (mode) {
                    ResponseMode.DUO -> 1
                    ResponseMode.CARRE -> 2
                    ResponseMode.CASH -> 4
                }
                pendingGlouDamage = glouToInflict
                pendingGlouSource = player
            }

            // Reset bouclier effect after successful answer
            if (bouclierActive) {
                bouclierActive = false
            }

        } else {
            // ===== MAUVAISE RÉPONSE =====

            val currentLoseStreak = (loseStreaks[player.id] ?: 0) + 1
            loseStreaks[player.id] = currentLoseStreak
            loseStreakCount = currentLoseStreak

            // Reset combo
            player.comboCategory = ""
            player.comboCount = 0

            // Apply spell shield if active
            if (player.spellShield) {
                player.spellShield = false
                // Shield absorbe le malus — on skip les penalites
                player.wrongAnswer()
                state.phase = GamePhase.ANSWER_REVEAL
                return AnswerResult(
                    isCorrect = false, pointsDelta = player.score - scoreBefore, newTotal = player.score,
                    correctAnswer = correctAnswer, shieldAbsorbed = true
                )
            }

            // Apply bouclier immunity if active
            val shouldApplyDamage = !bouclierActive

            // ===== MALUS DE POINTS (basé sur la difficulté du TOUR) =====
            val wrongPenalty = ScoringTable.getWrongPenalty(turnDifficulty) * if (state.doubleDownActive) 3 else 1

            // Vérifier si le Miroir est actif
            if (player.mirrorProtection && wrongPenalty > 0) {
                // Le malus rebondit sur un adversaire aléatoire !
                val otherPlayers = config.players.filter { it.id != player.id && !it.isEliminated && it.score > 0 }
                val victim = otherPlayers.randomOrNull()
                if (victim != null) {
                    victim.losePoints(wrongPenalty)
                    glouEvents.add(
                        GlouEvent(
                            GlouEventType.INFLICT, player, victim, wrongPenalty,
                            "\uD83E\uDE9E MIROIR ! Le malus de -$wrongPenalty rebondit sur ${victim.name} !"
                        )
                    )
                }
                player.mirrorProtection = false
            } else if (wrongPenalty > 0) {
                // Le joueur perd des points (seulement LUI, pas tout le monde)
                player.losePoints(wrongPenalty)
                points = -wrongPenalty
            }

            // Time Attack malus
            if (config.mode == GameMode.TIME_ATTACK) {
                state.timeAttackTimeLeft -= 5
            }

            // ===== LOSE STREAK PENALTY — SEUL LE PERDANT EST PUNI =====
            if (currentLoseStreak >= 3) {
                val penaltyAmount = when {
                    currentLoseStreak >= 6 -> 3  // 💀 CATASTROPHE
                    currentLoseStreak >= 5 -> 2  // 🌊 TSUNAMI
                    currentLoseStreak >= 4 -> 2  // 🔥 FLAMMES
                    else -> 1                     // 💨 MALÉDICTION
                }
                if (config.mode == GameMode.GLOU) {
                    // SEUL le joueur qui perd prend des Glou
                    player.takeDamage(penaltyAmount)
                    val penaltyEmoji = when {
                        currentLoseStreak >= 6 -> "💀"
                        currentLoseStreak >= 5 -> "🌊"
                        currentLoseStreak >= 4 -> "🔥"
                        else -> "💨"
                    }
                    val penaltyLabel = when {
                        currentLoseStreak >= 6 -> "CATASTROPHE"
                        currentLoseStreak >= 5 -> "TSUNAMI DE GLOU"
                        currentLoseStreak >= 4 -> "FLAMMES"
                        else -> "MALÉDICTION"
                    }
                    glouEvents.add(
                        GlouEvent(
                            GlouEventType.DRINK, null, player, penaltyAmount,
                            "$penaltyEmoji $penaltyLabel ! ${player.name} a raté ${currentLoseStreak}x de suite — prend $penaltyAmount Glou en plus !"
                        )
                    )
                } else {
                    // En Classic/Time Attack: seul le perdant perd des points supplémentaires
                    player.losePoints(penaltyAmount)
                    points -= penaltyAmount
                }
            }

            // Glou: perte de PV (unless Bouclier is active)
            if (config.mode == GameMode.GLOU && shouldApplyDamage) {
                val pvLoss = when (mode) {
                    ResponseMode.DUO -> 2
                    ResponseMode.CARRE -> 3
                    ResponseMode.CASH -> 5
                }
                player.takeDamage(pvLoss)
                glouEvents.add(
                    GlouEvent(
                        GlouEventType.DRINK, null, player, pvLoss,
                        "\uD83E\uDEE7 ${player.name} prend $pvLoss Glou ! (${player.pv} PV restants)"
                    )
                )

                // Check random glou bonus — INCREASED frequency
                val randomEvent = rollGlouBonus(player)
                if (randomEvent != null) glouEvents.add(randomEvent)
                // Second chance for bonus on lose streaks!
                if (currentLoseStreak >= 2) {
                    val bonusEvent = rollGlouBonus(player)
                    if (bonusEvent != null) glouEvents.add(bonusEvent)
                }
            } else if (config.mode == GameMode.GLOU && bouclierActive) {
                glouEvents.add(
                    GlouEvent(
                        GlouEventType.BOUCLIER, null, player, 0,
                        "\uD83D\uDEE1\uFE0F BOUCLIER ACTIF ! ${player.name} est protégé !"
                    )
                )
                bouclierActive = false
            }

            player.wrongAnswer()
        }

        state.glouEvents.addAll(glouEvents)
        state.phase = if (config.mode == GameMode.GLOU && glouEvents.isNotEmpty()) {
            GamePhase.GLOU_EVENT
        } else {
            GamePhase.ANSWER_REVEAL
        }

        return AnswerResult(
            isCorrect = isCorrect,
            pointsDelta = player.score - scoreBefore,
            newTotal = player.score,
            correctAnswer = correctAnswer,
            glouEvents = glouEvents,
            streakCount = player.streak,
            streakBonus = streakBonus,
            timeBonus = timeBonus,
            comboMultiplier = comboMultiplier,
            loseStreakCount = loseStreakCount,
            wheelPointsGained = if (isCorrect) calculateWheelPoints(turnDifficulty) else 0,
            wheelSpinsEarned = if (isCorrect) state.pendingWheelSpins else 0
        )
    }

    // ===== GLOU LOGIC =====

    private fun initGlouBonusPool() {
        glouBonusPool.clear()
        repeat(4) { glouBonusPool.add(GlouEventType.COUP_TRIPLE) }
        repeat(3) { glouBonusPool.add(GlouEventType.DERNIER_SOUFFLE) }
        repeat(4) { glouBonusPool.add(GlouEventType.HEAL) }
        repeat(3) { glouBonusPool.add(GlouEventType.ROULETTE_RUSSE) }
        repeat(3) { glouBonusPool.add(GlouEventType.ECHANGE_PV) }
        repeat(2) { glouBonusPool.add(GlouEventType.BUNKER) }
        repeat(2) { glouBonusPool.add(GlouEventType.BOUCLIER) }
        repeat(2) { glouBonusPool.add(GlouEventType.APOCALYPSE) }
        glouBonusPool.shuffle()
    }

    fun applyGlouToTarget(target: Player): GlouEvent? {
        if (pendingGlouDamage <= 0 || target !in getGlouTargets()) return null
        val source = pendingGlouSource ?: return null

        target.takeDamage(pendingGlouDamage)
        val event = GlouEvent(
            GlouEventType.INFLICT, source, target, pendingGlouDamage,
            "${source.name} inflige $pendingGlouDamage Glou à ${target.name} ! (${target.pv} PV)"
        )


        pendingGlouDamage = 0
        pendingGlouSource = null

        return event
    }

    fun applyGlouToAll(): List<GlouEvent> {
        if (pendingGlouDamage <= 0) return emptyList()
        val source = pendingGlouSource ?: return emptyList()
        val events = mutableListOf<GlouEvent>()

        val otherPlayers = config.players.filter { it.id != source.id && !it.isEliminated }
        if (otherPlayers.isNotEmpty()) {
            val baseDamage = pendingGlouDamage / otherPlayers.size
            val remainder = pendingGlouDamage % otherPlayers.size
            otherPlayers.forEachIndexed { index, target ->
                val perPlayer = baseDamage + if (index < remainder) 1 else 0
                target.takeDamage(perPlayer)
                events.add(GlouEvent(
                    GlouEventType.INFLICT, source, target, perPlayer,
                    "${source.name} inflige $perPlayer Glou à ${target.name} ! (${target.pv} PV)"
                ))
            }
        }

        pendingGlouDamage = 0
        pendingGlouSource = null
        return events
    }

    fun getGlouTargets(): List<Player> {
        val source = pendingGlouSource ?: return emptyList()
        return config.players.filter { it.id != source.id && !it.isEliminated }
    }

    fun getLoseStreak(playerId: Int): Int = loseStreaks[playerId] ?: 0

    private fun rollGlouBonus(player: Player): GlouEvent? {
        if ((1..100).random() > 35 || glouBonusPool.isEmpty()) return null

        val eventType = glouBonusPool.removeFirst()
        val otherPlayers = config.players.filter { it.id != player.id && !it.isEliminated }

        return when (eventType) {
            GlouEventType.APOCALYPSE -> {
                otherPlayers.forEach { it.takeDamage(10) }
                GlouEvent(
                    GlouEventType.APOCALYPSE, player, null, 10,
                    "\uD83D\uDD25 APOCALYPSE ! Tous les adversaires perdent 10 PV !"
                )
            }
            GlouEventType.COUP_TRIPLE -> {
                val target = otherPlayers.randomOrNull()
                target?.takeDamage(9)
                GlouEvent(
                    GlouEventType.COUP_TRIPLE, player, target, 9,
                    "⚡ COUP TRIPLE ! ${target?.name ?: "?"} prend 9 Glou !"
                )
            }
            GlouEventType.DERNIER_SOUFFLE -> {
                val weakest = config.players.filter { !it.isEliminated }.minByOrNull { it.pv }
                weakest?.heal(5)
                GlouEvent(
                    GlouEventType.DERNIER_SOUFFLE, null, weakest, 5,
                    "\uD83D\uDC80 DERNIER SOUFFLE ! ${weakest?.name ?: "?"} récupère 5 PV !"
                )
            }
            GlouEventType.BUNKER -> {
                player.heal(5)
                GlouEvent(
                    GlouEventType.BUNKER, null, player, 5,
                    "\uD83D\uDEE1\uFE0F BUNKER ! ${player.name} récupère 5 PV de protection !"
                )
            }
            GlouEventType.HEAL -> {
                player.heal(3)
                GlouEvent(
                    GlouEventType.HEAL, null, player, 3,
                    "\uD83D\uDC9A SOIN ! ${player.name} récupère 3 PV !"
                )
            }
            GlouEventType.ROULETTE_RUSSE -> {
                val target = otherPlayers.randomOrNull()
                target?.takeDamage(15)
                GlouEvent(
                    GlouEventType.ROULETTE_RUSSE, null, target, 15,
                    "\uD83C\uDFB0 ROULETTE RUSSE ! ${target?.name ?: "?"} perd 15 PV !"
                )
            }
            GlouEventType.ECHANGE_PV -> {
                val target = otherPlayers.randomOrNull()
                if (target != null) {
                    val tempPV = player.pv
                    player.pv = target.pv
                    target.pv = tempPV
                    GlouEvent(
                        GlouEventType.ECHANGE_PV, player, target, 0,
                        "\uD83D\uDD04 ÉCHANGE PV ! ${player.name} (${player.pv} PV) ↔ ${target.name} (${target.pv} PV)"
                    )
                } else {
                    null
                }
            }
            GlouEventType.BOUCLIER -> {
                player.glouShield = true
                GlouEvent(
                    GlouEventType.BOUCLIER, null, player, 0,
                    "\uD83D\uDEE1\uFE0F BOUCLIER ! ${player.name} est protégé pour ce tour !"
                )
            }
            else -> null
        }
    }

    // ===== BONUS SYSTEM =====

    fun useBonusSwitchQuestion(): Boolean {
        val player = state.currentPlayer ?: return false
        if (!player.hasBonusSwitchQuestion()) return false
        // Nouvelle question du MÊME niveau que celui choisi pour ce tour (même à la dernière question)
        val used = state.questions.map { it.text }.toSet()
        val fresh = QuestionBank.drawOne(config.categories, state.currentTurnDifficulty, used)
        if (fresh != null) {
            player.useBonusSwitchQuestion()
            state.questions[state.currentQuestionIndex] = fresh
            state.removedAnswerIndex = -1
            state.selectedMode = null
            state.phase = GamePhase.QUESTION
            return true
        }
        return false
    }

    fun useBonusRemoveAnswer(): Int {
        val player = state.currentPlayer ?: return -1
        val question = state.currentQuestion ?: return -1
        if (!player.hasBonusRemoveAnswer()) return -1

        player.useBonusRemoveAnswer()
        val wrongIndices = question.answers.indices.filter { it != question.correctIndex }
        val removed = wrongIndices.random()
        state.removedAnswerIndex = removed
        return removed
    }

    fun useBonusDoublePoints(): Boolean {
        val player = state.currentPlayer ?: return false
        if (!player.hasBonusDoublePoints()) return false
        player.useBonusDoublePoints()
        state.doublePointsActive = true
        return true
    }

    /** NOUVEAU: Seconde Chance — si le joueur rate, il pourra retenter avec 1 réponse supprimée */
    fun useBonusSecondChance(): Boolean {
        val player = state.currentPlayer ?: return false
        if (!player.hasBonusSecondChance()) return false
        player.useBonusSecondChance()
        state.secondChanceActive = true
        return true
    }

    /** NOUVEAU: Espion — révèle les premiers caractères de la réponse Cash */
    fun useBonusSpy(): String? {
        val player = state.currentPlayer ?: return null
        val question = state.currentQuestion ?: return null
        if (!player.hasBonusSpy()) return null
        player.useBonusSpy()

        val correctAnswer = question.cashAnswer.ifBlank {
            question.answers.getOrElse(question.correctIndex) { "" }
        }
        // Révèle les 3 premiers caractères + longueur
        val hint = if (correctAnswer.length <= 3) {
            correctAnswer.first().toString() + "..." + " (${correctAnswer.length} lettres)"
        } else {
            correctAnswer.take(3) + "..." + " (${correctAnswer.length} lettres)"
        }
        return hint
    }

    /** NOUVEAU: Miroir — le prochain malus rebondit sur un adversaire */
    fun activateMirror(): Boolean {
        if (!mirrorAvailable) return false
        val player = state.currentPlayer ?: return false
        player.bonusMirror--
        player.mirrorProtection = true
        return true
    }

    fun activateFreeze(): Boolean {
        val player = state.currentPlayer ?: return false
        if (!freezeAvailable) return false
        player.bonusFreeze--
        return true
    }

    /** STEAL (NERFÉ v2) : vole 10% du score de l'adversaire en tête (min 3, max 15) */
    fun activateSteal(currentPlayer: Player, allPlayers: List<Player>): Player? {
        if (!stealAvailable) return null
        val victim = allPlayers.filter { it.id != currentPlayer.id && !it.isEliminated && it.score > 0 }
            .maxByOrNull { it.score } ?: return null
        lastStealAmount = ((victim.score * 0.10f).toInt()).coerceIn(3, 15).coerceAtMost(victim.score)
        victim.losePoints(lastStealAmount)
        currentPlayer.score += lastStealAmount
        currentPlayer.bonusSteal--
        return victim
    }

    fun getLastStealAmount(victim: Player): Int = lastStealAmount

    // ===== NOUVEAUX BONUS =====

    /** BOOST : x1.5 sur la prochaine bonne réponse */
    fun activateBoost(): Boolean {
        val player = state.currentPlayer ?: return false
        if (!player.hasBonusBoost()) return false
        player.useBonusBoost()
        player.boostNext = true
        return true
    }

    /** SABOTAGE : -5s sur le timer du prochain joueur */
    fun activateSabotage(): Boolean {
        val player = state.currentPlayer ?: return false
        if (!player.hasBonusSabotage()) return false
        player.useBonusSabotage()
        state.sabotageNextPlayer = true
        return true
    }

    /** CHAÎNE : protège le streak une fois si mauvaise réponse */
    fun activateChain(): Boolean {
        val player = state.currentPlayer ?: return false
        if (!player.hasBonusChain()) return false
        player.useBonusChain()
        player.chainProtection = true
        return true
    }

    /** QUITTE OU DOUBLE : x3 si correct, x3 malus si faux */
    fun activateDoubleDown(): Boolean {
        val player = state.currentPlayer ?: return false
        if (!player.hasBonusDoubleDown()) return false
        player.useBonusDoubleDown()
        // Le doubleDown est géré directement dans processAnswer via un flag
        state.doubleDownActive = true
        return true
    }

    /** Vérifie si le prochain joueur est sabotaged et retourne les secondes à retirer */
    fun checkSabotage(): Int {
        return if (state.sabotageNextPlayer) {
            state.sabotageNextPlayer = false
            5  // -5 secondes
        } else {
            0
        }
    }

    // ===== CATEGORY COMBO SYSTEM =====

    private fun updateCategoryCombo(currentCategory: String): Float {
        val player = state.currentPlayer ?: return 1.0f
        player.comboCount = if (player.comboCategory == currentCategory) player.comboCount + 1 else 1
        player.comboCategory = currentCategory
        return getCategoryComboMultiplier()
    }

    fun getCategoryComboMultiplier(): Float = when (state.currentPlayer?.comboCount ?: 0) {
        in 4..Int.MAX_VALUE -> 2.0f
        3 -> 1.5f
        2 -> 1.2f
        else -> 1.0f
    }

    // ===== TIEBREAKER / SUDDEN DEATH =====

    fun checkTiebreaker(): List<Player>? {
        val maxScore = config.players.maxOf { it.score }
        val tiedPlayers = config.players.filter { it.score == maxScore }
        return if (tiedPlayers.size > 1) tiedPlayers else null
    }

    fun getSuddenDeathQuestion(): Question? {
        val hardExpertQuestions = state.questions.filter {
            it.difficulty == Difficulty.HARD || it.difficulty == Difficulty.EXPERT
        }
        return hardExpertQuestions.randomOrNull()
    }

    fun activateSuddenDeath(tiedPlayers: List<Player>) {
        suddenDeathActive = true
    }

    fun isSuddenDeathActive(): Boolean = suddenDeathActive

    // ===== LEVENSHTEIN DISTANCE (for Cash mode) =====

    fun validateCashAnswer(input: String, correct: String): Boolean {
        val question = state.currentQuestion
        val accepted = listOf(correct) + question?.alternativeAnswers.orEmpty() +
            listOfNotNull(question?.answers?.getOrNull(question.correctIndex))
        val wrong = question?.answers?.filterIndexed { index, _ -> index != question.correctIndex }.orEmpty()
        return CashAnswerMatcher.matches(input, accepted, wrong)
    }

    // ===== GAME STATE ACCESS =====

    fun getState(): GameState = state

    // ===== DUO ANSWERS =====

    fun getDuoAnswers(): Pair<List<String>, List<Int>> {
        val question = state.currentQuestion ?: return Pair(emptyList(), emptyList())
        val correctIndex = question.correctIndex
        // Ne jamais proposer en Duo une réponse déjà retirée par le bonus ❌
        val wrongIndices = (0 until question.answers.size)
            .filter { it != correctIndex && it != state.removedAnswerIndex }
        val wrongIndex = wrongIndices.randomOrNull() ?: 0
        val indices = listOf(correctIndex, wrongIndex).shuffled()
        val answers = indices.map { question.answers.getOrElse(it) { "" } }
        return Pair(answers, indices)
    }

    // ===== NAVIGATION =====

    fun nextTurn() {
        if (pendingGlouDamage > 0 && getGlouTargets().isNotEmpty()) return
        pendingGlouDamage = 0
        pendingGlouSource = null
        lastAnswer = null
        state.nextTurn()
        state.lastRandomEvent = if (state.isFinished) null else rollRandomEvent()
    }

    // ===== RANKING =====

    fun rankedPlayers(): List<Player> = if (config.mode == GameMode.GLOU) {
        config.players.sortedWith(compareBy<Player> { it.isEliminated }.thenByDescending { it.pv }.thenByDescending { it.score })
    } else config.players.sortedByDescending { it.score }

    fun winners(): List<Player> {
        val first = rankedPlayers().firstOrNull() ?: return emptyList()
        return rankedPlayers().filter {
            it.score == first.score && (config.mode != GameMode.GLOU ||
                (it.pv == first.pv && it.isEliminated == first.isEliminated))
        }
    }

    private data class Snapshot(
        val state: GameState,
        val loseStreaks: Map<Int, Int>,
        val glouBonusPool: List<GlouEventType>,
        val pendingGlouDamage: Int,
        val pendingSourceId: Int?,
        val lastAnswer: AnswerResult?
    )

    fun snapshot(): String = Gson().toJson(Snapshot(state, loseStreaks, glouBonusPool,
        pendingGlouDamage, pendingGlouSource?.id, lastAnswer))

    companion object {
        fun restore(json: String): GameEngine {
            val saved = Gson().fromJson(json, Snapshot::class.java)
            require(saved.state.config.players.isNotEmpty())
            return GameEngine(saved.state.config).apply {
                state = saved.state
                loseStreaks.putAll(saved.loseStreaks)
                glouBonusPool.addAll(saved.glouBonusPool)
                pendingGlouDamage = saved.pendingGlouDamage
                pendingGlouSource = state.config.players.find { it.id == saved.pendingSourceId }
                lastAnswer = saved.lastAnswer
            }
        }
    }

    fun getRanking(): List<PlayerRanking> {
        return rankedPlayers().map { player ->
            val accuracy = if (player.totalQuestionsAnswered > 0) {
                (player.correctAnswers * 100) / player.totalQuestionsAnswered
            } else 0
            PlayerRanking(
                name = player.name,
                avatarId = player.avatarId,
                score = player.score,
                correctAnswers = player.correctAnswers,
                accuracy = accuracy,
                bestStreak = player.bestStreak,
                cashUsed = player.cashUsed,
                cashCorrect = player.cashCorrect,
                level = player.level
            )
        }
    }

    fun rollRandomEvent(): RandomEvent? {
        if ((1..100).random() > 8) return null
        val players = state.config.players.filter { !it.isEliminated }
        if (players.isEmpty()) return null
        val target = players.random()
        return when ((1..6).random()) {
            1 -> { players.forEach { it.score += 15 }; RandomEvent("LOTERIE", "Tous gagnent 15 pts !", "[LOTERIE]") }
            2 -> { players.forEach { it.wheelPoints = (it.wheelPoints - 5).coerceAtLeast(0) }; RandomEvent("TEMPÊTE", "Tous perdent 5 WP", "[TEMPÊTE]") }
            3 -> { target.bonusSwitchQuestion += 1; RandomEvent("CADEAU", "${target.name} reçoit un bonus Switch !", "[CADEAU]") }
            4 -> { target.score += 30; RandomEvent("ÉCLAIR", "${target.name} +30 pts !", "[ÉCLAIR]") }
            5 -> { target.score = (target.score - 20).coerceAtLeast(0); RandomEvent("SORT", "${target.name} -20 pts !", "[SORT]") }
            else -> { target.spellDoubleNext = true; RandomEvent("TOUR DOUBLE", "${target.name} x2 au prochain tour !", "[DOUBLE]") }
        }
    }

}

data class AnswerResult(
    val isCorrect: Boolean,
    val pointsDelta: Int,
    val newTotal: Int,
    val correctAnswer: String,
    val streakCount: Int = 0,
    val streakBonus: Int = 0,
    val timeBonus: Int = 0,
    val comboMultiplier: Float = 1.0f,
    val glouEvents: List<GlouEvent> = emptyList(),
    val loseStreakCount: Int = 0,
    val wheelPointsGained: Int = 0,
    val wheelSpinsEarned: Int = 0,
    val shieldAbsorbed: Boolean = false
)

data class PlayerRanking(
    val name: String,
    val avatarId: String,
    val score: Int,
    val correctAnswers: Int,
    val accuracy: Int,
    val bestStreak: Int,
    val cashUsed: Int,
    val cashCorrect: Int,
    val level: Int
)

data class RandomEvent(val title: String, val description: String, val emoji: String = "")
