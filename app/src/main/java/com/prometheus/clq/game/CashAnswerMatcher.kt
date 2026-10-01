package com.prometheus.clq.game

import com.prometheus.clq.data.CashAliases
import java.math.BigDecimal

/** Accept spelling variations without accepting a different number or a fragment of an answer. */
object CashAnswerMatcher {
    private val ignoredWords = setOf("le", "la", "les", "l", "un", "une", "des", "de", "du", "d")
    private val numberPattern = Regex("[+-]?\\d+(?:[.,]\\d+)?")

    fun matches(input: String, acceptedAnswers: List<String>, wrongAnswers: List<String> = emptyList()): Boolean {
        if (input.isBlank() || input.length > 256) return false
        val normalized = CashAliases.normalize(input)
        if (normalized.isBlank()) return false
        val candidates = acceptedAnswers.filter { it.isNotBlank() }.flatMap {
            listOf(it) + CashAliases.alternativesFor(core(it))
        }.distinct()

        // An explicitly offered wrong answer must not become correct through typo tolerance.
        if (wrongAnswers.any { CashAliases.normalize(it) == normalized } &&
            candidates.none { CashAliases.normalize(it) == normalized && numbers(it) == numbers(input) }) return false
        return candidates.any { matchesCandidate(input, it) }
    }

    private fun matchesCandidate(input: String, correct: String): Boolean {
        val inputCore = core(input)
        val correctCore = core(correct)
        val inputNumbers = numbers(inputCore)
        val correctNumbers = numbers(correctCore)
        if (inputNumbers != correctNumbers) return false
        val a = words(input)
        val b = words(correct)
        if (a.isEmpty() || b.isEmpty()) return false
        if (a == b) return true

        // A numeric answer may include a unit or a short sentence, but never another value.
        if (correctNumbers.isNotEmpty() && numberPattern.replace(correctCore, "").isBlank()) return true
        if (a.size != b.size) return false
        return a.zip(b).all { (typed, expected) ->
            if (typed == expected) true
            else if (typed.any(Char::isDigit) || expected.any(Char::isDigit)) false
            else {
                val tolerance = when {
                    minOf(typed.length, expected.length) < 4 -> 0
                    expected.length < 9 -> 1
                    else -> 2
                }
                distance(typed, expected) <= tolerance
            }
        }
    }

    private fun words(text: String): List<String> = CashAliases.normalize(
        core(text)
            .replace(Regex("(?i)^\\s*(je pense que|c['’]est|la reponse est)\\s+"), "")
    ).split(" ").filter { it.isNotBlank() && it !in ignoredWords }

    private fun core(text: String): String = text.replace(Regex("\\s+\\([^)]*\\)|\\s+\\[[^]]*\\]"), " ").trim()

    private fun numbers(text: String): List<String> {
        val compact = text.replace(Regex("(?<=\\d)[ \\u00a0\\u202f](?=\\d{3}\\b)"), "")
        return numberPattern.findAll(compact).map {
            BigDecimal(it.value.replace(',', '.')).stripTrailingZeros().toPlainString()
        }.toList()
    }

    private fun distance(a: String, b: String): Int {
        var previous = IntArray(b.length + 1) { it }
        for (i in a.indices) {
            val current = IntArray(b.length + 1)
            current[0] = i + 1
            for (j in b.indices) current[j + 1] = minOf(
                current[j] + 1, previous[j + 1] + 1,
                previous[j] + if (a[i] == b[j]) 0 else 1
            )
            previous = current
        }
        return previous[b.length]
    }
}
