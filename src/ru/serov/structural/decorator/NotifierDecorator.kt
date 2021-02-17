package ru.serov.structural.decorator

open class NotifierDecorator(private val notification: INotifier): INotifier {
    override fun sendMessage(message: String) {
        notification.sendMessage(message)
    }
}