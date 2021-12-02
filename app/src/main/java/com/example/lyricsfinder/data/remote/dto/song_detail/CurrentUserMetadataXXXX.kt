package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class CurrentUserMetadataXXXX(
    @Json(name = "excluded_permissions")
    val excludedPermissions: List<Any>,
    @Json(name = "interactions")
    val interactions: InteractionsXXXX,
    @Json(name = "permissions")
    val permissions: List<String>
)