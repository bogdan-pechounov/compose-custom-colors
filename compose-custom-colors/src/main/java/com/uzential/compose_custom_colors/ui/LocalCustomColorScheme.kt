package com.uzential.compose_custom_colors.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import com.uzential.compose_custom_colors.utils.lightCustomColorScheme

private val defaultCustomColorScheme = Color.Red.lightCustomColorScheme()

val LocalCustomColorScheme = compositionLocalOf {
    defaultCustomColorScheme
}

val customColorScheme
    @Composable
    @ReadOnlyComposable
    get() = LocalCustomColorScheme.current
