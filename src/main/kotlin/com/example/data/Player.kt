package com.example.data

import io.ktor.http.cio.websocket.*

data class Player(
    val username: String,
    var socket: WebSocketSession,
    val clientId : String,
    val isDrawing:Boolean,
    var score: Int = 0,
    var rank: Int = 0
)