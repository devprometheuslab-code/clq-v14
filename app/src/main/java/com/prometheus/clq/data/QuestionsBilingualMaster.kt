package com.prometheus.clq.data

import com.prometheus.clq.model.Language
import com.prometheus.clq.model.Question

/**
 * Agrégateur des 19 batches bilingues.
 * Total : 9411 questions FR + EN.
 */
object QuestionsBilingualMaster {
    fun getAll(lang: Language = Language.FR): List<Question> {
        return QuestionsBilingualGenerated_1.get(lang) +
        QuestionsBilingualGenerated_2.get(lang) +
        QuestionsBilingualGenerated_3.get(lang) +
        QuestionsBilingualGenerated_4.get(lang) +
        QuestionsBilingualGenerated_5.get(lang) +
        QuestionsBilingualGenerated_6.get(lang) +
        QuestionsBilingualGenerated_7.get(lang) +
        QuestionsBilingualGenerated_8.get(lang) +
        QuestionsBilingualGenerated_9.get(lang) +
        QuestionsBilingualGenerated_10.get(lang) +
        QuestionsBilingualGenerated_11.get(lang) +
        QuestionsBilingualGenerated_12.get(lang) +
        QuestionsBilingualGenerated_13.get(lang) +
        QuestionsBilingualGenerated_14.get(lang) +
        QuestionsBilingualGenerated_15.get(lang) +
        QuestionsBilingualGenerated_16.get(lang) +
        QuestionsBilingualGenerated_17.get(lang) +
        QuestionsBilingualGenerated_18.get(lang) +
        QuestionsBilingualGenerated_19.get(lang)
    }
}
