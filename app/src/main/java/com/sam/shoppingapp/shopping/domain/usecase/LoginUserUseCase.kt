package com.sam.shoppingapp.shopping.domain.usecase

import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.models.UserData
import com.sam.shoppingapp.shopping.domain.repo.AuthRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class LoginUserUseCase @Inject constructor(
    private val repo: AuthRepository
) {
    fun loginUser(userData: UserData): Flow<ResultState<String>> {
        return repo.loginUserWithEmailAndPassword(userData)
    }
}