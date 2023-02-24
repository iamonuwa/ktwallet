package dev.iamonuwa.wallet.domain.interfaces.usecases

import dev.iamonuwa.wallet.domain.models.CreateWalletModel

interface CreateWalletUseCase {
    suspend fun execute(payload: CreateWalletModel)
}