package ru.serov.behavioral.memento.throughinnerclass

fun main() {
    val game = Game()
    val file = File(game)
    println(game)
    file.saveState()
    game.time = 1000
    println(game)
    file.undo()
    println(game)
}