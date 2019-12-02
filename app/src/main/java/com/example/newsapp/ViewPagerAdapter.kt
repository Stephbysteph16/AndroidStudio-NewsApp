package com.example.newsapp

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return NewsFragment.newInstance(News.departmentNews[position])
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "Computer Science"
            1-> "Math"
            2-> "Chemistry"
            else-> "NULL"
        }
    }

}