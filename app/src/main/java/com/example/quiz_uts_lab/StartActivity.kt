package com.example.quiz_uts_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {

    lateinit var start:Button
    lateinit var keluar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        supportActionBar?.hide()

        start=findViewById(R.id.start)
        start.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
//
        keluar=findViewById(R.id.keluar)
        keluar.setOnClickListener {
            finish();
            System.exit(0);
        }

    }



    override fun onBackPressed() {
        super.onBackPressed()
    }
}