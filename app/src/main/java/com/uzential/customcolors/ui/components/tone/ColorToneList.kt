package com.uzential.customcolors.ui.components.tone

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.uzential.compose_custom_colors.ui.CustomColorScheme
import com.uzential.compose_custom_colors.utils.Tone

@Composable
fun ColorToneList() {
    LazyRow {
        Tone.values().reversed().forEach {
            item {
                ColorToneItem(tone = it)
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    Column {
        CustomColorScheme(color = Color.Red) {
            ColorToneList()
        }

        CustomColorScheme(color = Color.Yellow) {
            ColorToneList()
        }

        CustomColorScheme(color = Color.Blue) {
            ColorToneList()
        }
    }
}
