package com.minimal.template.presentation.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun SystemUi(content: @Composable () -> Unit) {
    val systemUiController = rememberSystemUiController()
    val navigationColor = MaterialTheme.colors.surface.copy(alpha = .5f)
    val useDarkIcons = MaterialTheme.colors.isLight

    SideEffect {
        systemUiController.setStatusBarColor(
            color = Color.Transparent,
            darkIcons = useDarkIcons
        )
        systemUiController.setNavigationBarColor(
            color = navigationColor,
            darkIcons = useDarkIcons
        )
    }

    ProvideWindowInsets(content = content)
}