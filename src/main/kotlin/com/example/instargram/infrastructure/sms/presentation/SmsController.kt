package com.example.instargram.infrastructure.sms.presentation

import com.example.instargram.infrastructure.sms.service.SmsService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sms")
class SmsController(
    private val smsService: SmsService
) {
    @PostMapping
    fun send(@RequestParam phoneNumber: String) =
        smsService.sendSMS(phoneNumber)
}
