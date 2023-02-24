package dev.iamonuwa.wallet.domain.interfaces

import dev.iamonuwa.wallet.domain.models.CreateWalletModel
import dev.iamonuwa.wallet.domain.models.ImportWalletModel

interface WalletRepository {
    suspend fun createWallet(payload: CreateWalletModel)
    suspend fun importWallet(payload: ImportWalletModel)
}