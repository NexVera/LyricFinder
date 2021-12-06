package com.example.lyricsfinder.data.remote.dto.song_list


import com.squareup.moshi.Json

data class Hit(
    @Json(name = "highlights")
    val highlights: List<Any> = listOf(),
    @Json(name = "index")
    val index: String = "",
    @Json(name = "result")
    val result: Result = Result(),
    @Json(name = "type")
    val type: String = ""
)