package net.holosen.strategies

import net.holosen.interfaces.SendMessage
import net.holosen.models.Message

class SendEmail : SendMessage {
    override fun send(msg: Message): Boolean {
        println("Sending Email from ${msg.from} to ${msg.to} (${msg.message})")
        return true
    }
}