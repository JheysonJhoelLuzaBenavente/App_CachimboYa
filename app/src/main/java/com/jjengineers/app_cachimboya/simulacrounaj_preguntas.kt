package com.jjengineers.app_cachimboya

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.TimeUnit

class simulacrounaj_preguntas : AppCompatActivity() {

    private lateinit var timerTextView: TextView
    private lateinit var questionImageView: ImageView
    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var nextButton: Button
    private lateinit var countDownTimer: CountDownTimer

    private val questions = listOf(
        Question(
            text = "Pregunta 1",
            imageResId = R.drawable.p1_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 2",
            imageResId = R.drawable.p2_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 3",
            imageResId = R.drawable.p3_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 4",
            imageResId = R.drawable.p4_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 5",
            imageResId = R.drawable.p5_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 6",
            imageResId = R.drawable.p6_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 7",
            imageResId = R.drawable.p7_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 8",
            imageResId = R.drawable.p8_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 9",
            imageResId = R.drawable.p9_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 10",
            imageResId = R.drawable.p10_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 11",
            imageResId = R.drawable.p11_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 12",
            imageResId = R.drawable.p12_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 13",
            imageResId = R.drawable.p13_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 14",
            imageResId = R.drawable.p14_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 15",
            imageResId = R.drawable.p15_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 16",
            imageResId = R.drawable.p16_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 17",
            imageResId = R.drawable.p17_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 18",
            imageResId = R.drawable.p18_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 19",
            imageResId = R.drawable.p19_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 20",
            imageResId = R.drawable.p20_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 21",
            imageResId = R.drawable.p21_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 22",
            imageResId = R.drawable.p22_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 23",
            imageResId = R.drawable.p23_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 24",
            imageResId = R.drawable.p24_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 25",
            imageResId = R.drawable.p25_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 26",
            imageResId = R.drawable.p26_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 27",
            imageResId = R.drawable.p27_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 28",
            imageResId = R.drawable.p28_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 29",
            imageResId = R.drawable.p29_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 30",
            imageResId = R.drawable.p30_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 31",
            imageResId = R.drawable.p31_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 32",
            imageResId = R.drawable.p32_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 33",
            imageResId = R.drawable.p33_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 34",
            imageResId = R.drawable.p34_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 35",
            imageResId = R.drawable.p35_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 36",
            imageResId = R.drawable.p36_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 37",
            imageResId = R.drawable.p37_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 38",
            imageResId = R.drawable.p38_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 39",
            imageResId = R.drawable.p39_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 40",
            imageResId = R.drawable.p40_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 41",
            imageResId = R.drawable.p41_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 42",
            imageResId = R.drawable.p42_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 43",
            imageResId = R.drawable.p43_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 44",
            imageResId = R.drawable.p44_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 45",
            imageResId = R.drawable.p45_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 46",
            imageResId = R.drawable.p46_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 47",
            imageResId = R.drawable.p47_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 48",
            imageResId = R.drawable.p48_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 49",
            imageResId = R.drawable.p49_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 50",
            imageResId = R.drawable.p50_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 51",
            imageResId = R.drawable.p51_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 52",
            imageResId = R.drawable.p52_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 53",
            imageResId = R.drawable.p53_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 54",
            imageResId = R.drawable.p54_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 55",
            imageResId = R.drawable.p55_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 56",
            imageResId = R.drawable.p56_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 57",
            imageResId = R.drawable.p57_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 58",
            imageResId = R.drawable.p58_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
        Question(
            text = "Pregunta 59",
            imageResId = R.drawable.p59_unaj,
            options = listOf("A. ", "B. ", "C.", "D.", "E."),
            correctAnswer = "C."
        ),
    )

    private var currentQuestionIndex = 0
    private var correctAnswers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulacrounap_preguntas)

        timerTextView = findViewById(R.id.timerTextView)
        questionImageView = findViewById(R.id.questionImageView)
        questionTextView = findViewById(R.id.questionTextView)
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup)
        nextButton = findViewById(R.id.nextButton)

        startTimer()
        loadQuestion()

        nextButton.setOnClickListener {
            checkAnswer()
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                loadQuestion()
            } else {
                countDownTimer.cancel()
                val intent = Intent(this, simulacrounap_resultado::class.java)
                intent.putExtra("correctAnswers", correctAnswers)
                intent.putExtra("totalQuestions", questions.size)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun startTimer() {
        val totalTime = TimeUnit.HOURS.toMillis(2)

        countDownTimer = object : CountDownTimer(totalTime, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) % TimeUnit.HOURS.toMinutes(1),
                    TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) % TimeUnit.MINUTES.toSeconds(1))
                timerTextView.text = hms
            }

            override fun onFinish() {
                timerTextView.text = "00:00:00"
                val intent = Intent(this@simulacrounaj_preguntas, simulacrounap_resultado::class.java)
                intent.putExtra("correctAnswers", correctAnswers)
                intent.putExtra("totalQuestions", questions.size)
                startActivity(intent)
                finish()
            }
        }

        countDownTimer.start()
    }

    private fun loadQuestion() {
        val question = questions[currentQuestionIndex]
        // Cargar imagen y texto de la pregunta
        questionImageView.setImageResource(question.imageResId)
        questionTextView.text = question.text
        // Cargar opciones
        (optionsRadioGroup.getChildAt(0) as RadioButton).text = question.options[0]
        (optionsRadioGroup.getChildAt(1) as RadioButton).text = question.options[1]
        (optionsRadioGroup.getChildAt(2) as RadioButton).text = question.options[2]
        (optionsRadioGroup.getChildAt(3) as RadioButton).text = question.options[3]
        (optionsRadioGroup.getChildAt(4) as RadioButton).text = question.options[4]
    }

    private fun checkAnswer() {
        val selectedOptionId = optionsRadioGroup.checkedRadioButtonId
        val selectedOption = findViewById<RadioButton>(selectedOptionId).text.toString()
        val correctAnswer = questions[currentQuestionIndex].correctAnswer
        if (selectedOption == correctAnswer) {
            correctAnswers++
        }
    }
}

data class Question1(
    val text: String,
    val imageResId: Int,
    val options: List<String>,
    val correctAnswer: String
)
