package ru.serov.behavioral.memento.increasedsafety

interface IOriginator {
    fun getMemento(): IMemento
    fun setState(snapshot: IOriginator)
    fun setContainer(container: Container)
}