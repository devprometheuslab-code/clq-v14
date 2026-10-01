package com.prometheus.clq.model

data class Question(
    val id: Int,
    val text: String,
    val answers: List<String>,
    val correctIndex: Int,
    val category: String,
    val difficulty: Difficulty,
    val points: Int = difficulty.basePoints,
    val cashAnswer: String = answers.getOrElse(correctIndex) { "" },
    val alternativeAnswers: List<String> = emptyList(),
    val level: Int = difficulty.toLevel(),
    /**
     * Texte explicatif optionnel affiché dans le menu déroulant après la réponse.
     * Vide = un texte générique (catégorie + difficulté + bonne réponse) sera utilisé.
     */
    val explanation: String = ""
) {
    /**
     * Renvoie false si la bonne réponse n'a de sens QUE par rapport aux options
     * affichées (ex. "Tous les trois", "Aucun", "Les deux"...). Dans ce cas, le
     * mode CASH (saisie clavier) doit être désactivé car le joueur ne peut pas
     * deviner la formulation exacte.
     */
    fun isCashable(): Boolean {
        val correct = answers.getOrElse(correctIndex) { "" }.trim().lowercase()
        if (correct.isEmpty()) return false

        // Patterns "réponse meta" — n'a de sens qu'avec les options visibles
        val nonCashablePatterns = listOf(
            // Quantite explicite
            Regex("^tous les (deux|trois|quatre|cinq)\\b"),
            Regex("^toutes les (deux|trois|quatre|cinq)\\b"),
            Regex("^les (deux|trois|quatre|cinq)$"),
            // Reference aux autres options
            Regex("^tous les (précédents|precedents|suivants|cités|cites|énoncés|enonces)\\b"),
            Regex("^toutes les (précédentes|precedentes|suivantes|citées|citees|énoncées|enoncees)\\b"),
            Regex("^tous ces (animaux|éléments|elements|exemples|choix|cas|points)\\b"),
            Regex("^toutes ces (réponses|reponses|propositions|options)\\b"),
            // "Aucun" — strict pour ne pas bloquer "Aucune defaite en 300 matchs"
            Regex("^aucun(e)?\\s*$"),                                         // "aucun" / "aucune" seul
            Regex("^aucun(e)?\\s+(de|des)\\s+(ces|trois|deux|quatre|cinq|propositions|choix|réponses|reponses)\\b"),
            Regex("^aucun(e)?\\s+(de|des)\\s*$"),                             // "aucun de" / "aucun des" seul
            // Lettres
            Regex("^[abcd] et [abcd]$"),
            Regex("^[abcd], [abcd] et [abcd]$"),
            // Indetermines purs
            Regex("^plusieurs( de ces| des)?\\b"),
            Regex("^toutes( ces| les)?$"),
            Regex("^tous$")
        )
        return nonCashablePatterns.none { it.containsMatchIn(correct) }
    }
}

enum class Difficulty(val basePoints: Int, val label: String) {
    EASY(100, "Facile"),
    MEDIUM(200, "Moyen"),
    HARD(400, "Difficile"),
    EXPERT(800, "Expert");

    fun toLevel(): Int = when (this) {
        EASY -> 1
        MEDIUM -> 2
        HARD -> 3
        EXPERT -> 4
    }
}

/**
 * Mode de réponse — le joueur choisit APRÈS avoir vu la question
 * Tous les modes sont TOUJOURS disponibles (plus de restriction par niveau)
 */
enum class ResponseMode(val label: String, val emoji: String) {
    DUO("Duo", "\uD83D\uDFE2"),      // 🟢
    CARRE("Carré", "\uD83D\uDFE1"),   // 🟡
    CASH("Cash", "\uD83D\uDD34");     // 🔴

    companion object {
        fun availableFor(playerLevel: Int): List<ResponseMode> {
            // Tous les modes toujours disponibles
            return values().toList()
        }
    }
}

/**
 * Nouveau tableau de scoring CLQ basé sur la DIFFICULTÉ de la question (plus de niveau joueur)
 *
 * Difficulté | Duo | Carré | Cash | Malus si faux
 *   EASY     |  1  |   2   |  3   |  0
 *   MEDIUM   |  2  |   3   |  5   | -1
 *   HARD     |  3  |   5   |  8   | -2
 *   EXPERT   |  5  |   8   |  12  | -3
 */
object ScoringTable {
    data class ScoringRow(
        val duo: Int,
        val carre: Int,
        val cash: Int,
        val wrongPenalty: Int,
        val label: String
    )

    private val table = mapOf(
        Difficulty.EASY to ScoringRow(1, 2, 3, 0, "Facile"),
        Difficulty.MEDIUM to ScoringRow(2, 3, 5, 1, "Moyen"),
        Difficulty.HARD to ScoringRow(3, 5, 8, 2, "Difficile"),
        Difficulty.EXPERT to ScoringRow(5, 8, 12, 3, "Expert")
    )

    fun getPoints(difficulty: Difficulty, mode: ResponseMode): Int {
        val row = table[difficulty] ?: table[Difficulty.EASY]!!
        return when (mode) {
            ResponseMode.DUO -> row.duo
            ResponseMode.CARRE -> row.carre
            ResponseMode.CASH -> row.cash
        }
    }

    fun getWrongPenalty(difficulty: Difficulty): Int {
        val row = table[difficulty] ?: table[Difficulty.EASY]!!
        return row.wrongPenalty
    }

    fun getRow(difficulty: Difficulty): ScoringRow = table[difficulty] ?: table[Difficulty.EASY]!!

    // Legacy compatibility — map old level to difficulty
    fun getPoints(level: Int, mode: ResponseMode): Int {
        val diff = when (level) {
            1 -> Difficulty.EASY
            2 -> Difficulty.MEDIUM
            3 -> Difficulty.HARD
            else -> Difficulty.EXPERT
        }
        return getPoints(diff, mode)
    }

    fun getRow(level: Int): ScoringRow {
        val diff = when (level) {
            1 -> Difficulty.EASY
            2 -> Difficulty.MEDIUM
            3 -> Difficulty.HARD
            else -> Difficulty.EXPERT
        }
        return getRow(diff)
    }

    fun isAvailable(level: Int, mode: ResponseMode): Boolean = true

    /** Aperçu des points pour chaque mode à une difficulté donnée */
    fun getPointsPreview(difficulty: Difficulty): Map<ResponseMode, Pair<Int, Int>> {
        val row = table[difficulty] ?: table[Difficulty.EASY]!!
        return mapOf(
            ResponseMode.DUO to Pair(row.duo, row.wrongPenalty),
            ResponseMode.CARRE to Pair(row.carre, row.wrongPenalty),
            ResponseMode.CASH to Pair(row.cash, row.wrongPenalty)
        )
    }
}
