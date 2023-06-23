package com.example.reservasiin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CekActivity : AppCompatActivity() {
    private lateinit var button: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cek)

        button = findViewById(R.id.btn_pilih_pembayaran)
        button.setOnClickListener {
            val intent = Intent(this,PembayaranActivity::class.java)
            startActivity(intent)
        }
    }
}