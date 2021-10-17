package com.example.plugins

import com.example.routes.createRoomRoute
import com.example.routes.getRoomsRoute
import com.example.routes.joinRoomRoute
import io.ktor.routing.*
import io.ktor.locations.*
import io.ktor.application.*

fun Application.configureRouting() {
    install(Locations) {
    }

    routing {
        createRoomRoute()
        getRoomsRoute()
        joinRoomRoute()
    }

}
