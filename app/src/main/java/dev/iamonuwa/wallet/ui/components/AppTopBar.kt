package dev.iamonuwa.wallet.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import dev.iamonuwa.wallet.R

@Composable
fun AppTopBar(
    title: String,
    actions: @Composable RowScope.() -> Unit? = {},
    onBackButtonPressed: (() -> Unit)? = null
) {
    MediumTopAppBar(title = {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineLarge,
            maxLines = 1, overflow = TextOverflow.Ellipsis
        )
                            },
        actions = {
            actions.invoke(this)
                  }, navigationIcon = {
                      if (onBackButtonPressed != null) {
                          NavigationIcon {
                              onBackButtonPressed
                          }
                      }
                  }
    )
}

@Composable
private fun NavigationIcon(onNavigationIconClicked: () -> Unit) {
    IconButton(onClick = { onNavigationIconClicked() }) {
        Icon(
            painter = painterResource(
                id = R.drawable.ic_baseline_arrow_back_24
            ),
            contentDescription = stringResource(
                id = R.string.back_arrow
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppTopBar() {
    AppTopBar(title = "Create Wallet")
}