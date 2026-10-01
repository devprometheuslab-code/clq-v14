package com.prometheus.clq.model

/**
 * Modele multilingue pour les questions CLQ.
 *
 * Permet de stocker une question avec ses textes dans plusieurs langues
 * (francais + anglais + chinois initialement, extensible).
 *
 * Compatible avec le modele Question existant via la methode toQuestion(lang).
 */
data class LocalizedContent(
    val text: String,
    val answers: List<String>,
    val category: String,
    val explanation: String = ""
)

data class BilingualQuestion(
    val id: Int,
    val correctIndex: Int,
    val difficulty: Difficulty,
    val fr: LocalizedContent,
    val en: LocalizedContent,
    val zh: LocalizedContent? = null,
    val es: LocalizedContent? = null,
    val points: Int = difficulty.basePoints,
    val alternativeAnswers: Map<String, List<String>> = emptyMap()
) {
    /**
     * Convertit la question multilingue en Question CLQ standard
     * pour la langue demandee. Fallback EN puis FR si la langue cible manque.
     */
    fun toQuestion(lang: Language = Language.FR): Question {
        val content = when (lang) {
            Language.FR -> fr
            Language.EN -> en
            Language.ZH -> zh ?: en
            Language.ES -> es ?: en
        }
        return Question(
            id = id,
            text = content.text,
            answers = content.answers,
            correctIndex = correctIndex,
            category = content.category,
            difficulty = difficulty,
            points = points,
            cashAnswer = content.answers.getOrElse(correctIndex) { "" },
            alternativeAnswers = alternativeAnswers[lang.code] ?: emptyList(),
            level = difficulty.toLevel(),
            explanation = content.explanation
        )
    }
}

enum class Language(val code: String, val displayName: String, val flag: String) {
    FR("fr", "Francais", "FR"),
    EN("en", "English", "EN"),
    ZH("zh", "中文", "ZH"),
    ES("es", "Espanol", "ES");

    companion object {
        fun fromCode(code: String): Language = values().firstOrNull { it.code == code } ?: FR
    }
}

/**
 * Preference de langue utilisateur (a sauvegarder dans SharedPreferences).
 */
object LanguagePreference {
    private var current: Language = Language.FR

    fun get(): Language = current

    fun set(lang: Language) {
        current = lang
    }

    fun cycle(): Language {
        val all = Language.values()
        val nextIdx = (current.ordinal + 1) % all.size
        current = all[nextIdx]
        return current
    }
}
