package com.example.dateme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.dateme.adapter.PagerViewAdapter
import com.example.dateme.ui.Chat_Fragment
import com.example.dateme.ui.Home_Fragment
import com.example.dateme.ui.Profile_Fragement
import com.example.dateme.ui.Settings_Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var homeBtn: ImageButton
    private lateinit var settingBtn:ImageButton
    private lateinit var profileBtn:ImageButton
    private lateinit var chatBtn:ImageButton

    private lateinit var mViewPager: ViewPager
    private lateinit var mPagerViewAdapter: PagerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPager = findViewById(R.id.mViewPager)
        homeBtn = findViewById(R.id.home_btn)
        profileBtn = findViewById(R.id.profile_Btn)
        chatBtn = findViewById(R.id.chat_btn)
        settingBtn = findViewById(R.id.menu_btn)

        settingBtn.setOnClickListener {
            mViewPager.currentItem = 0
        }

        homeBtn.setOnClickListener {
            mViewPager.currentItem = 1
        }

        chatBtn.setOnClickListener {
            mViewPager.currentItem = 2
        }

        profileBtn.setOnClickListener {
            mViewPager.currentItem = 3
        }



        mPagerViewAdapter = PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter = mPagerViewAdapter
        mViewPager.offscreenPageLimit = 4

        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changeTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })




        mViewPager.currentItem = 1
        homeBtn.setImageResource(R.drawable.ic_baseline_home_24_pink)


    }


    private fun changeTabs(position: Int) {


        if (position == 0) {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
            chatBtn.setImageResource(R.drawable.ic_baseline_chat_bubble_24)
            settingBtn.setImageResource(R.drawable.ic_baseline_menu_24_pink)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_24)
        }

        if (position == 1) {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24_pink)
            chatBtn.setImageResource(R.drawable.ic_baseline_chat_bubble_24)
            settingBtn.setImageResource(R.drawable.ic_baseline_menu_24)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_24)
        }

        if (position == 2) {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
            chatBtn.setImageResource(R.drawable.ic_baseline_chat_bubble_24_pink)
            settingBtn.setImageResource(R.drawable.ic_baseline_menu_24)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_24)
        }
        if (position == 3) {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
            chatBtn.setImageResource(R.drawable.ic_baseline_chat_bubble_24)
            settingBtn.setImageResource(R.drawable.ic_baseline_menu_24)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_24_pink)
        }
    }


}