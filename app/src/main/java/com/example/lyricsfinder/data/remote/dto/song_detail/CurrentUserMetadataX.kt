package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class CurrentUserMetadataX(
    @Json(name = "excluded_permissions")
    val excludedPermissions: List<Any> = listOf(),
    @Json(name = "interactions")
    val interactions: InteractionsX = InteractionsX(),
    @Json(name = "permissions")
    val permissions: List<String> = listOf()
)