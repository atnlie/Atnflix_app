package com.app.jc.app_nav_bar

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.app.jc.pages.MovieDetail

fun NavGraphBuilder.movieDetailNavGraph(navController: NavHostController) {
    navigation(
        route = RootGraph.MOVIE_DETAIL,
        startDestination = MovieNavigationScreen.MovieDetailRoute
    ) {
        composable(route = MovieDetailsScreen.MovieDetail.route) {
            MovieDetail(
                goBack = {
                    navController.popBackStack(
                        route = RootGraph.MOVIE_DETAIL,
                        inclusive = false
                    )
                }
            )
        }
    }
}