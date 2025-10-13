package com.sam.shoppingapp.shopping.domain.usecase

import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.models.UserDataParent
import com.sam.shoppingapp.shopping.domain.repo.AuthRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class UpdateUserDataUseCase @Inject constructor(
    private val repo: AuthRepository
) {
    fun updateUserData(userDataParent: UserDataParent): Flow<ResultState<String>> {
        return repo.updateUserData(userDataParent)
    }
}