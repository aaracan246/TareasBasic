package com.example.tareasbasic.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.TareasBasic.navigation.AppScreen
import com.example.tareasbasic.screens.FirstScreen
import com.example.tareasbasic.screens.SecondScreen

@Composable
fun AppNavigation(){

    val navControlador = rememberNavController()
    NavHost(navController = navControlador, startDestination = AppScreen.FirstScreen.route){

        composable(AppScreen.FirstScreen.route){
            FirstScreen(navControlador)
        }

        composable(AppScreen.SecondScreen.route + "/" + "{text}",
            arguments = listOf(navArgument(name = "text"){ type = NavType.StringType })){
            SecondScreen(navControlador, it.arguments?.getString("text"))
        }
    }
}