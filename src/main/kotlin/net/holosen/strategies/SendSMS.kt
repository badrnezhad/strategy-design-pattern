package net.holosen.strategies

import net.holosen.interfaces.SendMessage
import net.holosen.models.Message

class SendSMS : SendMessage {
    override fun send(msg: Message): Boolean {
        println("Sending SMS from ${msg.from} to ${msg.to} (${msg.message})")
        return true
    }
}