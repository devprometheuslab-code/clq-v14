package com.prometheus.clq.model

data class Player(
    val id: Int,
    val name: String,
    var avatarId: String = "avatar_robot",
    var profileId: String? = null,
    var level: Int = 1,
    var score: Int = 0,
    var correctAnswers: Int = 0,
    var wrongAnswers: Int = 0,
    var streak: Int = 0,
    var bestStreak: Int = 0,

    // Mode Glou
    var pv: Int = 30,
    var isEliminated: Boolean = false,

    // Bonus disponibles (par joueur)
    var bonusSwitchQuestion: Int = 1,
    var bonusRemoveAnswer: Int = 1,
    var bonusDoublePoints: Int = 1,
    var bonusSecondChance: Int = 1,
    var bonusSpy: Int = 1,
    var bonusBoost: Int = 1,
    var bonusSabotage: Int = 1,
    var bonusChain: Int = 1,
    var bonusDoubleDown: Int = 1,
    var bonusSerieActive: Boolean = false,

    // Stats
    var duoUsed: Int = 0,
    var carreUsed: Int = 0,
    var cashUsed: Int = 0,
    var cashCorrect: Int = 0,
    var totalQuestionsAnswered: Int = 0,

    var categoryResults: MutableMap<String, Pair<Int, Int>> = mutableMapOf(),
    var lastCategory: String = "",
    var bonusFreeze: Int = 1,
    var bonusSteal: Int = 1,
    var bonusMirror: Int = 1,
    var chainProtection: Boolean = false,
    var mirrorProtection: Boolean = false,
    var boostNext: Boolean = false,
    var glouShield: Boolean = false,
    var comboCategory: String = "",
    var comboCount: Int = 0,
    var duoCorrect: Int = 0,
    var carreCorrect: Int = 0,
    var pointMilestones: MutableMap<Int, Int> = mutableMapOf(),

    // ===== WHEEL SYSTEM =====
    var wheelPoints: Int = 0,
    var wheelSpinsAvailable: Int = 0,
    var spells: MutableList<SpellType> = mutableListOf(),
    var totalSpins: Int = 0,

    // ===== ACTIVE SPELL EFFECTS =====
    var spellFreezeTimer: Boolean = false,
    var spellShield: Boolean = false,
    var spellDoubleNext: Boolean = false,
    var spellTripleNext: Boolean = false,
    var spellReveal: Boolean = false,
    var spellStreakShield: Int = 0,
    var streakBonusAccumulated: Int = 0
) {
    fun addPoints(points: Int) {
        score += points
        correctAnswers++
        streak++
        if (streak > bestStreak) bestStreak = streak
        totalQuestionsAnswered++
        recordPointMilestones()
    }

    fun recordPointMilestones() {
        if (totalQuestionsAnswered > 0) {
            listOf(10, 15, 20).forEach { target ->
                if (score >= target) pointMilestones.putIfAbsent(target, totalQuestionsAnswered)
            }
        }
    }

    fun wrongAnswer() {
        wrongAnswers++
        if (chainProtection || spellStreakShield > 0) {
            if (chainProtection) chainProtection = false else spellStreakShield--
        } else {
            streak = 0
            if (streakBonusAccumulated > 0) {
                score = (score - streakBonusAccumulated).coerceAtLeast(0)
                streakBonusAccumulated = 0
            }
            wheelPoints = (wheelPoints / 2).coerceAtLeast(0)
        }
        totalQuestionsAnswered++
    }

    fun addStreakBonus(bonus: Int) {
        if (bonus > 0) streakBonusAccumulated += bonus
    }

    fun addWheelPoints(points: Int): Int {
        val previousWP = wheelPoints
        wheelPoints += points
        val newSpins = SpellWheelConfig.countNewSpins(previousWP, wheelPoints)
        wheelSpinsAvailable += newSpins
        return newSpins
    }

    fun useWheelSpin(): SpellType? {
        if (wheelSpinsAvailable <= 0) return null
        wheelSpinsAvailable--
        totalSpins++
        val spell = SpellWheelConfig.spinWheel(streak)
        spells.add(spell)
        return spell
    }

    fun activateSpell(spell: SpellType): Boolean {
        val idx = spells.indexOf(spell)
        if (idx == -1) return false
        spells.removeAt(idx)
        when (spell) {
            SpellType.FREEZE_TIMER -> spellFreezeTimer = true
            SpellType.SHIELD -> spellShield = true
            SpellType.DOUBLE_NEXT -> spellDoubleNext = true
            SpellType.TRIPLE_NEXT -> spellTripleNext = true
            SpellType.REVEAL -> spellReveal = true
            SpellType.STREAK_SHIELD -> spellStreakShield += 2
            else -> {}
        }
        return true
    }

    fun hasSpell(spell: SpellType): Boolean = spells.contains(spell)

    fun losePoints(amount: Int) {
        score = (score - amount).coerceAtLeast(0)
    }

    val accuracy: Int get() =
        if (correctAnswers + wrongAnswers == 0) 0
        else (correctAnswers * 100) / (correctAnswers + wrongAnswers)

    val totalAnswered: Int get() = correctAnswers + wrongAnswers

    fun hasBonusSwitchQuestion() = bonusSwitchQuestion > 0
    fun hasBonusRemoveAnswer() = bonusRemoveAnswer > 0
    fun hasBonusDoublePoints() = bonusDoublePoints > 0
    fun hasBonusSecondChance() = bonusSecondChance > 0
    fun hasBonusSpy() = bonusSpy > 0
    fun hasBonusBoost() = bonusBoost > 0
    fun hasBonusSabotage() = bonusSabotage > 0
    fun hasBonusChain() = bonusChain > 0
    fun hasBonusDoubleDown() = bonusDoubleDown > 0

    fun useBonusSwitchQuestion() { bonusSwitchQuestion-- }
    fun useBonusRemoveAnswer() { bonusRemoveAnswer-- }
    fun useBonusDoublePoints() { bonusDoublePoints-- }
    fun useBonusSecondChance() { bonusSecondChance-- }
    fun useBonusSpy() { bonusSpy-- }
    fun useBonusBoost() { bonusBoost-- }
    fun useBonusSabotage() { bonusSabotage-- }
    fun useBonusChain() { bonusChain-- }
    fun useBonusDoubleDown() { bonusDoubleDown-- }

    fun takeDamage(amount: Int) {
        pv = (pv - amount).coerceAtLeast(0)
        if (pv <= 0) isEliminated = true
    }

    fun heal(amount: Int) {
        pv = (pv + amount).coerceAtMost(30)
    }

    fun inflictDamage(amount: Int): Int = amount

    fun availableModes(): List<ResponseMode> = ResponseMode.values().toList()

    fun trackResponseMode(mode: ResponseMode) {
        when (mode) {
            ResponseMode.DUO -> duoUsed++
            ResponseMode.CARRE -> carreUsed++
            ResponseMode.CASH -> cashUsed++
        }
    }
}
