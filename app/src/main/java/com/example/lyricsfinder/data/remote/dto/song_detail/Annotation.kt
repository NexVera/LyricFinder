package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Annotation(
    @Json(name = "api_path")
    val apiPath: String = "",
    @Json(name = "authors")
    val authors: List<Author> = listOf(),
    @Json(name = "body")
    val body: Body = Body(),
    @Json(name = "comment_count")
    val commentCount: Int = 0,
    @Json(name = "community")
    val community: Boolean = false,
    @Json(name = "cosigned_by")
    val cosignedBy: List<Any> = listOf(),
    @Json(name = "current_user_metadata")
    val currentUserMetadata: CurrentUserMetadataXX = CurrentUserMetadataXX(),
    @Json(name = "custom_preview")
    val customPreview: Any = Any(),
    @Json(name = "has_voters")
    val hasVoters: Boolean = false,
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "pinned")
    val pinned: Boolean = false,
    @Json(name = "rejection_comment")
    val rejectionComment: Any = Any(),
    @Json(name = "share_url")
    val shareUrl: String = "",
    @Json(name = "source")
    val source: Any = Any(),
    @Json(name = "state")
    val state: String = "",
    @Json(name = "url")
    val url: String = "",
    @Json(name = "verified")
    val verified: Boolean = false,
    @Json(name = "verified_by")
    val verifiedBy: Any = Any(),
    @Json(name = "votes_total")
    val votesTotal: Int = 0
)