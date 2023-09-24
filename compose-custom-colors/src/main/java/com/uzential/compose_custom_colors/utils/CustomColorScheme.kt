package com.uzential.compose_custom_colors.utils

import androidx.compose.ui.graphics.Color

data class CustomColorScheme(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

fun Color.lightCustomColorScheme(): CustomColorScheme {
    val palette = tonalPalette()
    return CustomColorScheme(
        color = palette.color40,
        onColor = palette.color100,
        colorContainer = palette.color90,
        onColorContainer = palette.color10
    )
}

fun Color.darkCustomColorScheme(): CustomColorScheme {
    val palette = tonalPalette()
    return CustomColorScheme(
        color = palette.color80,
        onColor = palette.color20,
        colorContainer = palette.color30,
        onColorContainer = palette.color90
    )
}

fun Color.customColorScheme(darkTheme: Boolean) = if (darkTheme) darkCustomColorScheme() else lightCustomColorScheme()

