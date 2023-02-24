package dev.iamonuwa.wallet.presentation.wallet


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WalletOverviewScreen() {
    Column(modifier = Modifier
        .padding(vertical = 32.dp)
        .fillMaxSize()) {
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                Text(text = "0ETH", style = MaterialTheme.typography.headlineLarge)
                Text(text = "$0.00", style = MaterialTheme.typography.headlineSmall, color = MaterialTheme.colorScheme.primary)
                Spacer(modifier = Modifier.height(32.dp))
                Row(modifier = Modifier.padding(horizontal = 32.dp)) {
                    Text(text = "0x9b0e2a45276D1A308eEB6473d301E88cb10BB691", overflow = TextOverflow.Visible, style = MaterialTheme.typography.headlineSmall, color = Color.Gray)
                }

                Spacer(modifier = Modifier.height(32.dp))

                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)) {
                    TextButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.QrCodeScanner, contentDescription = "QR Code Scan")
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                        Text(text = "QR CODE")
                    }

                    TextButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.ContentCopy, contentDescription = "QR Code Scan")
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                        Text(text = "COPY")
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row(modifier = Modifier
            .padding(horizontal = 32.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(0.dp)) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "Add Funds", modifier = Modifier.size(ButtonDefaults.IconSize))
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Text("Add")
            }
            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(0.dp)) {
                Icon(imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = "Add Funds", modifier = Modifier.size(ButtonDefaults.IconSize))
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Text("Pay")
            }
            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(0.dp)) {
                Icon(imageVector = Icons.Filled.Send, contentDescription = "Add Funds", modifier = Modifier.size(ButtonDefaults.IconSize))
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Text("Send")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewWalletOverviewScreen() {
    WalletOverviewScreen()
}