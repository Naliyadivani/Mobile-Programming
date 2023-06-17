package com.example.myapplication

import android.graphics.drawable.ColorDrawable
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setTitle("Hi,Nazwa!")

        val buttonSelesai = findViewById<Button>(R.id.button_selesai)

        buttonSelesai.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        // Mengganti background header bar
        window.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.merahGradasi)))
    }
}


//    fun tombolSelesai(){
//        Toast.makeText(this, "Terimakasih telah membaca berita hari ini", Toast.LENGTH_SHORT).show()
//        }
