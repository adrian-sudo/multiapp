package com.adrianlozano.androidmaster.sintaxis

fun main(){
    var name:String? = "Adrian , colombia"

    println(name?.get(3) ?: "Es nullo ")
}