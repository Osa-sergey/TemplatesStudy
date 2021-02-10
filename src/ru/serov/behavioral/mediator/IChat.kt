package ru.serov.behavioral.mediator

interface IChat {
    fun updateChat(message: String, client: IClient)
}
