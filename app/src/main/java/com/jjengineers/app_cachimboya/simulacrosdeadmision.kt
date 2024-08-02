package com.jjengineers.app_cachimboya

import android.content.Intent
import android.widget.ImageButton
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class simulacrosdeadmision : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulacrosdeadmision)

        val btn1: ImageButton = findViewById(R.id.buttonsimulacrounap)
        btn1.setOnClickListener {
            val intent = Intent(this, simulacrounap_inicio::class.java)
            startActivity(intent)
        }

        val btn2: ImageButton = findViewById(R.id.buttonsimulacrounaj)
        btn2.setOnClickListener {
            val intent = Intent(this, simulacrounaj_inicio::class.java) // replace AnotherActivity with your target activity
            startActivity(intent)
        }

        val btn3: ImageButton = findViewById(R.id.ButtonFL1)
        btn3.setOnClickListener {
            val intent = Intent(this, menuprincipal::class.java) // replace AnotherActivity with your target activity
            startActivity(intent)
        }
    }
}
