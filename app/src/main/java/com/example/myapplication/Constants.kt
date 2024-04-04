package com.example.myapplication

import com.example.ashsfirstapplication.Question

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val ques0 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_tunisia,
            optionOne = "Turkey",
            optionTwo = "Tunis",
            optionThree = "Egypt",
            optionFour = "Germany",
            correctAnswer = 2
        )
        questionsList.add(ques0)

        val ques1 = Question(
            id = 2,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Spain",
            optionThree = "Egypt",
            optionFour = "Seychelles",
            correctAnswer = 1
        )
        questionsList.add(ques1)

        val ques2 = Question(
            id = 3,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_australia,
            optionOne = "America",
            optionTwo = "Australia",
            optionThree = "New Zealand",
            optionFour = "Uzbekistan",
            correctAnswer = 2
        )
        questionsList.add(ques2)

        val ques3 = Question(
            id = 4,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_belgium,
            optionOne = "Germany",
            optionTwo = "Belgium",
            optionThree = "Armenia",
            optionFour = "France",
            correctAnswer = 2
        )
        questionsList.add(ques3)

        val ques4 = Question(
            id = 5,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_brazil,
            optionOne = "Japan",
            optionTwo = "India",
            optionThree = "Pakistan",
            optionFour = "Brazil",
            correctAnswer = 4
        )
        questionsList.add(ques4)

        val ques5 = Question(
            id = 6,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_denmark,
            optionOne = "Denmark",
            optionTwo = "Poland",
            optionThree = "Brazil",
            optionFour = "UK",
            correctAnswer = 1
        )
        questionsList.add(ques5)

        val ques6 = Question(
            id = 7,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_fiji,
            optionOne = "America",
            optionTwo = "Vietnam",
            optionThree = "Fiji",
            optionFour = "UAE",
            correctAnswer = 3
        )
        questionsList.add(ques6)

        val ques7 = Question(
            id = 8,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_algeria,
            optionOne = "Qatar",
            optionTwo = "Morocco",
            optionThree = "Algeria",
            optionFour = "Iraq",
            correctAnswer = 3
        )
        questionsList.add(ques7)

        val ques8 = Question(
            id = 9,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_india,
            optionOne = "India",
            optionTwo = "China",
            optionThree = "Kuwait",
            optionFour = "Australia",
            correctAnswer = 1
        )
        questionsList.add(ques8)

        val ques9 = Question(
            id = 10,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_new_zealand,
            optionOne = "Russia",
            optionTwo = "New Zealand",
            optionThree = "Armenia",
            optionFour = "Chile",
            correctAnswer = 2
        )
        questionsList.add(ques9)

        val ques10 = Question(
            id = 11,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_germany,
            optionOne = "Greece",
            optionTwo = "Australia",
            optionThree = "Germany",
            optionFour = "Austria",
            correctAnswer = 3
        )
        questionsList.add(ques10)

        return questionsList
    }
}

