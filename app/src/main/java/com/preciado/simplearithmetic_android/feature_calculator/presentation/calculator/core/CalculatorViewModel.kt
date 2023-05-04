package com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.core

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.preciado.simplearithmetic_android.feature_calculator.domain.model.Calculator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CalculatorViewModel @Inject constructor(
    private val calculator: Calculator
) : ViewModel() {
    public var _input_output = mutableStateOf("")
    init {
        _input_output.value = calculator.calculate("")
    }

    fun calculate(): String{
        return calculator.calculate(_input_output.value)
    }
}