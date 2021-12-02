package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class ThumbX(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXXXXX,
    @Json(name = "url")
    val url: String
)