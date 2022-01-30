package com.minimal.template.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.minimal.template.presentation.ui.main.MainScreen

@Composable
fun RootNavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = Destinations.ROUTE_MAIN
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Destinations.ROUTE_MAIN) {
            MainScreen()
        }
    }
}