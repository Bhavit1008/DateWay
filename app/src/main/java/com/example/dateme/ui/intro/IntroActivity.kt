package com.example.dateme.ui.intro

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.dateme.R
import com.example.dateme.adapter.IntroViewAdapter


class IntroActivity : AppCompatActivity() {

    private lateinit var mViewPager: ViewPager
    private lateinit var mPagerViewAdapter: IntroViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)


        mViewPager = findViewById(R.id.introviewPager)

        mPagerViewAdapter = IntroViewAdapter(supportFragmentManager)
        mViewPager.adapter = mPagerViewAdapter
        mViewPager.offscreenPageLimit = 4
        mViewPager.setPageTransformer(false, object : ViewPager.PageTransformer {
            override fun transformPage(page: View, position: Float) {
                page.setAlpha(0f)
                page.setVisibility(View.VISIBLE)

                // Start Animation for a short period of time
                page.animate()
                    .alpha(1f)
                    .setDuration(
                        500
                    )
            }
        })
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




        mViewPager.currentItem = 0


    }

    private fun changeTabs(position: Int) {


        if (position == 0) {

        }

        if (position == 1) {

        }


    }

}