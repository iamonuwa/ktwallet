package dev.iamonuwa.wallet.domain.repositories

import dev.iamonuwa.wallet.domain.interfaces.WalletRepository
import dev.iamonuwa.wallet.domain.models.CreateWalletModel
import dev.iamonuwa.wallet.domain.models.ImportWalletModel

class WalletRepositoryImpl: WalletRepository {
    override suspend fun createWallet(payload: CreateWalletModel) {
    }

    override suspend fun importWallet(payload: ImportWalletModel) {
    }
}