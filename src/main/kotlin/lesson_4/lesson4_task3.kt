package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY_20 = 20
const val WINTER = "Зима"
fun main() {
    val isSunnyToday = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(isSunnyToday == IS_SUNNY) && (isAwningOpen == IS_AWNING_OPEN) && 
                    (airHumidity == AIR_HUMIDITY_20) && (season != WINTER)}")
}