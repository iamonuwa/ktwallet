package dev.iamonuwa.wallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.iamonuwa.wallet.presentation.onboard.OnboardScreen
import dev.iamonuwa.wallet.presentation.wallet.CreateWalletScreen
import dev.iamonuwa.wallet.presentation.wallet.ImportWalletScreen
import dev.iamonuwa.wallet.presentation.wallet.WalletOverviewScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Router(navHostController = navController)
        }
    }
}


//@todo(Isaac) refactor this
object AppRoutes {
    const val ONBOARD = "Onboard"
    const val IMPORT_WALLET = "ImportWallet"
    const val WALLET_OVERVIEW = "WalletOverview"
    const val CREATE_WALLET = "CreateWallet"
}
@Composable
fun Router(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = AppRoutes.ONBOARD) {
        composable(route = AppRoutes.ONBOARD) {
            OnboardScreen(navController = navHostController)
        }
        composable(route = AppRoutes.IMPORT_WALLET) {
            ImportWalletScreen(navController = navHostController)
        }
        composable(route = AppRoutes.WALLET_OVERVIEW) {
            WalletOverviewScreen()
        }
        composable(route = AppRoutes.CREATE_WALLET) {
            CreateWalletScreen()
        }
    }
}