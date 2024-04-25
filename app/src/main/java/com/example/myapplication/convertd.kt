package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityConvertdBinding

class convertd : AppCompatActivity() {

    private lateinit var binding: ActivityConvertdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConvertdBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}