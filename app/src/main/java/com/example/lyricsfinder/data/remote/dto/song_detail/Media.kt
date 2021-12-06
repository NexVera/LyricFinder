package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Media(
    @Json(name = "attribution")
    val attribution: String = "",
    @Json(name = "native_uri")
    val nativeUri: String = "",
    @Json(name = "provider")
    val provider: String = "",
    @Json(name = "start")
    val start: Int = 0,
    @Json(name = "type")
    val type: String = "",
    @Json(name = "url")
    val url: String = ""
)