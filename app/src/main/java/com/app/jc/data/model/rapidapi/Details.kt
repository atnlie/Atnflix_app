package com.app.jc.data.model.rapidapi

data class Details(
    val availability: Availability,
    val contextualSynopsis: ContextualSynopsis,
    val delivery: Delivery,
    val displayRuntime: Int,
    val inRemindMeList: Boolean,
    val interestingMoment: InterestingMoment,
    val itemSummary: ItemSummary,
    val maturity: Maturity,
    val queue: Queue,
    val releaseYear: Int,
    val summary: Summary,
    val title: String,
    val trackIds: TrackIds,
    val userRating: UserRating,
    val userRatingRequestId: String
)