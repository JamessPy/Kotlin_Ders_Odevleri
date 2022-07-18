package com.example.odev6_3

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6_3.databinding.CardVerticalBinding
import com.google.android.material.snackbar.Snackbar


class KiyafetlerAdapter(var mContext: Context, var kiyafetlerListesi:List<Kiyafetler>) :
    RecyclerView.Adapter<KiyafetlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CardVerticalBinding) :
            RecyclerView.ViewHolder(tasarim.root) {
            var tasarim: CardVerticalBinding

            init {
                this.tasarim = tasarim
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
            val layoutInflater = LayoutInflater.from(mContext)
            val tasarim = CardVerticalBinding.inflate(layoutInflater, parent, false)

            return CardTasarimTutucu(tasarim)
        }

        override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

            val kiyafet = kiyafetlerListesi.get(position)
            val t = holder.tasarim

            t.imageViewKiyafetIsim.setImageResource(
                mContext.resources.getIdentifier(
                    kiyafet.dressName,
                    "drawable",
                    mContext.packageName
                )
            )
            t.imageAciklama.text = kiyafet.dressExp
            t.imageFiyat.text = "${kiyafet.dressPrice} TL"
            t.favCount.text = "${kiyafet.favIconSayisi}"


        }

    override fun getItemCount(): Int {
       return kiyafetlerListesi.size
    }

}