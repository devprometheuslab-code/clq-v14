package com.prometheus.clq.model

data class GameConfig(
    val players: List<Player>,
    val questionsPerPlayer: Int = 10,
    val timePerQuestion: Int = 30,
    val categories: List<String> = listOf("ALL"),
    val difficulty: Difficulty? = null,
    val mode: GameMode = GameMode.CLASSIC,
    val glouStartPV: Int = 30,
    val timeAttackDuration: Int = 120  // seconds for time attack mode
)

enum class GameMode(val label: String, val emoji: String, val description: String) {
    CLASSIC("Classique", "\uD83C\uDFC6", "Mode standard avec DUO/CARRÉ/CASH"),
    TIME_ATTACK("Time Attack", "⏱\uFE0F", "Maximum de questions en temps limité"),
    GLOU("Mode Glou", "\uD83E\uDEE7", "Mode fun social avec PV et Glou");

    companion object {
        fun fromName(name: String): GameMode =
            values().find { it.name == name } ?: CLASSIC
    }
}
