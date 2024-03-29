package com.app.jc.app_nav_bar

sealed class RootScreen(val route: String) {
    object Home : RootScreen(RootNavigationScreen.HomeRootRoute)
    object Search : RootScreen(RootNavigationScreen.SearchRootRoute)
    object Upcoming : RootScreen(RootNavigationScreen.UpcomingRootRoute)
}

sealed class ChildScreen(val route: String) {
    object Home : ChildScreen(ChildNavigationScreen.HomeChildRoute)
    object Search : ChildScreen(ChildNavigationScreen.SearchChildRoute)
    object Upcoming : ChildScreen(ChildNavigationScreen.UpcomingChildRoute)
    object MovieDetail : ChildScreen(MovieNavigationScreen.MovieDetailRoute)
    object MovieTrailer : ChildScreen(MovieNavigationScreen.MovieTrailerRoute)
}