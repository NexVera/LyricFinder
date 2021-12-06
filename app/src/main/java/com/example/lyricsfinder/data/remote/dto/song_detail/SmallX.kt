package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class SmallX(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXXXX = BoundingBoxXXXXX(),
    @Json(name = "url")
    val url: String = ""
)