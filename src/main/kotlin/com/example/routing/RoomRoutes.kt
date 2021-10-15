package com.example.routing

import com.example.data.Room
import com.example.models.BasicApiResponse
import com.example.models.CreateRoomRequest
import com.example.other.Constants.MAX_ROOM_SIZE
import com.example.server
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.createRoomRoute() {

    route("/api/createRoom"){
        post {
            val roomRequest = call.receiveOrNull<CreateRoomRequest>()
            if (roomRequest == null){
                call.respond(HttpStatusCode.BadRequest)
                return@post
            }
            if (server.rooms[roomRequest.name] != null){
                call.respond(
                    HttpStatusCode.OK,
                    BasicApiResponse(false, "Room Already Exists.")
                )
                return@post
            }
            if (roomRequest.maxPlayers > MAX_ROOM_SIZE){
                call.respond(
                    HttpStatusCode.OK,
                    BasicApiResponse(false, "The max room size is $MAX_ROOM_SIZE.")
                )
                return@post
            }

            val room = Room(
                roomRequest.name,
                roomRequest.maxPlayers
            )
            server.rooms[roomRequest.name] = room
            println("Room created: ${roomRequest.name}")

            call.respond(HttpStatusCode.OK, BasicApiResponse(true))
        }
    }
}