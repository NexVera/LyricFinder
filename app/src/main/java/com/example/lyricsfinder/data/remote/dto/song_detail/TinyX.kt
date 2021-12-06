package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class TinyX(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXXXXXX = BoundingBoxXXXXXXX(),
    @Json(name = "url")
    val url: String = ""
)