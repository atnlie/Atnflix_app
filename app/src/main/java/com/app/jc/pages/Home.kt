package com.app.jc.pages

import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.jc.data.di.JCInstance
import com.app.jc.data.repositories.MoviesRepositoryImpl
import com.app.jc.presentations.MoviesViewModel
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
