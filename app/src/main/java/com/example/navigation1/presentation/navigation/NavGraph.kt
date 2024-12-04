package com.example.navigation1.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation1.presentation.ui.screens.Screen1
import com.example.navigation1.presentation.ui.screens.Screen2
import com.example.navigation1.presentation.ui.screens.Screen3

@Composable
fun NavGraph(startDestination: String = Screens.Screen1.route) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screens.Screen1.route) {
            Screen1(navController)
        }
        composable(Screens.Screen2.route) {
            Screen2(navController)
        }
        composable(Screens.Screen3.route) {
            Screen3(navController)
        }
    }
}