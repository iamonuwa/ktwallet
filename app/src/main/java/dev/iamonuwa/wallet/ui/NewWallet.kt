package dev.iamonuwa.wallet.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.iamonuwa.wallet.ui.components.AppTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewWalletScreen() {
    Scaffold(
        topBar = {
            AppTopBar(title = "Create Wallet", onBackButtonPressed = {})
        },
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
                    var password by remember { mutableStateOf(TextFieldValue("")) }
                    var confirmPassword by remember { mutableStateOf(TextFieldValue("")) }

                    var seedPhrase by remember {
                        mutableStateOf("")
                    }

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
                                value = password,
                                visualTransformation = PasswordVisualTransformation(),
                                placeholder = { Text("Wallet Password") },
                                modifier = Modifier.fillMaxWidth(),
                                onValueChange = { newPassword -> password = newPassword })
                            Spacer(modifier = Modifier.height(20.dp))
                            OutlinedTextField(
                                value = confirmPassword,
                                visualTransformation = PasswordVisualTransformation(),
                                placeholder = { Text(text = "Confirm Wallet Password") },
                                modifier = Modifier.fillMaxWidth(),
                                onValueChange = { newPasswordConfirmation ->
                                    confirmPassword = newPasswordConfirmation
                                })
                        }
                        if (seedPhrase.isNotEmpty()) {
                            Row(
                                modifier = Modifier
                                    .background(MaterialTheme.colorScheme.secondary)
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = seedPhrase,
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
                        val context = LocalContext.current
                        Button(
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "Wallet has been created successfully",
                                    Toast.LENGTH_LONG
                                ).show()
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
fun PreviewNewWalletScreen() {
    NewWalletScreen()
}