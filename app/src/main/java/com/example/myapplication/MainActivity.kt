package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.activity.enableEdgeToEdge
import com.example.myapplication.databinding.ActivityConversorBinding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            var nome = "yulia"
            var senha  = "admin"

            var nomeText: String = binding.nome.text.toString()
            var senhaText: String = binding.senha.text.toString()
            val intentConversor = Intent(this, Conversor::class.java)
            if(nome == nomeText && senha == senhaText){
                startActivity(intentConversor)
            }
            else{
                Toast.makeText(applicationContext, "Login error!", Toast.LENGTH_SHORT).show()

            }
        }
        super.onCreate(savedInstanceState)
    }
}