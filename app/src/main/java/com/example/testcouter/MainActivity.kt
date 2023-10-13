package com.example.testcouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing
        var reset : Button = findViewById(R.id.reset)
        var minus : Button = findViewById(R.id.minus)
        var plus : Button = findViewById(R.id.plus)
        var countView : TextView = findViewById(R.id.numberView)

        plus.setOnClickListener(){
            counterPlus()
            countView.text = count.toString()
        }

        minus.setOnClickListener(){
            counterMinus()
            countView.text = count.toString()
        }

        reset.setOnClickListener(){
            resetView()
            countView.text = count.toString()
        }
    }
    private var count = 0
    fun counterPlus(){
        count ++
    }
    fun counterMinus(){
        count --
    }
    fun resetView(){
        count = 0
    }
}


