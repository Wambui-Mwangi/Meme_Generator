package com.example.meme_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication_trial.R

class MemePg3 : AppCompatActivity() {
    lateinit var btMemePg3Prev:Button
    lateinit var btMemePg3Next:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pg3)
        btMemePg3Prev = findViewById(R.id.btMemePg3Prev)
        btMemePg3Prev.setOnClickListener {
            val intent = Intent(this, MemePg2::class.java)
            startActivity(intent)
        }

        btMemePg3Next = findViewById(R.id.btMemePg3Next)
        btMemePg3Next.setOnClickListener {
            val intent = Intent(this, MemePg4::class.java)
            startActivity(intent)
        }
    }
}