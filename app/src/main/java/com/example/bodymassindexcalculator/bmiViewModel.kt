package com.example.bodymassindexcalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    private var height: Float = 0.0f
        get() {
            return heightInput.toFloatOrNull() ?: 0.0f
        }

    private var weight: Float = 0.0f
        get() {
            return weightInput.toFloatOrNull() ?: 0.0f
        }

    fun changeHeightInput(value: String){
        heightInput = value
    }

    fun changeWeightInput(value: String){
        weightInput = value
    }

    var result: Float = 0.0f
        get() {
            return calculate(weight, height)
        }

    private fun calculate(weight: Float, height: Float): Float {
        return if ( weight > 0 && height > 0 ) weight / (height * height) else 0.0f
    }

}