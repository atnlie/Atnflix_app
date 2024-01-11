package com.app.jc.presentations

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.jc.data.Result
import com.app.jc.data.model.MoviesItem
import com.app.jc.data.repositories.MoviesRepository
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MoviesViewModel(
    private val moviesRepository: MoviesRepository
): ViewModel() {
    private val _movies = MutableStateFlow<List<MoviesItem>>(emptyList())
    val movies = _movies.asStateFlow()

    private val _showErrorToast = Channel<Boolean>()
    val showErrorToast = _showErrorToast.receiveAsFlow()

    init {
        viewModelScope.launch {
            moviesRepository.getMoviesList().collectLatest { result ->
                when(result) {
                    is Result.Error -> {
                        _showErrorToast.send(true)
                    }
                    is Result.Success -> {
                        result.data?.let { movies ->
                            _movies.update { movies }
                        }
                    }
                }
            }
        }
    }
}