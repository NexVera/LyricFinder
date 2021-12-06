package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Interactions(
    @Json(name = "following")
    val following: Boolean?,
    @Json(name = "pyong")
    val pyong: Boolean?
)