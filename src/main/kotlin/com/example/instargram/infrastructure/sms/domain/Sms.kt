package com.example.instargram.infrastructure.sms.domain

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash
class Sms(

    @Id
    val phoneNumber: String,

    val numberCode: String
)
