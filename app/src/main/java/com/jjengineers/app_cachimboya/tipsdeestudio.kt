package com.jjengineers.app_cachimboya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tipsdeestudio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tipsdeestudio)

        val btn: ImageButton = findViewById(R.id.ButtonFL5)
        btn.setOnClickListener {
            val intent = Intent(this, menuprincipal::class.java) // replace AnotherActivity with your target activity
            startActivity(intent)
        }
    }


}