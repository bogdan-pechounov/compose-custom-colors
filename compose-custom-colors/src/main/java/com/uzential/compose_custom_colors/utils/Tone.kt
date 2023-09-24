package com.uzential.compose_custom_colors.utils

import android.annotation.SuppressLint
import androidx.annotation.ColorInt
import androidx.annotation.IntRange
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.google.android.material.color.utilities.Hct

fun Color.tone(@IntRange(from = 0, to = 100) tone: Int): Color {
    return Color(getColorRole(this.toArgb(), tone))
}

fun Color.tone(tone: Tone) = tone(tone.value)

@SuppressLint("RestrictedApi")
@ColorInt
private fun getColorRole(@ColorInt color: Int, @IntRange(from = 0, to = 100) tone: Int): Int {
    val hctColor = Hct.fromInt(color)
    hctColor.tone = tone.toDouble()
    return hctColor.toInt()
}

enum class Tone(val value: Int) {
    TONE_0(0),
    TONE_5(5),
    TONE_10(10),
    TONE_20(20),
    TONE_25(25),
    TONE_30(30),
    TONE_35(35),
    TONE_40(40),
    TONE_50(50),
    TONE_60(60),
    TONE_70(70),
    TONE_80(80),
    TONE_90(90),
    TONE_95(95),
    TONE_98(98),
    TONE_99(99),
    TONE_100(100),
}