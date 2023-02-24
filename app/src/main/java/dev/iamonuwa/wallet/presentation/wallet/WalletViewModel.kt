package dev.iamonuwa.wallet.presentation.wallet

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.iamonuwa.wallet.domain.interfaces.usecases.CreateWalletUseCase
import dev.iamonuwa.wallet.domain.interfaces.usecases.ImportWalletUseCase
import dev.iamonuwa.wallet.domain.models.CreateWalletModel
import dev.iamonuwa.wallet.domain.models.ImportWalletModel
import javax.inject.Inject
import java.lang.Exception

@HiltViewModel
class WalletViewModel @Inject constructor(
    private val createWalletUseCase: CreateWalletUseCase,
    private val  importWalletUseCase: ImportWalletUseCase
    ): ViewModel() {

    private val _password = mutableStateOf("")
    private val _confirmPassword = mutableStateOf("")
    private val _seedPhrase = mutableStateOf("")
    private val _errorMessage = mutableStateOf("")

    val password
        get() = _password.value

    val confirmPassword
        get() = _confirmPassword.value

    val seedPhrase
        get() = _seedPhrase.value

    fun onPasswordInputChange(newPassword: String) {
        _password.value = newPassword
    }

    fun onConfirmPasswordInputChange(newConfirmPassword: String) {
        _confirmPassword.value = newConfirmPassword
    }

    fun onSeedPhraseInputChange(newSeedPhrase: String) {
        _seedPhrase.value = newSeedPhrase
    }

    suspend fun createWallet() {
        try {
            createWalletUseCase.execute(CreateWalletModel(password = password))
        } catch (error: Exception) {
            _errorMessage.value = "Error creating wallet. Reason: ${error.message}"
        }
    }

    suspend fun importWallet() {
        try {
            importWalletUseCase.execute(ImportWalletModel(seedPhrase = seedPhrase))
        } catch (error: Exception) {
            _errorMessage.value = "Error importing wallet. Reason: ${error.message}"
        }
    }
}