package com.example.kotcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display.setText("0")
        one.setOnClickListener { display.append("1") }
        two.setOnClickListener { display.append("2") }
        three.setOnClickListener { display.append("3") }
        four.setOnClickListener { display.append("4") }
        five.setOnClickListener { display.append("5") }
        six.setOnClickListener { display.append("6") }
        seven.setOnClickListener { display.append("7") }
        eight.setOnClickListener { display.append("8") }
        nine.setOnClickListener { display.append("9") }
        zero.setOnClickListener { display.append("0") }
        plus.setOnClickListener { display.append("+") }
        minus.setOnClickListener { display.append("-") }
        division.setOnClickListener { display.append("/") }
        into.setOnClickListener { display.append("X") }
        percentage.setOnClickListener { display.append("%") }
        equal.setOnClickListener { display.append("=") }
        decimal.setOnClickListener {
            //TODO: add a decimal imp
        }
        plus_minus.setOnClickListener {
            //TODO: add a plus_minus imp
        }
        correction.setOnClickListener {
            if (display.text.lastIndex >= 0)
                display.text = display.text.subSequence(0, display.text.lastIndex)
        }
        btn_c.setOnClickListener{
            display.text = "0"
        }

    }



}
