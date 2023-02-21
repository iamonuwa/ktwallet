package dev.iamonuwa.wallet.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import dev.iamonuwa.wallet.ui.components.AppContainedButton
import dev.iamonuwa.wallet.ui.components.AppOutlinedButton
import dev.iamonuwa.wallet.ui.navigation.AppDestinations
import dev.iamonuwa.wallet.ui.screens.ui.theme.WalletTheme

@Composable
fun ConnectWallet(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Balance Android POC")
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            AppContainedButton(
                text = "Connect Wallet",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                onClick = {})
            AppOutlinedButton(
                text = "Restore Wallet",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                onClick = { navController.navigate(AppDestinations.RESTORE_WALLET) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConnectWalletPreview() {
    val navController = rememberNavController()
    ConnectWallet(navController)
}