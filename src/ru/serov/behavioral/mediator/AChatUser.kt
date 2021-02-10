package ru.serov.behavioral.mediator

abstract class AChatUser(val firstName: String,val secondName: String, private val chat: IChat,
                         var status: State = State.ONLINE, var mute: Boolean = false): IClient {

    override fun sendMessage(message: String) {
        chat.updateChat(message,this)
    }


}