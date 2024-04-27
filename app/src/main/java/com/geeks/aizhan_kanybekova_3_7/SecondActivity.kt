package com.geeks.aizhan_kanybekova_3_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geeks.aizhan_kanybekova_3_7.databinding.ActivitySecondBinding

private lateinit var binding : ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val filmName = intent.getStringExtra("filmName")

        val binding = binding.tvData
        binding.text= filmName.toString()
    }
    }
