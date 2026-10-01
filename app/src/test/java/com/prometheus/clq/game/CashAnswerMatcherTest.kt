package com.prometheus.clq.game

import org.junit.Assert.*
import org.junit.Test

class CashAnswerMatcherTest {
    private fun matches(input: String, answer: String) = CashAnswerMatcher.matches(input, listOf(answer))

    @Test fun acceptsAccentsArticlesAndPunctuation() {
        assertTrue(matches("  etats unis  ", "États-Unis"))
        assertTrue(matches("coeur", "Le cœur"))
        assertTrue(matches("C'est Paris", "Paris"))
    }
    @Test fun normalizesAliasesInBothDirectionsOfPunctuation() {
        assertTrue(matches("USA", "États-Unis"))
        assertTrue(matches("CR7", "Cristiano Ronaldo"))
        assertTrue(matches("de gaulle", "Charles de Gaulle"))
    }
    @Test fun acceptsSmallTyposButNotUnrelatedWords() {
        assertTrue(matches("Pariss", "Paris"))
        assertTrue(matches("Einsten", "Albert Einstein"))
        assertFalse(matches("Lyon", "Paris"))
    }
    @Test fun commonWordCannotValidateDifferentPeopleOrPlaces() {
        assertFalse(matches("Victor Hugo", "Victor Fleming"))
        assertFalse(matches("Victor", "Victor Fleming"))
        assertFalse(matches("Nouvelle Calédonie", "Nouvelle-Zélande"))
        assertFalse(matches("la", "La Terre"))
    }
    @Test fun numbersMustMatchExactly() {
        assertFalse(matches("11", "10"))
        assertFalse(matches("1998", "1999"))
        assertFalse(matches("10 ou 20", "10"))
        assertTrue(matches("10 pattes", "10"))
    }
    @Test fun signsAndDecimalsAreSignificant() {
        assertFalse(matches("3", "-3"))
        assertFalse(matches("35", "3,5"))
        assertTrue(matches("3.50", "3,5"))
        assertTrue(matches("1000", "1 000"))
    }
    @Test fun unitsCannotValidateDifferentQuantities() {
        assertFalse(matches("10 miles", "10 km"))
        assertFalse(matches("120 km", "100 km"))
    }
    @Test fun offeredWrongAnswerIsRejectedEvenWhenOneLetterAway() {
        assertFalse(CashAnswerMatcher.matches("Iran", listOf("Irak"), listOf("Iran")))
    }
    @Test fun explicitAlternativesAndContextRemainAccepted() {
        assertTrue(CashAnswerMatcher.matches("dix", listOf("10", "dix")))
        assertTrue(matches("Einstein", "Albert Einstein (1879–1955)"))
        assertTrue(matches("Paris", "Paris (France)"))
    }
    @Test fun emptyAndOversizedInputsAreRejected() {
        assertFalse(matches("", ""))
        assertFalse(matches("!!!", "Paris"))
        assertFalse(matches("a".repeat(257), "Paris"))
    }
}
