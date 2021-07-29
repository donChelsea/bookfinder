package com.example.bookfinder.elements

import com.google.gson.annotations.SerializedName

data class Book(
        val id: String,
        val volumeInfo: VolumeInfo,
        val saleInfo: SaleInfo,
        val accessInfo: AccessInfo,
        val searchInfo: SearchInfo
) {}

data class VolumeInfo (
        val title: String,
        val authors: List<String>,
        val publisher: String,
        val publishedDate: String,
        val description: String,
        val pageCount: Int,
        val categories: List<String>,
        val maturityRating: String,
        val imageLinks: ImageLinks,
) {}


data class ImageLinks(
        val thumbnail: String
) {}

data class SaleInfo(
        val retailPrice: RetailPrice,
        val buyLink: String,
) {}

data class RetailPrice(
        val amount: Double,
        val currencyCode: String
) {}

data class SearchInfo(
        val textSnippet: String
) {}

data class AccessInfo(
        val webReaderLink: String,
) {}

data class Items(
        @SerializedName("items")
        val items: List<Book>,
) {}




