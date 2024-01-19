package com.app.jc.section.cards.grids_card

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale

@Composable
fun GridCard(
    modifier: Modifier = Modifier,
    movieInfo: List<String>
) {
    LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = modifier
                .height(500.dp)
                .scale(1.01f)
        ) {
            items(movieInfo.size) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(movieInfo[it])
                        .crossfade(true)
                        .scale(Scale.FILL)
                        .build(),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                )
            }
        }
}