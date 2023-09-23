package com.uzential.compose_custom_colors.utils

import androidx.compose.ui.graphics.Color

fun Color.tonalPalette() = TonalPalette(
    color = this,
    color0 = tone(Tone.TONE_0),
    color5 = tone(Tone.TONE_5),
    color10 = tone(Tone.TONE_10),
    color20 = tone(Tone.TONE_20),
    color25 = tone(Tone.TONE_25),
    color30 = tone(Tone.TONE_30),
    color35 = tone(Tone.TONE_35),
    color40 = tone(Tone.TONE_40),
    color50 = tone(Tone.TONE_50),
    color60 = tone(Tone.TONE_60),
    color70 = tone(Tone.TONE_70),
    color80 = tone(Tone.TONE_80),
    color90 = tone(Tone.TONE_90),
    color95 = tone(Tone.TONE_95),
    color98 = tone(Tone.TONE_98),
    color99 = tone(Tone.TONE_99),
    color100 = tone(Tone.TONE_100)
)

data class TonalPalette(
    val color: Color,
    val color0: Color,
    val color5: Color,
    val color10: Color,
    val color20: Color,
    val color25: Color,
    val color30: Color,
    val color35: Color,
    val color40: Color,
    val color50: Color,
    val color60: Color,
    val color70: Color,
    val color80: Color,
    val color90: Color,
    val color95: Color,
    val color98: Color,
    val color99: Color,
    val color100: Color
)

