package com.example.tp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculerBtn.setOnClickListener {
            var res = (note1.text.toString().toFloat() + note1.text.toString().toFloat() + note1.text.toString().toFloat())/3
            if (res > 10){
                val msg = "Felicitation, vous avez reussi avec moyenne de "+res.toString()
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra("msg", msg)
                }
                startActivity(intent)
            }else{
                val msg = "Malheureusement, vous avez raté avec moyenne de "+res.toString()
                val intent = Intent(this, EchecActivity::class.java).apply {
                    putExtra("msg", msg)
                }
                startActivity(intent)
            }

        }
    }
}