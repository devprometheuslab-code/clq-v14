package com.prometheus.clq.game

import com.prometheus.clq.model.*
import org.junit.Assert.*
import org.junit.Test

class GameSessionSnapshotTest {
    private fun engine(): GameEngine = GameEngine(GameConfig(listOf(Player(0, "Éloïse | test")))).apply {
        startGame()
        getState().questions.clear()
        getState().questions.add(Question(1, "Capitale ?", listOf("Paris", "Lyon", "Lille", "Nice"), 0, "Test", Difficulty.EASY))
        selectDifficulty(Difficulty.EASY)
        selectResponseMode(ResponseMode.DUO)
    }
    @Test fun checkpointPreservesTimerChoicesAndTypedText() {
        val e = engine()
        val original = GameSessionSnapshot(gameId = "test", engineSnapshot = e.snapshot(),
            clockRemainingMs = 12_345, freezeRemainingMs = 2300, duoMapping = listOf(2, 0),
            cashText = "Éléphant", revealHint = "Indice", infiniteTime = true)
        val restored = GameSessionSnapshot.decode(original.encode())
        assertEquals(original, restored)
        assertEquals("Éloïse | test", GameEngine.restore(restored.engineSnapshot).getState().currentPlayer!!.name)
    }
    @Test fun revealedAnswerCannotBeScoredAgainAfterRelaunch() {
        val e = engine()
        val result = e.submitAnswer(0)
        val saved = GameSessionSnapshot(gameId = "test", engineSnapshot = e.snapshot(),
            answered = true, lastResult = result, wheelApplied = true, explanationOpen = true)
        val restored = GameSessionSnapshot.decode(saved.encode())
        val resumed = GameEngine.restore(restored.engineSnapshot)
        assertEquals(result, resumed.submitAnswer(0))
        assertEquals(1, resumed.getState().currentPlayer!!.totalQuestionsAnswered)
        assertTrue(restored.wheelApplied)
        assertTrue(restored.explanationOpen)
    }
    @Test(expected = IllegalArgumentException::class) fun rejectsUnknownVersion() {
        GameSessionSnapshot.decode(GameSessionSnapshot(gameId = "test", engineSnapshot = engine().snapshot()).encode()
            .replace("\"version\":1", "\"version\":2"))
    }
    @Test(expected = IllegalArgumentException::class) fun rejectsInvalidDuoMapping() {
        GameSessionSnapshot.decode(GameSessionSnapshot(gameId = "test", engineSnapshot = engine().snapshot(), duoMapping = listOf(0, 0)).encode())
    }
    @Test(expected = IllegalArgumentException::class) fun rejectsNegativeClock() {
        GameSessionSnapshot.decode(GameSessionSnapshot(gameId = "test", engineSnapshot = engine().snapshot(), clockRemainingMs = -1).encode())
    }
    @Test(expected = IllegalArgumentException::class) fun rejectsPartialCheckpoint() {
        GameSessionSnapshot.decode("{\"version\":1}")
    }
}
