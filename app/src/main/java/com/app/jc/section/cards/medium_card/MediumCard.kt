package com.app.jc.section.cards.medium_card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale

@Preview
@Composable
fun MediumCard() {
    val listData = listOf(
        "https://image.tmdb.org/t/p/w500/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
        "https://image.tmdb.org/t/p/w500/scFc8RD4sFxB2x0eIOaymphMnYh.jpg",
        "https://image.tmdb.org/t/p/w500/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
        "https://image.tmdb.org/t/p/w500/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
        "https://image.tmdb.org/t/p/w500/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
        "https://image.tmdb.org/t/p/w500/scFc8RD4sFxB2x0eIOaymphMnYh.jpg",
        "https://image.tmdb.org/t/p/w500/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
        "https://image.tmdb.org/t/p/w500/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
        "https://image.tmdb.org/t/p/w500/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
        "https://image.tmdb.org/t/p/w500/scFc8RD4sFxB2x0eIOaymphMnYh.jpg",
        "https://image.tmdb.org/t/p/w500/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
        "https://image.tmdb.org/t/p/w500/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
        "https://image.tmdb.org/t/p/w500/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
        "https://image.tmdb.org/t/p/w500/scFc8RD4sFxB2x0eIOaymphMnYh.jpg",
        "https://image.tmdb.org/t/p/w500/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
        "https://image.tmdb.org/t/p/w500/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
        "https://image.tmdb.org/t/p/w500/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
        "https://image.tmdb.org/t/p/w500/scFc8RD4sFxB2x0eIOaymphMnYh.jpg",
        "https://image.tmdb.org/t/p/w500/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
        "https://image.tmdb.org/t/p/w500/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
    ) {
        items(listData) { item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = 5.dp)
                    .height(250.dp)
                    .width(150.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                ,
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(item)
                        .crossfade(true)
                        .scale(Scale.FILL)
                        .build(),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}