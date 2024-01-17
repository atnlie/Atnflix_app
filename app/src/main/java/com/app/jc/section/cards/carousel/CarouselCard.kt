package com.app.jc.section.cards.carousel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.PlaylistAdd
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun CarouselCard(sliderList: List<String> = listOf()) {

    // TODO: get data from sliderlist
    var categories: List<String> = listOf(
        "Epic", "Action", "Violence", "Adult"
    )

    val pageCount = sliderList.size
    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f
    ) {
        pageCount
    }

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HorizontalPager(
            state = pagerState,
        ) { page ->
            val boxHeight = 500
            Box (
                modifier = Modifier
                    .height(boxHeight.dp),
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(sliderList[page])
                        .crossfade(true)
                        .scale(Scale.FILL)
                        .build(),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(fraction = 200f)
                        .background(
                            alpha = 0.9f,
                            brush = Brush
                                .verticalGradient(
                                    startY = boxHeight * 1.8f,
                                    colors = listOf(
                                        Color.Transparent,
                                        Color.Black
                                    )
                                )
                        ),
                    Alignment.BottomCenter
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        categories.forEachIndexed{ idx, value ->
                            Text(
                                value + if (idx < (categories.size-1)) " - " else "",
                                modifier = Modifier.padding(bottom = 60.dp),
                                color = Color.White,
                                fontSize = 14.sp

                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                            .padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,

                    ) {
                        IconButton(
                            onClick = { /*TODO*/ },
                            Modifier
                                .width(140.dp)
                                .background(Color.White)
                                .size(32.dp),

                        ) {
                            Row (
                                horizontalArrangement = Arrangement.Center,
                            ) {
                                Icon(
                                    Icons.Rounded.PlayArrow,
                                    contentDescription = "Play",
                                    tint = Color.Black,
                                    modifier = Modifier
                                        .size(20.dp)
                                )
                                Spacer(modifier = Modifier.padding(5.dp))
                                Text(
                                    "Play",
                                    color = Color.Black,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                        IconButton(
                            onClick = { /*TODO*/ },
                            Modifier
                                .width(140.dp)
                                .background(Color.DarkGray)
                                .size(32.dp)
                            ) {
                            Row (
                                horizontalArrangement = Arrangement.Center,
                            ) {
                                Icon(
                                    Icons.Rounded.PlaylistAdd,
                                    contentDescription = "MyList",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .size(20.dp)
                                )
                                Spacer(modifier = Modifier.padding(5.dp))
                                Text(
                                    "My List",
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
