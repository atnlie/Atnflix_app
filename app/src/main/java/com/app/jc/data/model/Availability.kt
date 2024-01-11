package com.app.jc.data.model

data class Availability(
    val availabilityDate: String,
    val availabilityStartTime: Long,
    val isPlayable: Boolean,
    val unplayableCause: Any
)