package com.example.lyricsfinder.data.repository

import com.example.lyricsfinder.data.remote.GeniusSongApi
import com.example.lyricsfinder.data.remote.dto.song_detail.SongDetailDto
import com.example.lyricsfinder.data.remote.dto.song_list.SongListDto
import com.example.lyricsfinder.domain.repository.SongRepository
import javax.inject.Inject

class SongRepositoryImpl @Inject constructor(
    private val api: GeniusSongApi
) : SongRepository {
    override suspend fun getSongList(keyword: String): SongListDto = api.getSongsByKeyword(keyword)

    override suspend fun getSongDetail(id: String): SongDetailDto = api.getSongById(id)
}