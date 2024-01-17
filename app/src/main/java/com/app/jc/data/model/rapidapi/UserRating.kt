package com.app.jc.data.model.rapidapi

data class UserRating(
    val reactionUserRating: String,
    val tooNewForMatchScore: Boolean,
    val type: String,
    val userRating: Int
)