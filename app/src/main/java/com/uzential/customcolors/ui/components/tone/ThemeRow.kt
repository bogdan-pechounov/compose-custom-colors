package com.uzential.customcolors.ui.components.tone

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uzential.compose_custom_colors.ui.CustomColorScheme
import com.uzential.compose_custom_colors.ui.LocalCustomColorScheme

@Composable
fun ThemeRow() {
    val colorScheme = LocalCustomColorScheme.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.large)
    ) {
        val modifier = Modifier
            .weight(1f)
            .height(70.dp)

        ThemeRowItem(
            modifier = modifier,
            text = "Custom Color",
            color = colorScheme.color,
            onColor = colorScheme.onColor
        )
        ThemeRowItem(
            modifier = modifier,
            text = "On Custom Color",
            color = colorScheme.onColor,
            onColor = colorScheme.color
        )
        ThemeRowItem(
            modifier = modifier,
            text = "Custom Color Container",
            color = colorScheme.colorContainer,
            onColor = colorScheme.onColorContainer
        )
        ThemeRowItem(
            modifier = modifier,
            text = "On Custom Container",
            color = colorScheme.onColorContainer,
            onColor = colorScheme.colorContainer
        )
    }
}

@Composable
fun ThemeRowItem(
    modifier: Modifier,
    text: String,
    color: Color,
    onColor: Color
) {
    val context = LocalContext.current
    Box(
        modifier = modifier
            .background(color)
            .clickable {
                val hexColor = java.lang.String.format("#%08X", -0x1 and color.toArgb())
                Toast
                    .makeText(
                        context,
                        hexColor,
                        Toast.LENGTH_SHORT
                    )
                    .show()
            }
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = text,
            color = onColor,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun Preview() {
    Column {
        val color = Color.Yellow
        CustomColorScheme(color = color, darkTheme = false) {
            ThemeRow()
        }
        CustomColorScheme(color = color, darkTheme = true) {
            ThemeRow()
        }
    }
}