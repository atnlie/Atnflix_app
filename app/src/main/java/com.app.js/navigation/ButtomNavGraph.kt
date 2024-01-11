package com.app.jc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.jc.screens.HomeScreen
import com.app.jc.screens.SearchScreen
import com.app.jc.screens.UpcomingScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavigationBarItem.Home.route
    ) {
        composable(route  = BottomNavigationBarItem.Home.route) {
            HomeScreen()
        }
        composable(route = BottomNavigationBarItem.Search.route) {
            SearchScreen()
        }
        composable(route = BottomNavigationBarItem.Upcoming.route) {
            UpcomingScreen()
        }
    }
}