package com.app.jc.app_nav_bar

sealed class MovieDetailsScreen (val route: String){
    object MovieDetail: MovieDetailsScreen(route = MovieNavigationScreen.MovieDetailRoute)
    object MovieTrailer: MovieDetailsScreen(route = MovieNavigationScreen.MovieTrailerRoute)
}