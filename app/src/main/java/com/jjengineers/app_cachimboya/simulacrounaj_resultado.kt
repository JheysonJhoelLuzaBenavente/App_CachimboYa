package com.jjengineers.app_cachimboya

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class simulacrounaj_resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulacrounaj_resultado)

        val correctAnswers = intent.getIntExtra("correctAnswers", 0)
        val totalQuestions = intent.getIntExtra("totalQuestions", 0)
        val percentage = (correctAnswers.toDouble() / totalQuestions.toDouble()) * 100

        val scoreTextView: TextView = findViewById(R.id.scoreTextView1)
        val percentageTextView: TextView = findViewById(R.id.percentageTextView1)

        scoreTextView.text = "Respuestas Correctas: $correctAnswers/$totalQuestions"
        percentageTextView.text = "Porcentaje: %.2f%%".format(percentage)
    }
}
