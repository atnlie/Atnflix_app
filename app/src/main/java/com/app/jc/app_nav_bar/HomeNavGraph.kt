package com.app.jc.app_nav_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Upcoming
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.jc.data.BottomNavigation
import com.app.jc.pages.HomeScreen
import com.app.jc.pages.SearchScreen
import com.app.jc.pages.UpcomingScreen

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = RootGraph.HOME,
        startDestination = BottomNavBarScreen.Home.route
    ) {
        composable(route = BottomNavBarScreen.Home.route) {
            HomeScreen(
                goToDetailsScreen = {
                    navController.navigate(ChildScreen.MovieDetail.route)
                }
            )
        }
        composable(route = BottomNavBarScreen.Search.route) {
            SearchScreen()
        }
        composable(route = BottomNavBarScreen.Upcoming.route) {
            UpcomingScreen()
        }
        movieDetailNavGraph(navController = navController)
    }
}

val itemsBar = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home,
        route = RootNavigationScreen.HomeRootRoute,
    ),
    BottomNavigation(
        title = "Search",
        icon = Icons.Rounded.Search,
        route =RootNavigationScreen.SearchRootRoute,
    ),
    BottomNavigation(
        title = "Upcoming",
        icon = Icons.Rounded.Upcoming,
        route =RootNavigationScreen.UpcomingRootRoute,
    )
)