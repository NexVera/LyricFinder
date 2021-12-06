package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Medium(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBox?,
    @Json(name = "url")
    val url: String?
)