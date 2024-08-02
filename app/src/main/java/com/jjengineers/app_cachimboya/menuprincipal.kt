package com.jjengineers.app_cachimboya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class menuprincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuprincipal)

        val btn1: ImageButton = findViewById(R.id.imagebuttonSA)
        val btn2: ImageButton = findViewById(R.id.imagebuttonBV)
        val btn3: ImageButton = findViewById(R.id.imagebuttonDP)
        val btn4: ImageButton = findViewById(R.id.imagebuttonAE)

        btn1.setOnClickListener {
            val intent = Intent(this, simulacrosdeadmision::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, biblioteca_cursos::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, tipsdeestudio::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this, areasdeestudio::class.java)
            startActivity(intent)
        }
    }
}
