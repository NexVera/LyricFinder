package com.example.lyricsfinder.data.remote

import com.example.lyricsfinder.common.Constants
import com.example.lyricsfinder.data.remote.dto.song_detail.SongDetailDto
import com.example.lyricsfinder.data.remote.dto.song_list.SongListDto
import retrofit2.http.*

interface GeniusSongApi {
    @Headers(
        "x-rapidapi-host: ${Constants.X_RAPID_API_HOST}",
        "x-rapidapi-key: ${Constants.X_RAPID_API_KEY}"
    )
    @GET("search")
    suspend fun getSongsByKeyword(
        @Query("q") keyword: String
    ): SongListDto

    @Headers(
        "x-rapidapi-host: ${Constants.X_RAPID_API_HOST}",
        "x-rapidapi-key: ${Constants.X_RAPID_API_KEY}"
    )
    @GET("songs/{id}")
    suspend fun getSongById(
        @Path("id") id: String
    ): SongDetailDto
}