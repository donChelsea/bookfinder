package com.example.bookfinder.network

import com.example.bookfinder.elements.Items
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


interface BookService {

    @GET("books/v1/volumes")
    fun getBooks(@Query("q") search: String,
                 @Query("key") key: String
    ): Call<Items>
}

object RetrofitSingleton {

    val retrofit = Retrofit.Builder()
            .baseUrl("https://www.googleapis.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BookService::class.java)
}