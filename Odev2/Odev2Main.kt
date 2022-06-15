package com.example.kotlindersleri.nesnetabanli1

fun main(){
    var fonk = Odev2()
    println("**************")
    val soru1 = fonk.soru1(50)
    println("Fahrenheit sonucu = $soru1")

    println("**************")
    fonk.soru2(10,5)

    println("**************")
    val soru3 = fonk.soru3(6)
    println("Girilen sayinin faktoriyeli = $soru3")

    println("**************")
    val soru4 = fonk.soru4("Merhaba")
    println("Kelimenin harflerinin tekrarlama sayisi = $soru4")

    println("**************")
    val soru5 = fonk.soru5(4)
    println("Ic acilarinin toplami = $soru5")

    println("**************")
    val soru6 = fonk.soru6(30)
    println("Calisan kisinin alacagi ucret = $soru6")

    println("**************")
    val soru7 = fonk.soru7(55)
    //Soru icerisindeki 50gb ı standart olarak kabul edip min ücreti 100 baz aldım.
    // Çünkü kota aşım ücreti verilmiş sadece standart ücret verilmemiş.
    println("Kullanim ucreti = $soru7")

}