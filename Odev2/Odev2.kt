package com.example.kotlindersleri.nesnetabanli1

import kotlin.collections.listOf as listOf

class Odev2 {
    fun soru1(derece:Double ): Double{
        return (derece * 1.8) + 32
    }
    fun soru1(derece:Int ): Double{
        return (derece * 1.8) + 32
    }
    fun soru2(en:Int,boy:Int){
        println(en*boy)
    }
    fun soru3(faktoriyel:Int):Int {
        var result = 1
        for (i in 1..faktoriyel){
            result = result * i
        }
        return result
        }
    fun soru4(Kelime:String): ArrayList<Int> {
        val arrayList = ArrayList<String>()
        val harfSayisi = ArrayList<Int>()

        for (i in 0..Kelime.length-1) {
            arrayList.add(i, Kelime[i].toString())
        }
        for (i in 0..arrayList.size-1) {
            var count = 0
            for(j in 0..arrayList.size-1){
                if (arrayList[i] == arrayList[j]){
                    count ++

                }
            }
            harfSayisi.add(i,count)
        }
        return harfSayisi
    }
    fun soru5(kenarSayisi:Int):Int {
        return (kenarSayisi-2) * 180
    }
    fun soru6(gunSayisi:Int):Int{
        val calismaSaati = gunSayisi*8
        var ucret = 0
        for (i in 1..calismaSaati){
            if(i <= 160){
                ucret +=10
        }
            else{
                ucret +=20
            }
        }
        return ucret
    }
    fun soru7(kota:Int):Int{
        var ucret = 100
        if(kota <= 50){
            return ucret
        }

        for (i in 51..kota){
            ucret += 4
        }
        return ucret
    }

}