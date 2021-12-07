package com.minimal.template.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.systemBarsPadding
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.minimal.template.presentation.ui.theme.MinimalTemplateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            MinimalTemplateTheme {
                ProvideWindowInsets {
                    MinimalTemplate()
                }
            }
        }
    }
}

@Composable
fun MinimalTemplate() {
    val systemUiController = rememberSystemUiController()
    val systemUiColor = MaterialTheme.colors.background
    val useDarkIcons = MaterialTheme.colors.isLight

    SideEffect {
        systemUiController.setSystemBarsColor(
            color = systemUiColor,
            darkIcons = useDarkIcons
        )
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            modifier = Modifier
                .systemBarsPadding()
                .fillMaxSize()
        ) {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MinimalTemplateTheme {
        MinimalTemplate()
    }
}