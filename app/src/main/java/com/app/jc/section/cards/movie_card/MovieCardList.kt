package com.app.jc.section.cards.movie_card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Download
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.app.jc.data.model.movies.MovieCardListModel

@Preview
@Composable
fun MovieCardList(
    modifier: Modifier = Modifier,
    movies: List<MovieCardListModel> = listOf(
        MovieCardListModel(
            title = "Energy of Love",
            image = "https://image.tmdb.org/t/p/w300/f1AQhx6ZfGhPZFTVKgxG91PhEYc.jpg",
            movieDuration = "40m",
            description = "In a small Italian village, a young man named Teo and a young woman named Alice fall in love at first sight. However, their love is forbidden because Teo is from a wealthy family and Alice is from a poor family. Despite the obstacles, Teo and Alice are determined to be together. They run away from their families and try to start a new life together. However, they are soon faced with many challenges, including poverty, discrimination, and the disapproval of their families. Despite all of the difficulties, Teo and Alice's love for each other grows stronger. They eventually overcome all of the obstacles and are finally able to be together."
        ),
        MovieCardListModel(
            title = "Bee Keeper",
            image = "https://image.tmdb.org/t/p/w300/f1AQhx6ZfGhPZFTVKgxG91PhEYc.jpg",
            movieDuration = "90m",
            description = "In the quiet countryside, a young beekeeper named Edward finds himself caught in a mysterious phenomenon. As he tends to his bees, he discovers that they are disappearing without a trace. Determined to uncover the truth, Edward embarks on a journey that leads him to a hidden world beneath the surface of his farm. There, he encounters a race of tiny creatures who reveal that the bees have been taken by a powerful force that seeks to control their unique ability to produce a rare and valuable substance. With the help of his newfound friends, Edward must race against time to save the bees and uncover the secrets of this hidden world before it's too late."
        ),
        MovieCardListModel(
            title = "Bee Keeper2",
            image = "https://image.tmdb.org/t/p/w300/f1AQhx6ZfGhPZFTVKgxG91PhEYc.jpg",
            movieDuration = "90m",
            description = "In the quiet countryside, a young beekeeper named Edward finds himself caught in a mysterious phenomenon. As he tends to his bees, he discovers that they are disappearing without a trace. Determined to uncover the truth, Edward embarks on a journey that leads him to a hidden world beneath the surface of his farm. There, he encounters a race of tiny creatures who reveal that the bees have been taken by a powerful force that seeks to control their unique ability to produce a rare and valuable substance. With the help of his newfound friends, Edward must race against time to save the bees and uncover the secrets of this hidden world before it's too late."
        ),
        MovieCardListModel(
            title = "World War III",
            image = "https://image.tmdb.org/t/p/w300/f1AQhx6ZfGhPZFTVKgxG91PhEYc.jpg",
            movieDuration = "40m",
            description = "In a small Italian village, a young man named Teo and a young woman named Alice fall in love at first sight. However, their love is forbidden because Teo is from a wealthy family and Alice is from a poor family. Despite the obstacles, Teo and Alice are determined to be together. They run away from their families and try to start a new life together. However, they are soon faced with many challenges, including poverty, discrimination, and the disapproval of their families. Despite all of the difficulties, Teo and Alice's love for each other grows stronger. They eventually overcome all of the obstacles and are finally able to be together."
        ),
        MovieCardListModel(
            title = "Killing Me Softly",
            image = "https://image.tmdb.org/t/p/w300/f1AQhx6ZfGhPZFTVKgxG91PhEYc.jpg",
            movieDuration = "90m",
            description = "In the quiet countryside, a young beekeeper named Edward finds himself caught in a mysterious phenomenon. As he tends to his bees, he discovers that they are disappearing without a trace. Determined to uncover the truth, Edward embarks on a journey that leads him to a hidden world beneath the surface of his farm. There, he encounters a race of tiny creatures who reveal that the bees have been taken by a powerful force that seeks to control their unique ability to produce a rare and valuable substance. With the help of his newfound friends, Edward must race against time to save the bees and uncover the secrets of this hidden world before it's too late."
        ),
        MovieCardListModel(
            title = "Dumb, I love you",
            image = "https://image.tmdb.org/t/p/w300/f1AQhx6ZfGhPZFTVKgxG91PhEYc.jpg",
            movieDuration = "90m",
            description = "In the quiet countryside, a young beekeeper named Edward finds himself caught in a mysterious phenomenon. As he tends to his bees, he discovers that they are disappearing without a trace. Determined to uncover the truth, Edward embarks on a journey that leads him to a hidden world beneath the surface of his farm. There, he encounters a race of tiny creatures who reveal that the bees have been taken by a powerful force that seeks to control their unique ability to produce a rare and valuable substance. With the help of his newfound friends, Edward must race against time to save the bees and uncover the secrets of this hidden world before it's too late."
        )
    )
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .height(
                if (movies.size > 5) ((movies.size / 1.2) * 100).dp else 200.dp
            ),
    ) {
        items(movies) { item ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = 5.dp)
                    .padding(vertical = 10.dp)
//                    .height(120.dp)
                    .clip(shape = RoundedCornerShape(5.dp)),
                verticalArrangement = Arrangement.Center
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(item.image)
                            .crossfade(true)
                            .scale(Scale.FILL)
                            .build(),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .width(120.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                    )
                    Column (
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                    ) {
                        Text(
                            text = item.title,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            fontSize = 14.sp
                        )
                        Text(
                            text = item.movieDuration,
                            color = Color(0xB2F3F3F3),
                            fontSize = 13.sp,
                        )
                    }
                    Spacer(Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Rounded.Download,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    text = item.description,
                    color = Color(0xB2F3F3F3),
                    fontSize = 12.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 5
                )
            }
        }
    }
}