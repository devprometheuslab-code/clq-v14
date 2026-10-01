package com.prometheus.clq.data

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Système de records CLQ
 * Tracked automatiquement :
 * - Record 10 points (moins de questions pour atteindre 10 pts)
 * - Record 15 points
 * - Record 20 points
 * - Record mort la plus rapide (mode Glou)
 * - Meilleur streak
 * - Meilleur score total
 * - Meilleure précision Cash
 */
class RecordsManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("clq_records", Context.MODE_PRIVATE)
    private val gson = Gson()

    // ===== DATA CLASSES =====

    data class Record(
        val playerName: String,
        val value: Int,          // Le score/nombre
        val detail: String,      // Détail (ex: "en 5 questions")
        val date: Long = System.currentTimeMillis(),
        val mode: String = ""
    )

    data class GameHistory(
        val date: Long = System.currentTimeMillis(),
        val mode: String,
        val playerCount: Int,
        val winnerName: String,
        val winnerScore: Int,
        val questionsPlayed: Int
    )

    // ===== RECORD KEYS =====

    companion object {
        const val KEY_RECORD_10PTS = "record_10pts"
        const val KEY_RECORD_15PTS = "record_15pts"
        const val KEY_RECORD_20PTS = "record_20pts"
        const val KEY_FASTEST_DEATH = "fastest_death"
        const val KEY_BEST_STREAK = "best_streak"
        const val KEY_BEST_SCORE = "best_score"
        const val KEY_BEST_CASH_ACCURACY = "best_cash_accuracy"
        const val KEY_GAME_HISTORY = "game_history"
        const val KEY_TOTAL_GAMES = "total_games"
        const val KEY_TOTAL_QUESTIONS = "total_questions"
    }

    // ===== GET RECORDS =====

    fun getRecord(key: String): Record? {
        val json = prefs.getString(key, null) ?: return null
        return runCatching { gson.fromJson(json, Record::class.java) }.getOrNull()
    }

    fun getAllRecords(): Map<String, Record?> {
        return mapOf(
            KEY_RECORD_10PTS to getRecord(KEY_RECORD_10PTS),
            KEY_RECORD_15PTS to getRecord(KEY_RECORD_15PTS),
            KEY_RECORD_20PTS to getRecord(KEY_RECORD_20PTS),
            KEY_FASTEST_DEATH to getRecord(KEY_FASTEST_DEATH),
            KEY_BEST_STREAK to getRecord(KEY_BEST_STREAK),
            KEY_BEST_SCORE to getRecord(KEY_BEST_SCORE),
            KEY_BEST_CASH_ACCURACY to getRecord(KEY_BEST_CASH_ACCURACY)
        )
    }

    // ===== UPDATE RECORDS =====

    private fun setRecord(key: String, record: Record) {
        prefs.edit().putString(key, gson.toJson(record)).apply()
    }

    /**
     * Check and update records after a game
     * Returns list of new records achieved
     */
    fun checkAndUpdateRecords(
        players: List<com.prometheus.clq.model.Player>,
        mode: String,
        totalQuestions: Int,
        gameId: String? = null
    ): List<Pair<String, Record>> {
        if (players.isEmpty() || (gameId != null && prefs.getString("last_completed_game", null) == gameId)) return emptyList()
        val newRecords = mutableListOf<Pair<String, Record>>()

        players.forEach { player ->
            // Record meilleur score
            val currentBestScore = getRecord(KEY_BEST_SCORE)
            if (currentBestScore == null || player.score > currentBestScore.value) {
                val modeLabel = when (mode) { "CLASSIC" -> "Classique"; "GLOU" -> "Glou"; "TIME_ATTACK" -> "Time Attack"; else -> mode }
                val record = Record(player.name, player.score, "Mode $modeLabel", mode = mode)
                setRecord(KEY_BEST_SCORE, record)
                newRecords.add(KEY_BEST_SCORE to record)
            }

            // Record meilleur streak
            val currentBestStreak = getRecord(KEY_BEST_STREAK)
            if (currentBestStreak == null || player.bestStreak > (currentBestStreak.value)) {
                val record = Record(player.name, player.bestStreak, "${player.bestStreak} réponses consécutives", mode = mode)
                setRecord(KEY_BEST_STREAK, record)
                newRecords.add(KEY_BEST_STREAK to record)
            }

            // Records X points (meilleur = moins de questions)
            checkPointRecord(player, 10, KEY_RECORD_10PTS, mode)?.let { newRecords.add(it) }
            checkPointRecord(player, 15, KEY_RECORD_15PTS, mode)?.let { newRecords.add(it) }
            checkPointRecord(player, 20, KEY_RECORD_20PTS, mode)?.let { newRecords.add(it) }

            // Cash accuracy
            if (player.cashUsed >= 3) {
                val cashAcc = if (player.cashUsed > 0) (player.cashCorrect * 100) / player.cashUsed else 0
                val currentCashRecord = getRecord(KEY_BEST_CASH_ACCURACY)
                if (currentCashRecord == null || cashAcc > currentCashRecord.value) {
                    val record = Record(player.name, cashAcc, "${player.cashCorrect}/${player.cashUsed} en Cash", mode = mode)
                    setRecord(KEY_BEST_CASH_ACCURACY, record)
                    newRecords.add(KEY_BEST_CASH_ACCURACY to record)
                }
            }
        }

        // Update stats
        val totalGames = prefs.getInt(KEY_TOTAL_GAMES, 0)
        val totalQ = prefs.getInt(KEY_TOTAL_QUESTIONS, 0)
        prefs.edit()
            .putInt(KEY_TOTAL_GAMES, totalGames + 1)
            .putInt(KEY_TOTAL_QUESTIONS, totalQ + totalQuestions)
            .putString("last_completed_game", gameId)
            .apply()

        // Save game history
        saveGameHistory(players, mode, totalQuestions)

        return newRecords
    }

    /**
     * Check Glou fastest death record
     */
    fun checkGlouDeath(player: com.prometheus.clq.model.Player, questionsPlayed: Int): Pair<String, Record>? {
        val currentRecord = getRecord(KEY_FASTEST_DEATH)
        // Lower = "better" (faster death = more impressive record)
        if (currentRecord == null || questionsPlayed < currentRecord.value) {
            val record = Record(player.name, questionsPlayed, "Éliminé en $questionsPlayed questions", mode = "Glou")
            setRecord(KEY_FASTEST_DEATH, record)
            return KEY_FASTEST_DEATH to record
        }
        return null
    }

    private fun checkPointRecord(
        player: com.prometheus.clq.model.Player,
        targetPoints: Int,
        key: String,
        mode: String
    ): Pair<String, Record>? {
        val reachedAt = player.pointMilestones[targetPoints]
        if (reachedAt != null && reachedAt > 0) {
            val questionsUsed = reachedAt
            val currentRecord = getRecord(key)
            // Better record = fewer questions to reach target
            if (currentRecord == null || questionsUsed < currentRecord.value) {
                val record = Record(player.name, questionsUsed, "$targetPoints pts en $questionsUsed questions", mode = mode)
                setRecord(key, record)
                return key to record
            }
        }
        return null
    }

    // ===== GAME HISTORY =====

    private fun saveGameHistory(
        players: List<com.prometheus.clq.model.Player>,
        mode: String,
        totalQuestions: Int
    ) {
        val winner = players.firstOrNull() ?: return
        val tied = players.filter { it.score == winner.score && (mode != "GLOU" || (it.pv == winner.pv && it.isEliminated == winner.isEliminated)) }
        val history = getGameHistory().toMutableList()
        history.add(0, GameHistory(
            mode = mode,
            playerCount = players.size,
            winnerName = tied.joinToString(" & ") { it.name },
            winnerScore = winner.score,
            questionsPlayed = totalQuestions
        ))
        // Keep last 50 games
        val trimmed = history.take(50)
        prefs.edit().putString(KEY_GAME_HISTORY, gson.toJson(trimmed)).apply()
    }

    fun getGameHistory(): List<GameHistory> {
        val json = prefs.getString(KEY_GAME_HISTORY, null) ?: return emptyList()
        val type = object : TypeToken<List<GameHistory>>() {}.type
        return runCatching { gson.fromJson<List<GameHistory>>(json, type) }.getOrNull() ?: emptyList()
    }

    fun getTotalGames(): Int = prefs.getInt(KEY_TOTAL_GAMES, 0)
    fun getTotalQuestions(): Int = prefs.getInt(KEY_TOTAL_QUESTIONS, 0)

    fun clearRecords() {
        prefs.edit().clear().apply()
    }
}
