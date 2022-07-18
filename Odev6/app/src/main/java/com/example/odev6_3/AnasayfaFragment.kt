package com.example.odev6_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.odev6_3.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        init()
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)
        tasarim.rvHorizontal.layoutManager = LinearLayoutManager(this.requireContext(),LinearLayoutManager.HORIZONTAL, false)
        tasarim.rvHorizontal.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val kiyafetlerListesi = ArrayList<Kiyafetler>()
        val iconListesi = ArrayList<Icons>()

        val k1 = Kiyafetler(1,"Bej Takım","im4",70.0,28)
        val k2 = Kiyafetler(2,"Django","im6",59.8,36)
        val k3 = Kiyafetler(3,"Inception","im1",129.99,11)
        val k4 = Kiyafetler(4,"Inter Stealler","im3",255.0,7)
        val k5 = Kiyafetler(5,"The Hateful Eight","im2",300.75,6)
        val k6 = Kiyafetler(6,"The Pianist","im5",500.40,45)


        kiyafetlerListesi.add(k1)
        kiyafetlerListesi.add(k2)
        kiyafetlerListesi.add(k3)
        kiyafetlerListesi.add(k4)
        kiyafetlerListesi.add(k5)
        kiyafetlerListesi.add(k6)

        val adapter = KiyafetlerAdapter(requireContext(),kiyafetlerListesi)
        tasarim.rv.adapter = adapter

        val i1 = Icons(1,"icon1")
        val i2 = Icons(2,"icon2")
        val i3 = Icons(3,"icon3")
        val i4 = Icons(4,"icon4")
        val i5 = Icons(5,"icon5")
        val i6 = Icons(6,"icon6")

        iconListesi.add(i1)
        iconListesi.add(i2)
        iconListesi.add(i3)
        iconListesi.add(i4)
        iconListesi.add(i5)
        iconListesi.add(i6)

        val adapter2 = IconsAdapter(requireContext(),iconListesi)
        tasarim.rvHorizontal.adapter = adapter2


        return tasarim.root
    }
    private fun init(){
        //rvHorizontal.layoutManager = LinearLayoutManager(this ,rvHorizontal.HORIZONTAL,false)
       // tasarim.rvHorizontal.layoutManager = layout


    }
}