package com.example.lyricsfinder.di

import com.example.lyricsfinder.common.Constants
import com.example.lyricsfinder.data.remote.GeniusSongApi
import com.example.lyricsfinder.data.repository.SongRepositoryImpl
import com.example.lyricsfinder.domain.repository.SongRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideGeniusSongApi(): GeniusSongApi = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create()

    @Provides
    @Singleton
    fun provideSongRepository(api: GeniusSongApi): SongRepository = SongRepositoryImpl(api)
}