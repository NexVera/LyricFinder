package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class PrimaryXX(
    @Json(name = "applicable")
    val applicable: Boolean = false,
    @Json(name = "base")
    val base: Double = 0.0,
    @Json(name = "multiplier")
    val multiplier: Int = 0
)