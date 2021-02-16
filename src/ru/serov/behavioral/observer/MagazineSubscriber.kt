package ru.serov.behavioral.observer

class MagazineSubscriber(private val name: String): IObserver {
    override fun handleEvent(observable: IObservable) {
        val title = (observable as NewsPublisher).title
        val text = observable.text
        println("Газета $name опубликовала новость: $title \n $text")
    }
}