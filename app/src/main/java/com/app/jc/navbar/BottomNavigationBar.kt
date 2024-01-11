package com.app.jc.navbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Upcoming
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.app.jc.data.BottomNavigation


val itemsBar = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home,
        route ="home",
    ),
    BottomNavigation(
        title = "Search",
        icon = Icons.Rounded.Search,
        route ="search",
    ),
    BottomNavigation(
        title = "Upcoming",
        icon = Icons.Rounded.Upcoming,
        route ="upcoming",
    )
)

@Composable
fun BottomNavigationBar(destination: NavDestination, navController: NavHostController) {
    NavigationBar {
        Row (
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            itemsBar.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = item.route == destination.route,
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