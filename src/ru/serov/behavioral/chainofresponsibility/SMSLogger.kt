package ru.serov.behavioral.chainofresponsibility

class SMSLogger(priority: Level): ALogger(priority) {
    override fun createMessage(str: String) =  println("СМС: $str")
}