package com.app.jc.navbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.jc.app_nav_bar.BottomNavBarScreen
import com.app.jc.data.model.rapidapi.MoviesItem
import com.app.jc.pages.HomeScreen
import com.app.jc.pages.SearchScreen
import com.app.jc.pages.UpcomingScreen

@Composable
fun BottomNavGraph(navController: NavHostController, pv: PaddingValues, mv: List<MoviesItem>) {
    NavHost(
        navController = navController,
        startDestination = BottomNavBarScreen.Home.route,
        modifier = Modifier.padding(paddingValues = pv)
    ) {
        composable(route  = BottomNavBarScreen.Home.route) {
//            HomeScreen(mv)
            HomeScreen(
                goToDetailsScreen = {
                    // do nothing
                }
            )
        }
        composable(route = BottomNavBarScreen.Search.route) {
            SearchScreen()
        }
        composable(route = BottomNavBarScreen.Upcoming.route) {
            UpcomingScreen()
        }
    }
}