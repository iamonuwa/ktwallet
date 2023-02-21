package dev.iamonuwa.wallet.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.W300
import androidx.compose.ui.text.font.FontWeight.Companion.W800
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OverviewScreen() {
    Column(modifier = Modifier
        .padding(vertical = 32.dp, horizontal = 16.dp)
        .fillMaxSize()) {
        Row(modifier = Modifier
            .height(96.dp)
            .fillMaxHeight(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text(text = "$0.00", fontSize = 32.sp, fontWeight = W800)
        }
        Row(modifier = Modifier.padding(top = 20.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = { /*TODO*/ }) {
                Text("Buy")
            }
            Button(onClick = { /*TODO*/ }) {
                Text("Send")
            }
            Button(onClick = { /*TODO*/ }) {
                Text("Receive")
            }
            Button(onClick = { /*TODO*/ }) {
                Text("Receive")
            }
        }
        
        Column {
            Text(text = "Assets", fontWeight = W300)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewOverviewScreen() {
    OverviewScreen()
}