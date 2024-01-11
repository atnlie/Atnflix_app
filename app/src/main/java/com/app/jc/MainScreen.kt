package com.app.jc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.app.jc.navbar.BottomNavigationBar
import com.app.jc.screens.HomeScreen

@Preview
@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        },
        containerColor = Color.Black
    ) {
        padding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            HomeScreen()

            // header
            // content
            // footer
        }
    }
}
