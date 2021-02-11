package ru.serov.behavioral.memento.throughinnerclass

import java.util.*

class File(private val game: Game) {
    private var history: LinkedList<Game.GameSave> = LinkedList()

    fun saveState()= history.addFirst(game.save())
    fun undo() {
        if (!history.isEmpty()) game.restore(history.pop())
    }
}