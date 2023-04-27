package com.example.meme_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication_trial.R

class MemePg6 : AppCompatActivity() {
    lateinit var btMemePg6Prev:Button
    lateinit var btMemePg6Next:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pg6)

        btMemePg6Prev = findViewById(R.id.btMemePg6Prev)
        btMemePg6Prev.setOnClickListener {
            val intent = Intent(this, MemePg5::class.java)
            startActivity(intent)
        }

        btMemePg6Next = findViewById(R.id.btMemePg6Next)
        btMemePg6Next.setOnClickListener {
            val intent = Intent(this, MemePg7::class.java)
            startActivity(intent)
        }
    }
}