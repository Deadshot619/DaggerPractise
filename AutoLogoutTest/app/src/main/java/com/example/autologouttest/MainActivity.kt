package com.example.autologouttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextPage(view: View){
        val service = Intent(this, BackGroundProcessingService::class.java)
        startService(service)

        val intent = Intent(this, SecondPage::class.java)
        startActivity(intent)
    }
}
