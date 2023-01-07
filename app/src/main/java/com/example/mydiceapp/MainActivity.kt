package com.example.mydiceapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.example.mydiceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var lastRoll = 0        //Remembers which roll was last
        var rowCounter = 1      //Counts how many same rolls you have in a row

        binding.rollButton.setOnClickListener {
            val diceRoll = listOf<Int>(1,2,3,4,5,6).random()
            binding.textView.isVisible = false

            when(diceRoll) {
                1 -> {
                    binding.diceIv.setImageResource(R.drawable.dice_1)
                    if (lastRoll == 1) {
                        rowCounter++
                    } else {
                        rowCounter = 1
                    }
                    lastRoll = 1
                    if (rowCounter >= 2){
                        binding.textView.isVisible = true
                        binding.textView.text = getString(R.string.TimesInARow, rowCounter.toString())
                    }
                }
                2 -> {
                    binding.diceIv.setImageResource(R.drawable.dice_2)
                    if (lastRoll == 2) {
                        rowCounter++
                    } else {
                        rowCounter = 1
                    }
                    lastRoll = 2
                    if (rowCounter >= 2){
                        binding.textView.isVisible = true
                        binding.textView.text = getString(R.string.TimesInARow, rowCounter.toString())
                    }
                }
                3 -> {
                    binding.diceIv.setImageResource(R.drawable.dice_3)
                    if (lastRoll == 3) {
                        rowCounter++
                    } else {
                        rowCounter = 1
                    }
                    lastRoll = 3
                    if (rowCounter >= 2){
                        binding.textView.isVisible = true
                        binding.textView.text = getString(R.string.TimesInARow, rowCounter.toString())
                    }
                }
                4 -> {
                    binding.diceIv.setImageResource(R.drawable.dice_4)
                    if (lastRoll == 4) {
                        rowCounter++
                    } else {
                        rowCounter = 1
                    }
                    lastRoll = 4
                    if (rowCounter >= 2){
                        binding.textView.isVisible = true
                        binding.textView.text = getString(R.string.TimesInARow, rowCounter.toString())
                    }
                }
                5 -> {
                    binding.diceIv.setImageResource(R.drawable.dice_5)
                    if (lastRoll == 5) {
                        rowCounter++
                    } else {
                        rowCounter = 1
                    }
                    lastRoll = 5
                    if (rowCounter >= 2){
                        binding.textView.isVisible = true
                        binding.textView.text = getString(R.string.TimesInARow, rowCounter.toString())
                    }
                }
                6 -> {
                    binding.diceIv.setImageResource(R.drawable.dice_6)
                    binding.textView.text = getString(R.string.YouNailedIt)
                    binding.textView.isVisible = true
                    if (lastRoll == 6) {
                        rowCounter++
                    } else {
                        rowCounter = 1
                    }
                    lastRoll = 6
                    if (rowCounter >= 2){
                        binding.textView.text = getString(R.string.TimesInARow, rowCounter.toString())
                    }
                }
            }
        }
    }
}