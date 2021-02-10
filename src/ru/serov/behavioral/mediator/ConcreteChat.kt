package ru.serov.behavioral.mediator

class ConcreteChat():IChat {

    private val clients: ArrayList<IClient> = ArrayList()

    fun addClients(vararg client: IClient) = clients.addAll(client)

    override fun updateChat(message: String, client: IClient) {
        if(client is AChatUser){
            // мы не будем отправлять сообщение себе
            // приведение в проверки для объектов clients может аукнуться
                // при добавлении подклассов не от AChatUser
            if(!(client.mute || client.status == State.OFFLINE) ) clients.forEach{
                if (it != client && (it as AChatUser).status != State.OFFLINE)
                it.displayMessage("${client.firstName}: $message")
            }
        }

    }
}