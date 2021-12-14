package com.example.lyricsfinder.presentation.song_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lyricsfinder.common.Constants
import com.example.lyricsfinder.common.Response
import com.example.lyricsfinder.common.State
import com.example.lyricsfinder.domain.model.Song
import com.example.lyricsfinder.domain.use_case.GetSongListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class SongListViewModel @Inject constructor(
    private val getSongListUseCase: GetSongListUseCase
) : ViewModel() {
    private val _state: MutableStateFlow<State<List<Song>>> = MutableStateFlow(State())
    val state = _state.asStateFlow()

    init {
        // Get randomized song list
        ('a'..'z').random().toString().apply {
            getSongList(this)
        }
    }

    private fun getSongList(keyword: String) {
        getSongListUseCase(keyword).onEach {
            when (it) {
                is Response.Loading -> _state.value = State(isLoading = true)
                is Response.Success -> _state.value = State(data = it.data)
                is Response.Error -> _state.value =
                    State(error = it.message ?: Constants.MSG_UNEXPECTED_ERROR)
            }
        }.launchIn(viewModelScope)
    }

    fun searchSongList(keyword: String): Boolean {
        getSongList(keyword)
        // True as the query will be handle by the listener
        return true
    }
}