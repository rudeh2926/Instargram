package com.example.instargram.infrastructure.sms.service

import com.example.instargram.infrastructure.sms.domain.repository.SmsRepository
import net.nurigo.java_sdk.api.Message
import org.json.simple.JSONObject
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.security.SecureRandom
import java.util.HashMap


@Service
class SmsService(
    private val smsRepository: SmsRepository,

    @Value("\${coolsms.apikey}")
    private val apiKey: String,

    @Value("\${coolsms.apisecret}")
    private val apiSecret: String,

    @Value("\${coolsms.fromnumber}")
    private val phoneNumber: String
) {
    private fun createRandomNumber(): String {
        val char = "0123456789"
        val random = SecureRandom()
        val codeBuilder = StringBuilder(6)
        for (i in 0..5) {
            val index = random.nextInt(char.length)
            codeBuilder.append(char[index])
        }
        return codeBuilder.toString()
    }

    fun makeParams(to: String, randomNum: String): Map<String, String> {
        return mapOf(
            "from" to phoneNumber,
            "type" to "SMS",
            "app_version" to "app 1.2",
            "to" to to,
            "text" to randomNum
        )
    }

    fun sendSMS(phoneNumber: String): String {
        val sms = Message(apiKey, apiSecret)

        val randomNum = createRandomNumber()

        val params = makeParams(phoneNumber, randomNum)

            val obj = sms.send(params as HashMap<String, String>) as JSONObject
            println(obj.toString())

        return randomNum
    }
}
