package com.example.ejerciciofer

import androidx.appcompat.app.AppCompatActivity
import com.example.ejerciciofer.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnClickListener {
            binding.button1.isEnabled = binding.switch1.isChecked == true

        }

        binding.button1.setOnClickListener {
            if(binding.editText.text.isNotEmpty())
            {
                Toast.makeText(this, "Hola ${binding.editText.text}!", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show()
        }

    }
}