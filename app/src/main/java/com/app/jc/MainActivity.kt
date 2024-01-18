package com.app.jc

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.app.jc.app_nav_bar.RootNavGraph
import com.app.jc.data.di.JCInstance
import com.app.jc.data.repositories.MoviesRepositoryImpl
import com.app.jc.presentations.MoviesViewModel
import com.app.jc.ui.theme.JCTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.flow.collectLatest

class MainActivity : ComponentActivity() {
//    private val viewModel by viewModels<MoviesViewModel>(factoryProducer = {
//        object: ViewModelProvider.Factory {
//            override fun <T: ViewModel> create(modelClass: Class<T>): T {
//                return MoviesViewModel(MoviesRepositoryImpl(JCInstance.api)) as T
//            }
//        }
//    })

    private val vm by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                !vm.isReady.value
            }
        }
        setContent {
            JCTheme {
                SetBarColor(color = MaterialTheme.colorScheme.background)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
//                    val moviesList = viewModel.movies.collectAsState().value
//                    val context = LocalContext.current
//                    LaunchedEffect(key1 = viewModel.showErrorToast) {
//                        viewModel.showErrorToast.collectLatest {show ->
//                            if (show) {
//                                Toast.makeText(
//                                    context,
//                                    "Something wrong...",
//                                    Toast.LENGTH_SHORT
//                                ).show()
//                            }
//                        }
//                    }

//                    MainScreen(moviesList)
                    RootNavGraph(navController = rememberNavController())
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
