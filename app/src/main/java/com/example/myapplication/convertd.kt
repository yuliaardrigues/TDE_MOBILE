package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityConvertdBinding

class convertd : AppCompatActivity() {

    private lateinit var binding: ActivityConvertdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConvertdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoreal.setOnClickListener {
            if (binding.real.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Informe o valor!!", Toast.LENGTH_SHORT).show()
            } else {
                val dolar: Float = binding.real.text.toString().toFloat()
                val real: Float = dolar * 1;
                Toast.makeText(applicationContext, "Convertido para R$" + real.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        binding.voltar.setOnClickListener{
            startActivity(Intent(this, Conversor::class.java))
        }
    }
}