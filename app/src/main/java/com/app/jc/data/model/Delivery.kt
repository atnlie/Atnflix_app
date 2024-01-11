package com.app.jc.data.model

data class Delivery(
    val has3D: Boolean,
    val has51Audio: Boolean,
    val hasAudioAssistive: Boolean,
    val hasAudioSpatial: Boolean,
    val hasDolbyAtmos: Boolean,
    val hasDolbyVision: Boolean,
    val hasHD: Boolean,
    val hasHDR: Boolean,
    val hasTextClosedCaptions: Boolean,
    val hasUltraHD: Boolean,
    val quality: String
)