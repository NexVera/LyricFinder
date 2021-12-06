package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class AvatarX(
    @Json(name = "medium")
    val medium: MediumX = MediumX(),
    @Json(name = "small")
    val small: SmallX = SmallX(),
    @Json(name = "thumb")
    val thumb: ThumbX = ThumbX(),
    @Json(name = "tiny")
    val tiny: TinyX = TinyX()
)