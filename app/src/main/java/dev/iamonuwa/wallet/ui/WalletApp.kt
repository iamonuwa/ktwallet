package dev.iamonuwa.wallet.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dev.iamonuwa.wallet.ui.navigation.NavGraph
import dev.iamonuwa.wallet.ui.theme.WalletTheme

@Composable
fun WalletApp() {
    WalletTheme {
        val systemUiController = rememberSystemUiController()
        SideEffect {
            systemUiController.setSystemBarsColor(Color.Transparent, darkIcons = true)
        }
        val navController = rememberNavController()
        NavGraph(navController)
    }
}

@Preview
@Composable
fun PreviewWalletApp() {
    WalletApp()
}