package com.app.jc.data.model.tmdb

data class TmdbResult(
    val page: Int,
    val results: List<TmdbMovie>,
    val total_pages: Int,
    val total_results: Int
)