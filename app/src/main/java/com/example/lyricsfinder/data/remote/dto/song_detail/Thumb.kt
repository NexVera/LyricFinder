package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Thumb(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXX?,
    @Json(name = "url")
    val url: String?
)