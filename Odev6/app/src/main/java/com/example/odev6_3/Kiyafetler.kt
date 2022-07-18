package com.example.odev6_3

import java.io.Serializable

data class Kiyafetler(var id:Int,
                      var dressExp:String,
                      var dressName:String,
                      var dressPrice: Double,
                      var favIconSayisi: Int): Serializable{
}