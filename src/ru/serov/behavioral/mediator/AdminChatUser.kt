package ru.serov.behavioral.mediator

class AdminChatUser(firstName: String, secondName: String, chat: IChat): AChatUser(firstName,secondName,chat) {
    override fun displayMessage(message: String) {
        println("Администратор $firstName $secondName получил сообщение: $message")
    }
}