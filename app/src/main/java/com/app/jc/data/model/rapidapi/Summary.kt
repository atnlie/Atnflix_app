package com.app.jc.data.model.rapidapi

data class Summary(
    val id: Int,
    val isOriginal: Boolean,
    val liveEvent: LiveEvent,
    val type: String,
    val unifiedEntityId: String
)