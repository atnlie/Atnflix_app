package com.app.jc.data.model.tmdb

data class tmdb_movie(
    val page: Int,
    val results: List<Tmdb_Movie>,
    val total_pages: Int,
    val total_results: Int
)