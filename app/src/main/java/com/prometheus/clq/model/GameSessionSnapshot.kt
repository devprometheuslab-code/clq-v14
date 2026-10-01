package com.prometheus.clq.model

import com.google.gson.Gson
import com.google.gson.JsonParser
import com.prometheus.clq.game.AnswerResult
import com.prometheus.clq.game.GameEngine

/** Versioned checkpoint shared by Android recreation and durable local storage. */
data class GameSessionSnapshot(
    val version: Int = 1,
    val gameId: String,
    val engineSnapshot: String,
    val answered: Boolean = false,
    val clockRemainingMs: Long = 0,
    val freezeRemainingMs: Long = 0,
    val infiniteTime: Boolean = false,
    val choosingGlouTarget: Boolean = false,
    val passPhone: Boolean = false,
    val wheel: Boolean = false,
    val wheelApplied: Boolean = false,
    val lastResult: AnswerResult? = null,
    val cashText: String = "",
    val revealHint: String? = null,
    val duoMapping: List<Int> = emptyList(),
    val explanationOpen: Boolean = false,
    val savedAt: Long = System.currentTimeMillis()
) {
    fun encode(): String = Gson().toJson(this)

    companion object {
        fun decode(json: String): GameSessionSnapshot {
            val root = JsonParser.parseString(json).asJsonObject
            require(root.get("version")?.asInt == 1) { "Unsupported checkpoint version" }
            require(root.has("duoMapping") && root.has("cashText")) { "Incomplete checkpoint" }
            val saved = Gson().fromJson(root, GameSessionSnapshot::class.java)
            require(saved.gameId.isNotBlank() && saved.cashText.length <= 256)
            require(saved.clockRemainingMs in 0..86_400_000 && saved.freezeRemainingMs in 0..86_400_000)
            val state = GameEngine.restore(saved.engineSnapshot).getState()
            require(state.config.players.size in 1..6 && state.questions.isNotEmpty())
            require(state.currentQuestionIndex in 0..state.totalQuestions)
            require(state.currentPlayerIndex in state.config.players.indices)
            require(saved.duoMapping.isEmpty() || (saved.duoMapping.size == 2 &&
                saved.duoMapping.distinct().size == 2 &&
                saved.duoMapping.all { it in state.currentQuestion!!.answers.indices }))
            require(!saved.answered || saved.lastResult != null)
            return saved
        }
    }
}
