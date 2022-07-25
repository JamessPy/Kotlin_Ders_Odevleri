package com.example.odev7.viewmodel

import androidx.lifecycle.ViewModel
import com.example.odev7.data2.IslerDaoRepository
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IsDetayFragmentViewModel @Inject constructor(var irepo: IslerDaoRepository) : ViewModel() {
    fun guncelle(is_id:Int,is_ad:String){
        irepo.isleriGuncelle(is_id,is_ad)
    }
}