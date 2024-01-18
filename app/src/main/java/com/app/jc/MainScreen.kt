package com.app.jc

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.app.jc.app_nav_bar.BottomNavigationBar
import com.app.jc.app_nav_bar.HomeNavGraph

@Preview
@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController()
) {
    Scaffold (
        bottomBar = {
            BottomNavigationBar(
                navController = navController
            )
        }
    ) {
            paddingValues ->
        print(paddingValues)
        HomeNavGraph(navController = navController)

    }

    //OLD
//fun MainScreen(moviesList: List<MoviesItem> = listOf()) {
//    val navController = rememberNavController()
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    val currentDestination = navBackStackEntry?.destination

//    Scaffold(
//        bottomBar = {
//            currentDestination?.let { BottomNavigationBar(it, navController) }
//        },
//        containerColor = Color.Black,
//    ) {
//        paddingValues ->
//        Column (
//            modifier = Modifier
//                .fillMaxSize()
//                //.padding(paddingValues)
//        ) {
//            BottomNavGraph(navController = navController, pv = paddingValues, mv = moviesList)
//        }
//    }


//    Scaffold (
//        bottomBar = {
//            currentDestination?.let  {
//                BottomNavigationBar(navController = BottomNavBarScreen)
//            }
//        }
//    ) { paddingValues ->
//        println(paddingValues)
//        RootNavGraph(navController = rememberNavController())
////        HomeScreen()
//    }
}
