package com.uzential.compose_custom_colors.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.uzential.compose_custom_colors.utils.customColorScheme
import com.uzential.compose_custom_colors.utils.darkCustomColorScheme
import com.uzential.compose_custom_colors.utils.harmonized
import com.uzential.compose_custom_colors.utils.lightCustomColorScheme

@Composable
fun CustomColorScheme(
    color: Color,
    darkTheme: Boolean = isSystemInDarkTheme(),
    harmonize: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme =  color.customColorScheme(darkTheme)  // TODO remember?
    val colorSchemeHarmonized = if(harmonize) colorScheme.harmonized else colorScheme

    CompositionLocalProvider(LocalCustomColorScheme provides colorSchemeHarmonized) {
        content()
    }
}