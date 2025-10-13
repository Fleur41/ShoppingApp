package com.sam.shoppingapp.shopping.domain.usecase

import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.models.ProductDataModels
import com.sam.shoppingapp.shopping.domain.repo.AuthRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetAllSuggestedProductsUseCase @Inject constructor(
    private val repo: AuthRepository
) {
    fun getAllSuggestedProducts(): Flow<ResultState<List<ProductDataModels>>> {
        return repo.getAllSuggestedProducts()
    }
}