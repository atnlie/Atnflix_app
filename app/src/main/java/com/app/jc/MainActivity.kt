package com.app.jc

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.jc.data.di.JCInstance
import com.app.jc.data.repositories.MoviesRepositoryImpl
import com.app.jc.presentations.MoviesViewModel
import com.app.jc.section.home.MoviesSection
import com.app.jc.ui.theme.JCTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.flow.collectLatest

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MoviesViewModel>(factoryProducer = {
        object: ViewModelProvider.Factory {
            override fun <T: ViewModel> create(modelClass: Class<T>): T {
                return MoviesViewModel(MoviesRepositoryImpl(JCInstance.api)) as T
            }
        }
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCTheme {
                SetBarColor(color = MaterialTheme.colorScheme.background)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val moviesList = viewModel.movies.collectAsState().value
                    val context = LocalContext.current
                    LaunchedEffect(key1 = viewModel.showErrorToast) {
                        viewModel.showErrorToast.collectLatest {show ->
                            if (show) {
                                Toast.makeText(
                                    context,
                                    "Something wrong...",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                    }
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
//                    MainScreen()
                }
            }
        }
    }

    @Composable
    private fun SetBarColor(color: Color) {
        val sUiController = rememberSystemUiController()
        SideEffect {
            sUiController.setSystemBarsColor(color = color)
        }
    }

}
