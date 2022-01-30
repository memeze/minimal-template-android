package com.minimal.template.presentation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.minimal.template.presentation.ui.navigation.Destinations
import com.minimal.template.presentation.ui.navigation.RootNavGraph

@Composable
fun MinimalTemplateApp() {
    SystemUi {
        val navController = rememberNavController()
        val startDestination = Destinations.ROUTE_MAIN

        RootNavGraph(
            navController = navController,
            startDestination = startDestination
        )
    }
}