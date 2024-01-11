package com.app.jc.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun UpcomingScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Magenta),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Upcoming",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize
        )
    }
}

@Preview
@Composable
fun UpcomingScreenPreview() {
    UpcomingScreen()
}