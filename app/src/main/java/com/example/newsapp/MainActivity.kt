package com.example.newsapp

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity(), MenuFragment.OnFragmentInteractionListener {
    // Whenever the listener is being called this function will be called
    override fun onButtonClicked(news: News) {
        val newsFragment = NewsFragment.newInstance(news)
        // Thing provided by android to load our fragment
        // This code replaces the fragment container on the layout for the new one
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, newsFragment, "newsFrag")
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Check if the phone is on Landscape mode
        if(resources.configuration.orientation
            == Configuration.ORIENTATION_LANDSCAPE
        ) {
            // Copy code from onButtonClicked
            // you can also call the method onButtonClicked(News.departmentNews[0]

            val newsFragment = NewsFragment.newInstance(News.departmentNews[0])
            // Thing provided by android to load our fragment
            // This code replaces the fragment container on the layout for the new one
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, newsFragment, "newsFrag")
                .commit()
        }
        else{
            findViewById<ViewPager>(R.id.news_viewPager).adapter =
                ViewPagerAdapter(supportFragmentManager)
        }
    }



}
