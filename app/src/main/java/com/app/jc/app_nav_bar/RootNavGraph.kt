package com.app.jc.app_nav_bar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.jc.MainScreen
import com.app.jc.pages.HomeScreen

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = RootGraph.ROOT,
        startDestination = RootGraph.HOME
    ) {
        composable(route = RootGraph.HOME) {
            MainScreen()
            // add more route e.g. auth (login, register, reset pass, etc.)
        }
    }
}