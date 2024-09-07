package com.example.plugins

import com.example.routing.userRoute
import com.example.service.UserService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(
    userService : UserService
) {
    routing {
        route("/api/user") {
            userRoute(userService)
        }
    }
}
