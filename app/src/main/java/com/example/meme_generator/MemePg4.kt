package com.example.meme_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication_trial.R

class MemePg4 : AppCompatActivity() {
    lateinit var btMemePg4Prev:Button
    lateinit var btMemePg4Next:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pg4)

    btMemePg4Prev = findViewById(R.id.btMemePg4Prev)
    btMemePg4Prev.setOnClickListener {
        val intent = Intent(this, MemePg3::class.java)
        startActivity(intent)
    }

     btMemePg4Next = findViewById(R.id.btMemePg4Next)
     btMemePg4Next.setOnClickListener {
         val intent=Intent(this, MemePg5::class.java)
         startActivity(intent)
     }
    }
}