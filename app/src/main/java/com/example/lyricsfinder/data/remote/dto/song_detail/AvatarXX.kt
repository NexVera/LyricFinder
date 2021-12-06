package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class AvatarXX(
    @Json(name = "medium")
    val medium: MediumXX = MediumXX(),
    @Json(name = "small")
    val small: SmallXX = SmallXX(),
    @Json(name = "thumb")
    val thumb: ThumbXX = ThumbXX(),
    @Json(name = "tiny")
    val tiny: TinyXX = TinyXX()
)