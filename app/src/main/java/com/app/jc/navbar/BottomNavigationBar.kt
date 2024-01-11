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
import androidx.compose.ui.tooling.preview.Preview
import com.app.jc.data.BottomNavigation

val itemsBar = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home,
        route = "home"
    ),
    BottomNavigation(
        title = "Search",
        icon = Icons.Rounded.Search,
        route = "search"
    ),
    BottomNavigation(
        title = "Upcoming",
        icon = Icons.Rounded.Upcoming,
        route = "upcoming"
    )
)

@Preview
@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row (
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            itemsBar.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 1,
                    onClick = { },
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