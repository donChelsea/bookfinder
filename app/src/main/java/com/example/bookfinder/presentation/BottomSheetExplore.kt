package com.example.bookfinder.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import com.example.bookfinder.databinding.BottomSheetExploreBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetExplore: BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetExploreBinding

    val TAG = "BottomSheetExplore"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetExploreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String): Boolean {
//                return false
//            }
//            override fun onQueryTextChange(newText: String): Boolean {
//                return false
//            }
//        })

    }
}