package dev.iamonuwa.wallet.presentation.wallet


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateWalletScreen() {
    val vm: WalletViewModel = hiltViewModel()
    Scaffold(
        topBar = {},
        content = { innerPadding ->
            Box(
                Modifier
                    .padding(innerPadding)
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {

                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vulputate ut pharetra sit amet aliquam id diam.",
                            color = MaterialTheme.colorScheme.outline,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Normal
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            OutlinedTextField(
                                value = vm.password,
                                visualTransformation = PasswordVisualTransformation(),
                                placeholder = { Text("Wallet Password") },
                                modifier = Modifier.fillMaxWidth(),
                                onValueChange = { value -> vm.onPasswordInputChange(value) })
                            Spacer(modifier = Modifier.height(20.dp))
                            OutlinedTextField(
                                value = vm.confirmPassword,
                                visualTransformation = PasswordVisualTransformation(),
                                placeholder = { Text(text = "Confirm Wallet Password") },
                                modifier = Modifier.fillMaxWidth(),
                                onValueChange = { value -> vm.onConfirmPasswordInputChange(value) })
                        }
                        if (vm.seedPhrase.isNotEmpty()) {
                            Row(
                                modifier = Modifier
                                    .background(MaterialTheme.colorScheme.secondary)
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = vm.seedPhrase,
                                    style = MaterialTheme.typography.titleSmall,
                                    modifier = Modifier.padding(
                                        vertical = 12.dp,
                                        horizontal = 12.dp
                                    ),
                                    color = MaterialTheme.colorScheme.onTertiary
                                )
                            }
                            TextButton(onClick = {}) {
                                Text("Copy to clipboard")
                            }
                        }
                    }
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Button(
                            onClick = {
                                runBlocking {
                                    vm.createWallet()
                                }
                            }, shape = Shapes.None, modifier = Modifier
                                .height(48.dp)
                                .fillMaxWidth()
                        ) {
                            Text(text = "Create Wallet")
                        }
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewCreateWalletScreen() {
    CreateWalletScreen()
}