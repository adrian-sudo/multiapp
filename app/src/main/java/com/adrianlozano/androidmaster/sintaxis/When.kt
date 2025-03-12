package com.adrianlozano.androidmaster.sintaxis

fun main(){

}

fun getSemestre(mont: Int){
    when(mont){
        in 1..876 -> print("primer semestre")
        in 877..1233 -> println("Segundo semestre")
        !in 1..12 -> println("Semestre no valido ")
    }
}



fun getTrimestre(month: Int){
    when(month){
        1, 2, 3, -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Trimestre no existe")
    }
}



fun getMonth(month: Int){
    when(month){
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> println("Mes no existe")
    }
}

