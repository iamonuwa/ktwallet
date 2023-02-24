package dev.iamonuwa.wallet

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.iamonuwa.wallet.domain.interfaces.WalletRepository
import dev.iamonuwa.wallet.domain.interfaces.usecases.CreateWalletUseCase
import dev.iamonuwa.wallet.domain.interfaces.usecases.ImportWalletUseCase
import dev.iamonuwa.wallet.domain.repositories.WalletRepositoryImpl
import dev.iamonuwa.wallet.domain.usecase.wallet.CreateWallet
import dev.iamonuwa.wallet.domain.usecase.wallet.ImportWallet
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesWalletRepository(): WalletRepository {
        return WalletRepositoryImpl()
    }

    @Provides
    @Singleton
    fun providesCreateWalletUseCase(walletRepository: WalletRepository): CreateWalletUseCase {
        return CreateWallet(walletRepository)
    }

    @Provides
    @Singleton
    fun providesImportWalletUseCase(walletRepository: WalletRepository): ImportWalletUseCase {
        return ImportWallet(walletRepository)
    }
}