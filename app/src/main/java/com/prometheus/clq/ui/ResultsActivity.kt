package com.prometheus.clq.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.prometheus.clq.adapter.RankingAdapter
import com.prometheus.clq.audio.SoundManager
import com.prometheus.clq.data.ProfileManager
import com.prometheus.clq.data.RecordsManager
import com.prometheus.clq.data.SavedGameStore
import com.prometheus.clq.databinding.ActivityResultsBinding
import com.prometheus.clq.model.Player

class ResultsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultsBinding
    private lateinit var soundManager: SoundManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        soundManager = SoundManager(this)
        val players = intent.getStringExtra("ranking_players_json")?.let {
            runCatching { Gson().fromJson(it, Array<Player>::class.java).toList() }.getOrNull()
        }.orEmpty()
        if (players.isEmpty()) { finish(); return }
        val mode = intent.getStringExtra("game_mode") ?: "CLASSIC"
        val gameId = intent.getStringExtra("game_id") ?: return
        val winnerIds = intent.getIntArrayExtra("winner_ids")?.toSet().orEmpty()
        val winners = players.filter { it.id in winnerIds }.ifEmpty { listOf(players.first()) }
        val first = winners.first()
        binding.tvWinnerEmoji.text = if (players.size == 1) "🎯" else if (winners.size > 1) "🤝" else "🏆"
        binding.tvWinner.text = when {
            players.size == 1 -> "Partie terminée, ${first.name} !"
            winners.size > 1 -> "Égalité : ${winners.joinToString(" & ") { it.name }}"
            else -> "${first.name} remporte la partie !"
        }
        binding.tvWinnerScore.text = if (mode == "GLOU") {
            "${first.pv} PV · ${first.score} points"
        } else "${first.score} points · ${first.correctAnswers}/${first.totalQuestionsAnswered} réponses · ${first.accuracy} %"
        val profiles = ProfileManager(this)
        players.forEach { player ->
            player.profileId?.let { profileId ->
                profiles.updateAfterGame(profileId, player.score, player.correctAnswers, player.wrongAnswers,
                    player.bestStreak, player.id in winnerIds, mode, player.duoUsed, player.duoCorrect,
                    player.carreUsed, player.carreCorrect, player.cashUsed, player.cashCorrect,
                    player.categoryResults, !player.isEliminated, gameId)
            }
        }
        val records = RecordsManager(this).checkAndUpdateRecords(players, mode,
            players.sumOf { it.totalQuestionsAnswered }, gameId)
        SavedGameStore(this).clear()
        if (records.isNotEmpty()) {
            binding.tvNewRecords.visibility = View.VISIBLE
            binding.tvNewRecords.text = "${records.size} nouveau${if (records.size > 1) "x" else ""} record${if (records.size > 1) "s" else ""} !\n" +
                records.joinToString("\n") { (_, record) -> "${record.playerName} · ${record.detail}" }
            soundManager.playNewRecord()
        }
        binding.recyclerRanking.layoutManager = LinearLayoutManager(this)
        binding.recyclerRanking.adapter = RankingAdapter(players, players.map { it.accuracy }, mode, winnerIds)
        if (savedInstanceState == null) GameJuice.celebrateWinner(binding.overlayContainer,
            listOf(binding.tvWinnerEmoji, binding.tvWinner, binding.tvWinnerScore))
        binding.btnPlayAgain.setOnClickListener {
            startActivity(Intent(this, SetupActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP))
            finish()
        }
        binding.btnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP))
            finish()
        }
    }

    override fun onDestroy() {
        if (::soundManager.isInitialized) soundManager.release()
        super.onDestroy()
    }
}
