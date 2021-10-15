package com.example.plugins

import com.example.routing.createRoomRoute
import io.ktor.routing.*
import io.ktor.locations.*
import io.ktor.application.*

fun Application.configureRouting() {
    install(Locations) {
    }

    routing {
        createRoomRoute()
    }

}
