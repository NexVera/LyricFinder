package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class IqByAction(
    @Json(name = "edit_metadata")
    val editMetadata: EditMetadata?
)