package dev.iamonuwa.wallet.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.W300
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.font.FontWeight.Companion.W800
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OverviewScreen() {
    Column(modifier = Modifier
        .padding(vertical = 32.dp)
        .fillMaxSize()) {
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                Text(text = "0ETH", fontSize = 24.sp, fontWeight = W500)
                Text(text = "$0.00", fontSize = 24.sp, fontWeight = W500, color = MaterialTheme.colorScheme.primary)

                Row(Modifier.padding(24.dp)) {
                    Text(text = "0x9b0e2a45276D1A308eEB6473d301E88cb10BB691", overflow = TextOverflow.Visible, fontSize = 28.sp, fontWeight = W400, color = Color.Gray)
                }

                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "QR CODE")
                    }

                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "COPY")
                    }
                }
            }
        }
        Column(modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(0.dp)) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "Add Funds", modifier = Modifier.size(ButtonDefaults.IconSize))
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Text("Add")
            }
            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(0.dp)) {
                Icon(imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = "Add Funds", modifier = Modifier.size(ButtonDefaults.IconSize))
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Text("Pay")
            }
            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(0.dp)) {
                Icon(imageVector = Icons.Filled.Send, contentDescription = "Add Funds", modifier = Modifier.size(ButtonDefaults.IconSize))
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Text("Out")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewOverviewScreen() {
    OverviewScreen()
}