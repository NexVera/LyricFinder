package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class BoundingBoxXXXXXXXXX(
    @Json(name = "height")
    val height: Int = 0,
    @Json(name = "width")
    val width: Int = 0
)