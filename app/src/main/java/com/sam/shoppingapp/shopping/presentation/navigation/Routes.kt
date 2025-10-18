package com.sam.shoppingapp.shopping.presentation.navigation

import kotlinx.serialization.Serializable

sealed class SubNavigation{
    @Serializable
    object LoginSignUpScreen: SubNavigation()

    @Serializable
    object MainHomeScreen: SubNavigation()

}

sealed class Routes{
    @Serializable
    object LoginScreen: Routes()

    @Serializable
    object SignUpScreen: Routes()

    @Serializable
    object HomeScreen: Routes()

    @Serializable
    object ProfileScreen: Routes()

    @Serializable
    object WishListScreen: Routes()

    @Serializable
    object CartScreen: Routes()

    @Serializable
    data class  CheckOutScreen(val productId: String): Routes()

    @Serializable
    object  PayScreen: Routes()

    @Serializable
    object  SeeAllProductScreen: Routes()

    @Serializable
    data class EachProductDetailScreen(val productId: String): Routes()

    @Serializable
    object AllCategoriesScreen: Routes()

    @Serializable
    data class EachCategoryItemsScreens(val categoryName: String): Routes()

//    @Serializable
//    object  SearchScreen: Routes()


}