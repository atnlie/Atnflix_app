//package com.app.jc.navbar
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavGraphBuilder
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.navigation
//import com.app.jc.app_nav_bar.MovieNavigation
//import com.app.jc.app_nav_bar.RootGraph
//import com.app.jc.pages.MovieDetail
//import com.app.jc.pages.MovieTrailer
//
//@Composable
//fun NavGraphBuilder.MovieNavigationGraph(navController: NavHostController) {
//    navigation(
////        navController = navController,
//        route = RootGraph.MOVIE_DETAIL,
//        startDestination = MovieNavigation.MovieDetailRoute
//    ) {
//        composable(route = MovieNavigation.MovieDetailRoute) {
//            MovieDetail(
//                goBack = {
//                    navController.navigate(MovieNavigation.MovieDetailRoute)
//                }
//            )
//        }
//        composable(route = MovieNavigation.MovieTrailerRoute) {
//            MovieTrailer(navController = navController)
//        }
//    }
//}