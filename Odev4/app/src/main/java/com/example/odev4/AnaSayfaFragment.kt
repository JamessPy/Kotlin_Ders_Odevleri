package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.buttonAnasayfaToA.setOnClickListener{
            Navigation.findNavController(it,).navigate(R.id.AFragment)
        }
        tasarim.buttonAnasayfaToB.setOnClickListener{
            Navigation.findNavController(it,).navigate(R.id.XFragment)
        }

        return tasarim.root
    }


}