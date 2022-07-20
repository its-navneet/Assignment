package com.example.android.assignment

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.net.URLEncoder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun checkServices(view: View) {
        val i = Intent(Intent.ACTION_VIEW)
        try {
            val url = "https://wa.me/message/U3AQWIPMBB6QO1"
            i.setPackage("com.whatsapp")
            i.data = Uri.parse(url)
            startActivity(i)

        } catch (e: Exception) {
            Toast.makeText(this, "Whatsapp not installed",Toast.LENGTH_SHORT).show()
            e.printStackTrace()
        }
    }
}