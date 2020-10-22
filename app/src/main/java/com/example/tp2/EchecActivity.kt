package com.example.tp2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_echec.*

class EchecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_echec)
        val message = intent.getStringExtra("msg")
        result.apply {
            text = message
        }
        homeBtn.setOnClickListener {
            finish()
        }
        sendSms.setOnClickListener {

        }
    }

    }