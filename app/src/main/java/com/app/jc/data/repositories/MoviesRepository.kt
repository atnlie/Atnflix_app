package com.app.jc.data.repositories

import com.app.jc.data.Result
import com.app.jc.data.model.MoviesItem
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {
    suspend fun getMoviesList(): Flow<Result<List<MoviesItem>>>

}