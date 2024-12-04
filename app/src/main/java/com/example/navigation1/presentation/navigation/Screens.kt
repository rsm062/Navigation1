package com.example.navigation1.presentation.navigation

sealed class Screens (val route: String){
    object Screen1 : Screens("screen1")
    object Screen2 : Screens("screen2")
    object Screen3 : Screens("screen3")
}