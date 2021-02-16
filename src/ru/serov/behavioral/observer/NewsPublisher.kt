package ru.serov.behavioral.observer

import java.util.*

class NewsPublisher(var title:String, var text:String): IObservable {

    private val subscribers: LinkedList<IObserver> = LinkedList()

    override fun addObserver(observer: IObserver) {
        if (!subscribers.contains(observer)) subscribers.add(observer)
    }

    override fun removeObserver(observer: IObserver) {
        subscribers.remove(observer)
    }

    override fun notifyObservers() {
        subscribers.forEach {it.handleEvent(this)}
    }


}