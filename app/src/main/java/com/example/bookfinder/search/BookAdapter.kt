package com.example.bookfinder.search

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.bookfinder.databinding.ItemSearchResultBinding
import com.example.bookfinder.elements.Book

class BookAdapter {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemSearchResultBinding.bind(view)

        fun onBind(book: Book) {

        }
    }
}