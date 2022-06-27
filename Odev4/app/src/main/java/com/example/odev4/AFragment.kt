package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentABinding
import com.example.odev4.databinding.FragmentAnaSayfaBinding


class AFragment : Fragment() {
    private lateinit var tasarim:FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentABinding.inflate(inflater, container, false)
        tasarim.buttonAToB.setOnClickListener(){
            Navigation.findNavController(it,).navigate(R.id.BFragment)
        }

        return tasarim.root
    }

}