package com.sam.shoppingapp.shopping.domain.models

data class ProductDataModels(
    val name: String = "",
    val description: String = "",
    val price: String = "",
    val finalPrice: String = "",
    val category: String = "",
    val image: String = "",
    var date: Long = System.currentTimeMillis(),
    var createdBy: String = "",
    var availableUnits: Int = 0,
    var productId: String = "",

)
