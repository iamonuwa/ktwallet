package dev.iamonuwa.wallet.domain.usecase.wallet

import dev.iamonuwa.wallet.domain.interfaces.WalletRepository
import dev.iamonuwa.wallet.domain.interfaces.usecases.ImportWalletUseCase
import dev.iamonuwa.wallet.domain.models.ImportWalletModel

class ImportWallet constructor(private val walletRepository: WalletRepository): ImportWalletUseCase {
    override suspend fun execute(payload: ImportWalletModel) {
        return walletRepository.importWallet(payload)
    }
}