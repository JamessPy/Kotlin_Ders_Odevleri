package com.example.odev7.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.odev7.R
import com.example.odev7.databinding.FragmentIsKayitBinding
import com.example.odev7.viewmodel.IsKayitFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IsKayitFragment : Fragment() {
    private lateinit var tasarim:FragmentIsKayitBinding
    private lateinit var viewModel:IsKayitFragmentViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_is_kayit, container, false)
        tasarim.isKayitFragment = this
        tasarim.isKayitToolbarBaslik = "İş Kayıt"
        return tasarim.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:IsKayitFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun buttonKaydetTikla(is_ad:String){
        viewModel.kayit(is_ad)
    }
}