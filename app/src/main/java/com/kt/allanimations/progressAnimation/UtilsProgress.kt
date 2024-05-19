package com.kt.allanimations.progressAnimation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

object IndicatorDefaults {
    val Size = 48.0.dp
    val StaticItemColor = Color(0xff757575)
    val DynamicItemColor = Color(0xffEEEEEE)

    val DefaultGradientColors = listOf(
        Color(0xffFFEB3B),
        Color(0xffE91E63)
    )

    val DotColor = Color(0xffBDBDBD)
}

enum class SpinnerShape {
    Rect, RoundedRect
}

enum class IndicatorStyle {
    Stroke, Filled
}

internal fun lerp(start: Float, stop: Float, fraction: Float): Float {
    return (1 - fraction) * start + fraction * stop
}


internal fun scale(start1: Float, end1: Float, pos: Float, start2: Float, end2: Float) =
    lerp(start2, end2, calculateFraction(start1, end1, pos))


internal fun calculateFraction(start: Float, end: Float, pos: Float) =
    (if (end - start == 0f) 0f else (pos - start) / (end - start)).coerceIn(0f, 1f)