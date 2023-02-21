package dev.iamonuwa.wallet.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable;
import dev.iamonuwa.wallet.ui.screens.ConnectWallet
import dev.iamonuwa.wallet.ui.screens.RestoreWallet
import dev.iamonuwa.wallet.ui.screens.Wallet

@Composable
fun AppNavigationGraph(navController: NavHostController = rememberNavController(), startDestination: String = AppDestinations.CONNECT_WALLET, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = startDestination, modifier = modifier) {
        composable(AppDestinations.CONNECT_WALLET) {
            ConnectWallet(navController = navController)
        }
        composable(AppDestinations.RESTORE_WALLET) {
            RestoreWallet(navController = navController)
        }
        composable(AppDestinations.WALLET) {
            Wallet(navController = navController)
        }
    }
}