package com.app.jc.section.cards.audiovideo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Comment
import androidx.compose.material.icons.rounded.Hd
import androidx.compose.material.icons.rounded.SpatialAudio
import androidx.compose.material.icons.rounded.SurroundSound
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.jc.data.enums.EnumDirection
import com.app.jc.data.model.movies.AudioVideoModel

@Preview
@Composable
fun AudioVideoCard(direction: EnumDirection = EnumDirection.ROW) {
    val items = listOf<AudioVideoModel>(
        AudioVideoModel(1, "Dolby Vision", Icons.Rounded.SurroundSound),
        AudioVideoModel(2, "HD", Icons.Rounded.Hd),
        AudioVideoModel(3, "Spatial", Icons.Rounded.SpatialAudio),
        AudioVideoModel(4, "Comment", Icons.Rounded.Comment),
    )
    when(direction) {
        EnumDirection.ROW -> {
            Row (
                modifier = Modifier
                    .padding(5.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                RenderItem(items)
            }
        }
        EnumDirection.COLUMN -> {
            Column (
                modifier = Modifier
                    .padding(5.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                RenderItem(items)
            }
        }
    }
}

@Composable
private fun RenderItem(items: List<AudioVideoModel> = listOf()) {
    items.forEach {value ->
        Icon(
            value.image,
            contentDescription = null,
            tint = Color(0xFFDCE2E4),
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
    }
}