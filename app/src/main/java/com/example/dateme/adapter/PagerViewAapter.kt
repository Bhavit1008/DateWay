package com.example.dateme.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.dateme.ui.Chat_Fragment
import com.example.dateme.ui.Home_Fragment
import com.example.dateme.ui.Profile_Fragement
import com.example.dateme.ui.Settings_Fragment

internal class PagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Settings_Fragment()
            }
            1 -> {
                Home_Fragment()
            }
            2 -> {
                Chat_Fragment()
            }
            3 -> {
                Profile_Fragement()
            }
            else -> Home_Fragment()
        }
    }

    override fun getCount(): Int {

        return 4
    }

}