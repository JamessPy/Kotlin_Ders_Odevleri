package com.example.odev6_3

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6_3.databinding.CardHorizontalBinding

class IconsAdapter(var mContext: Context, var iconListesi:List<Icons>) :
    RecyclerView.Adapter<IconsAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CardHorizontalBinding) :
        RecyclerView.ViewHolder(tasarim.root) {
        var tasarim: CardHorizontalBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardHorizontalBinding.inflate(layoutInflater, parent, false)

        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val kiyafet = iconListesi.get(position)
        val t = holder.tasarim

        t.imageViewIcon.setImageResource(
            mContext.resources.getIdentifier(
                kiyafet.imageName,
                "drawable",
                mContext.packageName
            )
        )


    }

    override fun getItemCount(): Int {
        return iconListesi.size
    }

}