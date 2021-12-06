package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class TinyXX(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXXXXXXXXXX = BoundingBoxXXXXXXXXXXX(),
    @Json(name = "url")
    val url: String = ""
)