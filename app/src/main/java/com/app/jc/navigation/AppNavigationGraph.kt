package com.app.jc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.app.jc.pages.HomeScreen
import com.app.jc.pages.MovieDetail

@Composable
fun AppNavigationGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = RootScreen.Home.route
    ){
        addHomeRoute(navController)
    }
}

private fun NavGraphBuilder.addHomeRoute(navController: NavController) {
    navigation(
        route = RootScreen.Home.route,
        startDestination = ChildScreen.Home.route
    ) {
        showHome(navController)
        showMovieDetail(navController)
    }
}

private fun NavGraphBuilder.showHome(navController: NavController) {
    composable(route = ChildScreen.Home.route) {
        HomeScreen(
            goToDetailsScreen = {
                // do nothing
            }
        )
    }
}

private fun NavGraphBuilder.showMovieDetail(navController: NavController) {
    composable(route = ChildScreen.MovieDetail.route) {
//        MovieDetail()
    }
}