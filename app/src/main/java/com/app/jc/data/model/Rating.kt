package com.app.jc.data.model

data class Rating(
    val board: String,
    val boardId: Int,
    val maturityDescription: String,
    val maturityLevel: Int,
    val ratingId: Int,
    val reasons: List<Reason>,
    val specificRatingReason: String,
    val value: String
)