package net.holosen

import net.holosen.enums.MessageType
import net.holosen.models.Message
import net.holosen.services.SendMessageService

fun main() {
    val message = Message(
        "09129999999",
        "09120000000",
        "Hello!"
    )
    val service = SendMessageService(MessageType.Call)
    service.send(message)
}