package com.app.jc.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomNavigationBarItem(val route: String, val icon: ImageVector, val label: String) {
    object Home: BottomNavigationBarItem("home", Icons.Default.Home, "Home")
    object Search: BottomNavigationBarItem("search", Icons.Default.Search, "Search")
    object Upcoming: BottomNavigationBarItem("upcoming", Icons.Default.ShoppingCart, "Upcoming")
}
