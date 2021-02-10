package ru.serov.behavioral.memento.increasedsafety

class Container(val originator: IOriginator) {
    private val caretaker: Caretaker = Caretaker()
    init {
        originator.setContainer(this)
    }

    fun saveState() = caretaker.addEntry(originator.getMemento())
    // делегат
    fun undo() = caretaker.undo()
}