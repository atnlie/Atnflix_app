package com.app.jc.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.jc.section.header.CategorySection
import com.app.jc.section.header.HeaderSection

@Preview
@Composable
fun HomeScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(
            horizontal = 2.dp
        )
    ) {
        HeaderSection(title = "For Atnlie")
        CategorySection()
    }
}
