package com.app.jc.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MovieDetail(goBack: () -> Boolean) {
    Box(modifier = Modifier.padding(top = 20.dp).fillMaxSize()) {
        Column {
            IconButton(onClick = {
//            navController.popBackStack()
//            navController.navigate("home") {
//                popUpTo("")
//                navController.popBackStack()
//                if (backQueue.size > 2) {
//                    popBackStack()
//                }
//                var launchSingleTop = true
//                popUpTo("first")
//                navController.navigate("movie_detail")
//            }
            }) {
                Icon(
                    Icons.Default.ArrowBack,
                    contentDescription = "",
                    tint = Color.White,
//                modifier = Modifier.padding(10.dp)
                )
            }
            Text(text = "percobaan")
            Button(onClick =  { goBack() }  ) {
                Text("Kembali lah.....")

            }
        }
    }
}