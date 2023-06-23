package com.example.reservasiin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PembayaranActivity : AppCompatActivity() {
    private lateinit var button: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        button = findViewById(R.id.btn_bayar)
        button.setOnClickListener {
            val intent = Intent(this,LandingActivity::class.java)
            startActivity(intent)
        }
    }
}