package com.adrianlozano.androidmaster.sintaxis

fun main(){
    var name:String = "Adrian"
    var name1: String = "Felipe"
    var name2 : String = "Rodriguez"


    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado","Domingo")
    
    println(weekDays.size)


    if(weekDays.size > 8){
        println(weekDays[7])
    }else{
        println("No hay valores en el arrays")
    }
}