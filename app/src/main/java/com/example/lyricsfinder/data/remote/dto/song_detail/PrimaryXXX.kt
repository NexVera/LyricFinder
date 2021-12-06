package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class PrimaryXXX(
    @Json(name = "applicable")
    val applicable: Boolean?,
    @Json(name = "base")
    val base: Double?,
    @Json(name = "multiplier")
    val multiplier: Int?
)