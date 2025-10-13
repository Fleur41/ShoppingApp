package com.sam.shoppingapp.shopping.domain.usecase

import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.models.CategoryDataModels
import com.sam.shoppingapp.shopping.domain.repo.AuthRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetCategoryInLimit @Inject constructor(
    private val repo: AuthRepository
) {
    fun getCategoriesInLimited(): Flow<ResultState<List<CategoryDataModels>>> {
        return repo.getCategoriesInLimited()
    }

}