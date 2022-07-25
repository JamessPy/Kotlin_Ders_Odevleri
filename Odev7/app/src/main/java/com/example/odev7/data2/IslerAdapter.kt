package com.example.odev7.data2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.odev7.R
import com.example.odev7.databinding.CardTasarimBinding
import com.example.odev7.extension.gecisYap
import com.example.odev7.fragment.AnasayfaFragmentDirections
import com.example.odev7.viewmodel.AnasayfaFragmentViewModel
import com.google.android.material.snackbar.Snackbar

class IslerAdapter (var mContext:Context,
                    var islerListesi:List<Isler>,
                    var viewModel:AnasayfaFragmentViewModel)
    : RecyclerView.Adapter<IslerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root) {
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim//Shadowing
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim:CardTasarimBinding = DataBindingUtil.inflate(layoutInflater,R.layout.card_tasarim, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val ist = islerListesi.get(position)
        val t = holder.tasarim
        t.isNesnesi = ist

        t.imageViewSilResim.setOnClickListener {
            Snackbar.make(it,"${ist.yapilacak_is} silinsin mi?",Snackbar.LENGTH_LONG)
                .setAction("EVET"){
                    viewModel.sil(ist.yapilacak_id)
                }.show()
        }

        t.satirCard.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.isDetayGecis(ist   = ist)
            Navigation.gecisYap(it,gecis)
        }
    }

    override fun getItemCount(): Int {
        return islerListesi.size
    }
}