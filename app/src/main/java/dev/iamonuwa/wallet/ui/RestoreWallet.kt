package dev.iamonuwa.wallet.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.iamonuwa.wallet.ui.navigation.AppNavigations

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestoreWalletScreen(navController: NavController) {
    var seedPhrase by remember { mutableStateOf(TextFieldValue("")) }

    Scaffold(
        topBar = {},
        floatingActionButton = {}
    ) { innerPadding ->
        Box(
            Modifier
                .padding(innerPadding)
        ) {
            Column(
                horizontalAlignment=Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(32.dp)
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Text("Import existing Wallet", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                Text("magna fringilla urna porttitor rhoncus dolor purus non enim praesent elementum facilisis leo vel fringilla est.", fontWeight = FontWeight.W300)
                Spacer(modifier = Modifier.height(40.dp))
                Row {
                    OutlinedTextField(
                        value = seedPhrase,
                        onValueChange = { newText ->
                            seedPhrase = newText
                        },
                        placeholder = { Text("Use spaces between words if you are a using a recovery phrase") },
                        modifier = Modifier.fillMaxWidth(),
                        maxLines = 4,
                        shape = RoundedCornerShape(0.dp)
                    )
                }
            }

            Column(
                Modifier
                    .padding(vertical = 48.dp, horizontal = 32.dp)
                    .fillMaxSize(), verticalArrangement = Arrangement.Bottom
            ) {
                Button(onClick = { navController.navigate(AppNavigations.OVERVIEW_SCREEN) }, shape = RoundedCornerShape(0.dp), modifier = Modifier.fillMaxWidth()) {
                    Text("Import Wallet")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRestoreWalletScreen() {
    val navController = rememberNavController()
    RestoreWalletScreen(navController = navController)
}