package com.uzential.customcolors.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uzential.compose_custom_colors.ui.CustomColorScheme
import com.uzential.compose_custom_colors.ui.LocalCustomColorScheme
import com.uzential.compose_custom_colors.utils.tone

@Composable
fun Example() {
    CustomColorScheme(color = Color.Yellow) { // darkTheme = isSystemInDarkTheme(), harmonize = true
        Column {
            Item()
        }
    }
}

@Composable
private fun Item(){
    val colorScheme = LocalCustomColorScheme.current

    Surface(
        color = colorScheme.customColorContainer
    ) {
        Text(
            text = "Example item",
            color = colorScheme.onCustomColorContainer
        )
    }
}

@Preview
@Composable
private fun Preview() {
    Example()
}