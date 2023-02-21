package dev.iamonuwa.wallet.ui

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.iamonuwa.wallet.ui.navigation.AppNavigations

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConnectWalletScreen(navController: NavController) {
    Scaffold(
        topBar = {},
        floatingActionButton = {},
        content = {innerPadding ->
      Box(
          Modifier
              .padding(innerPadding)) {
              Column(modifier = Modifier.padding(32.dp).fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                  Text("Introducing", fontSize = 32.sp, fontWeight = FontWeight.W600)
                  Text("Balance Wallet", fontSize = 32.sp, fontWeight = FontWeight.W600)
                  Text("Explore all of Web3 in one place on android", fontSize = 18.sp)
              }
              Column(Modifier.padding(vertical = 48.dp, horizontal = 32.dp).fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
                  Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                      Text("Create new wallet")
                  }
                  Button(onClick = { navController.navigate(AppNavigations.RESTORE_WALLET) }, modifier = Modifier.fillMaxWidth()) {
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
    ConnectWalletScreen(navController = navController)
}