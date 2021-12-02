package com.example.lyricsfinder.data.remote.dto.song_detail


import com.example.lyricsfinder.domain.model.SongDetail
import com.squareup.moshi.Json

data class SongDetailDto(
    @Json(name = "meta")
    val meta: Meta,
    @Json(name = "response")
    val response: Response
)

fun SongDetailDto.toSongDetail(): SongDetail = response.song.let {
    SongDetail(
        it.id,
        it.title,
        it.artistNames,
        it.writerArtists.map { writer -> writer.name },
        it.producerArtists.map { producer -> producer.name },
        it.releaseDate,
        it.songArtImageUrl
    )
}