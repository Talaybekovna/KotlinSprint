package org.example.lesson_4

const val TABLES = 13
fun main() {
    val reservedTablesForToday = TABLES

    val freeTablesForTomorrow = 4
    val reservedTablesForTomorrow = TABLES - freeTablesForTomorrow

    println("Доступность столиков на сегодня: ${reservedTablesForToday < TABLES},\n" +
            "Доступность столиков на завтра: ${reservedTablesForTomorrow < TABLES}")
}