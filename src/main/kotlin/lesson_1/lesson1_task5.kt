package org.example.lesson_1

fun main() {
    val totalSeconds = 5409
    val hours = totalSeconds / 60 / 60
    val minutes = totalSeconds / 60 - hours * 60
    val seconds = totalSeconds - (hours * 60 * 60 + minutes * 60)
    print("0$hours:$minutes:0$seconds")

}