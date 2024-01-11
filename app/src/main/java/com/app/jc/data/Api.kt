package com.app.jc.data

import com.app.jc.data.model.Movies
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Headers

interface Api {
    @Headers(value = ["X-RapidAPI-Key: 7454b12867mshe198dd117a23d08p1024b4jsn326a7eb22c3d",
        "X-RapidAPI-Host: netflix54.p.rapidapi.com"])
    @GET("title/{type}/")
    suspend fun getMoviesList(
        @Path("type") type: String,
        @Query("id") id: String,
    ): Movies

    companion object {
        const val BASE_URL = "https://netflix54.p.rapidapi.com/"
    }
}