package com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator

import android.app.Application
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.preciado.simplearithmetic_android.App
import com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.components.CalculatorBox
import com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.components.Title
import com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.core.CalculatorViewModel
import javax.inject.Inject

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
            value = viewModel._input.value,
            onValueChange = {
                            viewModel._input.value = it
            },
            onClick = {

            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}