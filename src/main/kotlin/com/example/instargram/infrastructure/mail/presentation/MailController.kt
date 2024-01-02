package com.example.instargram.infrastructure.mail.presentation

import com.example.instargram.infrastructure.mail.service.MailSendService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mail")
class MailController(
    private val mailSendService: MailSendService
) {
    @PostMapping
    fun mailSend(@RequestParam email: String) =
        mailSendService.sendMail(email)
}
