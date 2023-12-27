package com.example.instargram.global.security.jwt.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash
class RefreshToken (
    @Id
    val name : String,
    val refreshToken: String,
    val refreshTokenTime : Long
)
