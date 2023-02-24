package dev.iamonuwa.wallet.domain.interfaces.usecases

import dev.iamonuwa.wallet.domain.models.ImportWalletModel

interface ImportWalletUseCase {
    suspend fun execute(payload: ImportWalletModel)

}