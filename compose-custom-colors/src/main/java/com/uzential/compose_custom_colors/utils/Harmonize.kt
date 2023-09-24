package com.uzential.compose_custom_colors.utils

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.google.android.material.color.MaterialColors

fun Color.harmonize(with: Color) = Color(MaterialColors.harmonize(this.toArgb(), with.toArgb()))

// TODO only need to harmonize with primary color?
val Color.harmonized
    @Composable
    get() = harmonize(MaterialTheme.colorScheme.primary)




fun CustomColorScheme.harmonize(with: Color) = CustomColorScheme(
    color = color.harmonize(with),
    onColor = onColor.harmonize(with),
    colorContainer = colorContainer.harmonize(with),
    onColorContainer = onColorContainer.harmonize(with)
)

val CustomColorScheme.harmonized
    @Composable
    get() = harmonize(MaterialTheme.colorScheme.primary)

