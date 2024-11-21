package com.example.tareasbasic.navigation

sealed class AppScreen(val route: String) {
    data object FirstScreen: AppScreen("FirstScreen")
    data object SecondScreen: AppScreen("SecondScreen")
}