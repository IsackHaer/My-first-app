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


        binding.rollButton.setOnClickListener {
            val diceRoll = listOf<Int>(1,2,3,4,5,6).random()
            binding.textView.isVisible = false
            when(diceRoll) {
                1 -> binding.diceIv.setImageResource(R.drawable.dice_1)
                2 -> binding.diceIv.setImageResource(R.drawable.dice_2)
                3 -> binding.diceIv.setImageResource(R.drawable.dice_3)
                4 -> binding.diceIv.setImageResource(R.drawable.dice_4)
                5 -> binding.diceIv.setImageResource(R.drawable.dice_5)
                6 -> {
                    binding.diceIv.setImageResource(R.drawable.dice_6)
                    binding.textView.text = getString(R.string.YouNailedIt)
                    binding.textView.isVisible = true
                }
            }
        }
    }
}