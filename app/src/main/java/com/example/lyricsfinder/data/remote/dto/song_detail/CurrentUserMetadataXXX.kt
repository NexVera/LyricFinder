package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class CurrentUserMetadataXXX(
    @Json(name = "excluded_permissions")
    val excludedPermissions: List<Any> = listOf(),
    @Json(name = "interactions")
    val interactions: InteractionsXXX = InteractionsXXX(),
    @Json(name = "permissions")
    val permissions: List<String> = listOf()
)