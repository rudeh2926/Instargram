package com.example.instargram.infrastructure.mail.domain

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash
class Mail (
    @Id
    val email : String,

    val emailCode : String
)
