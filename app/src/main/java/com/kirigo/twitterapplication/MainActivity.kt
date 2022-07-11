package com.kirigo.twitterapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kirigo.twitterapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
        var tweet = Tweet("mercy_ndungu","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)
        var tweet1 = Tweet("mercy_kirigo","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)
        var tweet2 = Tweet("charles_ndungu","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)
        var tweet3 = Tweet("faith_ndungu","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)
        var tweet4 = Tweet("grace_ndungu","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)
        var tweet5 = Tweet("faith_wanjiru","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)
        var tweet6 = Tweet("grace_wangari","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)
        var tweet7 = Tweet("victor_ndungu","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)
        var tweet8 = Tweet("victor_huria","The Lord is my shepherd I shall now want","","","","","","23","16","4","2",)

        var  contactList=listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)
        var contactAdapter = TweetRVAdapter(contactList)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter= contactAdapter
//
    }
}
//cl
//    }
//}