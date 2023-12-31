package com.uzential.customcolors.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.uzential.customcolors.ui.components.tone.ThemeSection

val colors = listOf(Color.Yellow, Color.Red, Color.Green, Color.Blue)

@Composable
fun MainScreen() {
    var color by remember {
        mutableStateOf(Color.Red)
    }
    Column {
        Button(onClick = {
            color = colors.filter { it != color }.random()
        }) {
            Text("Change color")
        }

        ThemeSection(
            colorName = "Color",
            color = color
        )
    }
}