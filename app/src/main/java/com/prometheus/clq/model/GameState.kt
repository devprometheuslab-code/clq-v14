package com.prometheus.clq.model

data class GameState(
    val config: GameConfig,
    val questions: MutableList<Question>,
    var currentQuestionIndex: Int = 0,
    var currentPlayerIndex: Int = 0,
    var phase: GamePhase = GamePhase.QUESTION,
    var selectedMode: ResponseMode? = null,
    var removedAnswerIndex: Int = -1,        // For bonus remove
    var doubleDownActive: Boolean = false,
    var doublePointsActive: Boolean = false,  // For bonus double
    var secondChanceActive: Boolean = false,  // NOUVEAU: 2e tentative active
    var mirrorActive: Boolean = false,        // NOUVEAU: miroir actif (malus renvoyé)
    var boostActive: Boolean = false,         // Bonus Boost: 1.5x prochain correct
    var chainActive: Boolean = false,         // Bonus Chaîne: protège le streak 1 fois
    var sabotageNextPlayer: Boolean = false,  // Bonus Sabotage: -5s pour le prochain joueur
    var timeAttackTimeLeft: Int = 0,          // For time attack
    var glouEvents: MutableList<GlouEvent> = mutableListOf(),
    var roundNumber: Int = 1,
    var currentTurnDifficulty: Difficulty = Difficulty.MEDIUM  // Difficulté aléatoire du tour
) {
    val currentQuestion get() = questions.getOrNull(currentQuestionIndex)
    val currentPlayer get() = config.players.getOrNull(currentPlayerIndex)
    val totalQuestions get() = questions.size
    val alivePlayers get() = config.players.filter { !it.isEliminated }

    val isFinished: Boolean get() = when (config.mode) {
        GameMode.CLASSIC -> currentQuestionIndex >= totalQuestions
        GameMode.TIME_ATTACK -> timeAttackTimeLeft <= 0 || currentQuestionIndex >= totalQuestions
        GameMode.GLOU -> alivePlayers.size <= 1 || currentQuestionIndex >= totalQuestions
    }

    /** Nombre de spins pendants apres une bonne reponse */
    var pendingWheelSpins: Int = 0
    /** Dernier spell gagne par la roue */
    var lastRandomEvent: com.prometheus.clq.game.RandomEvent? = null
    var lastWheelSpell: SpellType? = null

    fun nextTurn() {
        currentQuestionIndex++
        selectedMode = null
        removedAnswerIndex = -1
        doublePointsActive = false
        doubleDownActive = false
        secondChanceActive = false
        boostActive = false
        pendingWheelSpins = 0
        lastWheelSpell = null
        // chainActive persiste jusqu'à utilisation
        // mirrorActive persiste jusqu'à utilisation (pas reset au tour)
        // La difficulte sera choisie par le joueur (plus aleatoire)
        phase = GamePhase.DIFFICULTY_SELECTION

        if (config.mode == GameMode.GLOU) {
            // Skip eliminated players
            var attempts = 0
            do {
                currentPlayerIndex = (currentPlayerIndex + 1) % config.players.size
                attempts++
            } while (config.players[currentPlayerIndex].isEliminated && attempts < config.players.size)
        } else {
            currentPlayerIndex = (currentPlayerIndex + 1) % config.players.size
        }

        if (currentPlayerIndex == 0) roundNumber++
    }

    // Switch question bonus
    fun switchQuestion(): Boolean {
        val nextIdx = currentQuestionIndex + 1
        if (nextIdx < questions.size) {
            val swapIdx = (nextIdx until questions.size).random()
            val temp = questions[currentQuestionIndex]
            questions[currentQuestionIndex] = questions[swapIdx]
            questions[swapIdx] = temp
            return true
        }
        return false
    }
}

enum class GamePhase {
    DIFFICULTY_SELECTION, // Joueur choisit la difficulté (NOUVEAU)
    QUESTION,           // Question affichée, joueur doit choisir mode
    MODE_SELECTION,     // Joueur choisit DUO/CARRÉ/CASH
    ANSWERING,          // Joueur répond
    CASH_INPUT,         // Mode cash - saisie libre
    ANSWER_REVEAL,      // Révélation de la réponse
    WHEEL_SPIN,         // Le joueur tourne la roue (NOUVEAU)
    GLOU_EVENT,         // Événement Glou
    BETWEEN_TURNS,      // Entre deux tours
    FINISHED            // Partie terminée
}

data class GlouEvent(
    val type: GlouEventType,
    val sourcePlayer: Player?,
    val targetPlayer: Player?,
    val amount: Int,
    val message: String
)

enum class GlouEventType(val label: String, val emoji: String) {
    DRINK("Glou", "\uD83E\uDEE7"),
    INFLICT("Inflige", "\uD83D\uDCA5"),
    APOCALYPSE("Apocalypse", "\uD83D\uDD25"),
    COUP_TRIPLE("Coup Triple", "\u26A1"),
    DERNIER_SOUFFLE("Dernier Souffle", "\uD83D\uDC80"),
    BUNKER("Bunker Anti-Apocalypse", "\uD83D\uDEE1\uFE0F"),
    HEAL("Soin", "\uD83D\uDC9A"),
    ROULETTE_RUSSE("Roulette Russe", "\uD83C\uDFB0"),
    ECHANGE_PV("Échange PV", "\uD83D\uDD04"),
    BOUCLIER("Bouclier", "\uD83D\uDEE1\uFE0F")
}

/**
 * Types de bonus utilisables pendant une partie
 */
enum class BonusType(val label: String, val emoji: String, val description: String) {
    SWITCH_QUESTION("Switch", "\uD83D\uDD04", "Changer de question"),
    REMOVE_ANSWER("Supprimer", "❌", "Supprimer une mauvaise réponse"),
    DOUBLE_POINTS("Double", "✖\uFE0F", "Doubler les points de cette question"),
    SECOND_CHANCE("2e Chance", "\uD83C\uDFB2", "Retenter si mauvaise réponse"),
    STEAL("Vol", "\uD83E\uDD77", "Vole quelques points au joueur en t\u00eate"),
    BOOST("Boost", "\uD83D\uDE80", "x1.5 sur la prochaine bonne r\u00e9ponse"),
    SABOTAGE("Sabotage", "\u23F1\uFE0F", "-5s sur le timer du prochain joueur"),
    CHAIN("Cha\u00eene", "\u26D3\uFE0F", "Prot\u00e8ge ton streak une fois si tu te trompes"),
    DOUBLE_DOWN("Quitte ou Double", "\uD83C\uDFB0", "x3 si correct, x3 malus si faux")
}
