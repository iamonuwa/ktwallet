package dev.iamonuwa.wallet.domain.usecase.wallet

import dev.iamonuwa.wallet.domain.interfaces.WalletRepository
import dev.iamonuwa.wallet.domain.interfaces.usecases.CreateWalletUseCase
import dev.iamonuwa.wallet.domain.models.CreateWalletModel

class CreateWallet constructor(private val walletRepository: WalletRepository):
    CreateWalletUseCase {
    override suspend fun execute(payload: CreateWalletModel) {
        return walletRepository.createWallet(payload)
    }
}