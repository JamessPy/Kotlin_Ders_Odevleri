package com.example.kisileruygulamasi.di

import android.content.Context
import androidx.room.Room
import com.example.odev7.data2.IslerDaoRepository
import com.example.odev7.room.IslerDao
import com.example.odev7.room.Veritabani
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideIslerDaoRepository(idao:IslerDao) : IslerDaoRepository {
        return IslerDaoRepository(idao)
    }
    @Provides
    @Singleton
    fun provideIslerDao(@ApplicationContext context: Context) : IslerDao {
        val vt = Room.databaseBuilder(context,Veritabani::class.java,"rehber.sqlite")
            .createFromAsset("rehber.sqlite").build()
        return  vt.getIslerDao()
    }

}