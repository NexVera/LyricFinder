package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class UserX(
    @Json(name = "api_path")
    val apiPath: String?,
    @Json(name = "avatar")
    val avatar: AvatarX?,
    @Json(name = "current_user_metadata")
    val currentUserMetadata: CurrentUserMetadataXXX?,
    @Json(name = "header_image_url")
    val headerImageUrl: String?,
    @Json(name = "human_readable_role_for_display")
    val humanReadableRoleForDisplay: String?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "iq")
    val iq: Int?,
    @Json(name = "login")
    val login: String?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "role_for_display")
    val roleForDisplay: String?,
    @Json(name = "url")
    val url: String?
)