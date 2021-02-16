package ru.serov.behavioral.observer

interface IObservable {
    fun addObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObservers()
}