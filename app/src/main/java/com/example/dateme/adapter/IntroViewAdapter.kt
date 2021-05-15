package com.example.dateme.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.dateme.ui.intro.FirstScreen
import com.example.dateme.ui.intro.SecondScreen

internal class IntroViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!,
    FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstScreen()
            }
            1 -> {
                SecondScreen()
            }
            else -> FirstScreen()
        }
    }

    override fun getCount(): Int {

        return 2
    }

}