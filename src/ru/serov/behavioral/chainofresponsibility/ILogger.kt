package ru.serov.behavioral.chainofresponsibility

interface ILogger {
    fun writeMessage(message: String, level: Level)
}