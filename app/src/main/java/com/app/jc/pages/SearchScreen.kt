package com.app.jc.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.app.jc.section.cards.medium_card.MediumCard

@Composable
fun SearchScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.DarkGray),
        contentAlignment = Alignment.Center
    ){
//        Text(
//            text = "Search",
//            fontWeight = FontWeight.Bold,
//            color = Color.White,
//            fontSize = MaterialTheme.typography.headlineLarge.fontSize
//        )
        MediumCard()
    }
}

@Preview
@Composable
fun SearchScreenPreview() {
    SearchScreen()
}