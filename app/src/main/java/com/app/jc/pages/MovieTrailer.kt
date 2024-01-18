package com.app.jc.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun MovieTrailer(navController: NavHostController) {
    Box() {
        Text(text="Trailer")
        Button(onClick = { navController.popBackStack() }) {
            Text("Kembali lah.....")

        }
    }
}