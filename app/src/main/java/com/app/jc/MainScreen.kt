package com.app.jc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.app.jc.navbar.BottomNavBarScreen
import com.app.jc.navbar.BottomNavigationBar
import com.app.jc.navigation.BottomNavGraph
import com.app.jc.screens.HomeScreen
import com.app.jc.screens.SearchScreen
import com.app.jc.screens.UpcomingScreen

@Preview
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        bottomBar = {
            currentDestination?.let { BottomNavigationBar(it, navController) }
        },
        containerColor = Color.Black
    ) {
        paddingValues ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            BottomNavGraph(navController = navController, pv = paddingValues)
        }
    }
}
