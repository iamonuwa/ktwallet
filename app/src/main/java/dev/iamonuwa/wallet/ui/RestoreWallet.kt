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
import dev.iamonuwa.wallet.ui.components.AppTopBar
import dev.iamonuwa.wallet.ui.navigation.AppNavigations

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestoreWalletScreen(navController: NavController) {
    var seedPhrase by remember { mutableStateOf(TextFieldValue("")) }

    Scaffold(
        topBar = {
            AppTopBar(title = "Import Wallet", onBackButtonPressed = {})
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
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vulputate ut pharetra sit amet aliquam id diam.", color=MaterialTheme.colorScheme.outline,  style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Normal)
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
                    .padding(vertical = 48.dp, horizontal = 16.dp)
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