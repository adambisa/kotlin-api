package com.example

import com.example.plugins.*
import com.example.repository.UserRepository
import com.example.service.UserService
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val userRepository = UserRepository()
    val userService = UserService(userRepository = userRepository)
    configureSerialization()
    configureSecurity()
    configureRouting(userService = userService)
}
