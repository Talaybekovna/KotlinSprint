package org.example.lesson_4

const val EVEN = true
fun main() {
    val day = 5

    println("""
        Упражнения для рук: ${(day % 2 == 0) != EVEN}
        Упражнения для ног: ${(day % 2 == 0) == EVEN}
        Упражнения для спины: ${(day % 2 == 0) == EVEN}
        Упражнения для пресса: ${(day % 2 == 0) != EVEN}
    """.trimIndent())
}