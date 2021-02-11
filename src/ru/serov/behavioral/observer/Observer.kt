package ru.serov.behavioral.observer

interface Observer {
    fun handleEvent(observable: Observable)
}