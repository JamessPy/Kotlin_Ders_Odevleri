package com.example.odev7.viewmodel

import androidx.lifecycle.ViewModel
import com.example.odev7.data2.IslerDaoRepository
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IsKayitFragmentViewModel @Inject constructor(var irepo: IslerDaoRepository) : ViewModel() {
    fun kayit(kisi_ad:String){
        irepo.IsKayit(kisi_ad)
    }
}