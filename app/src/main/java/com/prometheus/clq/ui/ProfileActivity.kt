package com.prometheus.clq.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.prometheus.clq.R
import com.prometheus.clq.data.AvatarManager
import com.prometheus.clq.data.ProfileManager

class ProfileActivity : AppCompatActivity() {

    private lateinit var profileManager: ProfileManager
    private lateinit var container: LinearLayout
    private lateinit var tvCount: TextView

    private var pickerMode: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        profileManager = ProfileManager(this)
        container = findViewById(R.id.containerProfiles)
        tvCount = findViewById(R.id.tvProfileCount)

        pickerMode = intent.getBooleanExtra("picker_mode", false)

        findViewById<MaterialButton>(R.id.btnCreateProfile).setOnClickListener {
            showCreateProfileDialog()
        }

        findViewById<MaterialButton>(R.id.btnProfileBack).setOnClickListener { finish() }
        refresh()
    }

    private fun refresh() {
        val profiles = profileManager.getAllProfiles()
        tvCount.text = "${profiles.size} profil${if (profiles.size > 1) "s" else ""} enregistré${if (profiles.size > 1) "s" else ""} (max ${ProfileManager.MAX_PROFILES})"
        container.removeAllViews()
        profiles.forEach { profile ->
            val card = LayoutInflater.from(this).inflate(R.layout.item_profile_card, container, false)
            val iv = card.findViewById<ImageView>(R.id.ivProfileAvatar)
            val tvName = card.findViewById<TextView>(R.id.tvProfileName)
            val tvLevel = card.findViewById<TextView>(R.id.tvProfileLevel)
            val tvStats = card.findViewById<TextView>(R.id.tvProfileStats)
            val btnDel = card.findViewById<MaterialButton>(R.id.btnDeleteProfile)

            AvatarManager.loadAvatar(iv, profile.avatarId)
            tvName.text = profile.name
            tvLevel.text = "Niv. ${profile.level} - ${profile.activeTitle}"
            tvStats.text = "${profile.totalGames} parties - ${profile.totalWins} victoires · Record ${profile.bestScore} pts · Série ${profile.bestStreak}"

            btnDel.setOnClickListener {
                AlertDialog.Builder(this)
                    .setTitle("Supprimer ${profile.name} ?")
                    .setMessage("Les stats seront perdues.")
                    .setPositiveButton("Supprimer") { _, _ ->
                        profileManager.deleteProfile(profile.id)
                        refresh()
                    }
                    .setNegativeButton("Annuler", null)
                    .show()
            }

            card.setOnClickListener {
                if (pickerMode) {
                    val result = Intent()
                    result.putExtra("profile_id", profile.id)
                    result.putExtra("profile_name", profile.name)
                    result.putExtra("profile_avatar", profile.avatarId)
                    setResult(RESULT_OK, result)
                    finish()
                } else {
                    showProfileDetails(profile)
                }
            }
            container.addView(card)
        }

        if (profiles.isEmpty()) {
            val empty = TextView(this)
            empty.text = "\nAucun profil.\nCrée ton premier profil pour sauvegarder tes stats !"
            empty.setTextColor(0xFFB0B0CC.toInt())
            empty.textSize = 14f
            empty.gravity = android.view.Gravity.CENTER
            container.addView(empty)
        }
    }

    private fun showCreateProfileDialog() {
        val profiles = profileManager.getAllProfiles()
        if (profiles.size >= ProfileManager.MAX_PROFILES) {
            Toast.makeText(this, "Max ${ProfileManager.MAX_PROFILES} profils", Toast.LENGTH_SHORT).show()
            return
        }

        val etName = EditText(this)
        etName.hint = "Nom du joueur"
        etName.filters = arrayOf(android.text.InputFilter.LengthFilter(16))
        etName.inputType = android.text.InputType.TYPE_CLASS_TEXT or android.text.InputType.TYPE_TEXT_FLAG_CAP_WORDS
        etName.setPadding(48, 32, 48, 32)

        val ivAvatar = ImageView(this)
        val lp = LinearLayout.LayoutParams(200, 200)
        lp.gravity = android.view.Gravity.CENTER
        ivAvatar.layoutParams = lp

        var chosenAvatar = AvatarManager.getDefaultAvatar().id
        AvatarManager.loadAvatar(ivAvatar, chosenAvatar)
        ivAvatar.setOnClickListener {
            showAvatarPickerGrid { picked ->
                chosenAvatar = picked
                AvatarManager.loadAvatar(ivAvatar, chosenAvatar)
            }
        }

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(32, 16, 32, 16)
        val hint = TextView(this)
        hint.text = "Clique l'avatar pour choisir parmi ${AvatarManager.getAllAvatars().size}"
        hint.setTextColor(0xFFB0B0CC.toInt())
        hint.gravity = android.view.Gravity.CENTER
        layout.addView(ivAvatar)
        layout.addView(hint)
        layout.addView(etName)

        val dialog = AlertDialog.Builder(this).setTitle("Nouveau profil").setView(layout)
            .setPositiveButton("Créer", null).setNegativeButton("Annuler", null).create()
        dialog.setOnShowListener {
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                val name = etName.text.toString().trim()
                if (name.isBlank()) { etName.error = "Indique un nom"; return@setOnClickListener }
                profileManager.createProfile(name, chosenAvatar)
                refresh()
                dialog.dismiss()
            }
        }
        dialog.show()
    }


    private fun showProfileDetails(profile: ProfileManager.PlayerProfile) {
        val msg = buildString {
            appendLine("Niveau ${profile.level} - ${profile.activeTitle}")
            appendLine("XP : ${profile.xp} / ${profile.xpToNextLevel}")
            appendLine()
            appendLine("STATS GLOBALES")
            appendLine("Parties : ${profile.totalGames}")
            appendLine("Victoires : ${profile.totalWins} (${profile.winRate}%)")
            appendLine("Précision : ${profile.accuracy}%")
            appendLine("Meilleur score : ${profile.bestScore}")
            appendLine("Meilleure série : ${profile.bestStreak}")
            appendLine()
            appendLine("PAR MODE")
            appendLine("Classique : ${profile.classicWins}/${profile.classicGames}")
            appendLine("Time Attack best : ${profile.timeAttackBestScore}")
            appendLine("Glou : ${profile.glouWins}/${profile.glouGames} (survie ${profile.glouSurvivalRate}%)")
            appendLine()
            appendLine("CASH : ${profile.cashCorrect}/${profile.cashUsed} (${profile.cashAccuracy}%)")
            appendLine()
            appendLine("Titres : ${profile.titles.joinToString(", ")}")
        }
        AlertDialog.Builder(this)
            .setTitle(profile.name)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .show()
    }

    /**
     * Affiche un dialog avec un grid scrollable de tous les avatars disponibles.
     * Quand l'utilisateur clique un avatar, on rappelle [onPick] avec son ID.
     */
    private fun showAvatarPickerGrid(onPick: (String) -> Unit) = AvatarPicker.show(this, onPick)
}
