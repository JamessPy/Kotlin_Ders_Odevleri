package com.example.odev7.room

import androidx.room.*
import com.example.odev7.data2.Isler

@Dao
interface IslerDao {
    @Query("SELECT * FROM test")
    suspend fun tumIsler() : List<Isler>

    @Insert
    suspend fun isEkle(isler: Isler)

    @Update
    suspend fun ısGuncelle(isler: Isler)

    @Delete
    suspend fun isSil(isler: Isler)

    @Query("SELECT * FROM test WHERE yapilacak_id like '%' || :aramaKelimesi || '%'")
    suspend fun isArama(aramaKelimesi:String) : List<Isler>
}