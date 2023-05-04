package com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.components.CalculatorBox
import com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.components.Title
import com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.core.CalculatorViewModel

@Composable
fun CalculatorScreen(
    navController: NavController,
    viewModel: CalculatorViewModel = hiltViewModel()
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        //TITLE
        Title("Calculator")
        //CALCULATOR
        CalculatorBox(
            value = viewModel._input_output.value,
            onValueChange = {
                            //should check for syntax errors in box
                            viewModel._input_output.value = it
            },
            onClick = {
                      viewModel.calculate()
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}