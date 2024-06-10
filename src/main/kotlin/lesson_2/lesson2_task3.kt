package org.example.lesson_2

const val TIME_UNITS = 60
fun main() {
    val departureTimeInHours = 9
    val departureTimeInMinutes = 39
    val totalTravelTimeInMinutes = 457

    val travelTimeInHours = totalTravelTimeInMinutes / TIME_UNITS
    val travelTimeInMinutes = totalTravelTimeInMinutes % TIME_UNITS

    val totalArrivalTimeInMinutes =
        (departureTimeInHours + travelTimeInHours) * TIME_UNITS + (departureTimeInMinutes + travelTimeInMinutes)

    val arrivalTimeInHours = totalArrivalTimeInMinutes / TIME_UNITS
    val arrivalTimeInMinutes = totalArrivalTimeInMinutes % TIME_UNITS

    println("$arrivalTimeInHours:$arrivalTimeInMinutes")
}