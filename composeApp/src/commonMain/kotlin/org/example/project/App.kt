package org.example.project

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import org.example.project.di.initializeKoin
import org.example.project.presentation.screen.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    initializeKoin()
    MaterialTheme {
        Navigator(HomeScreen())
    }
}