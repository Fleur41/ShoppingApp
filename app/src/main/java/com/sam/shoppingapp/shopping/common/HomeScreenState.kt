package com.sam.shoppingapp.shopping.common

import com.sam.shoppingapp.shopping.domain.models.BannerDataModels
import com.sam.shoppingapp.shopping.domain.models.CategoryDataModels
import com.sam.shoppingapp.shopping.domain.models.ProductDataModels

data class HomeScreenState (
    val isLoading: Boolean = true,
    val errorMessage: String? = null,
    val categories: List<CategoryDataModels>? = null,
    val products: List<ProductDataModels>? = null,
    val banners: List<BannerDataModels>? = null,

)