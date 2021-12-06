package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Avatar(
    @Json(name = "medium")
    val medium: Medium = Medium(),
    @Json(name = "small")
    val small: Small = Small(),
    @Json(name = "thumb")
    val thumb: Thumb = Thumb(),
    @Json(name = "tiny")
    val tiny: Tiny = Tiny()
)