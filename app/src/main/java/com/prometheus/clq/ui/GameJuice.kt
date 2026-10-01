package com.prometheus.clq.ui

import android.animation.*
import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.animation.*
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

/**
 * GameJuice — Toutes les animations et effets "feel good" du jeu.
 * Champion League Quizz — Prometheus Technology
 *
 * v2.0: Ajout neon glow, score counter, card reveal, avatar pulse,
 *       ranking stagger, question transitions, sparkle particles,
 *       correct answer glow flash, bonus button effects
 */
object GameJuice {

    // ===== SCORE POPUP =====

    fun showScorePopup(container: ViewGroup, points: Int, isBonus: Boolean = false) {
        val context = container.context
        val tv = TextView(context).apply {
            text = if (isBonus) "+$points BONUS" else "+$points pts"
            textSize = if (isBonus) 28f else 24f
            setTextColor(if (isBonus) Color.parseColor("#FFD740") else Color.parseColor("#00E676"))
            setShadowLayer(8f, 0f, 0f, Color.BLACK)
            gravity = Gravity.CENTER
            setTypeface(typeface, Typeface.BOLD)
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                gravity = Gravity.CENTER_HORIZONTAL or Gravity.TOP
                topMargin = 120
            }
        }

        container.addView(tv)

        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(tv, "translationY", 0f, -200f),
            ObjectAnimator.ofFloat(tv, "alpha", 1f, 0f),
            ObjectAnimator.ofFloat(tv, "scaleX", 0.5f, 1.3f, 1.0f),
            ObjectAnimator.ofFloat(tv, "scaleY", 0.5f, 1.3f, 1.0f)
        )
        animSet.duration = 1200
        animSet.interpolator = DecelerateInterpolator()
        animSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                container.removeView(tv)
            }
        })
        animSet.start()
    }

    // ===== STREAK OVERLAY =====

    data class StreakInfo(
        val count: Int,
        val emoji: String,
        val message: String,
        val color: Int
    )

    fun getStreakInfo(streak: Int): StreakInfo? = when {
        streak >= 15 -> StreakInfo(streak, "👑", "DIVIN !", Color.parseColor("#FFD700"))
        streak >= 10 -> StreakInfo(streak, "⭐", "LÉGENDAIRE !", Color.parseColor("#FFD740"))
        streak >= 7 -> StreakInfo(streak, "💎", "INARRÊTABLE !", Color.parseColor("#E040FB"))
        streak >= 5 -> StreakInfo(streak, "🔥", "EN FEU !", Color.parseColor("#FF6D00"))
        streak >= 3 -> StreakInfo(streak, "⚡", "Série x$streak", Color.parseColor("#00E5FF"))
        else -> null
    }

    fun showStreakOverlay(container: ViewGroup, streakInfo: StreakInfo) {
        val context = container.context

        val emojiTv = TextView(context).apply {
            text = streakInfo.emoji
            textSize = 64f
            gravity = Gravity.CENTER
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                gravity = Gravity.CENTER
                bottomMargin = 60
            }
        }

        val msgTv = TextView(context).apply {
            text = streakInfo.message
            textSize = 32f
            setTextColor(streakInfo.color)
            setShadowLayer(12f, 0f, 0f, Color.BLACK)
            gravity = Gravity.CENTER
            setTypeface(typeface, Typeface.BOLD)
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                gravity = Gravity.CENTER
                topMargin = 60
            }
        }

        container.addView(emojiTv)
        container.addView(msgTv)

        listOf(emojiTv, msgTv).forEach { v ->
            val animSet = AnimatorSet()
            animSet.playTogether(
                ObjectAnimator.ofFloat(v, "scaleX", 0.2f, 1.4f, 1.0f),
                ObjectAnimator.ofFloat(v, "scaleY", 0.2f, 1.4f, 1.0f),
                ObjectAnimator.ofFloat(v, "alpha", 0f, 1f, 1f, 0f)
            )
            animSet.duration = 1800
            animSet.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    container.removeView(v)
                }
            })
            animSet.start()
        }

        // Sparkle particles autour du streak
        showSparkles(container, streakInfo.color, 12)
    }

    // ===== SCREEN SHAKE =====

    fun shakeView(view: View) {
        val shakeAnim = ObjectAnimator.ofFloat(view, "translationX",
            0f, -15f, 15f, -12f, 12f, -8f, 8f, -4f, 4f, 0f
        )
        shakeAnim.duration = 500
        shakeAnim.interpolator = LinearInterpolator()
        shakeAnim.start()
    }

    // ===== BOUNCE =====

    fun bounceView(view: View) {
        val scaleX = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1.2f, 0.9f, 1.05f, 1f)
        val scaleY = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1.2f, 0.9f, 1.05f, 1f)
        val animSet = AnimatorSet()
        animSet.playTogether(scaleX, scaleY)
        animSet.duration = 500
        animSet.start()
    }

    // ===== HAPTIC FEEDBACK =====

    /** Light tap — navigation buttons, UI interactions */
    fun vibrateTap(context: Context) {
        vibrate(context, longArrayOf(0, 15), intArrayOf(0, 50))
    }

    /** Medium tap — mode selection, important choices */
    fun vibrateModeSelect(context: Context) {
        vibrate(context, longArrayOf(0, 25, 40, 25), intArrayOf(0, 70, 0, 100))
    }

    /** Bonus activation — satisfying double-click feel */
    fun vibrateBonus(context: Context) {
        vibrate(context, longArrayOf(0, 20, 30, 40), intArrayOf(0, 90, 0, 160))
    }

    /** Correct answer — crisp double tap */
    fun vibrateCorrect(context: Context) {
        vibrate(context, longArrayOf(0, 30, 50, 30), intArrayOf(0, 80, 0, 120))
    }

    /** Wrong answer — heavy buzz */
    fun vibrateWrong(context: Context) {
        vibrate(context, longArrayOf(0, 100, 80, 100), intArrayOf(0, 200, 0, 200))
    }

    /** Streak — escalating triple tap */
    fun vibrateStreak(context: Context) {
        vibrate(context, longArrayOf(0, 20, 30, 20, 30, 40), intArrayOf(0, 60, 0, 80, 0, 150))
    }

    /** Elimination — dramatic heavy pattern */
    fun vibrateElimination(context: Context) {
        vibrate(context, longArrayOf(0, 60, 40, 60, 40, 120), intArrayOf(0, 150, 0, 150, 0, 255))
    }

    /** Timer critical — quick urgent pulse */
    fun vibrateTimerCritical(context: Context) {
        vibrate(context, longArrayOf(0, 10, 20, 10), intArrayOf(0, 120, 0, 120))
    }

    /** Countdown tick — single short tick */
    fun vibrateTick(context: Context) {
        vibrate(context, longArrayOf(0, 8), intArrayOf(0, 40))
    }

    /** Spin wheel — rhythmic spin feel */
    fun vibrateSpin(context: Context) {
        vibrate(context, longArrayOf(0, 15, 25, 15, 25, 15, 25, 30), intArrayOf(0, 40, 0, 60, 0, 80, 0, 120))
    }

    /** Victory — celebratory escalating burst */
    fun vibrateVictory(context: Context) {
        vibrate(context, longArrayOf(0, 30, 30, 30, 30, 30, 30, 80), intArrayOf(0, 60, 0, 80, 0, 120, 0, 200))
    }

    private fun vibrate(context: Context, timings: LongArray, amplitudes: IntArray) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                val vibratorManager = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as? VibratorManager
                val vibrator = vibratorManager?.defaultVibrator
                vibrator?.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
            } else {
                @Suppress("DEPRECATION")
                val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as? Vibrator
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrator?.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
                } else {
                    @Suppress("DEPRECATION")
                    vibrator?.vibrate(150)
                }
            }
        } catch (_: Exception) { }
    }

    // ===== CONFETTI PARTICLES =====

    fun showConfetti(container: ViewGroup, count: Int = 40) {
        val colors = listOf(
            Color.parseColor("#FF1744"), Color.parseColor("#FFD740"),
            Color.parseColor("#00E676"), Color.parseColor("#00E5FF"),
            Color.parseColor("#E040FB"), Color.parseColor("#FF6D00"),
            Color.parseColor("#FFFFFF")
        )
        val width = container.width.takeIf { it > 0 } ?: 800
        val height = container.height.takeIf { it > 0 } ?: 1200

        repeat(count) {
            val confetti = View(container.context).apply {
                val size = Random.nextInt(6, 14)
                layoutParams = FrameLayout.LayoutParams(size, size * 2).apply {
                    gravity = Gravity.TOP or Gravity.START
                    leftMargin = Random.nextInt(0, width)
                }
                setBackgroundColor(colors.random())
                rotation = Random.nextFloat() * 360f
            }

            container.addView(confetti)

            val duration = Random.nextLong(1500, 2800)
            val delay = Random.nextLong(0, 500)
            val horizontalDrift = Random.nextFloat() * 200f - 100f

            val animSet = AnimatorSet()
            animSet.playTogether(
                ObjectAnimator.ofFloat(confetti, "translationY", -50f, height.toFloat()),
                ObjectAnimator.ofFloat(confetti, "translationX", 0f, horizontalDrift),
                ObjectAnimator.ofFloat(confetti, "rotation", confetti.rotation, confetti.rotation + Random.nextFloat() * 720f),
                ObjectAnimator.ofFloat(confetti, "alpha", 1f, 1f, 0.8f, 0f)
            )
            animSet.duration = duration
            animSet.startDelay = delay
            animSet.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    container.removeView(confetti)
                }
            })
            animSet.start()
        }
    }

    // ===== ANSWER BUTTONS SLIDE IN =====

    fun slideInAnswers(buttons: List<View>) {
        buttons.forEachIndexed { i, btn ->
            btn.translationX = 400f
            btn.alpha = 0f
            btn.scaleX = 0.85f
            btn.scaleY = 0.85f
            btn.animate()
                .translationX(0f)
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(350)
                .setStartDelay(i * 100L)
                .setInterpolator(OvershootInterpolator(0.8f))
                .start()
        }
    }

    // ===== CORRECT/WRONG FLASH =====

    fun flashBanner(banner: View, isCorrect: Boolean) {
        val color = if (isCorrect) Color.parseColor("#1B5E20") else Color.parseColor("#B71C1C")
        val originalColor = Color.parseColor("#1E1E42")

        val colorAnim = ValueAnimator.ofArgb(color, originalColor)
        colorAnim.duration = 600
        colorAnim.addUpdateListener { anim ->
            try {
                val bg = banner.background
                bg?.setTint(anim.animatedValue as Int)
            } catch (_: Exception) { }
        }
        colorAnim.start()
    }

    // ===== TIMER PULSE =====

    fun pulseTimer(timerView: View) {
        val scaleX = ObjectAnimator.ofFloat(timerView, "scaleX", 1f, 1.3f, 1f)
        val scaleY = ObjectAnimator.ofFloat(timerView, "scaleY", 1f, 1.3f, 1f)
        val animSet = AnimatorSet()
        animSet.playTogether(scaleX, scaleY)
        animSet.duration = 300
        animSet.start()
    }

    // ===== WRONG ANSWER: RED FLASH OVERLAY =====

    fun flashWrongOverlay(container: ViewGroup) {
        val overlay = View(container.context).apply {
            setBackgroundColor(Color.parseColor("#44FF1744"))
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        }
        container.addView(overlay)

        val fadeOut = ObjectAnimator.ofFloat(overlay, "alpha", 1f, 0f)
        fadeOut.duration = 500
        fadeOut.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                container.removeView(overlay)
            }
        })
        fadeOut.start()
    }

    // ===== CORRECT ANSWER: GREEN GLOW FLASH =====

    fun flashCorrectOverlay(container: ViewGroup) {
        val overlay = View(container.context).apply {
            setBackgroundColor(Color.parseColor("#2200E676"))
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        }
        container.addView(overlay)

        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(overlay, "alpha", 0f, 1f, 0f)
        )
        animSet.duration = 600
        animSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                container.removeView(overlay)
            }
        })
        animSet.start()
    }

    // ===== NEW: NEON GLOW PULSE ON BUTTONS =====

    private val glowAnimators = mutableMapOf<View, ValueAnimator>()

    /**
     * Démarre un effet de glow neon pulsant sur un bouton.
     * Parfait pour les bonus disponibles ou boutons importants.
     */
    fun startNeonGlow(view: View, glowColor: Int = Color.parseColor("#00FFE0")) {
        stopNeonGlow(view) // Stop previous if any
        if (android.os.Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) return

        val animator = ValueAnimator.ofFloat(0f, 1f, 0f).apply {
            duration = 1800
            repeatCount = ValueAnimator.INFINITE
            interpolator = AccelerateDecelerateInterpolator()
            addUpdateListener { anim ->
                val value = anim.animatedValue as Float
                view.elevation = 4f + (value * 16f)
                // Paint layer shadow for neon effect
                if (view is TextView) {
                    val alpha = (150 * value).toInt()
                    val r = Color.red(glowColor)
                    val g = Color.green(glowColor)
                    val b = Color.blue(glowColor)
                    view.setShadowLayer(10f + (value * 20f), 0f, 0f, Color.argb(alpha, r, g, b))
                }
                view.alpha = 0.85f + (value * 0.15f)
            }
        }
        glowAnimators[view] = animator
        animator.start()
    }

    fun stopNeonGlow(view: View) {
        glowAnimators[view]?.cancel()
        glowAnimators.remove(view)
        view.elevation = 0f
        view.alpha = 1f
        if (view is TextView) {
            view.setShadowLayer(0f, 0f, 0f, Color.TRANSPARENT)
        }
    }

    // ===== NEW: SCORE COUNTER ANIMATION =====

    /**
     * Anime un compteur de score de fromValue à toValue avec effet digit-by-digit.
     */
    fun animateScoreCounter(textView: TextView, fromValue: Int, toValue: Int, suffix: String = " pts") {
        val animator = ValueAnimator.ofInt(fromValue, toValue).apply {
            duration = 800L + ((toValue - fromValue).coerceIn(0, 100) * 5L)
            interpolator = DecelerateInterpolator(2f)
            addUpdateListener { anim ->
                textView.text = "${anim.animatedValue}$suffix"
            }
            // Petit bounce à la fin
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    val scaleX = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 1.15f, 1f)
                    val scaleY = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 1.15f, 1f)
                    AnimatorSet().apply {
                        playTogether(scaleX, scaleY)
                        duration = 200
                        start()
                    }
                }
            })
        }
        animator.start()
    }

    // ===== NEW: QUESTION CARD REVEAL =====

    /**
     * Animation de révélation de la question — scale from 0 with overshoot + fade.
     */
    fun revealQuestion(view: View) {
        view.scaleX = 0f
        view.scaleY = 0f
        view.alpha = 0f

        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(view, "scaleX", 0f, 1.05f, 1f),
            ObjectAnimator.ofFloat(view, "scaleY", 0f, 1.05f, 1f),
            ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        )
        animSet.duration = 400
        animSet.interpolator = OvershootInterpolator(1.2f)
        animSet.start()
    }

    // ===== NEW: AVATAR PULSE / BREATHING =====

    private var avatarPulseAnimator: AnimatorSet? = null

    /**
     * Animation de "respiration" subtile sur l'avatar du joueur actif.
     */
    fun startAvatarPulse(avatarView: View) {
        stopAvatarPulse()
        avatarView.scaleX = 1f
        avatarView.scaleY = 1f
        if (android.os.Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) return
        val scaleX = ObjectAnimator.ofFloat(avatarView, "scaleX", 1f, 1.06f, 1f).apply {
            repeatCount = ValueAnimator.INFINITE
        }
        val scaleY = ObjectAnimator.ofFloat(avatarView, "scaleY", 1f, 1.06f, 1f).apply {
            repeatCount = ValueAnimator.INFINITE
        }
        avatarPulseAnimator = AnimatorSet().apply {
            playTogether(scaleX, scaleY)
            duration = 2000
            interpolator = AccelerateDecelerateInterpolator()
            start()
        }
    }

    fun stopAvatarPulse() {
        val animator = avatarPulseAnimator
        avatarPulseAnimator = null
        animator?.cancel()
    }

    // ===== NEW: RANKING STAGGER ANIMATION =====

    /**
     * Cascade animation pour les items du ranking dans ResultsActivity.
     * Chaque item slide in depuis le bas avec un délai croissant.
     */
    fun staggerRankingItems(items: List<View>, baseDelay: Long = 100L) {
        items.forEachIndexed { index, item ->
            item.translationY = 80f
            item.alpha = 0f
            item.scaleX = 0.9f
            item.scaleY = 0.9f

            item.animate()
                .translationY(0f)
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(400)
                .setStartDelay(baseDelay + (index * 120L))
                .setInterpolator(OvershootInterpolator(0.6f))
                .start()
        }
    }

    // ===== NEW: SPARKLE PARTICLES =====

    /**
     * Mini particules étincelantes autour d'un point — plus subtil que les confetti.
     */
    fun showSparkles(container: ViewGroup, color: Int, count: Int = 8) {
        val centerX = container.width / 2
        val centerY = container.height / 2

        repeat(count) {
            val sparkle = View(container.context).apply {
                val size = Random.nextInt(4, 8)
                layoutParams = FrameLayout.LayoutParams(size, size).apply {
                    gravity = Gravity.TOP or Gravity.START
                    leftMargin = centerX + Random.nextInt(-150, 150)
                    topMargin = centerY + Random.nextInt(-150, 150)
                }
                setBackgroundColor(color)
                rotation = 45f
                alpha = 0f
            }
            container.addView(sparkle)

            val animSet = AnimatorSet()
            val angle = Random.nextFloat() * Math.PI.toFloat() * 2
            val distance = Random.nextFloat() * 200f + 50f

            animSet.playTogether(
                ObjectAnimator.ofFloat(sparkle, "translationX", 0f, kotlin.math.cos(angle) * distance),
                ObjectAnimator.ofFloat(sparkle, "translationY", 0f, kotlin.math.sin(angle) * distance),
                ObjectAnimator.ofFloat(sparkle, "alpha", 0f, 1f, 1f, 0f),
                ObjectAnimator.ofFloat(sparkle, "scaleX", 0.5f, 1.5f, 0f),
                ObjectAnimator.ofFloat(sparkle, "scaleY", 0.5f, 1.5f, 0f)
            )
            animSet.duration = Random.nextLong(600, 1200)
            animSet.startDelay = Random.nextLong(0, 300)
            animSet.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    container.removeView(sparkle)
                }
            })
            animSet.start()
        }
    }

    // ===== NEW: ANSWER BUTTON CORRECT/WRONG HIGHLIGHT =====

    /**
     * Highlight un bouton de réponse en vert (correct) ou rouge (wrong) avec animation.
     */
    fun highlightAnswerButton(button: View, isCorrect: Boolean) {
        val targetColor = if (isCorrect) Color.parseColor("#00E676") else Color.parseColor("#FF1744")
        val originalColor = Color.parseColor("#252545")

        // Flash color
        val flash = ValueAnimator.ofArgb(originalColor, targetColor)
        flash.duration = 200
        flash.addUpdateListener {
            button.setBackgroundColor(it.animatedValue as Int)
        }

        // Scale punch
        val scaleUp = AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(button, "scaleX", 1f, if (isCorrect) 1.08f else 0.95f),
                ObjectAnimator.ofFloat(button, "scaleY", 1f, if (isCorrect) 1.08f else 0.95f)
            )
            duration = 150
        }
        val scaleBack = AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(button, "scaleX", 1f),
                ObjectAnimator.ofFloat(button, "scaleY", 1f)
            )
            duration = 200
            interpolator = OvershootInterpolator(2f)
        }

        val fullAnim = AnimatorSet()
        fullAnim.playSequentially(flash, scaleUp, scaleBack)
        fullAnim.start()
    }

    // ===== NEW: TIMER CRITICAL SHAKE + COLOR =====

    /**
     * Animation plus intense quand le timer est critique (< 3s).
     * Combine pulse + teinte rouge + shake léger.
     */
    fun timerCritical(timerView: View) {
        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(timerView, "scaleX", 1f, 1.4f, 1f),
            ObjectAnimator.ofFloat(timerView, "scaleY", 1f, 1.4f, 1f),
            ObjectAnimator.ofFloat(timerView, "translationX", 0f, -5f, 5f, -3f, 3f, 0f)
        )
        animSet.duration = 400
        animSet.start()
    }

    // ===== NEW: ENTRANCE ANIMATION FOR ENTIRE SCREEN =====

    /**
     * Animation d'entrée douce pour tout le contenu d'une activité.
     * Utilise fade + légère translation vers le haut.
     */
    fun animateScreenEntrance(rootView: View, delay: Long = 0) {
        rootView.alpha = 0f
        rootView.translationY = 30f

        rootView.animate()
            .alpha(1f)
            .translationY(0f)
            .setDuration(500)
            .setStartDelay(delay)
            .setInterpolator(DecelerateInterpolator(1.5f))
            .start()
    }

    /**
     * Animation d'entrée pour plusieurs éléments en cascade.
     */
    fun animateElementsCascade(views: List<View>, startDelay: Long = 100) {
        views.forEachIndexed { index, view ->
            view.alpha = 0f
            view.translationY = 40f

            view.animate()
                .alpha(1f)
                .translationY(0f)
                .setDuration(400)
                .setStartDelay(startDelay + (index * 80L))
                .setInterpolator(DecelerateInterpolator(1.5f))
                .start()
        }
    }

    // ===== NEW: WINNER CELEBRATION =====

    /**
     * Animation de célébration pour le gagnant dans ResultsActivity.
     * Confetti + sparkles + bounce du nom.
     */
    fun celebrateWinner(container: ViewGroup, winnerViews: List<View>) {
        // Gold confetti
        showConfetti(container, 60)

        // Gold sparkles
        showSparkles(container, Color.parseColor("#FFD700"), 20)

        // Bounce cascade sur les vues du winner
        winnerViews.forEachIndexed { index, view ->
            view.scaleX = 0f
            view.scaleY = 0f
            view.alpha = 0f

            val scaleX = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1.2f, 0.95f, 1.05f, 1f)
            val scaleY = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1.2f, 0.95f, 1.05f, 1f)
            val alpha = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

            AnimatorSet().apply {
                playTogether(scaleX, scaleY, alpha)
                duration = 600
                startDelay = 200L + (index * 150L)
                interpolator = OvershootInterpolator(1.2f)
                start()
            }
        }
    }

    // ===== NEW: MODE SELECTION PUNCH =====

    /**
     * Animation punch quand un mode (DUO/CARRÉ/CASH) est sélectionné.
     */
    fun punchSelect(view: View) {
        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.9f, 1.15f, 1f),
            ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.9f, 1.15f, 1f)
        )
        animSet.duration = 300
        animSet.interpolator = OvershootInterpolator(2f)
        animSet.start()
    }

    // ===== NEW: GLOU PV BAR DAMAGE EFFECT =====

    /**
     * Flash rouge sur la barre de PV quand le joueur prend des dégâts.
     */
    fun flashPVDamage(pvBar: View) {
        val flash = ObjectAnimator.ofArgb(
            pvBar, "backgroundColor",
            Color.parseColor("#FF1744"),
            Color.parseColor("#1A1A35")
        )
        flash.duration = 400
        flash.start()

        shakeView(pvBar)
    }

    // ===== NEW: BONUS USED EFFECT =====

    /**
     * Animation quand un bonus est utilisé — le bouton rétrécit et disparaît.
     */
    fun bonusUsedEffect(button: View) {
        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(button, "scaleX", 1f, 1.3f, 0f),
            ObjectAnimator.ofFloat(button, "scaleY", 1f, 1.3f, 0f),
            ObjectAnimator.ofFloat(button, "alpha", 1f, 1f, 0f),
            ObjectAnimator.ofFloat(button, "rotation", 0f, 15f)
        )
        animSet.duration = 400
        animSet.interpolator = AccelerateInterpolator(1.5f)
        animSet.start()
    }

    // ===== NEW: NEXT QUESTION TRANSITION =====

    /**
     * Transition fluide entre les questions — slide out old, slide in new.
     */
    fun transitionQuestion(questionView: View, onMidpoint: () -> Unit) {
        // Slide out to left
        questionView.animate()
            .translationX(-questionView.width.toFloat())
            .alpha(0f)
            .setDuration(200)
            .setInterpolator(AccelerateInterpolator())
            .withEndAction {
                // Update content at midpoint
                onMidpoint()

                // Reset position to right
                questionView.translationX = questionView.width.toFloat()

                // Slide in from right
                questionView.animate()
                    .translationX(0f)
                    .alpha(1f)
                    .setDuration(300)
                    .setInterpolator(OvershootInterpolator(0.5f))
                    .start()
            }
            .start()
    }

    // ===== LOSE STREAK OVERLAY =====

    /**
     * Overlay dramatique pour les lose streaks — écran rouge, skull, tremblement.
     */
    fun showLoseStreakOverlay(container: ViewGroup, streakCount: Int) {
        val (emoji, message, color) = when {
            streakCount >= 6 -> Triple("💀", "CATASTROPHE x$streakCount", Color.parseColor("#FF1744"))
            streakCount >= 5 -> Triple("🌊", "TSUNAMI x$streakCount", Color.parseColor("#FF6D00"))
            streakCount >= 4 -> Triple("🔥", "FLAMMES x$streakCount", Color.parseColor("#FF9100"))
            else -> Triple("💨", "MALÉDICTION x$streakCount", Color.parseColor("#FFD740"))
        }

        // Dark red overlay
        val overlay = View(container.context).apply {
            setBackgroundColor(Color.parseColor("#66B71C1C"))
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        }
        container.addView(overlay)

        val emojiTv = TextView(container.context).apply {
            text = emoji
            textSize = 72f
            gravity = Gravity.CENTER
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply { gravity = Gravity.CENTER; bottomMargin = 80 }
        }

        val msgTv = TextView(container.context).apply {
            text = message
            textSize = 28f
            setTextColor(color)
            setShadowLayer(16f, 0f, 0f, Color.BLACK)
            gravity = Gravity.CENTER
            setTypeface(typeface, Typeface.BOLD)
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply { gravity = Gravity.CENTER; topMargin = 60 }
        }

        container.addView(emojiTv)
        container.addView(msgTv)

        // Slam-in animation for emoji
        val emojiAnim = AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(emojiTv, "scaleX", 3f, 0.8f, 1.1f, 1f),
                ObjectAnimator.ofFloat(emojiTv, "scaleY", 3f, 0.8f, 1.1f, 1f),
                ObjectAnimator.ofFloat(emojiTv, "alpha", 0f, 1f, 1f, 1f, 0f),
                ObjectAnimator.ofFloat(emojiTv, "rotation", -15f, 10f, -5f, 0f)
            )
            duration = 2000
        }
        val msgAnim = AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(msgTv, "scaleX", 0f, 1.2f, 1f),
                ObjectAnimator.ofFloat(msgTv, "scaleY", 0f, 1.2f, 1f),
                ObjectAnimator.ofFloat(msgTv, "alpha", 0f, 1f, 1f, 0f)
            )
            startDelay = 200
            duration = 1800
        }
        val overlayAnim = ObjectAnimator.ofFloat(overlay, "alpha", 0f, 0.8f, 0.8f, 0f).apply {
            duration = 2200
        }

        listOf(emojiAnim, msgAnim).forEach { it.start() }
        overlayAnim.start()

        overlayAnim.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                container.removeView(overlay)
                container.removeView(emojiTv)
                container.removeView(msgTv)
            }
        })
    }

    // ===== FLOATING DAMAGE NUMBER =====

    /**
     * Chiffre de dégâts flottant (style RPG) — pour le mode Glou.
     */
    fun showDamageNumber(container: ViewGroup, amount: Int, x: Float = -1f, y: Float = -1f) {
        val tv = TextView(container.context).apply {
            text = "-$amount"
            textSize = 36f
            setTextColor(Color.parseColor("#FF1744"))
            setShadowLayer(10f, 0f, 0f, Color.BLACK)
            setTypeface(typeface, Typeface.BOLD)
            gravity = Gravity.CENTER
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                gravity = if (x < 0) Gravity.CENTER else (Gravity.TOP or Gravity.START)
                if (x >= 0) { leftMargin = x.toInt(); topMargin = y.toInt() }
            }
        }
        container.addView(tv)

        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(tv, "translationY", 0f, -180f),
            ObjectAnimator.ofFloat(tv, "alpha", 1f, 1f, 0.6f, 0f),
            ObjectAnimator.ofFloat(tv, "scaleX", 0.5f, 1.5f, 1.2f),
            ObjectAnimator.ofFloat(tv, "scaleY", 0.5f, 1.5f, 1.2f),
            ObjectAnimator.ofFloat(tv, "translationX", 0f, (Random.nextFloat() * 60f - 30f))
        )
        animSet.duration = 1500
        animSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                container.removeView(tv)
            }
        })
        animSet.start()
    }

    // ===== HEAL NUMBER =====

    fun showHealNumber(container: ViewGroup, amount: Int) {
        val tv = TextView(container.context).apply {
            text = "+$amount ❤️"
            textSize = 30f
            setTextColor(Color.parseColor("#00E676"))
            setShadowLayer(10f, 0f, 0f, Color.BLACK)
            setTypeface(typeface, Typeface.BOLD)
            gravity = Gravity.CENTER
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply { gravity = Gravity.CENTER }
        }
        container.addView(tv)

        AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(tv, "translationY", 0f, -150f),
                ObjectAnimator.ofFloat(tv, "alpha", 1f, 1f, 0f),
                ObjectAnimator.ofFloat(tv, "scaleX", 0.8f, 1.3f, 1f),
                ObjectAnimator.ofFloat(tv, "scaleY", 0.8f, 1.3f, 1f)
            )
            duration = 1300
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    container.removeView(tv)
                }
            })
            start()
        }
    }

    // ===== ELIMINATION DRAMATIC =====

    /**
     * Animation dramatique d'élimination — écran rouge + "ÉLIMINÉ!" géant.
     */
    fun showEliminationEffect(container: ViewGroup, playerName: String) {
        val overlay = View(container.context).apply {
            setBackgroundColor(Color.parseColor("#99B71C1C"))
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            alpha = 0f
        }

        val tv = TextView(container.context).apply {
            text = "💀 ÉLIMINÉ !"
            textSize = 42f
            setTextColor(Color.parseColor("#FF1744"))
            setShadowLayer(20f, 0f, 0f, Color.BLACK)
            setTypeface(typeface, Typeface.BOLD)
            gravity = Gravity.CENTER
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply { gravity = Gravity.CENTER }
        }

        val nameTv = TextView(container.context).apply {
            text = playerName
            textSize = 24f
            setTextColor(Color.parseColor("#FFAAAA"))
            setShadowLayer(10f, 0f, 0f, Color.BLACK)
            gravity = Gravity.CENTER
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply { gravity = Gravity.CENTER; topMargin = 140 }
        }

        container.addView(overlay)
        container.addView(tv)
        container.addView(nameTv)

        val overlayAnim = ObjectAnimator.ofFloat(overlay, "alpha", 0f, 1f, 1f, 0f).apply { duration = 2500 }
        AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(tv, "scaleX", 3f, 0.7f, 1.1f, 1f),
                ObjectAnimator.ofFloat(tv, "scaleY", 3f, 0.7f, 1.1f, 1f),
                ObjectAnimator.ofFloat(tv, "alpha", 0f, 1f, 1f, 0f),
                ObjectAnimator.ofFloat(tv, "rotation", -10f, 5f, 0f)
            )
            duration = 2500
            start()
        }
        AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(nameTv, "alpha", 0f, 1f, 1f, 0f),
                ObjectAnimator.ofFloat(nameTv, "translationY", 30f, 0f)
            )
            startDelay = 300
            duration = 2200
            start()
        }
        overlayAnim.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                container.removeView(overlay)
                container.removeView(tv)
                container.removeView(nameTv)
            }
        })
        overlayAnim.start()
    }

    // ===== WOBBLE =====

    /**
     * Wobble oscillant — pour signaler le danger ou l'incertitude.
     */
    fun wobbleView(view: View) {
        AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(view, "rotation", 0f, -3f, 3f, -2f, 2f, -1f, 1f, 0f),
                ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.05f, 0.97f, 1.02f, 1f),
                ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.05f, 0.97f, 1.02f, 1f)
            )
            duration = 600
            start()
        }
    }

    // ===== GLOU TARGET BUTTON GLOW =====

    /**
     * Pulse les boutons de cible Glou pour attirer l'attention.
     */
    fun pulseTargetButtons(buttons: List<View>) {
        buttons.forEachIndexed { index, btn ->
            btn.alpha = 0f
            btn.scaleX = 0.8f
            btn.scaleY = 0.8f
            btn.animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(400)
                .setStartDelay(index * 80L)
                .setInterpolator(OvershootInterpolator(1.5f))
                .start()
        }
    }

    // ===== PASS PHONE FLIP =====

    /**
     * Effet de retournement pour l'écran pass phone — rotation Y 3D simulée.
     */
    fun flipIn(view: View) {
        view.scaleX = 0f
        view.alpha = 0f

        AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(view, "scaleX", 0f, 1.1f, 1f),
                ObjectAnimator.ofFloat(view, "alpha", 0f, 1f),
                ObjectAnimator.ofFloat(view, "rotationY", 90f, -10f, 0f)
            )
            duration = 500
            interpolator = OvershootInterpolator(0.8f)
            start()
        }
    }

    // ===== COMBO FIRE EFFECT =====

    /**
     * Effet visuel pour les gros combos — particules dorées montantes.
     */
    fun showComboFire(container: ViewGroup, multiplier: Float) {
        if (multiplier < 1.5f) return

        val particleCount = ((multiplier - 1f) * 15).toInt().coerceIn(5, 25)
        val gold = Color.parseColor("#FFD700")
        val orange = Color.parseColor("#FF9100")

        repeat(particleCount) {
            val particle = View(container.context).apply {
                val size = Random.nextInt(3, 8)
                layoutParams = FrameLayout.LayoutParams(size, size).apply {
                    gravity = Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL
                    leftMargin = Random.nextInt(-200, 200)
                }
                setBackgroundColor(if (Random.nextBoolean()) gold else orange)
                rotation = 45f
            }
            container.addView(particle)

            AnimatorSet().apply {
                playTogether(
                    ObjectAnimator.ofFloat(particle, "translationY", 0f, -Random.nextFloat() * 400f - 100f),
                    ObjectAnimator.ofFloat(particle, "translationX", 0f, Random.nextFloat() * 100f - 50f),
                    ObjectAnimator.ofFloat(particle, "alpha", 1f, 0.8f, 0f),
                    ObjectAnimator.ofFloat(particle, "scaleX", 1f, 0.3f),
                    ObjectAnimator.ofFloat(particle, "scaleY", 1f, 0.3f)
                )
                duration = Random.nextLong(800, 1600)
                startDelay = Random.nextLong(0, 200)
                addListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator) {
                        container.removeView(particle)
                    }
                })
                start()
            }
        }
    }

    // ===== COUNTDOWN NUMBER ANIMATION =====

    /**
     * Gros chiffre qui apparaît et disparaît au centre — style countdown 3, 2, 1.
     */
    fun showCountdownNumber(container: ViewGroup, number: String, color: Int = Color.WHITE) {
        val tv = TextView(container.context).apply {
            text = number
            textSize = 80f
            setTextColor(color)
            setTypeface(typeface, Typeface.BOLD)
            setShadowLayer(20f, 0f, 0f, Color.BLACK)
            gravity = Gravity.CENTER
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            ).apply { gravity = Gravity.CENTER }
        }

        container.addView(tv)

        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(tv, "scaleX", 2f, 1f, 0.8f),
            ObjectAnimator.ofFloat(tv, "scaleY", 2f, 1f, 0.8f),
            ObjectAnimator.ofFloat(tv, "alpha", 0f, 1f, 1f, 0f)
        )
        animSet.duration = 900
        animSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                container.removeView(tv)
            }
        })
        animSet.start()
    }
}
