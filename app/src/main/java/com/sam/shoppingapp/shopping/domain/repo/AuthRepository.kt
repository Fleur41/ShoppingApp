package com.sam.shoppingapp.shopping.domain.repo

import android.net.Uri
import com.sam.shoppingapp.shopping.common.ResultState
import com.sam.shoppingapp.shopping.domain.models.BannerDataModels
import com.sam.shoppingapp.shopping.domain.models.CartDataModels
import com.sam.shoppingapp.shopping.domain.models.CategoryDataModels
import com.sam.shoppingapp.shopping.domain.models.ProductDataModels
import com.sam.shoppingapp.shopping.domain.models.UserData
import com.sam.shoppingapp.shopping.domain.models.UserDataParent
import kotlinx.coroutines.flow.Flow



interface AuthRepository {
    //Make sure to add this to Ayaana app
    fun registerUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun loginUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun getUserById(uid: String): Flow<ResultState<UserDataParent>>
    fun updateUserData(userDataParent: UserDataParent): Flow<ResultState<String>>
    fun userProfileImage(uri: Uri): Flow<ResultState<String>>
    fun getCategoriesInLimited(): Flow<ResultState<List<CategoryDataModels>>>
    fun getProductsInLimited(): Flow<ResultState<List<ProductDataModels>>>
    fun getAllProducts(): Flow<ResultState<List<ProductDataModels>>>
    fun getProductById(productId: String): Flow<ResultState<List<ProductDataModels>>>
    fun addToCart(cartDataModels: CartDataModels): Flow<ResultState<String>>
    fun addToFav(productDataModels: ProductDataModels): Flow<ResultState<String>>
    fun getAllFav(): Flow<ResultState<List<ProductDataModels>>>
    fun getCart(): Flow<ResultState<List<ProductDataModels>>>
    fun getAllCategories(): Flow<ResultState<List<CategoryDataModels>>>
    fun getCheckOut(productId: String): Flow<ResultState<List<ProductDataModels>>>
    fun getBanner(): Flow<ResultState<List<BannerDataModels>>>
    fun getSpecificItems(categoryName: String): Flow<ResultState<List<ProductDataModels>>>
    fun getAllSuggestedProducts(): Flow<ResultState<List<ProductDataModels>>>
}

