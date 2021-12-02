package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class SmallXX(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXXXXXXXX,
    @Json(name = "url")
    val url: String
)