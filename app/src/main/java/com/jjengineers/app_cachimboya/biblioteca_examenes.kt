package com.jjengineers.app_cachimboya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class biblioteca_examenes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biblioteca_examenes)

        val btn1: Button = findViewById(R.id.buttonCU)
        val btn2: Button = findViewById(R.id.buttonLI1)


        btn1.setOnClickListener {
            val intent = Intent(this, biblioteca_cursos::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, biblioteca_libros::class.java)
            startActivity(intent)
        }

        val btn3: ImageButton = findViewById(R.id.ButtonFL3)
        btn3.setOnClickListener {
            val intent = Intent(this, menuprincipal::class.java) // replace AnotherActivity with your target activity
            startActivity(intent)
        }

    }
}