package com.uzential.compose_custom_colors.utils

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

data class CustomColorScheme(
    val customColor: Color,
    val onCustomColor: Color,
    val customColorContainer: Color,
    val onCustomColorContainer: Color
)

fun Color.lightCustomColorScheme(): CustomColorScheme {
    val palette = tonalPalette()
    return CustomColorScheme(
        customColor = palette.color40,
        onCustomColor = palette.color100,
        customColorContainer = palette.color90,
        onCustomColorContainer = palette.color10
    )
}

fun Color.darkCustomColorScheme(): CustomColorScheme {
    val palette = tonalPalette()
    return CustomColorScheme(
        customColor = palette.color80,
        onCustomColor = palette.color20,
        customColorContainer = palette.color30,
        onCustomColorContainer = palette.color90
    )
}

fun Color.customColorScheme(darkTheme: Boolean) = if (darkTheme) darkCustomColorScheme() else lightCustomColorScheme()

