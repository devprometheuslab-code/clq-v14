package com.prometheus.clq.ui

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import android.view.animation.DecelerateInterpolator
import com.prometheus.clq.model.*
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin

/**
 * Vue custom de Roue de la Fortune pour CLQ.
 * Affiche 8 secteurs colores avec les sorts, anime la rotation,
 * et appelle un callback avec le sort gagne.
 */
class SpinWheelView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    // ===== CONFIGURATION =====
    private var slices: List<WheelSlice> = emptyList()
    private var isSpinning = false
    private var currentRotation = 0f
    private var targetSpell: SpellType? = null
    var onSpinComplete: ((SpellType) -> Unit)? = null

    // ===== PAINTS =====
    private val slicePaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 36f
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        setShadowLayer(4f, 2f, 2f, Color.BLACK)
    }
    private val emojiPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        textSize = 48f
        textAlign = Paint.Align.CENTER
    }
    private val borderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#FFD700")
        style = Paint.Style.STROKE
        strokeWidth = 6f
    }
    private val centerPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#1A1A2E")
    }
    private val centerBorderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#FFD700")
        style = Paint.Style.STROKE
        strokeWidth = 4f
    }
    private val pointerPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#FF1744")
        style = Paint.Style.FILL
    }
    private val glowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#FFD700")
        style = Paint.Style.STROKE
        strokeWidth = 12f
        maskFilter = BlurMaskFilter(20f, BlurMaskFilter.Blur.OUTER)
    }

    // Couleurs par rarete
    private val rarityColors = mapOf(
        SpellRarity.COMMON to intArrayOf(Color.parseColor("#1E88E5"), Color.parseColor("#1565C0")),
        SpellRarity.UNCOMMON to intArrayOf(Color.parseColor("#43A047"), Color.parseColor("#2E7D32")),
        SpellRarity.RARE to intArrayOf(Color.parseColor("#8E24AA"), Color.parseColor("#6A1B9A")),
        SpellRarity.EPIC to intArrayOf(Color.parseColor("#FF8F00"), Color.parseColor("#EF6C00")),
        SpellRarity.LEGENDARY to intArrayOf(Color.parseColor("#E53935"), Color.parseColor("#C62828"))
    )

    private val rect = RectF()

    // ===== SETUP =====

    fun setupWheel(streak: Int) {
        slices = SpellWheelConfig.buildVisualWheel(streak)
        invalidate()
    }

    // ===== SPIN =====

    fun spin(resultSpell: SpellType) {
        if (isSpinning) return
        isSpinning = true
        targetSpell = resultSpell

        // Trouver l'index du secteur cible
        val targetIndex = slices.indexOfFirst { it.spell == resultSpell }
            .takeIf { it >= 0 } ?: 0

        // Calculer l'angle cible (le pointeur est en haut = -90° / 270°)
        val sliceAngle = 360f / slices.size
        // L'angle ou se trouve le milieu du secteur cible quand la roue est a 0°
        val sliceMidAngle = targetIndex * sliceAngle + sliceAngle / 2f
        // On veut que ce secteur soit sous le pointeur (en haut, -90° dans le repere canvas)
        val targetRotation = 360f - sliceMidAngle - 90f

        val startRotation = currentRotation
        // 5 a 8 tours complets + angle final
        val fullRotations = (5 + (Math.random() * 3).toInt()) * 360f
        val endRotation = startRotation + fullRotations + ((targetRotation - startRotation % 360f + 360f) % 360f)

        ValueAnimator.ofFloat(startRotation, endRotation).apply {
            duration = 4000 + (Math.random() * 1500).toLong()
            interpolator = DecelerateInterpolator(2.5f)
            addUpdateListener { anim ->
                currentRotation = anim.animatedValue as Float
                invalidate()
            }
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    isSpinning = false
                    onSpinComplete?.invoke(resultSpell)
                }
            })
            start()
        }
    }

    // ===== DRAW =====

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (slices.isEmpty()) return

        val cx = width / 2f
        val cy = height / 2f
        val radius = min(cx, cy) * 0.85f
        val sliceAngle = 360f / slices.size

        rect.set(cx - radius, cy - radius, cx + radius, cy + radius)

        canvas.save()
        canvas.rotate(currentRotation, cx, cy)

        // Dessiner les secteurs
        slices.forEachIndexed { i, slice ->
            val startAngle = i * sliceAngle
            val colors = rarityColors[slice.spell.rarity] ?: intArrayOf(Color.GRAY, Color.DKGRAY)

            // Gradient radial pour chaque secteur
            slicePaint.shader = RadialGradient(
                cx, cy, radius,
                colors[0], colors[1],
                Shader.TileMode.CLAMP
            )
            canvas.drawArc(rect, startAngle, sliceAngle, true, slicePaint)

            // Bordure du secteur
            borderPaint.strokeWidth = 2f
            canvas.drawArc(rect, startAngle, sliceAngle, true, borderPaint)

            // Emoji + texte au milieu du secteur
            val midAngle = Math.toRadians((startAngle + sliceAngle / 2f).toDouble())
            val textRadius = radius * 0.62f
            val tx = cx + (textRadius * cos(midAngle)).toFloat()
            val ty = cy + (textRadius * sin(midAngle)).toFloat()

            canvas.save()
            canvas.rotate(startAngle + sliceAngle / 2f + 90f, tx, ty)

            // Emoji
            canvas.drawText(slice.spell.emoji, tx, ty - 10f, emojiPaint)

            // Label (reduit)
            textPaint.textSize = when {
                slice.spell.label.length > 10 -> 22f
                slice.spell.label.length > 7 -> 26f
                else -> 30f
            }
            canvas.drawText(slice.spell.label, tx, ty + 35f, textPaint)

            canvas.restore()
        }

        canvas.restore()

        // Bordure exterieure dorée avec glow
        setLayerType(LAYER_TYPE_SOFTWARE, null)
        canvas.drawCircle(cx, cy, radius, glowPaint)
        borderPaint.strokeWidth = 6f
        canvas.drawCircle(cx, cy, radius, borderPaint)

        // Centre de la roue
        val centerRadius = radius * 0.15f
        canvas.drawCircle(cx, cy, centerRadius, centerPaint)
        canvas.drawCircle(cx, cy, centerRadius, centerBorderPaint)

        // Texte central
        textPaint.textSize = 24f
        textPaint.color = Color.parseColor("#FFD700")
        canvas.drawText("SPIN", cx, cy + 8f, textPaint)
        textPaint.color = Color.WHITE

        // Pointeur (triangle en haut)
        val pointerPath = Path().apply {
            moveTo(cx, cy - radius - 15f)
            lineTo(cx - 20f, cy - radius + 25f)
            lineTo(cx + 20f, cy - radius + 25f)
            close()
        }
        canvas.drawPath(pointerPath, pointerPaint)
        // Bordure pointeur
        val pointerBorderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Color.parseColor("#FFD700")
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        canvas.drawPath(pointerPath, pointerBorderPaint)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val size = min(
            MeasureSpec.getSize(widthMeasureSpec),
            MeasureSpec.getSize(heightMeasureSpec)
        )
        setMeasuredDimension(size, size)
    }

}
