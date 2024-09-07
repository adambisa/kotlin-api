package com.example.routing.response

import com.example.utils.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.UUID


@Serializable
data class UserResponse(
    @Serializable(with = UUIDSerializer::class)
    val id:UUID,
    val username:String,
)
