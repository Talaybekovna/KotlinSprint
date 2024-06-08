package org.example.lesson_2

fun main() {
    val departureTimeInHours = 9
    val departureTimeInMinutes = 39
    val totalTravelTimeInMinutes = 457

    val travelTimeInHours = totalTravelTimeInMinutes / 60
    val travelTimeInMinutes = totalTravelTimeInMinutes % 60

    val totalArrivalTimeInMinutes =
        (departureTimeInHours + travelTimeInHours) * 60 + (departureTimeInMinutes + travelTimeInMinutes)

    val arrivalTimeInHours = totalArrivalTimeInMinutes / 60
    val arrivalTimeInMinutes = totalArrivalTimeInMinutes % 60

    val arrivalTime = "$arrivalTimeInHours:$arrivalTimeInMinutes"
    println(arrivalTime)
}