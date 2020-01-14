package com.example.updateappdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.krishna.fileloader.FileLoader
import com.krishna.fileloader.listener.FileRequestListener
import com.krishna.fileloader.pojo.FileResponse
import com.krishna.fileloader.request.FileLoadRequest
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun downloadApk(view: View) {

        var documentLink = "https://axisallocation.axisbank.co.in/apk/AxisApp_debug_crashtest4.apk"

        FileLoader.with(this)
            .load(documentLink)
            .fromDirectory("UpdateApp", FileLoader.DIR_EXTERNAL_PUBLIC)
            .asFile(object : FileRequestListener<File>{
                override fun onLoad(request: FileLoadRequest?, response: FileResponse<File>?) {
                    var file = response?.body
                    openInstaller(file)
                }

                override fun onError(request: FileLoadRequest?, t: Throwable?) {
                    Toast.makeText(
                        this@MainActivity,
                        t?.message,
                        Toast.LENGTH_LONG
                    ).show()
                }

            })

    }

    private fun openInstaller(file: File?) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(Uri.fromFile(file),
            "application/vnd.android.package-archive")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}
