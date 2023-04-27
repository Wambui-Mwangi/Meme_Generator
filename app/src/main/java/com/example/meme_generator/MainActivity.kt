package com.example.meme_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication_trial.R

class MainActivity : AppCompatActivity() {
    lateinit var btLetsGo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btLetsGo = findViewById(R.id.btLetsGo)
        btLetsGo.setOnClickListener {
            val intent = Intent(this, MemePg1::class.java)
            startActivity(intent)
        }
    }
}