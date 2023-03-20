package com.example.practice13

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnboardingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen)
    }

    fun login(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}