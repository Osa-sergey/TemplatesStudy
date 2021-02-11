package ru.serov.behavioral.observer

class SiteSubscriber(private val url: String): Observer  {

    override fun handleEvent(observable: Observable) {
        val title = (observable as NewsPublisher).title
        val text = observable.text
        println("Сайт $url опубликовал новость: $title \n $text")
    }
}