package com.example.lyricsfinder.presentation.song_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.lyricsfinder.common.BindableListAdapter
import com.example.lyricsfinder.databinding.ItemSongListBinding
import com.example.lyricsfinder.domain.model.Song
import javax.inject.Inject

class SongListAdapter @Inject constructor() :
    BindableListAdapter<Song, SongListAdapter.SongViewHolder>(DiffCallBack) {

    class SongViewHolder(
        private val binding: ItemSongListBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(song: Song, fragment: Fragment) {
            binding.apply {
                this.songListFragment = fragment as SongListFragment
                this.song = song
            }
        }
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Song>() {
        override fun areItemsTheSame(oldItem: Song, newItem: Song): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Song, newItem: Song): Boolean =
            oldItem.hashCode() == newItem.hashCode()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder =
        SongViewHolder(
            ItemSongListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.bind(getItem(position), fragment)
    }
}