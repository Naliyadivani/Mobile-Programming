package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.setTitle("Thank You Nazwa!")

        val tombolkembali = findViewById<Button>(R.id.kembali)

        tombolkembali.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        // Mengganti background header bar
        window.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.merahGradasi)))
    }
    }