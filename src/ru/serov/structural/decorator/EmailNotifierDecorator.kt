package ru.serov.structural.decorator

class EmailNotifierDecorator(notification: INotifier): NotifierDecorator(notification) {
    override fun sendMessage(message: String) {
        println("Отправляем по почте оповещение: $message")
        super.sendMessage(message)
    }
}