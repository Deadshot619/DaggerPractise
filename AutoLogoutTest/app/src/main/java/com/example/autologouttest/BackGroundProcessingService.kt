package com.example.autologouttest

import android.app.Service
import android.content.Intent
import android.os.CountDownTimer
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import java.util.*

class BackGroundProcessingService : Service(){
    companion object{
        lateinit var timer: CountDownTimer
    }

    override fun onCreate() {
        super.onCreate()
        timer = object: CountDownTimer(5000, 1000){
            override fun onFinish() {
                val intent = Intent(applicationContext, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(intent)

//                timer.cancel()
                stopSelf()
            }

            override fun onTick(millisUntilFinished: Long) {
//                Toast.makeText(
//                    applicationContext,
//                    "${millisUntilFinished / 1000}",
//                    Toast.LENGTH_SHORT
//                ).show()
                Log.i("TickTock", "${millisUntilFinished / 1000}")
            }
        }
    }

    override fun onBind(intent: Intent?): IBinder? {


//        timer.start()
        return null
    }

}