package com.example.mtgmanacounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.mtgmanacounter.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main);

        // White Mana Counter
        binding.minus10WhiteManaButton.setOnClickListener{  }

        binding.minus5WhiteManaButton.setOnClickListener {  }

        binding.minus1WhiteManaButton.setOnClickListener {  }

        binding.plus1WhiteManaButton.setOnClickListener {  }

        binding.plus5WhiteManaButton.setOnClickListener {  }

        binding.plus10WhiteManaButton.setOnClickListener {  }

        // Blue Mana counter
        binding.minus10BlueButton.setOnClickListener { }

        binding.minus5BlueButton.setOnClickListener { }

        binding.minus1BlueButton.setOnClickListener { }

        binding.plus1BlueButton.setOnClickListener { }

        binding.plus5BlueButton.setOnClickListener { }

        binding.plus10BlueButton.setOnClickListener { }

        // Black Mana Counter
        binding.minus10BlackButton.setOnClickListener { }

        binding.minus5BlackButton.setOnClickListener { }

        binding.minus1BlackButton.setOnClickListener { }

        binding.plus1BlackButton.setOnClickListener { }

        binding.plus5BlackButton.setOnClickListener { }

        binding.plus10BlackButton.setOnClickListener { }

        // Red Mana Counter
        binding.minus10RedButton.setOnClickListener { }

        binding.minus5RedButton.setOnClickListener { }

        binding.minus1RedButton.setOnClickListener { }

        binding.plus1RedButton.setOnClickListener { }

        binding.plus5RedButton.setOnClickListener { }

        binding.plus10RedButton.setOnClickListener { }

        // Green Mana Counter
        binding.minus10GreenButton.setOnClickListener { }

        binding.minus5GreenButton.setOnClickListener { }

        binding.minus1GreenButton.setOnClickListener { }

        binding.plus1GreenButton.setOnClickListener { }

        binding.plus5GreenButton.setOnClickListener { }

        binding.plus10GreenButton.setOnClickListener { }


        // Colorless Mana Counter
        binding.minus10ColorlessButton.setOnClickListener { }

        binding.minus5ColorlessButton.setOnClickListener { }

        binding.minus1ColorlessButton.setOnClickListener { }

        binding.plus1ColorlessButton.setOnClickListener { }

        binding.plus5ColorlessButton.setOnClickListener { }

        binding.plus10ColorlessButton.setOnClickListener { }

        // Utility Buttons

            // Double all mana
        binding.doubleManaButton.setOnClickListener {
            binding.whitemanarunsum.setText((binding.whitemanarunsum.text.toString().toIntOrNull() ?: 0) * 2)
            binding.bluemanaSum.setText((binding.bluemanaSum.text.toString().toIntOrNull() ?: 0) * 2)
            binding.blackmanaSum.setText((binding.blackmanaSum.text.toString().toIntOrNull() ?: 0) * 2)
            binding.redmanaSum.setText((binding.redmanaSum.text.toString().toIntOrNull() ?: 0) * 2)
            binding.greenmanaSum.setText((binding.greenmanaSum.text.toString().toIntOrNull() ?: 0) * 2)
            binding.colorlessmanaSum.setText((binding.colorlessmanaSum.text.toString().toIntOrNull() ?: 0) * 2)
        }

            // Zero out all mana
        binding.zeroManaButton.setOnClickListener() {
            binding.whitemanarunsum.text = "0"
            binding.bluemanaSum.text = "0"
            binding.blackmanaSum.text= "0"
            binding.redmanaSum.text = "0"
            binding.greenmanaSum.text = "0"
            binding.colorlessmanaSum.text = "0"
        }

    }


}

