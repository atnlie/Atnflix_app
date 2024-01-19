package com.app.jc.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Download
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.app.jc.R
import com.app.jc.data.enums.EnumDirection
import com.app.jc.data.model.movies.ImageWithText
import com.app.jc.section.cards.audiovideo.AudioVideoCard
import com.app.jc.section.cards.grids_card.GridCard
import com.app.jc.section.cards.movie_card.MovieCardList
import com.app.jc.section.tabmoreinfo.TabMoreInfoCard

@Preview
@Composable
fun MovieDetail(
    goBack: () -> Boolean = { false }
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    val poster =  "https://image.tmdb.org/t/p/w780/f1AQhx6ZfGhPZFTVKgxG91PhEYc.jpg"
    Box(modifier = Modifier
        .padding(top = 5.dp)
        .fillMaxSize()
    ) {
        Column (
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(poster)
                        .crossfade(true)
                        .scale(Scale.FILL)
                        .build(),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .padding(end = 10.dp),
                    horizontalArrangement = Arrangement.End,
                ) {
                    FilledIconButton(
                        onClick = {
                            goBack()
                        },
                        modifier = Modifier
                            .size(30.dp),
                        colors = IconButtonDefaults.filledIconButtonColors(Color.DarkGray)
                        ) {
                        Icon(
                            Icons.Rounded.Close,
                            contentDescription = "",
                            tint = Color.White,

                        )
                    }
                }
            }
            Column (
                modifier = Modifier
                    .padding(horizontal = 10.dp)
            ) {
                Text(
                    text = "The Warrior's Way",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    color = Color.White

                )
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "98% match",
                        color = Color.Green,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.padding(end = 10.dp))
                    Text(
                        "2023",
                        color = Color.White,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.padding(end = 10.dp))
                    IconButton(
                        onClick = {},
                        Modifier
                            .background(Color.DarkGray)
                            .width(40.dp)
                            .height(25.dp)
                            .clip(shape = RoundedCornerShape(50.dp))
                        ,

                    ) {
                        Text("18+",
                            color = Color.White,
                            fontSize = 15.sp
                            )
                    }
                    Spacer(modifier = Modifier.padding(end = 10.dp))
                    Text(
                        "12 Episodes",
                        color = Color.White,
                        fontSize = 15.sp
                    )
                }
                AudioVideoCard(EnumDirection.ROW)
                Spacer(modifier = Modifier.padding(vertical = 10.dp))
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .background(Color.White),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Rounded.PlayArrow,
                        contentDescription = "Play",
                        tint = Color.Black,
                        modifier = Modifier
                            .size(26.dp)
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        "Play",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .background(Color.DarkGray),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Default.Download,
                        contentDescription = "Download",
                        tint = Color.White,
                        modifier = Modifier
                            .size(22.dp)
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        "Download",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Row {
                    Text(
                        text = "When teenage Priscilla Beaulieu meets Elvis Presley at a party, the man who is already a meteoric rock-and-roll superstar becomes someone entirely unexpected in private moments: a thrilling crush, an ally in loneliness, a vulnerable best friend.",
                        color = Color.White,
                        fontSize = 16.sp
                        )
                }
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Row {
                    Column {
                        Text(
                            text = "Cast: When teenage Priscilla Beaulieu meets... more",
                            color = Color(0xFF87858B),
                            fontSize = 16.sp,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 1
                        )
                        Text(
                            text = "Creators: Steve Job, Nocolas Gage, ... more",
                            color = Color(0xFF87858B),
                            fontSize = 16.sp,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 1
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(top = 20.dp))
                TabMoreInfoCard(
                    tabsList =  listOf(
                        ImageWithText(
                            text = "More Like This",
                            image = painterResource(id = R.drawable.anton)
                        ),
                        ImageWithText(
                            text = "Collection",
                            image = painterResource(id = R.drawable.atn)
                        ),
                        ImageWithText(
                            text = "Episodes",
                            image = painterResource(id = R.drawable.atn)
                        )
                    ),
                ) {
                    selectedTabIndex = it
                }
                when(selectedTabIndex) {
                    0 -> Box(
                        modifier = Modifier
                        .padding(top = 14.dp)
                    ) {
                        GridCard(
                            movieInfo = listOf(
                                "https://image.tmdb.org/t/p/w342/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
                                "https://image.tmdb.org/t/p/w342/scFc8RD4sFxB2x0eIOaymphMnYh.jpg",
                                "https://image.tmdb.org/t/p/w342/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
                                "https://image.tmdb.org/t/p/w342/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
                                "https://image.tmdb.org/t/p/w342/scFc8RD4sFxB2x0eIOaymphMnYh.jpg",
                                "https://image.tmdb.org/t/p/w342/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
                            )
                        )
                    }
                    1 ->  Box(
                        modifier = Modifier
                            .padding(top = 14.dp)
                    ) {
                        GridCard(
                            movieInfo = listOf(
                                "https://image.tmdb.org/t/p/w342/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
                                "https://image.tmdb.org/t/p/w342/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
                                "https://image.tmdb.org/t/p/w342/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
                                "https://image.tmdb.org/t/p/w342/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
                                "https://image.tmdb.org/t/p/w342/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
                                "https://image.tmdb.org/t/p/w342/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
                                "https://image.tmdb.org/t/p/w342/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
                                "https://image.tmdb.org/t/p/w342/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
                                "https://image.tmdb.org/t/p/w342/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
                                "https://image.tmdb.org/t/p/w342/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
                                "https://image.tmdb.org/t/p/w342/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg",
                                "https://image.tmdb.org/t/p/w342/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg"
                            )
                        )
                    }
                    2 ->  Box(
                        modifier = Modifier
                            .padding(top = 14.dp)
                    ) {
                        MovieCardList()
                    }
                }
                Spacer(modifier = Modifier.padding(vertical = 10.dp))

            }
        }
    }
}
