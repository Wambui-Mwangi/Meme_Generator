package com.example.meme_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication_trial.R

class MemePg7 : AppCompatActivity() {
    lateinit var btMemePg7Prev:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pg7)
        btMemePg7Prev = findViewById(R.id.btMemePg7Prev)
        btMemePg7Prev.setOnClickListener {
            val intent = Intent(this, MemePg6::class.java)
            startActivity(intent)
        }
    }
}