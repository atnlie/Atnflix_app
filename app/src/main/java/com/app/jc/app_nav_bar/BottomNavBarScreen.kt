package com.app.jc.app_nav_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomNavBarScreen(val route: String, val icon: ImageVector, val label: String) {
    object Home: BottomNavBarScreen("home_root", Icons.Default.Home, "Home")
    object Search: BottomNavBarScreen("search_root", Icons.Default.Search, "Search")
    object Upcoming: BottomNavBarScreen("upcoming_root", Icons.Default.ShoppingCart, "Upcoming")
}
