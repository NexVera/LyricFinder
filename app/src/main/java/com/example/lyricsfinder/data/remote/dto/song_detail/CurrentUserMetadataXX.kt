package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class CurrentUserMetadataXX(
    @Json(name = "excluded_permissions")
    val excludedPermissions: List<String>?,
    @Json(name = "interactions")
    val interactions: InteractionsXX?,
    @Json(name = "iq_by_action")
    val iqByAction: IqByActionX?,
    @Json(name = "permissions")
    val permissions: List<String>?
)