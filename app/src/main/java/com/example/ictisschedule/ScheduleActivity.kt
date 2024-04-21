package com.example.ictisschedule

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        val backToPreviousScreenButton = findViewById<ImageView>(R.id.ivBackArrow)

        backToPreviousScreenButton.setOnClickListener { finish() }

    }
}