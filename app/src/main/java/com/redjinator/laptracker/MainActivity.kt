package com.redjinator.laptracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var begin   : Long = 0
    private var end     : Long = 0

    // onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get start button and add listener
        val startButton : Button = findViewById(R.id.start_button)
        startButton.setOnClickListener {
            startLap()
        }

        // Get end button and add listener
        val endButton : Button = findViewById(R.id.end_button)
        endButton.setOnClickListener {
            endLap()
        }
    }

    // Start Lap function
    fun startLap() {
        begin   = System.currentTimeMillis()
    }

    // End Lap function
    fun endLap() {
        end     = System.currentTimeMillis()

        val lapName:    EditText = findViewById(R.id.lap_entry)
        val lapDisplay: TextView = findViewById(R.id.lap_board)

        var minutes = ((end-begin)/1000)/60
        var seconds = ((end-begin)/1000)%60

        lapDisplay.text = "${lapDisplay.text}\n${lapName.text}\t\t\t${minutes}min ${seconds}sec"
    }

}