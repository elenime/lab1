package com.example.wordle

/**
 * An object that provides a list of four-letter words and a function
 * to get a random word from the list.
 */
object FourLetterWordList {
    private val words = listOf(
        "BANK", "LAVA", "SWIM", "ZOOM", "DEAL",
        "EACH", "FISH", "GOLD", "HELP", "JUMP",
        "KICK", "LIME", "MIND", "NEST", "OPEN",
        "PULL", "QUIT", "RACE", "STAR", "TRIP",
        "UNIT", "VIEW", "WARM", "YARD", "ZERO"
        // Add more 4-letter words here
    )

    /**
     * Returns a random four-letter word from the list.
     */
    fun getRandomFourLetterWord(): String {
        return words.random()
    }
}
