package com.thabo.weathersmart

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        //declarations
        var clear_btn = findViewById<Button>(R.id.clear_btn)
        var exitbtn = findViewById<Button>(R.id.exitbtn)
        var ave_btn = findViewById<Button>(R.id.ave_btn)

        fun calculateAverageTemp(): Any {
            TODO("Not yet implemented")
        }

        fun main() {
            val numDays = 7
            // declare empty arrays
            val days = Array(numDays) { 0 }
            val minTemps = DoubleArray(numDays)
            val maxTemps = DoubleArray(numDays)

            //loop to get data for each day
            for (day in 0 until numDays) {
                val dayNum = day + 1
            }

            val temperatures = mutableListOf<Double>()
            ave_btn.setOnClickListener {
                val averageTemp = calculateAverageTemp()
                "Average temperature for the week: $averageTemp degrees".also {
                }
            }
            fun calculateAverageTemperature(): Double {
                if (temperatures.isEmpty()) {
                    //handle case where no temperatures are entered
                }
                val sum = temperatures.sum()
                val average = sum / temperatures.size
                return average
            }
        }


//making the button click to the next page
        val next_page = findViewById<Button>(R.id.next_page)
        next_page.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)


            //making the button exit the app
            val extibtn: Button = findViewById(R.id.exitbtn)
            extibtn.setOnClickListener {
                finish()
            }












            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }}