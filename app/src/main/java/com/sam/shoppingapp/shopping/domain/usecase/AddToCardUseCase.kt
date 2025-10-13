package com.sam.shoppingapp.shopping.domain.usecase

import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.models.CartDataModels
import com.sam.shoppingapp.shopping.domain.repo.AuthRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddToCardUseCase @Inject constructor(
    private val repo: AuthRepository
) {
    fun addToCart(cartDataModels: CartDataModels): Flow<ResultState<String>> {
        return repo.addToCart(cartDataModels)
    }

}