package com.prometheus.clq.game

import com.google.gson.Gson
import com.prometheus.clq.model.*
import com.prometheus.clq.data.QuestionBank
import org.junit.Assert.*
import org.junit.Test

class GameEngineRegressionTest {
    private fun game(mode: GameMode = GameMode.CLASSIC, count: Int = 2): GameEngine {
        val e = GameEngine(GameConfig((0 until count).map { Player(it, "Joueur $it") }, mode = mode))
        e.startGame()
        e.getState().questions.clear()
        repeat(8) { e.getState().questions.add(Question(it, "Question $it", listOf("Paris", "Lyon", "Lille", "Nice"), 0, "Test", Difficulty.MEDIUM)) }
        return e
    }
    private fun ready(e: GameEngine, difficulty: Difficulty = Difficulty.MEDIUM) {
        e.getState().questions[e.getState().currentQuestionIndex] = e.getState().currentQuestion!!.copy(difficulty = difficulty)
        e.selectDifficulty(difficulty)
        e.selectResponseMode(ResponseMode.CARRE)
    }
    @Test fun doubleDownActuallyTriplesReward() {
        val e = game(); ready(e); assertTrue(e.activateDoubleDown())
        assertEquals(9, e.submitAnswer(0).pointsDelta)
    }
    @Test fun doubleDownTriplesPenalty() {
        val e = game(); ready(e); e.getState().currentPlayer!!.score = 20
        e.activateDoubleDown(); assertEquals(-3, e.submitAnswer(1).pointsDelta)
    }
    @Test fun chainProtectsOnlyItsOwner() {
        val e = game(); val p = e.getState().config.players
        p[0].streak = 4; p[1].streak = 4
        e.activateChain(); e.getState().currentPlayerIndex = 1; ready(e); e.submitAnswer(1)
        assertEquals(0, p[1].streak); assertTrue(p[0].chainProtection)
    }
    @Test fun chainConsumesOnceAndCountsWrongAnswer() {
        val e = game(); ready(e); val p = e.getState().currentPlayer!!; p.streak = 4
        e.activateChain(); e.submitAnswer(1)
        assertEquals(4, p.streak); assertEquals(1, p.wrongAnswers); assertFalse(p.chainProtection)
        p.wrongAnswer(); assertEquals(0, p.streak)
    }
    @Test fun freezeIsAvailableForEachPlayer() {
        val e = game(); assertTrue(e.activateFreeze()); assertFalse(e.activateFreeze())
        e.getState().currentPlayerIndex = 1; assertTrue(e.activateFreeze())
    }
    @Test fun stealingCannotCreatePoints() {
        val e = game(); val p = e.getState().config.players; p[1].score = 1
        assertSame(p[1], e.activateSteal(p[0], p)); assertEquals(0, p[1].score); assertEquals(1, p[0].score)
        assertEquals(1, e.getLastStealAmount(p[1]))
    }
    @Test fun failedStealDoesNotConsumeBonus() {
        val e = game(); val p = e.getState().config.players
        assertNull(e.activateSteal(p[0], p)); assertTrue(e.stealAvailable)
    }
    @Test fun categoryComboCannotPassToOtherPlayer() {
        val e = game(); ready(e); e.submitAnswer(0)
        e.getState().currentPlayerIndex = 1; assertEquals(1f, e.getCategoryComboMultiplier(), 0f)
    }
    @Test fun glouDamageMustBeResolvedBeforeNextTurn() {
        val e = game(GameMode.GLOU); ready(e); e.submitAnswer(0)
        assertEquals(2, e.pendingGlouDamage); e.nextTurn()
        assertEquals(0, e.getState().currentQuestionIndex); assertEquals(2, e.pendingGlouDamage)
        e.applyGlouToTarget(e.getGlouTargets().first()); assertEquals(28, e.getState().config.players[1].pv)
        e.nextTurn(); assertEquals(1, e.getState().currentQuestionIndex)
    }
    @Test fun glouCannotTargetSelf() {
        val e = game(GameMode.GLOU); ready(e); e.submitAnswer(0)
        assertNull(e.applyGlouToTarget(e.getState().currentPlayer!!)); assertEquals(2, e.pendingGlouDamage)
    }
    @Test fun distributingGlouDoesNotMultiplyDamage() {
        val e = game(GameMode.GLOU, 6); ready(e); e.submitAnswer(0)
        assertEquals(2, e.applyGlouToAll().sumOf { it.amount })
    }
    @Test fun survivingGlouPlayerWinsEvenWithFewerPoints() {
        val e = game(GameMode.GLOU); val p = e.getState().config.players
        p[0].score = 100; p[0].takeDamage(30); p[1].score = 1
        assertEquals(p[1].id, e.rankedPlayers().first().id); assertEquals(listOf(p[1]), e.winners())
    }
    @Test fun duplicateAnswerIsNotScoredTwice() {
        val e = game(); ready(e); val first = e.submitAnswer(0); val second = e.submitAnswer(0)
        assertEquals(first, second); assertEquals(1, e.getState().currentPlayer!!.totalQuestionsAnswered)
    }
    @Test fun responseCountersTrackAnswersNotModeClicks() {
        val e = game(); ready(e); e.selectResponseMode(ResponseMode.CARRE)
        assertEquals(0, e.getState().currentPlayer!!.carreUsed)
        e.submitAnswer(0); assertEquals(1, e.getState().currentPlayer!!.carreUsed)
        assertEquals(1, e.getState().currentPlayer!!.carreCorrect)
        assertEquals(1 to 1, e.getState().currentPlayer!!.categoryResults["Test"])
    }
    @Test fun milestonesRememberFirstCrossing() {
        val p = Player(0, "A"); p.addPoints(12); p.addPoints(10); p.wrongAnswer()
        assertEquals(1, p.pointMilestones[10]); assertEquals(2, p.pointMilestones[20])
    }
    @Test fun gameSnapshotRestoresSharedPlayerIdentityAndPendingDamage() {
        val e = game(GameMode.GLOU); ready(e); e.submitAnswer(0)
        val restored = GameEngine.restore(e.snapshot())
        assertSame(restored.getState().currentPlayer, restored.pendingGlouSource)
        restored.applyGlouToTarget(restored.getGlouTargets().first())
        assertEquals(28, restored.getState().config.players[1].pv)
        assertEquals(1, restored.getState().currentPlayer!!.correctAnswers)
    }
    @Test fun pipeAndUnicodeNamesRoundTrip() {
        val original = listOf(Player(0, "Quentin|é 🏆"))
        val restored = Gson().fromJson(Gson().toJson(original), Array<Player>::class.java)
        assertEquals(original.first().name, restored.first().name)
    }
    @Test fun tiesKeepAllPlayersAndTheirScores() {
        val e = game(); e.getState().config.players.forEach { it.score = 12 }
        assertEquals(2, e.winners().size); assertTrue(e.rankedPlayers().all { it.score == 12 })
    }
    @Test fun finalTurnDoesNotRollRandomEvent() {
        repeat(50) {
            val e = game(); e.getState().currentQuestionIndex = e.getState().totalQuestions - 1
            ready(e); e.submitAnswer(0); e.nextTurn()
            assertTrue(e.getState().isFinished); assertNull(e.getState().lastRandomEvent)
        }
    }
    @Test fun crabQuestionCountsAllTenLegs() {
        val q = QuestionBank.getByCategory("ALL").first { it.text == "Combien de pattes a un crabe?" }
        assertEquals("10", q.answers[q.correctIndex])
    }
    @Test fun playableBankHasValidAnswerIndices() {
        val questions = QuestionBank.getByCategory("ALL")
        assertTrue(questions.isNotEmpty())
        assertTrue(questions.all { it.correctIndex in it.answers.indices && it.answers.size >= 2 })
        println("Playable question bank: ${questions.size} questions, ${QuestionBank.countByCategory().size} categories")
    }
}
