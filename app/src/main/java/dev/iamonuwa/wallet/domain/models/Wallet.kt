package dev.iamonuwa.wallet.domain.models

data class CreateWalletModel(
    val password: String
)

data class ImportWalletModel(
    val seedPhrase: String
)