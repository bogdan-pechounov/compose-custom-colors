package com.uzential.customcolors.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.uzential.compose_custom_colors.ui.CustomColorScheme
import com.uzential.compose_custom_colors.ui.customColorScheme

@Composable
fun Example() {
    CustomColorScheme(color = Color.Red) { // darkTheme = isSystemInDarkTheme(), harmonize = true
        Column {
            Item()
        }
    }
}

@Composable
private fun Item() {
    // val customColorScheme = LocalCustomColorScheme.current

    Surface(
        color = customColorScheme.colorContainer
    ) {
        Text(
            text = "Example item",
            color = customColorScheme.onColorContainer
        )
    }
}

@Preview
@Composable
private fun Preview() {
    Example()
}