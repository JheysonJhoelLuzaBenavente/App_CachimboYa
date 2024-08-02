package com.jjengineers.app_cachimboya

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class simulacrounaj_inicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulacrounaj_inicio)

        val startButton: Button = findViewById(R.id.startButton1)
        startButton.setOnClickListener {
            val intent = Intent(this, simulacrounaj_preguntas::class.java)
            startActivity(intent)
        }
    }
}