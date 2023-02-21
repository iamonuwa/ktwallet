package dev.iamonuwa.wallet.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.iamonuwa.wallet.ui.components.AppContainedButton
import dev.iamonuwa.wallet.ui.screens.ui.theme.WalletTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Wallet(navController: NavController) {
    WalletTheme {
        Column(modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp).fillMaxWidth()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "0.00 BTC", fontSize = 30.sp, fontWeight = FontWeight.W600, modifier = Modifier.padding(bottom = 20.dp))
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    AppContainedButton(text = "Buy", onClick = {})
                    AppContainedButton(text = "Send", onClick = {})
                    AppContainedButton(text = "Receive", onClick = {})
                }
            }
            Column(modifier = Modifier.padding(vertical = 30.dp)) {
                Text(text = "Transactions", fontSize = 14.sp, color = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWallet() {
    val navController: NavController = rememberNavController()
    Wallet(navController)
}