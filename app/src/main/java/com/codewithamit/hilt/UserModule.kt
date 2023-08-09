package com.codewithamit.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @FirebaseQualifier
    fun providesFirebaseRepository() : UserRepository {
        return FirebaseRepository()
    }

    @Provides
    @SQLQualifier
    fun providesSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }
}