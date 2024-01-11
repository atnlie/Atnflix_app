package com.app.jc.data.repositories

import com.app.jc.data.Api
import com.app.jc.data.Result
import com.app.jc.data.model.MoviesItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class MoviesRepositoryImpl (
    private val api: Api
): MoviesRepository {
    override suspend fun getMoviesList(): Flow<Result<List<MoviesItem>>> {
        return flow {
            val moviesData = try {
                // TODO: add params instead of hardcode here
                val id = "80057281"
                val type= "similars"
                api.getMoviesList(type, id)

            } catch (e: IOException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error fetch Movies"))
                return@flow
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error fetch Movies"))
                return@flow
            } catch (e: Exception) {
                e.printStackTrace()
                emit(Result.Error(message = "Error fetch Movies"))
                return@flow
            }

            emit(Result.Success(moviesData))
        }
    }
}