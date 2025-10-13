package com.sam.shoppingapp.shopping.domain.usecase

import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.models.BannerDataModels
import com.sam.shoppingapp.shopping.domain.repo.AuthRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetBannerUseCase @Inject constructor(
    private val repo: AuthRepository
) {
    fun getBanner(): Flow<ResultState<List<BannerDataModels>>> {
        return repo.getBanner()
    }
}


