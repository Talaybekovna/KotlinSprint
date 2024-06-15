package org.example.lesson_4

fun main() {
    val day = 5

    val isEven = day % 2 == 0

    val handsExercises = !isEven
    val legsExercises = isEven
    val backExercises = isEven
    val absExercises = !isEven

    println("""
        Упражнения для рук:    $handsExercises
        Упражнения для ног:    $legsExercises
        Упражнения для спины:  $backExercises
        Упражнения для пресса: $absExercises
    """.trimIndent())
}