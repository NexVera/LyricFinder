package com.example.lyricsfinder.presentation.song_detail

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.lyricsfinder.databinding.FragmentSongDetailBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class SongDetailFragment : Fragment() {
    private val viewModel: SongDetailViewModel by viewModels()
    private lateinit var binding: FragmentSongDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lifecycleScope.launchWhenStarted {
            viewModel.state.collectLatest {
                // Set the loading animation
                binding.isLoading = it.isLoading

                // Handle success/error api response
                if (it.error.isNotBlank())
                    Snackbar.make(view, it.error, Snackbar.LENGTH_LONG).show()
                else {
                    binding.song = it.data
                    binding.songDetailFragment = this@SongDetailFragment
                }
            }
        }
    }

    // Listener Method
    fun navigateToLyricUrl() {
        binding.song?.let {
            Intent(
                Intent.ACTION_VIEW,
                it.lyricUrl.toUri().buildUpon().scheme("https").build()
            ).apply { startActivity(this) }
        }
    }
}