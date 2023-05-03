package com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorBox(
    value: String,
    onValueChange: (String)->Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier.fillMaxSize()){
        Row(
            modifier = modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = modifier.fillMaxHeight().weight(3f).background(MaterialTheme.colors.background),
                contentAlignment = Alignment.Center
            ){
                TextField(
                    value = value,
                    onValueChange = onValueChange,
                    modifier = modifier
                        .background(MaterialTheme.colors.background),
                    textStyle = TextStyle(
                        fontSize = 70.sp,
                        textAlign = TextAlign.End
                    )
                )
            }

            Button(
                onClick = onClick,
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Text(text = "=")
            }
        }
    }
}