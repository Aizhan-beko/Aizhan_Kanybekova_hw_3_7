package com.geeks.aizhan_kanybekova_3_7

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.geeks.aizhan_kanybekova_3_7.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_1, FirstFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_2, SecondFragment())
            .commit()
    }
    }




