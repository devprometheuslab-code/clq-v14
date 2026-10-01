package com.prometheus.clq.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import com.prometheus.clq.R
import com.prometheus.clq.audio.SoundManager
import com.prometheus.clq.data.RecordsManager
import com.prometheus.clq.data.SavedGameStore
import com.prometheus.clq.game.GameEngine
import com.prometheus.clq.databinding.ActivityMainBinding
import com.prometheus.clq.ui.GameJuice

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var soundManager: SoundManager
    private lateinit var recordsManager: RecordsManager
    private val savedGames by lazy { SavedGameStore(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        soundManager = SoundManager(this)
        recordsManager = RecordsManager(this)

        // Animate entrance elements
        animateEntranceElements()

        // Show stats if games played
        val totalGames = recordsManager.getTotalGames()
        if (totalGames > 0) {
            val totalQ = recordsManager.getTotalQuestions()
            binding.tvStats.text = "$totalGames partie${if (totalGames > 1) "s" else ""} • $totalQ question${if (totalQ > 1) "s" else ""} jouée${if (totalQ > 1) "s" else ""}"
            binding.tvStats.visibility = View.VISIBLE
        }

        // Sound toggle button
        updateSoundButton()

        binding.btnPlay.setOnClickListener {
            GameJuice.vibrateModeSelect(this)
            soundManager.playBonus()

            if (savedGames.load() != null) {
                AlertDialog.Builder(this)
                    .setTitle(R.string.new_game_title)
                    .setMessage(R.string.new_game_message)
                    .setPositiveButton(R.string.new_game_continue) { _, _ -> openSetup() }
                    .setNegativeButton(R.string.cancel, null).show()
            } else openSetup()
        }

        binding.btnResume.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java).putExtra("resume_saved_game", true))
        }

        binding.btnRecords.setOnClickListener {
            GameJuice.vibrateTap(this)
            startActivity(Intent(this, RecordsActivity::class.java))
        }

        binding.btnProfiles.setOnClickListener {
            GameJuice.vibrateTap(this)
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        binding.btnRules.setOnClickListener {
            GameJuice.vibrateTap(this)
            startActivity(Intent(this, RulesActivity::class.java))
        }

        binding.btnSound.setOnClickListener {
            GameJuice.vibrateTap(this)
            soundManager.toggleSound()
            updateSoundButton()
        }
    }

    private fun openSetup() {
        startActivity(Intent(this, SetupActivity::class.java))
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }

    private fun updateResumeCard() {
        val saved = savedGames.load()
        binding.layoutResume.visibility = if (saved != null) View.VISIBLE else View.GONE
        if (saved != null) {
            val state = GameEngine.restore(saved.engineSnapshot).getState()
            binding.tvResumeDetails.text = getString(R.string.resume_game_details,
                state.config.mode.label, resources.getQuantityString(R.plurals.resume_players,
                    state.config.players.size, state.config.players.size),
                (state.currentQuestionIndex + 1).coerceAtMost(state.totalQuestions), state.totalQuestions)
        }
    }

    private fun animateEntranceElements() {
        // Collect main UI elements for cascade animation
        val animatedElements = mutableListOf<View>()

        // Add title if it exists
        // Title is not a binding ID — skip (it's a static TextView without an id)

        // Add stats view if visible
        if (binding.tvStats.visibility == View.VISIBLE) {
            animatedElements.add(binding.tvStats)
        }

        // Add buttons in cascade order
        animatedElements.add(binding.btnPlay)
        animatedElements.add(binding.btnRecords)
        animatedElements.add(binding.btnRules)
        animatedElements.add(binding.btnSound)

        // Apply cascade animation
        if (animatedElements.isNotEmpty()) {
            GameJuice.animateElementsCascade(animatedElements, startDelay = 100)
        }
    }

    private fun updateSoundButton() {
        binding.btnSound.text = if (soundManager.isSoundEnabled) "Son activé" else "Son désactivé"
        binding.btnSound.contentDescription = if (soundManager.isSoundEnabled) "Couper les sons et la musique" else "Activer les sons et la musique"
    }

    override fun onResume() {
        super.onResume()
        updateResumeCard()
        updateSoundButton()
        // Refresh stats
        val totalGames = recordsManager.getTotalGames()
        if (totalGames > 0) {
            val totalQ = recordsManager.getTotalQuestions()
            binding.tvStats.text = "$totalGames partie${if (totalGames > 1) "s" else ""} • $totalQ question${if (totalQ > 1) "s" else ""} jouée${if (totalQ > 1) "s" else ""}"
            binding.tvStats.visibility = View.VISIBLE
        }
    }

    override fun onPause() {
        GameJuice.stopNeonGlow(binding.btnPlay)
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        soundManager.release()
    }
}
