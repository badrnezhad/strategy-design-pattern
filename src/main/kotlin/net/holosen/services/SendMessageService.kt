package net.holosen.services

import net.holosen.context.SendMessageContext
import net.holosen.enums.MessageType
import net.holosen.interfaces.SendMessage
import net.holosen.models.Message
import net.holosen.strategies.MakeCall
import net.holosen.strategies.SendEmail
import net.holosen.strategies.SendSMS

class SendMessageService(
    private val type: MessageType
) : SendMessage {
    private var context: SendMessageContext? = null

    override fun send(message: Message): Boolean {
        context = when (type) {
            MessageType.Email -> SendMessageContext(SendEmail())
            MessageType.SMS -> SendMessageContext(SendSMS())
            MessageType.Call -> SendMessageContext(MakeCall())
        }
        if (context == null)
            return false
        return context!!.send(message)
    }
}