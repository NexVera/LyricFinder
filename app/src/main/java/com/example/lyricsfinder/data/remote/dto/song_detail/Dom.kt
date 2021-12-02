package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Dom(
    @Json(name = "children")
    val children: List<Any>,
    @Json(name = "tag")
    val tag: String
)