package com.app.jc.section.cards.grids_card

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun GridCard(
    movieInfo: List<Painter>,
    modifier: Modifier = Modifier,
    cols: Int = 3
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(cols),
        modifier = modifier
            .scale(1.01f)
    ) {
        items(movieInfo.size) {
            Image(
                painter = movieInfo[it],
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(1f)
                    .border(
                        width = 1.dp,
                        color = Color.White

                    )
            )
        }
    }
}