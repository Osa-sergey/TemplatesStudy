package ru.serov.behavioral.mediator

class SimpleChatUser(firstName: String, secondName: String,chat: IChat): AChatUser(firstName,secondName,chat) {

    override fun displayMessage(message: String) {
        println("Пользователь $firstName $secondName получил сообщение: $message")
    }
}