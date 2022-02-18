package com.example.lyricsfinder.presentation.song_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.lyricsfinder.R
import com.example.lyricsfinder.common.Constants
import com.example.lyricsfinder.databinding.FragmentSongListBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

@AndroidEntryPoint
class SongListFragment : Fragment() {
    private val viewModel: SongListViewModel by viewModels()
    private lateinit var binding: FragmentSongListBinding

    @Inject
    lateinit var adapter: SongListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lifecycleScope.launchWhenStarted {
            viewModel.state.collectLatest {
                // Bind the response
                binding.songListFragment = this@SongListFragment
                binding.viewModel = viewModel

                // Handle error
                if (it.error.isNotBlank())
                    Snackbar.make(view, it.error, Snackbar.LENGTH_LONG).show()
            }
        }
    }

    // Listener Method
    fun onNavigate(id: String) {
        bundleOf(Constants.PARAM_SONG_ID to id).apply {
            findNavController().navigate(R.id.action_songListFragment_to_songDetailFragment, this)
        }
    }
}