package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentXBinding
import com.example.odev4.databinding.FragmentYBinding
import com.google.android.material.snackbar.Snackbar


class YFragment : Fragment() {
    private lateinit var tasarim:FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentYBinding.inflate(inflater, container, false)



            return tasarim.root
    }

}