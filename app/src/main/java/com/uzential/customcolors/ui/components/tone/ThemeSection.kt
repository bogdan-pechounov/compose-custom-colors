package com.uzential.customcolors.ui.components.tone

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uzential.compose_custom_colors.ui.CustomColorScheme

@Composable
fun ThemeSection(
    colorName: String = "Yellow",
    color: Color = Color.Yellow
) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = colorName,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center
            )

            Box(
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
                    .background(color)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))


        CustomColorScheme(color = color, darkTheme = false, harmonize = false) {
            HeaderText(text = "Light Theme")
            ThemeRow()
        }

        CustomColorScheme(color = color, darkTheme = true, harmonize = false) {
            HeaderText(text = "Dark Theme")
            ThemeRow()

            HeaderText(text = "Tonal Palette")
            ColorToneList()
        }

        CustomColorScheme(color = color, darkTheme = false, harmonize = true) {
            HeaderText(text = "Light Theme (Harmonized)")
            ThemeRow()
        }

        CustomColorScheme(color = color, darkTheme = true, harmonize = true) {
            HeaderText(text = "Dark Theme (Harmonized)")
            ThemeRow()

            HeaderText(text = "Tonal Palette (Harmonized)")
            ColorToneList()
        }
    }
}

@Composable
private fun HeaderText(text: String){
    Text(
        text = text,
        style = MaterialTheme.typography.titleSmall
    )
}

@Preview
@Composable
fun ThemeSectionPreview() {
    ThemeSection()
}