package com.example.solarsystem


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickme=findViewById<Button>(R.id.button)

        clickme.setOnClickListener {
            val intent= Intent(this@MainActivity,mainpage::class.java)
            startActivity(intent)
        }
    }
}

