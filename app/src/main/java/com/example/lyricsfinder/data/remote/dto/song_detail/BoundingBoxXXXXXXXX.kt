package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class BoundingBoxXXXXXXXX(
    @Json(name = "height")
    val height: Int,
    @Json(name = "width")
    val width: Int
)