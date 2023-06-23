package com.example.reservasiin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class keteranganActivity : AppCompatActivity() {
    private lateinit var button: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keterangan)

        button = findViewById(R.id.btn_pesan)
        button.setOnClickListener {
            val intent = Intent(this,CekActivity::class.java)
            startActivity(intent)
        }
    }
}