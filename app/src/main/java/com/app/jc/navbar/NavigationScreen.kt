package com.app.jc.navbar

sealed  class NavigationScreen(val route: String) {
    object MovieDetail: NavigationScreen(route = "movie_detail")
}
