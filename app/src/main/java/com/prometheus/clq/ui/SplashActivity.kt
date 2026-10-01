package com.prometheus.clq.ui

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationSet
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.prometheus.clq.R

/**
 * Splash branding Prometheus pour Champion League Quizz v11.
 *
 *  - Logo anime (fade + scale)
 *  - Son `prometheus_enter` synchro (respecte le mute device via STREAM_MUSIC)
 *  - Duree 2500 ms pour matcher la duree du son
 */
class SplashActivity : AppCompatActivity() {

    private var splashSound: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // 1. Son de branding (silencieux si device mute)
        playBrandingSound()

        // 2. Animation logo : fade + scale subtle
        val logoImageView = findViewById<ImageView>(R.id.splash_logo)
        val fadeIn = AlphaAnimation(0f, 1f).apply {
            duration = 800
            interpolator = AccelerateDecelerateInterpolator()
        }
        val scaleUp = ScaleAnimation(
            0.85f, 1f, 0.85f, 1f,
            ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
            ScaleAnimation.RELATIVE_TO_SELF, 0.5f
        ).apply {
            duration = 800
            interpolator = AccelerateDecelerateInterpolator()
        }
        logoImageView.startAnimation(AnimationSet(true).apply {
            addAnimation(fadeIn)
            addAnimation(scaleUp)
        })

        // 3. Navigation differee (laisser le son se terminer)
        Handler(Looper.getMainLooper()).postDelayed({
            // Couper le son d'intro AVANT de naviguer — sinon il peut
            // deborder sur MainActivity et echapper au bouton SON OFF.
            try {
                splashSound?.stop()
                splashSound?.release()
            } catch (_: Exception) { }
            splashSound = null

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }, 2500)
    }

    private fun playBrandingSound() {
        // Respecter la pref globale (meme cle que SoundManager)
        val prefs = getSharedPreferences("clq_audio", Context.MODE_PRIVATE)
        val soundEnabled = prefs.getBoolean("sound_enabled", true)
        if (!soundEnabled) return
        try {
            splashSound = MediaPlayer.create(this, R.raw.prometheus_enter)?.apply {
                setVolume(0.7f, 0.7f)
                start()
            }
        } catch (e: Exception) {
            // Echec silencieux : ne pas bloquer le demarrage de l'app
        }
    }

    override fun onDestroy() {
        splashSound?.release()
        splashSound = null
        super.onDestroy()
    }
}
