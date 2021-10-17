package com.example.lifecycle

import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.tv)
        tv.text="${tv.text}\nonline"
    }

    override fun onPause() {
        super.onPause()
        val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        val currentDate = sdf.format(Date())
        tv.text = "${tv.text}\nLast seen $currentDate"

    }

    override fun onResume() {
        super.onResume()
        tv.text="${tv.text}\nonline"
    }
}