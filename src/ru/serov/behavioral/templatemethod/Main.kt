package ru.serov.behavioral.templatemethod

fun main() {
    val buildInfo = SpecifiedInfoClass("Москва, Красная площадь, Грановитая палата",
            "1487—1491",
            Author("Марко", "Фрязин"),
            Author("Пьето Антонио", "Солари")
    )
    println(buildInfo.getInfo())
}