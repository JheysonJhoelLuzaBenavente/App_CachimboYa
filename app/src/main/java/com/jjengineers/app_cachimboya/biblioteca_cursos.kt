package com.jjengineers.app_cachimboya

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class biblioteca_cursos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biblioteca_cursos)

        val btn1: Button = findViewById(R.id.buttonEX)
        val btn2: Button = findViewById(R.id.buttonLI)
        val btn3: ImageButton = findViewById(R.id.ButtonFL2)
        val btnRM: ImageButton = findViewById(R.id.ButtonRM)
        val btnRV: ImageButton = findViewById(R.id.ButtonRV)
        val btnFISICA: ImageButton = findViewById(R.id.ButtonFISICA)
        val btnQUIMICA: ImageButton = findViewById(R.id.ButtonQUIMICA)
        val btnALGEBRA: ImageButton = findViewById(R.id.ButtonALGEBRA)
        val btnARITMETICA: ImageButton = findViewById(R.id.ButtonARITMETICA)
        val btnGEOMETRIA: ImageButton = findViewById(R.id.ButtonGEOMETRIA)

        btn1.setOnClickListener {
            val intent = Intent(this, biblioteca_examenes::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, biblioteca_libros::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, menuprincipal::class.java)
            startActivity(intent)
        }

        btnRM.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1QRWw4mGcTB_Y5L1ytdkkZ9qulXelHpLe?usp=drive_link"))
            startActivity(intent)
        }

        btnRV.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1GQmmu2-r38d2QLr626ZRjuBhKXkEBOUI?usp=drive_link"))
            startActivity(intent)
        }

        btnFISICA.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1bw5rw3s1DEdEe4rWh3RrlAkbfys3hhJe?usp=drive_link"))
            startActivity(intent)
        }

        btnQUIMICA.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1f35-Z1DiFX3x9LINn3UKq9hAuJCktOcR?usp=drive_link"))
            startActivity(intent)
        }

        btnALGEBRA.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1HZlZRPKJ34OgFuztC6Ixc7rO3CH5acr3?usp=drive_link"))
            startActivity(intent)
        }

        btnARITMETICA.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1y4g4Lo0fjEAg8BbgDNz4CFfnlekIBgz_?usp=drive_link"))
            startActivity(intent)
        }

        btnGEOMETRIA.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1-TsUaDrv9KSIghnXSfWFgvQ6i-UVDVIQ?usp=drive_link"))
            startActivity(intent)
        }
    }
}
