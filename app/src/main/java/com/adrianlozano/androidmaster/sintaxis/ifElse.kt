package com.adrianlozano.androidmaster.sintaxis

fun main(){
    ifInt()
}

fun ifInt(){
    var age = 29

    if(age > 18){
        println("Beber Cerveza")
    }else{
    println("Beber jugo")
    }
}

fun ifBoolean(){
    var  soyFeliz:Boolean = false


    //sin nada == true
    // con ! al principio == false
    if(!soyFeliz){
    println("Estoy triste")
    }
}

fun ifAnidado(){
    val animal = "Aris"

    if (animal == "dog"){
        println("Es un perro")
    }else if (animal == "cat"){
        println("Es un gato")
    }else if (animal == "bird"){
        println("Es un pajaro")
    }else{
        println("No es uno de los animales esperado en la lista")
    }
}

fun  ifBasico(){
    val name = "Pepe"

    if(name == "Adrian" ){
        println("Oye, la variable name es Adrian")
    }else {
        println("Este no es Adrian")
    }
}
