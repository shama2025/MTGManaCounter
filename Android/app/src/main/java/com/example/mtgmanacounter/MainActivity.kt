package com.example.mtgmanacounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : ComponentActivity() {

    private lateinit var whiteManaRumSum: TextView
    private lateinit var blueManaRunSum: TextView
    private lateinit var blackManaRunSum: TextView
    private lateinit var redManaRunSum: TextView
    private lateinit var greenManaRunSum: TextView
    private lateinit var colorlessManaRunSum: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        whiteManaRumSum = findViewById(R.id.whitemanarunsum)
        blueManaRunSum = findViewById(R.id.bluemana_sum)
        blackManaRunSum = findViewById(R.id.blackmana_sum)
        redManaRunSum = findViewById(R.id.redmana_sum)
        greenManaRunSum = findViewById(R.id.greenmana_sum)
        colorlessManaRunSum = findViewById(R.id.colorlessmana_sum)

// White Mana Counter
        findViewById<Button>(R.id.minus_10_white_mana_button).setOnClickListener() {
            checkManaCount(whiteManaRumSum, -10)
        }
        findViewById<Button>(R.id.minus_5_white_mana_button).setOnClickListener() {
            checkManaCount(whiteManaRumSum, -5)
        }
        findViewById<Button>(R.id.minus_1_white_mana_button).setOnClickListener() {
            checkManaCount(whiteManaRumSum, -1)
        }
        findViewById<Button>(R.id.plus_1_white_mana_button).setOnClickListener() {
            checkManaCount(whiteManaRumSum, 1)
        }
        findViewById<Button>(R.id.plus_5_white_mana_button).setOnClickListener() {
            checkManaCount(whiteManaRumSum, 5)
        }
        findViewById<Button>(R.id.plus_10_white_mana_button).setOnClickListener() {
            checkManaCount(whiteManaRumSum, 10)
        }

// Blue Mana Counter
        findViewById<Button>(R.id.minus_10_blue_button).setOnClickListener() {
            checkManaCount(blueManaRunSum, -10)
        }
        findViewById<Button>(R.id.minus_5_blue_button).setOnClickListener() {
            checkManaCount(blueManaRunSum, -5)
        }
        findViewById<Button>(R.id.minus_1_blue_button).setOnClickListener() {
            checkManaCount(blueManaRunSum, -1)
        }
        findViewById<Button>(R.id.plus_1_blue_button).setOnClickListener() {
            checkManaCount(blueManaRunSum, 1)
        }
        findViewById<Button>(R.id.plus_5_blue_button).setOnClickListener() {
            checkManaCount(blueManaRunSum, 5)
        }
        findViewById<Button>(R.id.plus_10_blue_button).setOnClickListener() {
            checkManaCount(blueManaRunSum, 10)
        }

// Black Mana Counter
        findViewById<Button>(R.id.minus_10_black_button).setOnClickListener() {
            checkManaCount(blackManaRunSum, -10)
        }
        findViewById<Button>(R.id.minus_5_black_button).setOnClickListener() {
            checkManaCount(blackManaRunSum, -5)
        }
        findViewById<Button>(R.id.minus_1_black_button).setOnClickListener() {
            checkManaCount(blackManaRunSum, -1)
        }
        findViewById<Button>(R.id.plus_1_black_button).setOnClickListener() {
            checkManaCount(blackManaRunSum, 1)
        }
        findViewById<Button>(R.id.plus_5_black_button).setOnClickListener() {
            checkManaCount(blackManaRunSum, 5)
        }
        findViewById<Button>(R.id.plus_10_black_button).setOnClickListener() {
            checkManaCount(blackManaRunSum, 10)
        }

// Red Mana Counter
        findViewById<Button>(R.id.minus_10_red_button).setOnClickListener() {
            checkManaCount(redManaRunSum, -10)
        }
        findViewById<Button>(R.id.minus_5_red_button).setOnClickListener() {
            checkManaCount(redManaRunSum, -5)
        }
        findViewById<Button>(R.id.minus_1_red_button).setOnClickListener() {
            checkManaCount(redManaRunSum, -1)
        }
        findViewById<Button>(R.id.plus_1_red_button).setOnClickListener() {
            checkManaCount(redManaRunSum, 1)
        }
        findViewById<Button>(R.id.plus_5_red_button).setOnClickListener() {
            checkManaCount(redManaRunSum, 5)
        }
        findViewById<Button>(R.id.plus_10_red_button).setOnClickListener() {
            checkManaCount(redManaRunSum, 10)
        }

// Green Mana Counter
        findViewById<Button>(R.id.minus_10_green_button).setOnClickListener() {
            checkManaCount(greenManaRunSum, -10)
        }
        findViewById<Button>(R.id.minus_5_green_button).setOnClickListener() {
            checkManaCount(greenManaRunSum, -5)
        }
        findViewById<Button>(R.id.minus_1_green_button).setOnClickListener() {
            checkManaCount(greenManaRunSum, -1)
        }
        findViewById<Button>(R.id.plus_1_green_button).setOnClickListener() {
            checkManaCount(greenManaRunSum, 1)
        }
        findViewById<Button>(R.id.plus_5_green_button).setOnClickListener() {
            checkManaCount(greenManaRunSum, 5)
        }
        findViewById<Button>(R.id.plus_10_green_button).setOnClickListener() {
            checkManaCount(greenManaRunSum, 10)
        }

// Colorless Mana Counter
        findViewById<Button>(R.id.minus_10_colorless_button).setOnClickListener() {
            checkManaCount(colorlessManaRunSum, -10)
        }
        findViewById<Button>(R.id.minus_5_colorless_button).setOnClickListener() {
            checkManaCount(colorlessManaRunSum, -5)
        }
        findViewById<Button>(R.id.minus_1_colorless_button).setOnClickListener() {
            checkManaCount(colorlessManaRunSum, -1)
        }
        findViewById<Button>(R.id.plus_1_colorless_button).setOnClickListener() {
            checkManaCount(colorlessManaRunSum, 1)
        }
        findViewById<Button>(R.id.plus_5_colorless_button).setOnClickListener() {
            checkManaCount(colorlessManaRunSum, 5)
        }
        findViewById<Button>(R.id.plus_10_colorless_button).setOnClickListener() {
            checkManaCount(colorlessManaRunSum, 10)
        }

// Utility Buttons

        // Double all mana
        findViewById<Button>(R.id.doubleManaButton).setOnClickListener()
        {
            whiteManaRumSum.text = ((whiteManaRumSum.text.toString().toIntOrNull() ?: 0) * 2).toString()
            blueManaRunSum.text = ((blueManaRunSum.text.toString().toIntOrNull() ?: 0) * 2).toString()
            blackManaRunSum.text = ((blackManaRunSum.text.toString().toIntOrNull() ?: 0) * 2).toString()
            redManaRunSum.text = ((redManaRunSum.text.toString().toIntOrNull() ?: 0) * 2).toString()
            greenManaRunSum.text = ((greenManaRunSum.text.toString().toIntOrNull() ?: 0) * 2).toString()
            colorlessManaRunSum.text = ((colorlessManaRunSum.text.toString().toIntOrNull() ?: 0) * 2).toString()
        }

        // Zero out all mana
        findViewById<Button>(R.id.zeroManaButton).setOnClickListener()
        {
            whiteManaRumSum.text = "0"
            redManaRunSum.text = "0"
            blueManaRunSum.text = "0"
            blackManaRunSum.text = "0"
            redManaRunSum.text = "0"
            greenManaRunSum.text = "0"
            colorlessManaRunSum.text = "0"
        }

        // Hide System bar on load
        hideSystemBar(this)
    }

// Utility Functions

    // Check for any decrement is number goes below 0
    fun checkManaCount(mana: TextView, counter: Int) {
        val num = mana.text.toString().toIntOrNull() ?: 0
        val result = num + counter

        if (result >= 0) {
            mana.text = "$result"
        }
    }

    // Hides the system bar
    private fun hideSystemBar(activity: MainActivity){
        val window = activity.window
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val controller = WindowInsetsControllerCompat(window, window.decorView)
        controller.hide(WindowInsetsCompat.Type.systemBars())
        controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }
}

