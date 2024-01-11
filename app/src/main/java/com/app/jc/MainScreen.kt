package com.app.jc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.app.jc.navbar.BottomNavigationBar

@Preview
@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) {
        paddingValues ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // header
            // content
            // footer
        }
    }
}
