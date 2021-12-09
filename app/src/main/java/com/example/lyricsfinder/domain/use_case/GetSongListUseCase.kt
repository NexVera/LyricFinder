package com.example.lyricsfinder.domain.use_case

import com.example.lyricsfinder.common.Constants
import com.example.lyricsfinder.common.Response
import com.example.lyricsfinder.data.remote.dto.song_list.toSongList
import com.example.lyricsfinder.domain.model.Song
import com.example.lyricsfinder.domain.repository.SongRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class GetSongListUseCase @Inject constructor(
    private val repository: SongRepository
) {
    operator fun invoke(keyword: String): Flow<Response<List<Song>>> = flow {
        try {
            emit(Response.Loading())
            repository.getSongList(keyword).toSongList().apply { emit(Response.Success(this)) }
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: Constants.MSG_UNEXPECTED_ERROR))
        }
    }
}