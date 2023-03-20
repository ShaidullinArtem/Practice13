package com.example.practice13

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val timer = object :CountDownTimer(3000, 1000) {
            override fun onTick(millisUnitFinish: Long) {}

            override fun onFinish() {
                val intent = Intent(this@SplashScreen, OnboardingScreen::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}