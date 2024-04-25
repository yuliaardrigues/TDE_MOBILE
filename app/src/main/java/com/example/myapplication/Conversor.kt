package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityConversorBinding
import com.example.myapplication.databinding.ActivityConvertdBinding
import com.example.myapplication.databinding.ActivityRealBinding

class Conversor : AppCompatActivity() {
    private lateinit var binding: ActivityConversorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConversorBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bt.setOnClickListener {
            startActivity(Intent(this, ActivityRealBinding::class.java))
        }
        binding.bts.setOnClickListener {
            startActivity(Intent(this, ActivityConvertdBinding::class.java))
        }
    }
}