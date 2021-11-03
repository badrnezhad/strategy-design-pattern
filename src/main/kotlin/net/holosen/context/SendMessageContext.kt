package net.holosen.context

import net.holosen.interfaces.SendMessage
import net.holosen.models.Message

class SendMessageContext(private val gateway: SendMessage) : SendMessage {
    override fun send(message: Message): Boolean {
        return gateway.send(message)
    }
}