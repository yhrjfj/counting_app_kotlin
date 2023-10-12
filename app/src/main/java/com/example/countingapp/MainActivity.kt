package com.example.countingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing
        val text = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val reset = findViewById<Button>(R.id.reset)
        text.text = number.toString()
        // Plus 1 button
        button.setOnClickListener() {
            number.toString()
            addition()
            text.text = number.toString()
        }
        // Reset button
        reset.setOnClickListener(){
            number = 0
            text.text = number.toString()
        }

    }
    private var number = 0
    // Function for show number
    private fun addition(){
        number++
    }
}