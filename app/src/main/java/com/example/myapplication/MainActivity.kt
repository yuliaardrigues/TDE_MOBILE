package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityConversorBinding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val nome = binding.nome.text.toString().trim()
            val senha = binding.senha.text.toString().trim()

           if(nome == "yulia" && senha == "admin"){
               Toast.makeText(applicationContext, "Login ok!", Toast.LENGTH_SHORT).show()
               startActivity(Intent(this, ActivityConversorBinding::class.java))
           }
            else{
                Toast.makeText(applicationContext, "Login error!", Toast.LENGTH_SHORT).show()

            }
        }
      }
    }