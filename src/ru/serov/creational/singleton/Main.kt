package ru.serov.creational.singleton

fun main(){
    /** Является можно сказать антишаблоном
     *  Существуют различные вариации когда в метод getInstance
     *  передаются параметры для специфической конфигурации внутреннего
     *  объекта. Плохо ведет себя в многопоточном использовании
     *
     *  Можно инициализировать как с самого начала так и при первом
     *  обращении (что мы и делаем с помощью by lazy для val переменных)
     */

    val historyList = HistoryList.getInstance()
    historyList.addCommand("Hello")
    historyList.addCommand("World")
    println(historyList)
    val historyList1 = HistoryList.getInstance()
    historyList1.undoCommand()
    println(historyList)
}
