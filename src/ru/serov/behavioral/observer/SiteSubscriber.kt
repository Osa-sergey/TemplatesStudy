package ru.serov.behavioral.observer

class SiteSubscriber(private val url: String): IObserver  {

    override fun handleEvent(observable: IObservable) {
        val title = (observable as NewsPublisher).title
        val text = observable.text
        println("Сайт $url опубликовал новость: $title \n $text")
    }
}