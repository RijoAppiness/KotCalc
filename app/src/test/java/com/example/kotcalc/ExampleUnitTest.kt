package com.example.kotcalc

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun main() {
//        val calcEngine = CalcEngine()
//        calcEngine.pushKey(KEY.ONE)
//        calcEngine.pushKey(KEY.PLUS)
//        calcEngine.pushKey(KEY.ONE)
//        calcEngine.pushKey(KEY.PLUS)
//        calcEngine.pushKey(KEY.ONE)
//        calcEngine.pushKey(KEY.EQUAL)


    }
    val calcEngine = CalcEngine()

    fun singleDigitAddition(){
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.PLUS())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.DOT())
        calcEngine.pushKey(KEY.SEVEN())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.PLUS())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())
        //println(calcEngine.getResult())

    }
    fun multiDigitAddition(){
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.SEVEN())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.PLUS())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.PLUS())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.THREE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun singleDigitSubtraction(){
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.MINUS())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.MINUS())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun multiDigitSubtraction(){
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.SEVEN())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.MINUS())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.MINUS())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.THREE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun singleDigitMultiplication(){
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.INTO())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.INTO())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun multiDigitMultiplication(){
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.SEVEN())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.INTO())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.INTO())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.THREE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun singleDigitDivision(){
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.DIVIDE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.FIVE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.DIVIDE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun multiDigitDivision(){
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.SEVEN())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.DIVIDE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.DIVIDE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.THREE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun singleDigitPercentage(){
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.PERCENTAGE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.FIVE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.PERCENTAGE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun multiDigitPercentage(){
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.SEVEN())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.PERCENTAGE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.PERCENTAGE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.THREE())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())

    }
    fun multiOperation(){
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.ZERO())
        calcEngine.pushKey(KEY.PLUS())
        calcEngine.pushKey(KEY.TWO())
        calcEngine.pushKey(KEY.FIVE())
        calcEngine.pushKey(KEY.INTO())
        calcEngine.pushKey(KEY.FOUR())
        calcEngine.pushKey(KEY.FIVE())
        calcEngine.pushKey(KEY.MINUS())
        calcEngine.pushKey(KEY.FIVE())
        calcEngine.pushKey(KEY.DIVIDE())
        calcEngine.pushKey(KEY.FIVE())
        println(calcEngine.getDisplayString())
//    println(calcEngine)
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())




    }


}
