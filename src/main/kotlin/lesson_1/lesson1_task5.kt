package org.example.lesson_1

const val TIME_UNITS = 60
fun main() {
    val totalSeconds = 5409
    val hours = totalSeconds / TIME_UNITS / TIME_UNITS
    val minutes = totalSeconds / TIME_UNITS - hours * TIME_UNITS
    val seconds = totalSeconds - (hours * TIME_UNITS * TIME_UNITS + minutes * TIME_UNITS)
    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)
    print("$formattedHours:$formattedMinutes:$formattedSeconds")
}