package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class IqByActionX(
    @Json(name = "accept")
    val accept: Accept = Accept(),
    @Json(name = "delete")
    val delete: Delete = Delete(),
    @Json(name = "reject")
    val reject: Reject = Reject()
)