package com.example.tp2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_echec.*
import kotlinx.android.synthetic.main.activity_echec.homeBtn
import kotlinx.android.synthetic.main.activity_echec.result
import kotlinx.android.synthetic.main.activity_echec.sendSms
import kotlinx.android.synthetic.main.activity_result.*

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
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
            intent.putExtra("sms_body", message);
            startActivity(intent)
        }
    }

    }