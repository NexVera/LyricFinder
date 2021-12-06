package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Avatar(
    @Json(name = "medium")
    val medium: Medium?,
    @Json(name = "small")
    val small: Small?,
    @Json(name = "thumb")
    val thumb: Thumb?,
    @Json(name = "tiny")
    val tiny: Tiny?
)