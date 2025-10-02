package com.example.wordle

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var wordToGuess: String
    private var guessCount = 0

    private lateinit var guessViews: List<TextView>
    private lateinit var resultViews: List<TextView>
    private lateinit var tvAnswer: TextView
    private lateinit var btnSubmit: Button
    private lateinit var btnReset: Button
    private lateinit var etGuess: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get random word
        wordToGuess = FourLetterWordList.getRandomFourLetterWord()
        // Debug: print it in Logcat if needed
        // Log.d("WORDLE", "Word to guess: $wordToGuess")

        // Initialize views
        etGuess = findViewById(R.id.etGuess)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnReset = findViewById(R.id.btnReset)
        tvAnswer = findViewById(R.id.tvAnswer)

        guessViews = listOf(
            findViewById(R.id.tvGuess1),
            findViewById(R.id.tvGuess2),
            findViewById(R.id.tvGuess3)
        )

        resultViews = listOf(
            findViewById(R.id.tvResult1),
            findViewById(R.id.tvResult2),
            findViewById(R.id.tvResult3)
        )

        btnReset.visibility = View.GONE
        tvAnswer.visibility = View.GONE

        btnSubmit.setOnClickListener {
            val guess = etGuess.text.toString().trim().uppercase()

            if (guess.length != 4) {
                Toast.makeText(this, "Please enter a 4-letter word", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val result = checkGuess(guess, wordToGuess)

            // Update guess and result
            if (guessCount < 3) {
                guessViews[guessCount].text = guess
                resultViews[guessCount].text = result
                guessCount++
                etGuess.text.clear()
            }

            // End of game
            if (guessCount == 3 || guess == wordToGuess) {
                btnSubmit.isEnabled = false
                tvAnswer.text = "The word was: $wordToGuess"
                tvAnswer.visibility = View.VISIBLE
                btnReset.visibility = View.VISIBLE
            }
        }

        btnReset.setOnClickListener {
            recreate()
        }
    }

    /**
     * Returns a string with results:
     * O = Correct letter in correct place
     * + = Correct letter in wrong place
     * X = Letter not in the word
     */
    private fun checkGuess(guess: String, wordToGuess: String): String {
        val result = StringBuilder()

        for (i in guess.indices) {
            result.append(
                when {
                    guess[i] == wordToGuess[i] -> 'O'
                    guess[i] in wordToGuess -> '+'
                    else -> 'X'
                }
            )
        }
        return result.toString()
    }
}
