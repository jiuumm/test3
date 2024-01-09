package com.example.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test3.databinding.ActivityMainBinding

class OtherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        

    }
}