package com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle

@Composable
fun Title(
    title: String,
    modifier: Modifier = Modifier
){
    Text(
        text = buildAnnotatedString {
            withStyle(
                style = MaterialTheme.typography.h2.toSpanStyle()
            ){
                append(title)
            }
        }
    )
}