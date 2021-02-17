package ru.serov.structural.decorator

class PhoneNotifierDecorator(notification: INotifier): NotifierDecorator(notification) {
    override fun sendMessage(message: String) {
        println("Отправляем по телефону оповещение: $message")
        super.sendMessage(message)
    }
}