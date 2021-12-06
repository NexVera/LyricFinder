package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Range(
    @Json(name = "content")
    val content: String?
)