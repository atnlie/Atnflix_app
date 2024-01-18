package com.app.jc.navbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.jc.pages.MovieDetail

@Composable
fun NavigationGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = NavigationScreen.MovieDetail.route,
        modifier = Modifier
    ) {
        composable(route = NavigationScreen.MovieDetail.route) {
//            MovieDetail(navController = navController)
        }
    }
}