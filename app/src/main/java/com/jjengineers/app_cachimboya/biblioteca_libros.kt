package com.jjengineers.app_cachimboya

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class biblioteca_libros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biblioteca_libros)

        val btn1:Button = findViewById(R.id.buttonCU1)
        val btn2:Button = findViewById(R.id.buttonEX1)
        val btnLUMBRERAS: ImageButton = findViewById(R.id.ButtonLUMBRERAS)
        val btnSANMARCOS: ImageButton = findViewById(R.id.ButtonSANMARCOS)
        val btnCUZCANO: ImageButton = findViewById(R.id.ButtonCUZCANO)


        btn1.setOnClickListener {
            val intent = Intent(this, biblioteca_cursos::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, biblioteca_examenes::class.java)
            startActivity(intent)
        }

        val btn3: ImageButton = findViewById(R.id.ButtonFL4)
        btn3.setOnClickListener {
            val intent = Intent(this, menuprincipal::class.java) // replace AnotherActivity with your target activity
            startActivity(intent)
        }

        btnLUMBRERAS.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1Mu26xOvA1aCE5Ky7ktWftKBucv0KGjSX?usp=drive_link"))
            startActivity(intent)
        }

        btnSANMARCOS.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1Ej5uNCLRqX8Tt7hj1ewXDS6fSVOMLPxL?usp=drive_link"))
            startActivity(intent)
        }

        btnCUZCANO.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1yyn3GLHbYSH-OnUd46Jf5IuhX4B8C4LW?usp=drive_link"))
            startActivity(intent)
        }

    }
}