package com.example.kotcalc

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val calcEngine = CalcEngine()

    @Test
    fun singleDigitAddition() {
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
        assertEquals(calcEngine.getResult(), 3.7, 0.001)
        //println(calcEngine.getResult())

    }

    @Test
    fun multiDigitAddition() {
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
        assertEquals(calcEngine.getResult(), 31.0, 0.001)

    }

    @Test
    fun singleDigitSubtraction() {
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
        assertEquals(calcEngine.getResult(), -1.0, 0.001)

    }

    @Test
    fun multiDigitSubtraction() {
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
        assertEquals(calcEngine.getResult(), 3.0, 0.001)

    }

    @Test
    fun singleDigitMultiplication() {
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
        assertEquals(calcEngine.getResult(), 1.0, 0.001)

    }

    @Test
    fun multiDigitMultiplication() {
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
        calcEngine.pushKey(KEY.INTO())
        calcEngine.pushKey(KEY.PLUS_MINUS())
        calcEngine.pushKey(KEY.TWO())
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())
        assertEquals(calcEngine.getResult(), 221.0 * -2, 0.001)

    }

    @Test
    fun singleDigitDivision() {
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
        println(calcEngine.getResult())
        assertEquals(calcEngine.getDisplayString().toDouble(), run {
            1.0 / 5 / 1
        }, 0.001)

    }

    @Test
    fun multiDigitDivision() {
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
        assertEquals(calcEngine.getResult(), run {
            17.0 / 1 / 13
        }, 0.001)

    }

    @Test
    fun singleDigitPercentage() {
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
        assertEquals(calcEngine.getResult(), run {
            (1.0 * 5 / 100) * (1 / 100)
        }, 0.001)

    }

    @Test
    fun multiDigitPercentage() {
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
        assertEquals(calcEngine.getResult(), run {
            (17.0 * 1.0 / 100.0) * 13 / 100
        }, 0.001)

    }

    @Test
    fun multiOperation() {
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
        calcEngine.pushKey(KEY.PLUS())
        calcEngine.pushKey(KEY.SIX())
        calcEngine.pushKey(KEY.EIGHT())
        calcEngine.pushKey(KEY.NINE())
        println(calcEngine.getDisplayString())
//    println(calcEngine)
        calcEngine.pushKey(KEY.EQUAL())
        println(calcEngine.getDisplayString())
        assertEquals(calcEngine.getResult(), run {
            10.0 + 25 * 45 - 5 / 5 + 689
        }, 0.001)


    }

    @Test
    fun correction() {
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
        calcEngine.pushKey(KEY.PLUS())
        calcEngine.pushKey(KEY.SIX())
        calcEngine.pushKey(KEY.EIGHT())
        calcEngine.pushKey(KEY.NINE())
        println(calcEngine.getDisplayString())
//    println(calcEngine)
        val display = calcEngine.getDisplayString()
        calcEngine.pushKey(KEY.CORRECTION())
        println(calcEngine.getDisplayString())
        assertEquals(calcEngine.getDisplayString(), run {
            display.substring(0, display.lastIndex)
        }
        )


    }
    @Test
    fun regex() {
        calcEngine.pushKey(KEY.ONE())
        calcEngine.pushKey(KEY.ZERO())
        calcEngine.pushKey(KEY.DOT())
        val display = calcEngine.getDisplayString()
        println(calcEngine.getDisplayString())
        calcEngine.pushKey(KEY.DOT())
        println(calcEngine.getDisplayString())
        assertEquals(calcEngine.getDisplayString(),display)


    }
    @Test
    fun reset() {
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
        calcEngine.pushKey(KEY.RESET())
        assertTrue(calcEngine.getDisplayString()=="")


    }


}
