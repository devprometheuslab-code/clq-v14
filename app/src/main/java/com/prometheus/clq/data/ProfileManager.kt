package com.prometheus.clq.data

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Gestion des profils joueurs sauvegardés.
 * Chaque profil contient : nom, avatar, stats cumulées, succès.
 */
class ProfileManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("clq_profiles", Context.MODE_PRIVATE)
    private val gson = Gson()

    companion object {
        const val KEY_PROFILES = "saved_profiles"
        const val KEY_ACTIVE_PROFILE = "active_profile_id"
        const val MAX_PROFILES = 20
    }

    // ===== DATA CLASSES =====

    data class PlayerProfile(
        val id: String,                        // UUID unique
        var name: String,
        var avatarId: String = "avatar_robot",  // ID de l'avatar choisi
        var level: Int = 1,                     // Niveau global 1-50

        // Stats cumulées
        var totalGames: Int = 0,
        var totalWins: Int = 0,
        var totalQuestionsAnswered: Int = 0,
        var totalCorrect: Int = 0,
        var totalWrong: Int = 0,
        var totalScore: Int = 0,
        var bestScore: Int = 0,
        var bestStreak: Int = 0,

        // Stats par mode
        var classicGames: Int = 0,
        var classicWins: Int = 0,
        var timeAttackGames: Int = 0,
        var timeAttackBestScore: Int = 0,
        var glouGames: Int = 0,
        var glouWins: Int = 0,
        var glouSurvivalRate: Int = 0,         // % de survie

        // Stats par mode de réponse
        var duoUsed: Int = 0,
        var duoCorrect: Int = 0,
        var carreUsed: Int = 0,
        var carreCorrect: Int = 0,
        var cashUsed: Int = 0,
        var cashCorrect: Int = 0,

        // Stats par catégorie (nom -> [correct, total])
        var categoryStats: MutableMap<String, IntArray> = mutableMapOf(),

        // XP & niveaux
        var xp: Int = 0,
        var xpToNextLevel: Int = 100,

        // Titres débloqués
        var titles: MutableList<String> = mutableListOf("Débutant"),
        var activeTitle: String = "Débutant",

        // Date
        var createdAt: Long = System.currentTimeMillis(),
        var lastPlayedAt: Long = System.currentTimeMillis()
    ) {
        val accuracy: Int
            get() = if (totalQuestionsAnswered == 0) 0
            else (totalCorrect * 100) / totalQuestionsAnswered

        val winRate: Int
            get() = if (totalGames == 0) 0
            else (totalWins * 100) / totalGames

        val cashAccuracy: Int
            get() = if (cashUsed == 0) 0
            else (cashCorrect * 100) / cashUsed

        fun bestCategory(): String? {
            return categoryStats.maxByOrNull { entry ->
                if (entry.value[1] > 0) (entry.value[0] * 100) / entry.value[1] else 0
            }?.key
        }

        fun worstCategory(): String? {
            return categoryStats.filter { it.value[1] >= 3 }.minByOrNull { entry ->
                (entry.value[0] * 100) / entry.value[1]
            }?.key
        }
    }

    // ===== CRUD =====

    fun getAllProfiles(): List<PlayerProfile> {
        val json = prefs.getString(KEY_PROFILES, null) ?: return emptyList()
        val type = object : TypeToken<List<PlayerProfile>>() {}.type
        return runCatching { gson.fromJson<List<PlayerProfile>>(json, type) }.getOrNull() ?: emptyList()
    }

    fun getProfile(id: String): PlayerProfile? {
        return getAllProfiles().find { it.id == id }
    }

    fun getActiveProfile(): PlayerProfile? {
        val activeId = prefs.getString(KEY_ACTIVE_PROFILE, null) ?: return null
        return getProfile(activeId)
    }

    fun setActiveProfile(id: String) {
        prefs.edit().putString(KEY_ACTIVE_PROFILE, id).apply()
    }

    fun saveProfile(profile: PlayerProfile, completedGameId: String? = null) {
        val profiles = getAllProfiles().toMutableList()
        val index = profiles.indexOfFirst { it.id == profile.id }
        if (index >= 0) {
            profiles[index] = profile
        } else {
            if (profiles.size >= MAX_PROFILES) return // Max atteint
            profiles.add(profile)
        }
        val editor = prefs.edit().putString(KEY_PROFILES, gson.toJson(profiles))
        if (completedGameId != null) editor.putString("last_game_${profile.id}", completedGameId)
        editor.apply()
    }

    fun createProfile(name: String, avatarId: String): PlayerProfile {
        val profile = PlayerProfile(
            id = java.util.UUID.randomUUID().toString(),
            name = name,
            avatarId = avatarId
        )
        saveProfile(profile)
        setActiveProfile(profile.id)
        return profile
    }

    fun deleteProfile(id: String) {
        val profiles = getAllProfiles().filter { it.id != id }
        prefs.edit().putString(KEY_PROFILES, gson.toJson(profiles)).apply()
        if (prefs.getString(KEY_ACTIVE_PROFILE, null) == id) {
            prefs.edit().remove(KEY_ACTIVE_PROFILE).apply()
        }
    }

    // ===== UPDATE STATS AFTER GAME =====

    fun updateAfterGame(
        profileId: String,
        score: Int,
        correctAnswers: Int,
        wrongAnswers: Int,
        bestStreak: Int,
        isWinner: Boolean,
        mode: String,
        duoUsed: Int = 0,
        duoCorrect: Int = 0,
        carreUsed: Int = 0,
        carreCorrect: Int = 0,
        cashUsed: Int = 0,
        cashCorrect: Int = 0,
        categoryResults: Map<String, Pair<Int, Int>> = emptyMap(), // cat -> (correct, total)
        survived: Boolean = true,  // For Glou mode
        gameId: String? = null
    ) {
        if (gameId != null && prefs.getString("last_game_$profileId", null) == gameId) return
        val profile = getProfile(profileId) ?: return

        // Stats globales
        profile.totalGames++
        profile.totalScore += score
        profile.totalCorrect += correctAnswers
        profile.totalWrong += wrongAnswers
        profile.totalQuestionsAnswered += correctAnswers + wrongAnswers
        if (score > profile.bestScore) profile.bestScore = score
        if (bestStreak > profile.bestStreak) profile.bestStreak = bestStreak
        if (isWinner) profile.totalWins++

        // Stats par mode
        when (mode) {
            "CLASSIC" -> {
                profile.classicGames++
                if (isWinner) profile.classicWins++
            }
            "TIME_ATTACK" -> {
                profile.timeAttackGames++
                if (score > profile.timeAttackBestScore) profile.timeAttackBestScore = score
            }
            "GLOU" -> {
                profile.glouGames++
                if (isWinner) profile.glouWins++
                val survivals = if (survived) profile.glouSurvivalRate * (profile.glouGames - 1) + 100
                else profile.glouSurvivalRate * (profile.glouGames - 1)
                profile.glouSurvivalRate = survivals / profile.glouGames
            }
        }

        // Stats mode de réponse
        profile.duoUsed += duoUsed
        profile.duoCorrect += duoCorrect
        profile.carreUsed += carreUsed
        profile.carreCorrect += carreCorrect
        profile.cashUsed += cashUsed
        profile.cashCorrect += cashCorrect

        // Stats catégories
        categoryResults.forEach { (cat, result) ->
            val existing = profile.categoryStats.getOrPut(cat) { intArrayOf(0, 0) }
            existing[0] += result.first
            existing[1] += result.second
        }

        // XP
        val xpGained = calculateXp(score, correctAnswers, bestStreak, isWinner, mode)
        profile.xp += xpGained
        while (profile.xp >= profile.xpToNextLevel) {
            profile.xp -= profile.xpToNextLevel
            profile.level++
            profile.xpToNextLevel = calculateXpNeeded(profile.level)
            checkTitleUnlocks(profile)
        }

        profile.lastPlayedAt = System.currentTimeMillis()
        saveProfile(profile, gameId)
    }

    private fun calculateXp(
        score: Int, correct: Int, streak: Int, isWinner: Boolean, mode: String
    ): Int {
        var xp = score * 5 + correct * 10 + streak * 15
        if (isWinner) xp += 50
        if (mode == "GLOU") xp = (xp * 1.2).toInt()
        return xp
    }

    private fun calculateXpNeeded(level: Int): Int {
        return 100 + (level - 1) * 50  // 100, 150, 200, 250...
    }

    private fun checkTitleUnlocks(profile: PlayerProfile) {
        val titlesToCheck = mapOf(
            5 to "Apprenti",
            10 to "Connaisseur",
            15 to "Expert",
            20 to "Maître Quiz",
            25 to "Champion",
            30 to "Légende",
            35 to "Dieu du Quiz",
            40 to "Immortel",
            45 to "Transcendant",
            50 to "CLQ Ultimate"
        )
        titlesToCheck.forEach { (lvl, title) ->
            if (profile.level >= lvl && title !in profile.titles) {
                profile.titles.add(title)
            }
        }

        // Stats-based titles
        if (profile.totalWins >= 10 && "Vainqueur" !in profile.titles) {
            profile.titles.add("Vainqueur")
        }
        if (profile.bestStreak >= 10 && "Inarrêtable" !in profile.titles) {
            profile.titles.add("Inarrêtable")
        }
        if (profile.cashAccuracy >= 80 && profile.cashUsed >= 20 && "Cash Master" !in profile.titles) {
            profile.titles.add("Cash Master")
        }
        if (profile.glouWins >= 5 && "Survivant" !in profile.titles) {
            profile.titles.add("Survivant")
        }
        if (profile.totalGames >= 100 && "Vétéran" !in profile.titles) {
            profile.titles.add("Vétéran")
        }
    }
}
