package ru.serov.structural.decorator

class Notification(private val i: Int = 1): INotifier {
    override fun sendMessage(message: String) {
        println(message)
    }
}