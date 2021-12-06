package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class MediumXX(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXXXXXXX?,
    @Json(name = "url")
    val url: String?
)