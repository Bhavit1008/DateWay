package com.example.dateme.ui.auth

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.dateme.MainActivity
import com.example.dateme.R

class splash_screen_class : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val handler = Handler()
        handler.postDelayed(Runnable {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },500)
    }
}