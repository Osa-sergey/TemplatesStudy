package ru.serov.behavioral.observer

interface IObserver {
    fun handleEvent(observable: IObservable)
}