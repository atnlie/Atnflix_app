package com.app.jc.app_nav_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
//fun BottomNavigationBar(destination: NavDestination, navController: NavHostController) {
fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val bottomBarDestination = itemsBar.any { it.route == currentDestination?.route }

    if (bottomBarDestination) {
        NavigationBar {
            Row(
                modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
            ) {
                itemsBar.forEachIndexed { _, item ->
                    NavigationBarItem(
                        selected = item.route == currentDestination?.route,
//                        selected = currentDestination?.hierarchy?.any {
//                            it.route == item.route
//                        } == true,
                        onClick = {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title,
                                tint = MaterialTheme.colorScheme.onBackground
                            )
                        },
                        label = {
                            Text(
                                text = item.title,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        }
                    )
                }

            }
        }
    }
}