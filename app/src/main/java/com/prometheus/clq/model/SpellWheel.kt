package com.prometheus.clq.model

/**
 * Systeme de Roue Magique — Champion League Quizz
 *
 * Les joueurs accumulent des "wheel points" (WP) en repondant correctement :
 *   - Niveau EASY   = 1 WP
 *   - Niveau MEDIUM = 2 WP
 *   - Niveau HARD   = 3 WP
 *   - Niveau EXPERT = 4 WP
 *
 * Paliers pour debloquer un spin : 8, 12, 16, 20, 25, 30, 36, 42, 50 ...
 * Un streak eleve augmente la probabilite de sorts puissants.
 */

// ===== SPELL TYPES =====

enum class SpellRarity(val label: String, val color: Long) {
    COMMON("Commun", 0xFF90CAF9),        // Bleu clair
    UNCOMMON("Peu commun", 0xFF66BB6A),  // Vert
    RARE("Rare", 0xFFAB47BC),            // Violet
    EPIC("Épique", 0xFFFFB300),          // Or
    LEGENDARY("Légendaire", 0xFFFF1744)  // Rouge
}

enum class SpellType(
    val label: String,
    val emoji: String,
    val description: String,
    val rarity: SpellRarity
) {
    // COMMON — petits bonus
    BONUS_1PT("+1 Point", "\u2B50", "Gagne 1 point bonus immédiatement", SpellRarity.COMMON),
    BONUS_2PT("+2 Points", "\u2B50\u2B50", "Gagne 2 points bonus immédiatement", SpellRarity.COMMON),

    // UNCOMMON — bonus tactiques
    FREEZE_TIMER("Gel du Timer", "\u2744\uFE0F", "Le timer est gelé pour ta prochaine question", SpellRarity.UNCOMMON),
    SHIELD("Bouclier", "\uD83D\uDEE1\uFE0F", "Protège d'un malus à la prochaine mauvaise réponse", SpellRarity.UNCOMMON),
    DOUBLE_NEXT("Double Suivant", "\u2716\uFE0F", "Double les points de ta prochaine bonne réponse", SpellRarity.UNCOMMON),

    // RARE — bonus offensifs/defensifs
    STEAL_3("Vol de 3pts", "\uD83E\uDD77", "Vole 3 points au joueur en tête", SpellRarity.RARE),
    HEAL_5PV("Soin +5 PV", "\uD83D\uDC9A", "Restaure 5 PV (mode Glou)", SpellRarity.RARE),
    NUKE_2("Nuke -2pts", "\uD83D\uDCA3", "Tous les adversaires perdent 2 points", SpellRarity.RARE),

    // EPIC — tres puissant
    REVEAL("Révélation", "\uD83D\uDC41\uFE0F", "Vois la bonne réponse avant de choisir", SpellRarity.EPIC),
    STREAK_SHIELD("Protège-Streak", "\u26D3\uFE0F", "Ton streak est protégé pendant 2 questions", SpellRarity.EPIC),

    // LEGENDARY — game changer
    TRIPLE_NEXT("Triple Suivant", "\uD83D\uDC8E", "Triple les points de ta prochaine bonne réponse", SpellRarity.LEGENDARY),
    APOCALYPSE("Apocalypse", "\uD83D\uDD25", "Tous les adversaires perdent 5 PV / 5 points", SpellRarity.LEGENDARY)
}

// ===== WHEEL CONFIGURATION =====

data class WheelSlice(
    val spell: SpellType,
    val weight: Float      // Poids de base (ajuste par le streak)
)

object SpellWheelConfig {

    /** Paliers de WP pour debloquer un spin */
    val THRESHOLDS = listOf(8, 12, 16, 20, 25, 30, 36, 42, 50, 60, 72, 86, 100)

    /** Retourne le prochain palier non atteint, ou null si tous depasses */
    fun getNextThreshold(currentWP: Int): Int? {
        return THRESHOLDS.firstOrNull { it > currentWP }
    }

    /** Verifie si un palier vient d'etre atteint */
    fun checkThresholdReached(previousWP: Int, newWP: Int): Boolean {
        return THRESHOLDS.any { it in (previousWP + 1)..newWP }
    }

    /** Nombre de spins gagnes d'un coup (si on saute plusieurs paliers) */
    fun countNewSpins(previousWP: Int, newWP: Int): Int {
        return THRESHOLDS.count { it in (previousWP + 1)..newWP }
    }

    /**
     * Genere la roue avec des poids ajustes selon le streak.
     * Plus le streak est haut, plus les sorts rares/epiques/legendaires ont de poids.
     */
    fun buildWheel(streak: Int): List<WheelSlice> {
        // Multiplicateurs de rarete selon le streak
        val streakBoost = when {
            streak >= 10 -> 4.0f   // DIVIN — legende accessible
            streak >= 7  -> 3.0f   // INARRETABLE
            streak >= 5  -> 2.0f   // EN FEU
            streak >= 3  -> 1.5f   // Serie
            else         -> 1.0f   // Normal
        }

        return listOf(
            // COMMON — poids eleve de base, diminue avec le streak
            WheelSlice(SpellType.BONUS_1PT,       30f / streakBoost),
            WheelSlice(SpellType.BONUS_2PT,       25f / streakBoost),

            // UNCOMMON — stable
            WheelSlice(SpellType.FREEZE_TIMER,    15f),
            WheelSlice(SpellType.SHIELD,          15f),
            WheelSlice(SpellType.DOUBLE_NEXT,     12f),

            // RARE — booste par le streak
            WheelSlice(SpellType.STEAL_3,         6f * streakBoost),
            WheelSlice(SpellType.HEAL_5PV,        5f * streakBoost),
            WheelSlice(SpellType.NUKE_2,          5f * streakBoost),

            // EPIC — booste fortement
            WheelSlice(SpellType.REVEAL,          3f * streakBoost),
            WheelSlice(SpellType.STREAK_SHIELD,   2f * streakBoost),

            // LEGENDARY — quasi impossible sauf gros streak
            WheelSlice(SpellType.TRIPLE_NEXT,     1f * streakBoost * streakBoost),
            WheelSlice(SpellType.APOCALYPSE,      0.5f * streakBoost * streakBoost)
        )
    }

    /**
     * Tire un spell aleatoirement en respectant les poids.
     */
    fun spinWheel(streak: Int): SpellType {
        val wheel = buildWheel(streak)
        val totalWeight = wheel.sumOf { it.weight.toDouble() }.toFloat()
        var random = (Math.random() * totalWeight).toFloat()

        for (slice in wheel) {
            random -= slice.weight
            if (random <= 0) return slice.spell
        }
        return wheel.last().spell
    }

    /**
     * Construit 8 secteurs visuels pour l'affichage de la roue.
     * Chaque secteur represente un groupe de sorts.
     */
    fun buildVisualWheel(streak: Int): List<WheelSlice> {
        val fullWheel = buildWheel(streak)
        // Prendre les 8 sorts les plus probables pour l'affichage
        return fullWheel.sortedByDescending { it.weight }.take(8)
    }
}
