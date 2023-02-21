package dev.iamonuwa.wallet.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import dev.iamonuwa.wallet.ui.screens.ui.theme.WalletTheme

@Composable
fun RestoreWallet(navController: NavController) {
    WalletTheme {
        Text("Restore Wallet")
    }
}