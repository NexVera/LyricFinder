package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Body(
    @Json(name = "dom")
    val dom: DomX?
)