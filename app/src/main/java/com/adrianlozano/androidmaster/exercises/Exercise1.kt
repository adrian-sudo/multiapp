package com.adrianlozano.androidmaster.exercises

import androidx.core.app.NotificationCompat.MessagingStyle.Message

/***
 * Ejercicio de google para Android de notificaciones
 */

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

//    printlnNotificationSummary(morningNotification)
    printlnNotificationSummary(eveningNotification)
}

fun printlnNotificationSummary(numberOfMessage: Int){
    // codigo..
    if(numberOfMessage > 99 ){
        println("Your phone is blowing up! you have 99+ notificacions.")
    }else{
        println("You have $numberOfMessage notificaciones.")
    }
}