package com.preciado.simplearithmetic_android.feature_calculator.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.preciado.simplearithmetic_android.feature_calculator.presentation.calculator.CalculatorScreen
import com.preciado.simplearithmetic_android.ui.theme.SimpleArithmetic_AndroidTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity(

) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleArithmetic_AndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "calculator"){
                        composable("calculator"){
                            CalculatorScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun HomeScreen(
    navController: NavController
){
    Text(text = "Home Screen")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SimpleArithmetic_AndroidTheme {
    }
}