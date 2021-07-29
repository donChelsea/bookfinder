package com.example.bookfinder.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bookfinder.databinding.BottomSheetExploreBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetExplore: BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetExploreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetExploreBinding.inflate(inflater, container, false)
        return binding.root
    }
}