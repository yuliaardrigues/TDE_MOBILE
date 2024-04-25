package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityRealBinding

class convertr : AppCompatActivity() {

    private lateinit var binding: ActivityRealBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRealBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}