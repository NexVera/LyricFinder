package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Small(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxX?,
    @Json(name = "url")
    val url: String?
)