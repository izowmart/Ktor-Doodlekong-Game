package com.example.plugins

import com.example.session.DrawingSession
import io.ktor.sessions.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.util.*

fun Application.configureSecurity() {

    install(Sessions) {
        cookie<DrawingSession>("MY_SESSION") {
            cookie.extensions["SameSite"] = "lax"
        }

    }

    intercept(ApplicationCallPipeline.Features){
        if (call.sessions.get<DrawingSession>() == null){
            val clientId = call.parameters["client_id"]?: ""
            call.sessions.set(DrawingSession(clientId, generateNonce()))
        }
    }

    routing {
        get("/session/increment") {


        }
    }
}
