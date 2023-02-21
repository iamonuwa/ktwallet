package dev.iamonuwa.wallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.iamonuwa.wallet.ui.WalletApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           WalletApp()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WalletApp()
}