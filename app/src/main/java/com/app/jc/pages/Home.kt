package com.app.jc.pages

import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.jc.data.di.JCInstance
import com.app.jc.data.model.MoviesItem
import com.app.jc.data.repositories.MoviesRepositoryImpl
import com.app.jc.presentations.MoviesViewModel
import com.app.jc.section.header.CategorySection
import com.app.jc.section.header.HeaderSection
import com.app.jc.section.home.MoviesSection

@Preview
@Composable
fun HomeScreen(moviesList: List<MoviesItem> = listOf()) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(
            horizontal = 2.dp
        )
    ) {
        HeaderSection(title = "For Atnlie")
        CategorySection()
        if (moviesList.isEmpty()) {
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                CircularProgressIndicator()
            }
        } else {
            LazyColumn(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                contentPadding = PaddingValues(16.dp)
            ) {
                items(moviesList.size) { index ->
                    MoviesSection(movie = moviesList[index])
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}
