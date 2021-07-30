package com.example.bookfinder

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bookfinder.databinding.ActivityMainBinding
import com.example.bookfinder.elements.Items
import com.example.bookfinder.network.RetrofitSingleton
import com.example.bookfinder.presentation.BottomSheetExplore
import com.example.bookfinder.presentation.ExploreFragment
import com.example.bookfinder.presentation.HomeFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val TAG = "Main Activity"
    private lateinit var binding: ActivityMainBinding

    private val homeFragment = HomeFragment()
    private val exploreFragment = ExploreFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(exploreFragment)
        controlBottomNav()

        val bookService = RetrofitSingleton.retrofit.getBooks("flowers", "AIzaSyA__YSz-DE9A_tlqNU68U8aS75yusXrKxs")

        bookService.enqueue(object : Callback<Items> {
            override fun onResponse(call: Call<Items>, response: Response<Items>) {
                Log.d(TAG, "onResponse: " + (response.body()?.items?.get(0)?.id))
            }

            override fun onFailure(call: Call<Items>, t: Throwable) {
                Log.d(TAG, "onFailure: something went wrong " + t.message)
            }
        })

    }

    private fun controlBottomNav() {
        binding.bottomNavigatinView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.exploreFragment -> replaceFragment(exploreFragment)
                R.id.homeFragment -> replaceFragment(homeFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }

}

