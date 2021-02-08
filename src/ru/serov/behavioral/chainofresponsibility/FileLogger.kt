package ru.serov.behavioral.chainofresponsibility

class FileLogger(priority: Level):ALogger(priority) {
    override fun createMessage(str: String) =  println("Записываем в файл: $str")
}