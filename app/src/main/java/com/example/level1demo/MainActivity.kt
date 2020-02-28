package com.example.level1demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        confirmButton.setOnClickListener {
            checkAnswer()
        }
    }




    private fun checkAnswer(){
        val textRes = if (inputText.text.toString() == getString(R.string.answer)){
            R.string.correct
        }else{
            R.string.incorrect
        }
        Toast.makeText(this@MainActivity,textRes, Toast.LENGTH_SHORT).show()

    }
}
