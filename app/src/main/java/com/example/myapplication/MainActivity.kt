package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.example.myapplication.Constants.getQuestions

import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    var answer: Int? = null
    var progressCount = 0
    var correctAnswers=0
    var questionList = getQuestions();
    override fun onCreate(savedInstanceState: Bundle?) {

        var tvQuestion: TextView? = null
        var btnSubmit: Button? = null
        var ivCountry: ImageView? = null
        var pbQuizProgress: ProgressBar? = null
        var tvQuizProgress: TextView? = null
        var tvOptionOne: TextView? = null
        var tvOptionTwo: TextView? = null
        var tvOptionThree: TextView? = null
        var tvOptionFour: TextView? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        tvQuestion = findViewById(R.id.tv_question)
        btnSubmit = findViewById(R.id.btn_submit)
        ivCountry = findViewById(R.id.iv_country)
        pbQuizProgress = findViewById(R.id.pb_quiz_progress)
        tvQuizProgress = findViewById(R.id.tv_quiz_progress)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)

        //to show the quiz
        tvQuestion.text = questionList.get(progressCount).question
        ivCountry.setImageResource(questionList.get(progressCount).image)
        tvOptionOne.text = questionList.get(progressCount).optionOne
        tvOptionTwo.text = questionList.get(progressCount).optionTwo
        tvOptionThree.text = questionList.get(progressCount).optionThree
        tvOptionFour.text = questionList.get(progressCount).optionFour
        tvQuizProgress.text = progressCount.toString()

        // Function to set answer and highlight selected option
        fun setAnswerAndHighlight(option: Int, textView: TextView) {
            // Reset text color for all options
            val allOptions = listOf<TextView>(tvOptionOne, tvOptionTwo, tvOptionThree, tvOptionFour)
            allOptions.forEach { it.setTextColor(resources.getColor(android.R.color.black)) }

            // Highlight the selected option
            textView.setTextColor(resources.getColor(android.R.color.holo_blue_dark))

            // Set the answer
            answer = option
        }
        // Click listeners for options
        tvOptionOne.setOnClickListener { setAnswerAndHighlight(1, tvOptionOne) }
        tvOptionTwo.setOnClickListener { setAnswerAndHighlight(2, tvOptionTwo) }
        tvOptionThree.setOnClickListener { setAnswerAndHighlight(3, tvOptionThree) }
        tvOptionFour.setOnClickListener { setAnswerAndHighlight(4, tvOptionFour) }


        btnSubmit.setOnClickListener {
            when (answer) {
                questionList[progressCount].correctAnswer -> {
                    Log.d("MainActivity", "Correct answer")
                    progressCount++

                    // Check if progressCount is within bounds of questionList size
                    if (progressCount < questionList.size) {
                        // Update UI with new question and options
                        tvQuestion.text = questionList[progressCount].question
                        ivCountry.setImageResource(questionList[progressCount].image)
                        tvOptionOne.text = questionList[progressCount].optionOne
                        tvOptionTwo.text = questionList[progressCount].optionTwo
                        tvOptionThree.text = questionList[progressCount].optionThree
                        tvOptionFour.text = questionList[progressCount].optionFour

                        // Update progress text
                        tvQuizProgress.text = progressCount.toString()
                    } else {
                        // Handle end of questions, e.g., display a message or navigate to another screen
                        // For example:
                        // tvQuestion.text = "Quiz completed!"
                    }
                }

                null -> {
                    Log.d("MainActivity", "Please choose an answer")
                }

                else -> {
                    Log.d("MainActivity", "Incorrect answer")
                }
            }
        }
        //Update the UI
        fun updateUIForQuestion(index: Int) {
            if (index < questionList.size) {
            tvQuestion.text = questionList[index].question
            ivCountry.setImageResource(questionList[index].image)
            tvOptionOne.text = questionList[index].optionOne
            tvOptionTwo.text = questionList[index].optionTwo
            tvOptionThree.text = questionList[index].optionThree
            tvOptionFour.text = questionList[index].optionFour
            val allOptions = listOf<TextView>(tvOptionOne, tvOptionTwo, tvOptionThree, tvOptionFour)
            allOptions.forEach { it.setTextColor(resources.getColor(android.R.color.black)) }
            // Update progress text
            tvQuizProgress.text = (index).toString() // Display 1-based index for progress
            pbQuizProgress.progress=progressCount
            answer=null
            }else{
                // Handle end of questions, e.g., display a message or navigate to another screen
                // For example:
                // tvQuestion.text = "Quiz completed!"
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("correctAnswers", correctAnswers)
                startActivity(intent)
            }
        }

        //Event handling for submit
        btnSubmit.setOnClickListener {

            when (answer) {
                questionList[progressCount].correctAnswer -> {
                    progressCount++
                    correctAnswers++

                    Log.d("MainActivity", "Correct answers="+correctAnswers)
                        updateUIForQuestion(progressCount)

                }

                null -> {
                    Log.d("MainActivity", "Please choose an answer")
                }

                else -> {
                    Log.d("MainActivity", "Incorrect answer")
                    progressCount++
                    updateUIForQuestion(progressCount)
                }

            }
        }

    }

}