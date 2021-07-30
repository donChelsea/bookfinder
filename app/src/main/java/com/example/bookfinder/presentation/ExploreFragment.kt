package com.example.bookfinder.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bookfinder.R
import com.example.bookfinder.databinding.FragmentExploreBinding
import com.example.bookfinder.databinding.FragmentHomeBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class ExploreFragment : Fragment() {
    private lateinit var binding: FragmentExploreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExploreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        BottomSheetExplore().apply {
            activity?.supportFragmentManager.let {
                if (it != null) {
                    show(it, "BottomSheetExplore")
                }
            }
        }

        BottomSheetBehavior.from(binding.bottomSheetLayout).apply {
            peekHeight = 200
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }


}