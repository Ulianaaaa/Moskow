package com.example.moskow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.moskow.login.viewModel.LoginActivity

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }

    fun onClick(view: View) {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }

    fun clickedToLogin(view: View) {
        val intent2 = Intent(this, LoginActivity::class.java)
        startActivity(intent2)
    }
}