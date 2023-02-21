package dev.iamonuwa.wallet.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable

import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dev.iamonuwa.wallet.ui.navigation.AppNavigationGraph
import dev.iamonuwa.wallet.ui.screens.ui.theme.WalletTheme

@Composable
fun WalletApp() {
    WalletTheme() {
        val systemUiController = rememberSystemUiController()
        val useDarkIcons = !isSystemInDarkTheme()

        SideEffect {
            systemUiController.setSystemBarsColor(Color.Transparent, darkIcons = useDarkIcons)
        }
        val navController = rememberNavController()
        AppNavigationGraph(navController)
    }
}