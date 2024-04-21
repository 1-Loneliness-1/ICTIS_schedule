package com.example.ictisschedule

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scheduleButton = findViewById<Button>(R.id.bSchedule)
        val newsButton = findViewById<Button>(R.id.bNews)
        val studentCabinetButton = findViewById<Button>(R.id.bStudentCabinet)
        val settingsButton = findViewById<Button>(R.id.bSettings)

        scheduleButton.setOnClickListener {
            val scheduleIntent = Intent(this@MainActivity, ScheduleActivity::class.java)
            startActivity(scheduleIntent)
        }

        newsButton.setOnClickListener {
            //TODO Implement transition to the news feed screen
        }

        studentCabinetButton.setOnClickListener {
            //TODO Implement transition to the cabinet of student screen
        }

        settingsButton.setOnClickListener {
            //TODO Implement transition to the settings screen
        }

    }

}