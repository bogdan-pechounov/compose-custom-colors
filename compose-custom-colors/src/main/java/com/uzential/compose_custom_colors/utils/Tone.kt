package com.uzential.compose_custom_colors.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.smarttoolfactory.extendedcolors.md3.hct.Cam16
import com.smarttoolfactory.extendedcolors.md3.hct.Hct

// TODO result is slightly incorrect
fun Color.tone(tone: Int): Color {
    val camColor = Cam16.fromInt(this.toArgb())
    val colorTone = Hct.from(camColor.hue, camColor.chroma, tone.toDouble()).toInt()
    return Color(colorTone)
}

fun Color.tone(tone: Tone) = tone(tone.value)

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