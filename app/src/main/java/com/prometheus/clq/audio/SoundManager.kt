package com.prometheus.clq.audio

import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.media.SoundPool
import android.media.AudioManager
import com.prometheus.clq.R

/**
 * Gestionnaire audio CLQ v2.0
 * 22 effets sonores — Champion League Quizz
 * Prometheus Technology
 *
 * v2.0: Ajout whoosh, reveal, mode_select, celebration,
 *       swoosh_in, timer_critical, sparkle
 */
class SoundManager(private val context: Context) {

    private var soundPool: SoundPool? = null
    var isSoundEnabled: Boolean = true
    var isMusicEnabled: Boolean = true
    private var mediaPlayer: MediaPlayer? = null

    private val prefs = context.getSharedPreferences("clq_audio", Context.MODE_PRIVATE)

    // Sound IDs loaded from SoundPool
    private var sCorrect = 0
    private var sWrong = 0
    private var sTick = 0
    private var sTimerWarning = 0
    private var sGameStart = 0
    private var sGameOver = 0
    private var sVictory = 0
    private var sBonus = 0
    private var sCashType = 0
    private var sStreak = 0
    private var sGlouDrink = 0
    private var sGlouApocalypse = 0
    private var sGlouHeal = 0
    private var sSelect = 0
    private var sCountdown = 0

    // New v2.0 sounds
    private var sWhoosh = 0
    private var sReveal = 0
    private var sModeSelect = 0
    private var sCelebration = 0
    private var sSwooshIn = 0
    private var sTimerCritical = 0
    private var sSparkle = 0

    init {
        isSoundEnabled = prefs.getBoolean("sound_enabled", true)
        isMusicEnabled = prefs.getBoolean("music_enabled", true)

        val attrs = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(8) // Augmenté de 6 à 8 pour plus de sons simultanés
            .setAudioAttributes(attrs)
            .build()

        loadSounds()
    }

    private fun loadSounds() {
        val sp = soundPool ?: return
        try {
            // Original sounds
            sCorrect = sp.load(context, R.raw.sound_correct, 1)
            sWrong = sp.load(context, R.raw.sound_wrong, 1)
            sTick = sp.load(context, R.raw.sound_tick, 1)
            sTimerWarning = sp.load(context, R.raw.sound_timer_warning, 1)
            sGameStart = sp.load(context, R.raw.sound_game_start, 1)
            sGameOver = sp.load(context, R.raw.sound_game_over, 1)
            sVictory = sp.load(context, R.raw.sound_victory, 1)
            sBonus = sp.load(context, R.raw.sound_bonus, 1)
            sCashType = sp.load(context, R.raw.sound_cash_type, 1)
            sStreak = sp.load(context, R.raw.sound_streak, 1)
            sGlouDrink = sp.load(context, R.raw.sound_glou_drink, 1)
            sGlouApocalypse = sp.load(context, R.raw.sound_glou_apocalypse, 1)
            sGlouHeal = sp.load(context, R.raw.sound_glou_heal, 1)
            sSelect = sp.load(context, R.raw.sound_select, 1)
            sCountdown = sp.load(context, R.raw.sound_countdown, 1)

            // New v2.0 sounds
            sWhoosh = sp.load(context, R.raw.sound_whoosh, 1)
            sReveal = sp.load(context, R.raw.sound_reveal, 1)
            sModeSelect = sp.load(context, R.raw.sound_mode_select, 1)
            sCelebration = sp.load(context, R.raw.sound_celebration, 1)
            sSwooshIn = sp.load(context, R.raw.sound_swoosh_in, 1)
            sTimerCritical = sp.load(context, R.raw.sound_timer_critical, 1)
            sSparkle = sp.load(context, R.raw.sound_sparkle, 1)
        } catch (e: Exception) {
            // Fallback silencieux si fichiers manquants
        }
    }

    private fun play(soundId: Int, volume: Float = 1.0f, rate: Float = 1.0f) {
        if (!isSoundEnabled || soundId == 0) return
        try {
            soundPool?.play(soundId, volume, volume, 1, 0, rate)
        } catch (e: Exception) { }
    }

    // ===== EFFETS SONORES ORIGINAUX =====

    fun playCorrect() = play(sCorrect, 0.9f)

    fun playWrong() = play(sWrong, 0.8f)

    fun playTick() = play(sTick, 0.4f)

    fun playTimeWarning() = play(sTimerWarning, 0.9f)

    fun playGameStart() = play(sGameStart, 1.0f)

    fun playGameOver() = play(sGameOver, 0.9f)

    fun playVictory() = play(sVictory, 1.0f)

    fun playNewRecord() = play(sVictory, 1.0f, 1.2f)  // Victoire pitch up

    fun playBonus() = play(sBonus, 0.8f)

    fun playCashType() = play(sCashType, 0.3f)

    fun playStreak() = play(sStreak, 0.9f)

    fun playGlouEvent() = play(sGlouDrink, 0.8f)

    fun playGlouApocalypse() = play(sGlouApocalypse, 1.0f)

    fun playGlouHeal() = play(sGlouHeal, 0.7f)

    fun playSelect() = play(sSelect, 0.5f)

    fun playCountdown() = play(sCountdown, 0.9f)

    fun playElimination() = play(sGameOver, 0.7f, 0.7f)  // Game over en plus grave

    // ===== NOUVEAUX EFFETS v2.0 =====

    /** Transition entre écrans — accompagne les animations slide/fade */
    fun playWhoosh() = play(sWhoosh, 0.6f)

    /** Révélation de question — arpège montant mystérieux */
    fun playReveal() = play(sReveal, 0.7f)

    /** Sélection d'un mode (DUO/CARRÉ/CASH) — blip satisfaisant */
    fun playModeSelect() = play(sModeSelect, 0.6f)

    /** Célébration winner — fanfare courte triomphale */
    fun playCelebration() = play(sCelebration, 0.9f)

    /** Slide-in d'éléments UI — swoosh subtil */
    fun playSwooshIn() = play(sSwooshIn, 0.4f)

    /** Timer critique (< 3s) — battement cardiaque grave et oppressant */
    fun playTimerCritical() = play(sTimerCritical, 0.8f)

    /** Sparkle/étoile — petit tintement féérique */
    fun playSparkle() = play(sSparkle, 0.5f)

    /** Streak avec pitch variable selon le niveau */
    fun playStreakLevel(streak: Int) {
        val rate = when {
            streak >= 15 -> 1.4f
            streak >= 10 -> 1.3f
            streak >= 7 -> 1.2f
            streak >= 5 -> 1.1f
            else -> 1.0f
        }
        play(sStreak, 0.9f, rate)
        if (streak >= 5) playSparkle()
    }

    // ===== TOGGLE =====

    fun toggleSound(): Boolean {
        isSoundEnabled = !isSoundEnabled
        // Le bouton SON pilote AUSSI la musique de fond — sinon SON OFF
        // laissait tourner music_quiz en boucle.
        isMusicEnabled = isSoundEnabled
        prefs.edit()
            .putBoolean("sound_enabled", isSoundEnabled)
            .putBoolean("music_enabled", isMusicEnabled)
            .apply()

        if (!isSoundEnabled) {
            // 1) Couper instantanément les SFX déjà partis dans le SoundPool
            try { soundPool?.autoPause() } catch (_: Exception) { }
            // 2) Couper la musique de fond (MediaPlayer séparé)
            try {
                if (mediaPlayer?.isPlaying == true) mediaPlayer?.pause()
            } catch (_: Exception) { }
        } else {
            // Réactivation : on relance le SoundPool et la musique si elle existe
            try { soundPool?.autoResume() } catch (_: Exception) { }
            try { mediaPlayer?.start() } catch (_: Exception) { }
        }
        return isSoundEnabled
    }

    fun toggleMusic(): Boolean {
        isMusicEnabled = !isMusicEnabled
        prefs.edit().putBoolean("music_enabled", isMusicEnabled).apply()
        if (!isMusicEnabled) {
            try {
                if (mediaPlayer?.isPlaying == true) mediaPlayer?.pause()
            } catch (_: Exception) { }
        } else {
            try { mediaPlayer?.start() } catch (_: Exception) { }
        }
        return isMusicEnabled
    }


    // ===== BACKGROUND MUSIC =====

    fun startMusic() {
        // Respecter SON OFF : si l'utilisateur a coupé le son, on ne relance
        // PAS la musique de fond, même si une activity rappelle startMusic().
        if (!isMusicEnabled || !isSoundEnabled) return
        try {
            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(context, R.raw.music_quiz)
                mediaPlayer?.isLooping = true
                mediaPlayer?.setVolume(0.3f, 0.3f)
            }
            mediaPlayer?.start()
        } catch (e: Exception) { }
    }

    fun stopMusic() {
        try {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = null
        } catch (e: Exception) { }
    }

    fun pauseMusic() {
        try {
            if (mediaPlayer?.isPlaying == true) mediaPlayer?.pause()
        } catch (e: Exception) { }
    }

    fun resumeMusic() {
        startMusic()
    }

    fun release() {
        try {
            mediaPlayer?.stop()
            mediaPlayer?.release()
        } catch (e: Exception) { }
        mediaPlayer = null
        try {
            soundPool?.release()
        } catch (e: Exception) { }
        soundPool = null
    }
}
