package com.example.kotcalc

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    /**
     * This View model handles all the calculation process
     */
    private val calcEngine = ObservableCalcEngine()  // Hold the whole calculations

    fun sendKey(key:KEY){
        calcEngine.pushKey(key) //Transferring a key push
    }

    fun getDisplay():LiveData<String>{
        return calcEngine.getObservableDisplay()
    }


}