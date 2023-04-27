package com.example.meme_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication_trial.R

class MemePg1 : AppCompatActivity() {
    lateinit var btPg1Prev:Button
    lateinit var btpg1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pg1)
        btPg1Prev=findViewById(R.id.btPg1Prev)
        btPg1Prev.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btpg1 = findViewById(R.id.btpg1)
        btpg1.setOnClickListener {
            val intent = Intent(this, MemePg2::class.java )
            startActivity(intent)
        }
    }
}