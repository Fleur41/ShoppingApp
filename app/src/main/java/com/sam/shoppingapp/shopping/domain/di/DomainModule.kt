package com.sam.shoppingapp.shopping.domain.di



import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

//    @Singleton
//    @Provides
//    // FIX: The function should provide your AuthRepository interface, not a Firebase internal class.
//    fun provideAuthRepository(
//        firebaseAuth: FirebaseAuth,
//        firebaseDatabase: FirebaseDatabase
//    ): AuthRepository {
//        // FIX: Return an instance of your repository implementation (AuthRepositoryImpl).
//        return AuthRepositoryImpl(firebaseAuth, firebaseDatabase)
//    }
}
