package com.example.lyricsfinder.data.remote.dto.song_detail


import com.example.lyricsfinder.common.Constants
import com.example.lyricsfinder.domain.model.SongDetail
import com.squareup.moshi.Json

data class SongDetailDto(
    @Json(name = "meta")
    val meta: Meta?,
    @Json(name = "response")
    val response: Response?
)

fun SongDetailDto.toSongDetail(): SongDetail? = response?.song?.let {
    SongDetail(
        it.id ?: Constants.DEFAULT_VAL_INT,
        it.title ?: Constants.DEFAULT_VAL_STRING,
        it.artistNames ?: Constants.DEFAULT_VAL_STRING,
        it.writerArtists?.map { writer -> writer.name ?: Constants.DEFAULT_VAL_STRING }
            ?: emptyList(),
        it.producerArtists?.map { producer -> producer.name ?: Constants.DEFAULT_VAL_STRING }
            ?: emptyList(),
        it.releaseDate ?: Constants.DEFAULT_VAL_STRING,
        it.songArtImageUrl ?: Constants.DEFAULT_VAL_STRING
    )
}