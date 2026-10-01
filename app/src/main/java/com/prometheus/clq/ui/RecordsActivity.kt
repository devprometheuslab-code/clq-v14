package com.prometheus.clq.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.prometheus.clq.data.RecordsManager
import com.prometheus.clq.databinding.ActivityRecordsBinding

class RecordsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecordsBinding
    private lateinit var recordsManager: RecordsManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecordsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recordsManager = RecordsManager(this)

        // Global stats
        val totalGames = recordsManager.getTotalGames()
        val totalQ = recordsManager.getTotalQuestions()
        binding.tvGlobalStats.text = "$totalGames parties jouées • $totalQ questions répondues"

        // Load all records
        val records = recordsManager.getAllRecords()
        val noRecord = "---"

        // Best Score
        val bestScore = records[RecordsManager.KEY_BEST_SCORE]
        binding.tvRecordBestScore.text = bestScore?.let { "${it.value} pts" } ?: noRecord
        binding.tvRecordBestScoreDetail.text = bestScore?.let { "${it.playerName} • ${it.detail}" } ?: ""

        // Best Streak
        val bestStreak = records[RecordsManager.KEY_BEST_STREAK]
        binding.tvRecordBestStreak.text = bestStreak?.let { "${it.value} réponses" } ?: noRecord
        binding.tvRecordBestStreakDetail.text = bestStreak?.let { "${it.playerName} • ${it.detail}" } ?: ""

        // Record 10pts
        val r10 = records[RecordsManager.KEY_RECORD_10PTS]
        binding.tvRecord10.text = r10?.let { "${it.value} questions" } ?: noRecord
        binding.tvRecord10Detail.text = r10?.let { "${it.playerName} • ${it.detail}" } ?: ""

        // Record 15pts
        val r15 = records[RecordsManager.KEY_RECORD_15PTS]
        binding.tvRecord15.text = r15?.let { "${it.value} questions" } ?: noRecord
        binding.tvRecord15Detail.text = r15?.let { "${it.playerName} • ${it.detail}" } ?: ""

        // Record 20pts
        val r20 = records[RecordsManager.KEY_RECORD_20PTS]
        binding.tvRecord20.text = r20?.let { "${it.value} questions" } ?: noRecord
        binding.tvRecord20Detail.text = r20?.let { "${it.playerName} • ${it.detail}" } ?: ""

        // Fastest Death (Glou)
        val fastDeath = records[RecordsManager.KEY_FASTEST_DEATH]
        binding.tvRecordFastestDeath.text = fastDeath?.let { "${it.value} questions" } ?: noRecord
        binding.tvRecordFastestDeathDetail.text = fastDeath?.let { "${it.playerName} • ${it.detail}" } ?: ""

        // Cash Accuracy
        val cashAcc = records[RecordsManager.KEY_BEST_CASH_ACCURACY]
        binding.tvRecordCashAccuracy.text = cashAcc?.let { "${it.value}%" } ?: noRecord
        binding.tvRecordCashAccuracyDetail.text = cashAcc?.let { "${it.playerName} • ${it.detail}" } ?: ""

        binding.btnBack.setOnClickListener { finish() }
    }
}
