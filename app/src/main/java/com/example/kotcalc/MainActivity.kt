package com.example.kotcalc

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)


        mainViewModel.getDisplay().observe(this, Observer {
            display.setText(it)
        })


        one.setOnClickListener { mainViewModel.sendKey(KEY.ONE()) }
        two.setOnClickListener { mainViewModel.sendKey(KEY.TWO()) }
        three.setOnClickListener { mainViewModel.sendKey(KEY.THREE()) }
        four.setOnClickListener { mainViewModel.sendKey(KEY.FOUR())}
        five.setOnClickListener { mainViewModel.sendKey(KEY.FIVE())}
        six.setOnClickListener { mainViewModel.sendKey(KEY.SIX()) }
        seven.setOnClickListener { mainViewModel.sendKey(KEY.SEVEN())}
        eight.setOnClickListener { mainViewModel.sendKey(KEY.EIGHT()) }
        nine.setOnClickListener { mainViewModel.sendKey(KEY.NINE()) }
        zero.setOnClickListener { mainViewModel.sendKey(KEY.ZERO()) }
        plus.setOnClickListener { mainViewModel.sendKey(KEY.PLUS()) }
        minus.setOnClickListener { mainViewModel.sendKey(KEY.MINUS()) }
        division.setOnClickListener { mainViewModel.sendKey(KEY.DIVIDE()) }
        into.setOnClickListener { mainViewModel.sendKey(KEY.INTO()) }
        percentage.setOnClickListener { mainViewModel.sendKey(KEY.PERCENTAGE()) }
        equal.setOnClickListener { mainViewModel.sendKey(KEY.EQUAL()) }
        decimal.setOnClickListener {mainViewModel.sendKey(KEY.DOT())}
        plus_minus.setOnClickListener {mainViewModel.sendKey(KEY.PLUS_MINUS())}
        correction.setOnClickListener {mainViewModel.sendKey(KEY.CORRECTION())}
        btn_c.setOnClickListener {mainViewModel.sendKey(KEY.RESET())}

    }


}
