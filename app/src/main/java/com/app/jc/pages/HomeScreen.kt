package com.app.jc.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.app.jc.data.EnumCard
import com.app.jc.section.cards.carousel.CarouselCard
import com.app.jc.section.cards.horizontal.HorizontalCard
import com.app.jc.section.header.CategorySection
import com.app.jc.section.header.HeaderSection

@Composable
fun HomeScreen(
    goToDetailsScreen: () -> Unit?
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 2.dp)
    ) {
        HeaderSection(title = "For Atnlie")
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            CategorySection()

            // TODO: get data from API
            val sliderList = listOf(
                "https://image.tmdb.org/t/p/w500/otjBqNDpZ3C9mzfDOI4kaiib3Qd.jpg",
                "https://image.tmdb.org/t/p/w500/scFc8RD4sFxB2x0eIOaymphMnYh.jpg",
                "https://image.tmdb.org/t/p/w500/ofTnrgEwtPILNfjwk0FAx3bfwZ6.jpg",
                "https://image.tmdb.org/t/p/w500/5VJSIAhSn4qUsg5nOj4MhQhF5wQ.jpg"
            )
            CarouselCard(sliderList, goToDetailsScreen)

            Spacer(modifier = Modifier.padding(top = 10.dp))

            HorizontalCard(
                title = "Only on Netflix",
                type = EnumCard.MEDIUM
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            HorizontalCard(
                title = "Top 10 Movies in Indonesian Today",
                type = EnumCard.SMALL
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            HorizontalCard(
                title = "New Release",
                type = EnumCard.SMALL
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            HorizontalCard(
                title = "TV Shows",
                type = EnumCard.SMALL
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            HorizontalCard(
                title = "Trending Now",
                type = EnumCard.SMALL
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            HorizontalCard(
                title = "Action Movies",
                type = EnumCard.SMALL
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            HorizontalCard(
                title = "K-Drama",
                type = EnumCard.SMALL
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            HorizontalCard(
                title = "Asians Movies & TV",
                type = EnumCard.SMALL
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            HorizontalCard(
                title = "Indonesian Movies & TV",
                type = EnumCard.SMALL
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))
        }


        //        if (moviesList.isEmpty()) {
        //            Box(modifier = Modifier.fillMaxWidth(),
        //                contentAlignment = Alignment.Center
        //            ){
        //                CircularProgressIndicator()
        //            }
        //        } else {
        //            LazyColumn(modifier = Modifier.fillMaxWidth(),
        //                horizontalAlignment = Alignment.CenterHorizontally,
        //                contentPadding = PaddingValues(16.dp)
        //            ) {
        //                items(moviesList.size) { index ->
        //                    MoviesSection(movie = moviesList[index])
        //                    Spacer(modifier = Modifier.height(16.dp))
        //                }
        //            }
        //        }

    }
}
