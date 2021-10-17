package com.example.models

import com.example.other.Constants.TYPE_CHAT_MESSAGE

data class ChatMessage(
    val from: String,
    val roomName: String,
    val message: String,
    val timestamp: Long
):BaseModel(TYPE_CHAT_MESSAGE)
