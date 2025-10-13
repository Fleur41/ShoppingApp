package com.sam.shoppingapp.shopping.domain.usecase

import android.net.Uri
import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.repo.AuthRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class UserProfileImageUseCase @Inject constructor(
    private val repo: AuthRepository
) {
    fun userProfileImage(uri: Uri): Flow<ResultState<String>> {
        return repo.userProfileImage(uri)
    }
}