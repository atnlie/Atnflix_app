package com.app.jc.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.jc.navbar.BottomNavBarScreen
import com.app.jc.screens.HomeScreen
import com.app.jc.screens.SearchScreen
import com.app.jc.screens.UpcomingScreen

@Composable
fun BottomNavGraph(navController: NavHostController, pv: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = BottomNavBarScreen.Home.route,
        modifier = Modifier.padding(paddingValues = pv)
    ) {
        composable(route  = BottomNavBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomNavBarScreen.Search.route) {
            SearchScreen()
        }
        composable(route = BottomNavBarScreen.Upcoming.route) {
            UpcomingScreen()
        }
    }
}