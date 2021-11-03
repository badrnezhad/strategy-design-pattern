package net.holosen.interfaces

import net.holosen.models.Message

interface SendMessage {
    fun send(message: Message): Boolean
}