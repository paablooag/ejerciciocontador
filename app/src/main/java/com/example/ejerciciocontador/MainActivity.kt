package com.example.ejerciciocontador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var contador = 1
    private lateinit var texto2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto2 = findViewById(R.id.textView3)
    }

    fun pito(view: View) {
        contador++
        texto2.text=contador.toString()

    }
}