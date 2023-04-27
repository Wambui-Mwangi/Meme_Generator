package com.example.meme_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication_trial.R

class MemePg5 : AppCompatActivity() {
    lateinit var btMemePg5Prev:Button
    lateinit var btMemePg5Next:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pg5)

        btMemePg5Prev=findViewById(R.id.btMemePg5Prev)
        btMemePg5Prev.setOnClickListener {
            val intent = Intent(this, MemePg4::class.java)
            startActivity(intent)
        }

        btMemePg5Next=findViewById(R.id.btMemePg5Next)
        btMemePg5Next.setOnClickListener {
            val intent = Intent(this, MemePg6::class.java)
            startActivity(intent)
        }
    }
}