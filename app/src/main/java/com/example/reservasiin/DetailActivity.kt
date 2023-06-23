package com.example.reservasiin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        textView = findViewById(R.id.btn_pilih_tempat)
        textView.setOnClickListener{
            val intent = Intent(this,keteranganActivity::class.java)
            startActivity(intent)
        }
    }
}