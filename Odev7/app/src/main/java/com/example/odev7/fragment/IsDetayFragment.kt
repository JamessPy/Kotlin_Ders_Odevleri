package com.example.odev7.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.odev7.R
import com.example.odev7.databinding.FragmentIsDetayBinding
import com.example.odev7.viewmodel.IsDetayFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IsDetayFragment : Fragment() {

     private lateinit var tasarim:FragmentIsDetayBinding
     private lateinit var viewModel:IsDetayFragmentViewModel
     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_is_detay, container, false)
            tasarim.isDetayFragment = this
            tasarim.isDetayToolbarBaslik = "Is Detay"

            val bundle: IsDetayFragmentArgs by navArgs()
            val gelenIst = bundle.ist
            tasarim.isNesnesi = gelenIst

            return tasarim.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:IsDetayFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun buttonGuncelleTikla(is_id:Int,is_ad:String){
        viewModel.guncelle(is_id,is_ad)
    }



}