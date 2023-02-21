package dev.iamonuwa.wallet.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.iamonuwa.wallet.ui.ConnectWalletScreen
import dev.iamonuwa.wallet.ui.OverviewScreen
import dev.iamonuwa.wallet.ui.RestoreWalletScreen

@Composable
fun NavGraph(
    navHostController: NavHostController = rememberNavController(),
    startDestination: String = AppNavigations.CONNECT_WALLET,
    modifier: Modifier = Modifier
) {
    NavHost(navController = navHostController, startDestination = startDestination, modifier = modifier) {
        composable(route = AppNavigations.CONNECT_WALLET) {
            ConnectWalletScreen(navController = navHostController)
        }
        composable(route = AppNavigations.RESTORE_WALLET) {
            RestoreWalletScreen(navController = navHostController)
        }
        composable(route = AppNavigations.OVERVIEW_SCREEN) {
            OverviewScreen()
        }
    }
}