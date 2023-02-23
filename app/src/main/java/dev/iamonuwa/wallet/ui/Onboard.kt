package dev.iamonuwa.wallet.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.iamonuwa.wallet.ui.navigation.AppNavigations


fun createWallet() {

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnboardingScreen(navController: NavController) {
    Scaffold(
        topBar = {},
        floatingActionButton = {},
        content = {innerPadding ->
      Box(
          Modifier
              .padding(innerPadding)) {
              Column(modifier = Modifier.padding(32.dp).fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                  Text("Introducing", style = MaterialTheme.typography.headlineLarge, fontWeight = FontWeight.Bold)
                  Text("Balance Wallet", style = MaterialTheme.typography.headlineLarge, fontWeight = FontWeight.Bold)
                  Text("Crypto made easy", style = MaterialTheme.typography.bodyMedium)
              }
              Column(Modifier.padding(vertical = 48.dp, horizontal = 32.dp).fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
                  Button(onClick = { navController.navigate(AppNavigations.NEW_WALLET) }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(0.dp)) {
                      Text("Create new wallet")
                  }
                  OutlinedButton(onClick = { navController.navigate(AppNavigations.RESTORE_WALLET) }, shape = RoundedCornerShape(0.dp), modifier = Modifier.fillMaxWidth()) {
                      Text("Import existing wallet")
                  }
              }
      }
    })
}

@Preview(showBackground = true)
@Composable
fun PreviewConnectWalletScreen() {
    val navController = rememberNavController()
    OnboardingScreen(navController = navController)
}