package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nneew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nneew)

        val bt: Button = findViewById(R.id.button)
        bt.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val bt2: Button = findViewById(R.id.button2)
        bt2.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val bt3: Button = findViewById(R.id.button3)
        bt3.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        val bt4: Button = findViewById(R.id.button4)
        bt4.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        val bt5: Button = findViewById(R.id.button5)
        bt5.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        val bt6: Button = findViewById(R.id.button6)
        bt6.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
    }
}

