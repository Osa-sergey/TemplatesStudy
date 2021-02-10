package ru.serov.behavioral.mediator

fun main() {
    /** Данный шаблон позволяет вынести сложную логику
     *  взаимодействия объектов между собой в отдельный класс,
     *  что позволит сделать переиспользуемым эти объекты.
     *  Также это позволяет сделать единое централизованное управление
     *  объектами. В другом варианте данный шаблон используется
     *  для broadcast оповещений.
     */

    val chat = ConcreteChat()
    val client1 = AdminChatUser("Дмитрий", "Никулин", chat)
    val client2 = SimpleChatUser("Сергей", "Андронов", chat)
    val client3 = SimpleChatUser("Андрей", "Куров", chat)

    client2.mute = true
    client3.status = State.OFFLINE

    chat.addClients(client1,client2,client3)
    client1.sendMessage("Всем привет!!!")

    println("_____________________________")

    client2.sendMessage("Всем привет!!!")

    println("_____________________________")

    client3.sendMessage("Всем привет!!!")

    println("_____________________________")

    client3.status = State.ONLINE
    client1.sendMessage("Всем привет!!!")
}