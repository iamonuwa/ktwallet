package dev.iamonuwa.wallet.ui.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object AppDestinations {
    const val CONNECT_WALLET = "CONNECT_WALLET"
    const val RESTORE_WALLET = "RESTORE_WALLET"
    const val WALLET = "WALLET"
    const val SEND_FUNDS = "SEND_FUNDS"
    const val RECEIVE_FUND = "RECEIVE_FUND"
}

class AppNavigation(navController: NavHostController) {
    val navigateToHome: () -> Unit = {
        navController.navigate(AppDestinations.CONNECT_WALLET) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }

            launchSingleTop = true
            restoreState = true
        }
    }
}