package ru.serov.behavioral.memento.increasedsafety

import java.util.*

class Caretaker() {
    private val history: LinkedList<IMemento> = LinkedList()

    fun addEntry(entry: IMemento) = history.addFirst(entry)
    fun undo() {
        if (!history.isEmpty()) history.pop().restore()
    }

}