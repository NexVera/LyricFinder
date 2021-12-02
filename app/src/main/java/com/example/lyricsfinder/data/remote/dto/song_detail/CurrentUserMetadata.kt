package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class CurrentUserMetadata(
    @Json(name = "excluded_permissions")
    val excludedPermissions: List<String>,
    @Json(name = "interactions")
    val interactions: Interactions,
    @Json(name = "iq_by_action")
    val iqByAction: IqByAction,
    @Json(name = "permissions")
    val permissions: List<String>,
    @Json(name = "relationships")
    val relationships: Relationships
)