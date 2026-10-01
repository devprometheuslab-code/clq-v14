package com.prometheus.clq.ui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.prometheus.clq.R
import com.prometheus.clq.data.AvatarManager
import com.prometheus.clq.data.QuestionBank
import com.prometheus.clq.databinding.ActivitySetupBinding
import com.prometheus.clq.model.*

class SetupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySetupBinding

    // Player data: name field + avatar (plus de niveau !)
    private data class PlayerRow(
        val editText: EditText,
        val avatarView: ImageView,
        var avatarId: String = "avatar_robot",
        var profileId: String? = null
    )

    private val playerRows = mutableListOf<PlayerRow>()
    private var activePlayers = 1
    private var restoring = false
    private var bankReady = false
    private var selectedMode: GameMode = GameMode.CLASSIC

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySetupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupPlayerRows()
        setupModeButtons()
        setupCategorySpinner()
        setupSliders()
        restoreLastSetup()

        binding.btnSetupBack.setOnClickListener { finish() }
        binding.btnAddPlayer.setOnClickListener {
            if (activePlayers < playerRows.size) { activePlayers++; updatePlayerVisibility(); updateSummary() }
        }
        binding.btnRemovePlayer.setOnClickListener {
            if (activePlayers > 1) { activePlayers--; updatePlayerVisibility(); updateSummary() }
        }
        binding.btnStartGame.setOnClickListener { GameJuice.vibrateModeSelect(this); startGame() }
    }

    // ===== Préférences : on retrouve la dernière config (noms, avatars, réglages) =====
    private val prefs by lazy { getSharedPreferences("clq_setup", MODE_PRIVATE) }

    private fun restoreLastSetup() {
        restoring = true
        playerRows.forEachIndexed { i, row ->
            row.profileId = prefs.getString("profile_$i", null)
            prefs.getString("name_$i", null)?.let { row.editText.setText(it) }
            prefs.getString("avatar_$i", null)?.let { row.avatarId = it; updateAvatarDisplay(row) }
        }
        activePlayers = prefs.getInt("player_count", (playerRows.indexOfLast { !it.editText.text.isNullOrBlank() } + 1).coerceAtLeast(1)).coerceIn(1, 6)
        updatePlayerVisibility()
        restoring = false
        binding.sliderQuestions.value = prefs.getInt("qpp", 10).toFloat().coerceIn(5f, 30f)
        binding.sliderTime.value = prefs.getInt("time", 30).toFloat().coerceIn(10f, 60f)
        selectedMode = runCatching { GameMode.valueOf(prefs.getString("mode", "CLASSIC")!!) }.getOrDefault(GameMode.CLASSIC)
        if (selectedMode == GameMode.TIME_ATTACK) selectedMode = GameMode.CLASSIC
        updateModeSelection()
        updateSummary()
    }

    private fun saveSetup(category: String) {
        val e = prefs.edit().putInt("player_count", activePlayers)
        playerRows.forEachIndexed { i, row ->
            e.putString("name_$i", row.editText.text?.toString()?.trim() ?: "")
            e.putString("avatar_$i", row.avatarId)
            e.putString("profile_$i", row.profileId)
        }
        e.putInt("qpp", binding.sliderQuestions.value.toInt())
        e.putInt("time", binding.sliderTime.value.toInt())
        e.putString("mode", selectedMode.name)
        e.putString("category", category)
        e.apply()
    }

    private fun setupSliders() {
        binding.sliderQuestions.addOnChangeListener { _, _, _ -> updateSummary() }
        binding.sliderTime.addOnChangeListener { _, _, _ -> updateSummary() }
        playerRows.forEach { row ->
            row.editText.addTextChangedListener(object : android.text.TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, a: Int, b: Int, c: Int) {}
                override fun onTextChanged(s: CharSequence?, a: Int, b: Int, c: Int) {}
                override fun afterTextChanged(s: android.text.Editable?) {
                    if (!restoring) row.profileId = null
                    updateSummary()
                }
            })
        }
    }

    /** Valeurs des curseurs + résumé « 2 joueurs · 20 questions · ~10 min » au-dessus du bouton. */
    private fun updateSummary() {
        val qpp = binding.sliderQuestions.value.toInt()
        val time = binding.sliderTime.value.toInt()
        binding.tvQuestionsValue.text = "$qpp"
        binding.tvTimeValue.text = "$time s"
        val nPlayers = activePlayers
        val total = qpp * nPlayers
        val minutes = ((total * (time * 0.6 + 12)) / 60).toInt().coerceAtLeast(1)
        binding.tvPlayerCount.text = "$activePlayers / 6"
        binding.btnStartGame.isEnabled = bankReady && (selectedMode != GameMode.GLOU || activePlayers >= 2)
        binding.btnStartGame.text = when {
            !bankReady -> "Chargement des questions…"
            selectedMode == GameMode.GLOU && activePlayers < 2 -> "Ajoute un deuxième joueur"
            else -> "Lancer la partie"
        }
        binding.tvSetupSummary.text = "$nPlayers joueur${if (nPlayers > 1) "s" else ""} · $total questions · ≈ $minutes min"
    }

    // Default avatar assignments per slot
    private val defaultAvatars = listOf(
        "avatar_robot", "avatar_ninja", "avatar_pirate",
        "avatar_astronaut", "avatar_viking", "avatar_wizard"
    )

    private fun setupPlayerRows() {
        playerRows.clear()
        playerRows.addAll(listOf(
            PlayerRow(binding.etPlayer1, binding.ivAvatar1, avatarId = defaultAvatars[0]),
            PlayerRow(binding.etPlayer2, binding.ivAvatar2, avatarId = defaultAvatars[1]),
            PlayerRow(binding.etPlayer3, binding.ivAvatar3, avatarId = defaultAvatars[2]),
            PlayerRow(binding.etPlayer4, binding.ivAvatar4, avatarId = defaultAvatars[3]),
            PlayerRow(binding.etPlayer5, binding.ivAvatar5, avatarId = defaultAvatars[4]),
            PlayerRow(binding.etPlayer6, binding.ivAvatar6, avatarId = defaultAvatars[5])
        ))

        playerRows.forEach { row ->
            updateAvatarDisplay(row)
            row.avatarView.setOnClickListener { GameJuice.vibrateTap(this); showAvatarPicker(row) }
        }
    }

    private fun updateAvatarDisplay(row: PlayerRow) {
        AvatarManager.loadAvatar(row.avatarView, row.avatarId, circleCrop = false)
    }

    private fun showAvatarPicker(row: PlayerRow) {
        val pm = com.prometheus.clq.data.ProfileManager(this)
        val profiles = pm.getAllProfiles()
        val options = mutableListOf<String>()
        if (profiles.isNotEmpty()) options.add("[PROFILS] Charger un profil (${profiles.size})")
        options.add("[AVATAR] Choisir un avatar (${AvatarManager.getAllAvatars().size} dispo)")
        AlertDialog.Builder(this).setTitle("Joueur")
            .setItems(options.toTypedArray()) { _, which ->
                if (options[which].startsWith("[PROFILS]")) showProfileLoader(row, profiles) else showAvatarOnlyPicker(row)
            }.show()
    }
    private fun showAvatarOnlyPicker(row: PlayerRow) {
        AvatarPicker.show(this) { avatarId ->
            row.avatarId = avatarId; row.profileId = null; updateAvatarDisplay(row)
        }
    }

    private fun showProfileLoader(row: PlayerRow, profiles: List<com.prometheus.clq.data.ProfileManager.PlayerProfile>) {
        AlertDialog.Builder(this).setTitle("Charger un profil").setItems(profiles.map { "${it.name} Lv${it.level}" }.toTypedArray()) { _, w ->
            val p = profiles[w]
            if (playerRows.take(activePlayers).any { it !== row && it.profileId == p.id }) {
                Toast.makeText(this, "Ce profil est déjà dans la partie.", Toast.LENGTH_SHORT).show()
            } else {
                row.avatarId = p.avatarId; row.editText.setText(p.name); row.profileId = p.id
                updateAvatarDisplay(row)
            }
        }.show()
    }

    private fun setupModeButtons() {
        updateModeSelection()

        binding.btnModeClassic.setOnClickListener {
            GameJuice.vibrateModeSelect(this)
            selectedMode = GameMode.CLASSIC
            updateModeSelection()
            updateSummary()
        }
        binding.btnModeTimeAttack.setOnClickListener {
            GameJuice.vibrateModeSelect(this)
            selectedMode = GameMode.TIME_ATTACK
            updateModeSelection()
            updateSummary()
        }
        binding.btnModeGlou.setOnClickListener {
            GameJuice.vibrateModeSelect(this)
            selectedMode = GameMode.GLOU
            updateModeSelection()
            updateSummary()
        }
    }

    private fun updateModeSelection() {
        binding.tvModeDesc.text = when (selectedMode) {
            GameMode.CLASSIC -> "🏆 Classique : chacun son tour, le meilleur score gagne."
            GameMode.GLOU -> "🍺 Glou : chaque joueur a des PV, les mauvaises réponses font mal. Le dernier debout gagne (2 joueurs min.)."
            GameMode.TIME_ATTACK -> "⏱️ Time Attack : un maximum de bonnes réponses avant la fin du chrono."
        }
        val inactive = Color.parseColor("#2A2A55")
        val textInactive = Color.parseColor("#B0B0CC")

        binding.btnModeClassic.setBackgroundColor(inactive)
        binding.btnModeClassic.setTextColor(textInactive)
        binding.btnModeTimeAttack.setBackgroundColor(inactive)
        binding.btnModeTimeAttack.setTextColor(textInactive)
        binding.btnModeGlou.setBackgroundColor(inactive)
        binding.btnModeGlou.setTextColor(textInactive)

        binding.btnModeClassic.isSelected = selectedMode == GameMode.CLASSIC
        binding.btnModeGlou.isSelected = selectedMode == GameMode.GLOU
        binding.btnModeClassic.contentDescription = "Classique" + if (binding.btnModeClassic.isSelected) ", sélectionné" else ""
        binding.btnModeGlou.contentDescription = "Glou" + if (binding.btnModeGlou.isSelected) ", sélectionné" else ""
        when (selectedMode) {
            GameMode.CLASSIC -> {
                binding.btnModeClassic.setBackgroundColor(Color.parseColor("#6200EE"))
                binding.btnModeClassic.setTextColor(Color.WHITE)
            }
            GameMode.TIME_ATTACK -> {
                binding.btnModeTimeAttack.setBackgroundColor(Color.parseColor("#00D4FF"))
                binding.btnModeTimeAttack.setTextColor(Color.BLACK)
            }
            GameMode.GLOU -> {
                binding.btnModeGlou.setBackgroundColor(Color.parseColor("#FFA726"))
                binding.btnModeGlou.setTextColor(Color.BLACK)
            }
        }
    }

    private fun updatePlayerVisibility() {
        playerRows.forEachIndexed { i, row -> (row.editText.parent as View).visibility = if (i < activePlayers) View.VISIBLE else View.GONE }
        binding.btnAddPlayer.isEnabled = activePlayers < 6
        binding.btnRemovePlayer.isEnabled = activePlayers > 1
    }

    override fun onPause() {
        super.onPause()
        saveSetup(categoryKeys.getOrElse(binding.spinnerCategory.selectedItemPosition) { "ALL" })
    }

    /** Clés de catégories (valeurs envoyées au jeu) — l'affichage est en français avec le nombre de questions. */
    private var categoryKeys: List<String> = listOf("ALL")

    private fun setupCategorySpinner() {
        categoryKeys = listOf("ALL") + QuestionBank.categories.filter { it != "ALL" }
        bindCategoryAdapter(emptyMap())
        // Le comptage charge la banque de questions : on le fait hors du thread UI
        Thread {
            val counts = runCatching { QuestionBank.countByCategory() }.getOrDefault(emptyMap())
            runOnUiThread {
                if (!isFinishing && !isDestroyed) {
                    bankReady = counts.isNotEmpty()
                    bindCategoryAdapter(counts)
                    updateSummary()
                    if (!bankReady) binding.tvSetupSummary.text = "Questions indisponibles. Reviens au menu et réessaie."
                }
            }
        }.start()
    }

    private fun bindCategoryAdapter(counts: Map<String, Int>) {
        val previous = categoryKeys.getOrNull(binding.spinnerCategory.selectedItemPosition)
        val keys = if (counts.isEmpty()) categoryKeys
            else categoryKeys.filter { it == "ALL" || (counts[it] ?: 0) >= 20 }
        val labels = keys.map { key ->
            val n = if (key == "ALL") counts.values.sum() else counts[key] ?: 0
            val name = if (key == "ALL") "Toutes les catégories" else key
            if (n > 0) "$name  ($n)" else name
        }
        categoryKeys = keys
        val adapter = android.widget.ArrayAdapter(this, com.prometheus.clq.R.layout.item_spinner_category, labels)
        adapter.setDropDownViewResource(com.prometheus.clq.R.layout.item_spinner_category)
        binding.spinnerCategory.adapter = adapter
        val saved = prefs.getString("category", "ALL")
        val idx = keys.indexOf(previous ?: saved).takeIf { it >= 0 } ?: 0
        binding.spinnerCategory.setSelection(idx.coerceIn(0, keys.size - 1))
    }

    private fun startGame() {
        if (!bankReady) return
        val players = playerRows.take(activePlayers).mapIndexed { i, row ->
            Player(id = i, name = row.editText.text.toString().trim().ifBlank { "Joueur ${i + 1}" },
                avatarId = row.avatarId, profileId = row.profileId)
        }

        if (players.isEmpty()) {
            Toast.makeText(this, "Minimum 1 joueur !", Toast.LENGTH_SHORT).show()
            return
        }

        if (selectedMode == GameMode.GLOU && players.size < 2) {
            Toast.makeText(this, "Mode Glou : minimum 2 joueurs !", Toast.LENGTH_SHORT).show()
            return
        }

        val questionsPerPlayer = binding.sliderQuestions.value.toInt()
        val timePerQ = binding.sliderTime.value.toInt()
        val category = categoryKeys.getOrElse(binding.spinnerCategory.selectedItemPosition) { "ALL" }
        saveSetup(category)

        val intent = Intent(this, GameActivity::class.java)
        intent.putExtra("config_players_json", com.google.gson.Gson().toJson(players))
        intent.putExtra("config_qpp", questionsPerPlayer)
        intent.putExtra("config_time", timePerQ)
        intent.putExtra("config_category", category)
        intent.putExtra("config_mode", selectedMode.name)
        startActivity(intent)
    }
}
