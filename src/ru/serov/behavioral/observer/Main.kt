package ru.serov.behavioral.observer

fun main() {
    val publisher = NewsPublisher("Глобальное потепление",
    "В результате глобального потепления в Арктике тают льды.")

    val site = SiteSubscriber("www.geo.ru")
    publisher.addObserver(MagazineSubscriber("Все о природе"))
    publisher.addObserver(site)

    publisher.notifyObservers()

    println("________________________")

    publisher.removeObserver(site)

    publisher.text = "Ученые бросили все силы на поиск решения данной проблемы."

    publisher.notifyObservers()
}