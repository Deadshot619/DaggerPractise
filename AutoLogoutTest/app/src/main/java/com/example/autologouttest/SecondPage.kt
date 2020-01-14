package com.example.autologouttest

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

import kotlinx.android.synthetic.main.activity_second_page.*

class SecondPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }


    override fun onResume() {
        super.onResume()
        BackGroundProcessingService.timer.cancel()
        BackGroundProcessingService.timer.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        BackGroundProcessingService.timer.cancel()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        BackGroundProcessingService.timer.cancel()
        BackGroundProcessingService.timer.start()
    }

}
