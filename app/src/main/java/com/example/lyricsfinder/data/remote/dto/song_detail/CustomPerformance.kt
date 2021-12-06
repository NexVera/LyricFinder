package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class CustomPerformance(
    @Json(name = "artists")
    val artists: List<ArtistX> = listOf(),
    @Json(name = "label")
    val label: String = ""
)