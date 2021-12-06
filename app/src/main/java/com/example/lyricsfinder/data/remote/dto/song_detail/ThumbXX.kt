package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class ThumbXX(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXXXXXXXXX?,
    @Json(name = "url")
    val url: String?
)