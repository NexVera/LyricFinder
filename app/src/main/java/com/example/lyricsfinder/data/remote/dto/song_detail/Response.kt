package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Response(
    @Json(name = "song")
    val song: Song?
)