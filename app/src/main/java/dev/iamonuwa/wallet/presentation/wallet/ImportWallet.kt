package dev.iamonuwa.wallet.presentation.wallet

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.runBlocking


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImportWalletScreen(navController: NavController) {
    val vm: WalletViewModel = hiltViewModel()

    Scaffold(
        topBar = {
        },
        floatingActionButton = {}
    ) { innerPadding ->
        Box(
            Modifier
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vulputate ut pharetra sit amet aliquam id diam.", color= MaterialTheme.colorScheme.outline,  style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Normal)
                Spacer(modifier = Modifier.height(40.dp))
                Row {
                    OutlinedTextField(
                        value = vm.seedPhrase,
                        onValueChange = { value -> vm.onSeedPhraseInputChange(value)},
                        placeholder = { Text("Use spaces between words if you are a using a recovery phrase") },
                        modifier = Modifier.fillMaxWidth(),
                        maxLines = 4,
                        shape = RoundedCornerShape(0.dp)
                    )
                }
            }

            Column(
                Modifier
                    .padding(vertical = 48.dp, horizontal = 16.dp)
                    .fillMaxSize(), verticalArrangement = Arrangement.Bottom
            ) {
                Button(onClick = { runBlocking {
                    vm.importWallet()
                } }, shape = RoundedCornerShape(0.dp), modifier = Modifier.fillMaxWidth()) {
                    Text("Import Wallet")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewImportWalletScreen() {
    val navController = rememberNavController()
    ImportWalletScreen(navController = navController)
}