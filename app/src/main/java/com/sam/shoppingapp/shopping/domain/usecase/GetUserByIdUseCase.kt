package com.sam.shoppingapp.shopping.domain.usecase

import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.models.UserDataParent
import com.sam.shoppingapp.shopping.domain.repo.AuthRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

//Aliweka GetUserUseCase
class GetUserByIdUseCase @Inject constructor(
    private val repo: AuthRepository
)  {
    fun getUserById(uid: String): Flow<ResultState<UserDataParent>> {
        return repo.getUserById(uid)
    }
}