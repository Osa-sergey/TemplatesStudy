package ru.serov.behavioral.mediator

interface IClient {
    fun sendMessage(message: String)
    fun displayMessage(message: String)
}
