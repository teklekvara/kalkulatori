package com.example.kalkulatori

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    private lateinit var resultTextView: TextView

    private var isNewOp= true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.editText)
    }
    fun numberEvent(clickedView: View){
        if (clickedView is TextView){
            var text = resultTextView.text.toString()
            val number = clickedView.text.toString()

            if (text == "0"){
                isNewOp=false
                text = ""
            }

            val result = text + number

            resultTextView.text = result
        }
    }}