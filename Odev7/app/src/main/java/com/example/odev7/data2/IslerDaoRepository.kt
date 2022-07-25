package com.example.odev7.data2

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.odev7.room.IslerDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class IslerDaoRepository(var idao: IslerDao) {
    var islerListesi: MutableLiveData<List<Isler>>

    init {
        islerListesi = MutableLiveData()
    }

    fun isleriGetir(): MutableLiveData<List<Isler>> {
        return islerListesi
    }

    fun tumIsleriAl() {
        val job = CoroutineScope(Dispatchers.Main).launch {
            islerListesi.value = idao.tumIsler()
        }
    }

    fun IsKayit(is_ad: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val yeniIs = Isler(0, is_ad)
            idao.isEkle(yeniIs)
        }
    }

    fun isleriGuncelle(is_id: Int, is_ad: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val guncellenenKisi = Isler(is_id, is_ad)
            idao.ısGuncelle(guncellenenKisi)
        }
    }

    fun isAra(aramaKelimesi: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            islerListesi.value = idao.isArama(aramaKelimesi)
        }
    }

    fun isSil(is_id: Int) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val silinenKisi = Isler(is_id, "")
            idao.isSil(silinenKisi)
            tumIsleriAl()
        }
    }

}