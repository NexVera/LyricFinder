package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Tiny(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXX,
    @Json(name = "url")
    val url: String
)