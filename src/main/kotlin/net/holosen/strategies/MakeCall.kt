package net.holosen.strategies

import net.holosen.interfaces.SendMessage
import net.holosen.models.Message

class MakeCall : SendMessage {
    override fun send(msg: Message): Boolean {
        println("Making Call from ${msg.from} to ${msg.to} (${msg.message})")
        return true
    }
}