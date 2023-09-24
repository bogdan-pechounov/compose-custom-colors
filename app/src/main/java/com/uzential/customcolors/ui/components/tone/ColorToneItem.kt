package com.uzential.customcolors.ui.components.tone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
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
import com.uzential.compose_custom_colors.ui.LocalCustomColorScheme
import com.uzential.compose_custom_colors.utils.Tone
import com.uzential.compose_custom_colors.utils.tone

@Composable
fun ColorToneItem(tone: Tone){
    val backgroundColor = LocalCustomColorScheme.current.color.tone(tone)
    val textColor = if(backgroundColor.luminance() > 0.5) Color.Black else Color.White

    Box(
        modifier = Modifier
            .size(width = 50.dp, height = 70.dp)
            .clip(RectangleShape)
            .background(backgroundColor)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "${tone.value}",
            color = textColor
        )
    }
}

@Preview
@Composable
private fun Preview() {
    ColorToneItem(tone = Tone.TONE_35)
}