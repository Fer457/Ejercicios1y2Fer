package com.example.ejerciciofer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val switch1 = findViewById<SwitchCompat>(R.id.switch1)
        val txedit = findViewById<EditText>(R.id.editText)

        switch1.setOnClickListener {
            btn1.isEnabled = switch1.isChecked == true

        }

        btn1.setOnClickListener {
            if(txedit.text.isNotEmpty())
            {
                Toast.makeText(this, "Hola ${txedit.text}!", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show()
        }

    }
}