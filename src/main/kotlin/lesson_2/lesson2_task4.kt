package org.example.lesson_2

const val PERCENT = 100
fun main() {
    val crystals = 7
    val ironOres = 11
    val baff = 20

    val baffForCrystals = crystals * baff / PERCENT
    val baffForIronOres = ironOres * baff / PERCENT

    println("baffForCrystals: $baffForCrystals")
    println("baffForIronOres: $baffForIronOres")
}