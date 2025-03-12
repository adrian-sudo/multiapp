package com.adrianlozano.androidmaster.sintaxis

fun main(){
    mutableList()
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(0,"dayAdrian")
    println(weekDays)

    if(weekDays.isEmpty()){
        //No hay nada
    }else{
        weekDays.forEach { println(it)}
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it)}
    }

    weekDays.last()
}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly.toString())
    println(readOnly[0])
    println(readOnly.last())


    //FILTRAR
    val  example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach{ weekDay ->   println(weekDay) }
}
