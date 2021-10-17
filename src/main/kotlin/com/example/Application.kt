package com.example

import io.ktor.application.*
import com.example.plugins.*
import com.google.gson.Gson

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

val server = DrawingServer()
val gson = Gson()

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSockets()
    configureRouting()
    configureSecurity()
    configureSerialization()
    configureMonitoring()
}
