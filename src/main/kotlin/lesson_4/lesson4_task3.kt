package org.example.lesson_4

const val SUNNY = true
const val OPEN_TENT = true
const val AIR_HUMIDITY_20 = 20
const val WINTER = "Зима"
fun main() {
    val sunnyToday = true
    val openTentNow = true
    val airHumidity = 20
    val season = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(sunnyToday == SUNNY) && (openTentNow == OPEN_TENT) && 
                    (airHumidity == AIR_HUMIDITY_20) && (season != WINTER)}")
}