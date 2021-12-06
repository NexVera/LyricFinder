package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class MediumX(
    @Json(name = "bounding_box")
    val boundingBox: BoundingBoxXXXX = BoundingBoxXXXX(),
    @Json(name = "url")
    val url: String = ""
)