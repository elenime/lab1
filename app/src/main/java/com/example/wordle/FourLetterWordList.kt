package com.example.wordle

object FourLetterWordList {

    private val words = listOf(
        "LAVA", "BANK", "CODE", "DESK", "FISH",
        "GOAT", "HELP", "JAVA", "KING", "LION",
        "MIND", "NEST", "OPEN", "PORK", "QUIZ",
        "ROAD", "STAR", "TIME", "USER", "VIEW",
        "WORD", "ZERO", "TREE", "SHIP", "RAIN"
    )

    fun getRandomFourLetterWord(): String {
        return words.random()
    }
}