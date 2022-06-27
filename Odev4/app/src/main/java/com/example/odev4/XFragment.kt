package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentBBinding
import com.example.odev4.databinding.FragmentXBinding


class XFragment : Fragment() {
    private lateinit var tasarim:FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentXBinding.inflate(inflater, container, false)
        tasarim.buttonXToY.setOnClickListener() {
            Navigation.findNavController(it,).navigate(R.id.YFragment)
        }

        return tasarim.root
    }
}