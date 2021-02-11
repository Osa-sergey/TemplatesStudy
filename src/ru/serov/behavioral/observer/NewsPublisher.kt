package ru.serov.behavioral.observer

import java.util.*

class NewsPublisher(var title:String, var text:String): Observable {

    private val subscribers: LinkedList<Observer> = LinkedList()

    override fun addObserver(observer: Observer) {
        if (!subscribers.contains(observer)) subscribers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        subscribers.remove(observer)
    }

    override fun notifyObservers() {
        subscribers.forEach {it.handleEvent(this)}
    }


}