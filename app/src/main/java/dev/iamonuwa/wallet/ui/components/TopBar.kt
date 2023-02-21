package dev.iamonuwa.wallet.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dev.iamonuwa.wallet.ui.screens.ui.theme.WalletTheme


@OptIn(ExperimentalMaterial3Api::class)
val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

@Composable
fun TopBar(title: String, actions: @Composable RowScope.() -> Unit? = {}, onBackButtonPressed: (() -> Unit)? = null) {
            MediumTopAppBar(title = {
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyMedium.copy(fontSize = 20.sp),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }, navigationIcon = {
                if (onBackButtonPressed != null) {
                    TopBarIcon(onIconPressed = onBackButtonPressed)
                } else {
                    null
                }
            }, actions = {
                actions.invoke(this)
            }, scrollBehavior = scrollBehavior
            )
}

@Composable
private fun TopBarIcon(onIconPressed: () -> Unit) {
    IconButton(onClick = onIconPressed) {
        Icon(Icons.Filled.ArrowBack, null)
    }
}

@Preview
@Composable
fun TopBarPreview() {
    WalletTheme {
        TopBar(title="Restore Wallet", onBackButtonPressed = {})
    }
}