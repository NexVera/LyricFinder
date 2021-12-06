package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Meta(
    @Json(name = "status")
    val status: Int = 0
)