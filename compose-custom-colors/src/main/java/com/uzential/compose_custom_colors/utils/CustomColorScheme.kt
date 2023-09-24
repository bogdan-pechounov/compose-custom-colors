package com.uzential.compose_custom_colors.utils

import androidx.compose.ui.graphics.Color

data class CustomColorScheme(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

fun Color.lightCustomColorScheme(): CustomColorScheme {
    return CustomColorScheme(
        color = tone(Tone.TONE_40),
        onColor = tone(Tone.TONE_100),
        colorContainer = tone(Tone.TONE_90),
        onColorContainer = tone(Tone.TONE_10)
    )
}

fun Color.darkCustomColorScheme(): CustomColorScheme {
    return CustomColorScheme(
        color = tone(Tone.TONE_80),
        onColor = tone(Tone.TONE_20),
        colorContainer = tone(Tone.TONE_30),
        onColorContainer = tone(Tone.TONE_90)
    )
}

fun Color.customColorScheme(darkTheme: Boolean) = if (darkTheme) darkCustomColorScheme() else lightCustomColorScheme()

