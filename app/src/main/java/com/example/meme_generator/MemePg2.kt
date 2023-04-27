package com.example.meme_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication_trial.R

class MemePg2 : AppCompatActivity() {
    lateinit var btMemePg2Prev:Button
    lateinit var btMemepg2Next:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pg2)
        btMemePg2Prev = findViewById(R.id.btMemePg2Prev)
        btMemePg2Prev.setOnClickListener {
            val intent = Intent(this, MemePg1::class.java)
            startActivity(intent)
        }

        btMemepg2Next = findViewById(R.id.btMemepg2Next)
        btMemepg2Next.setOnClickListener {
            val intent = Intent(this, MemePg3::class.java)
            startActivity(intent)
        }
    }
}