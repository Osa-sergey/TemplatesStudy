package ru.serov.behavioral.memento.increasedsafety

open class Memento(private val originator: IOriginator, private val snapshot: IOriginator): IMemento {
    override fun restore() = originator.setState(snapshot)
}