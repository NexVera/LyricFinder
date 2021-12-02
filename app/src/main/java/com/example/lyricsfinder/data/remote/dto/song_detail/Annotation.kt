package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Annotation(
    @Json(name = "api_path")
    val apiPath: String,
    @Json(name = "authors")
    val authors: List<Author>,
    @Json(name = "body")
    val body: Body,
    @Json(name = "comment_count")
    val commentCount: Int,
    @Json(name = "community")
    val community: Boolean,
    @Json(name = "cosigned_by")
    val cosignedBy: List<Any>,
    @Json(name = "current_user_metadata")
    val currentUserMetadata: CurrentUserMetadataXX,
    @Json(name = "custom_preview")
    val customPreview: Any?,
    @Json(name = "has_voters")
    val hasVoters: Boolean,
    @Json(name = "id")
    val id: Int,
    @Json(name = "pinned")
    val pinned: Boolean,
    @Json(name = "rejection_comment")
    val rejectionComment: Any?,
    @Json(name = "share_url")
    val shareUrl: String,
    @Json(name = "source")
    val source: Any?,
    @Json(name = "state")
    val state: String,
    @Json(name = "url")
    val url: String,
    @Json(name = "verified")
    val verified: Boolean,
    @Json(name = "verified_by")
    val verifiedBy: Any?,
    @Json(name = "votes_total")
    val votesTotal: Int
)