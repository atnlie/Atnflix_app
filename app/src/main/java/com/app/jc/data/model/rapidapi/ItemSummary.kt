package com.app.jc.data.model

data class ItemSummary(
    val availability: Availability,
    val boxArt: BoxArt,
    val id: Int,
    val infoDensityRuntime: Int,
    val isOriginal: Boolean,
    val liveEvent: LiveEvent,
    val maturity: Maturity,
    val numSeasonsLabel: Any,
    val releaseYear: Int,
    val requestId: String,
    val title: String,
    val titleMaturity: TitleMaturity,
    val type: String,
    val unifiedEntityId: String,
    val userRatingRequestId: String,
    val videoId: Int
)