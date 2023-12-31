package com.example.instargram.infrastructure.mail.service

import com.example.instargram.infrastructure.mail.domain.Mail
import com.example.instargram.infrastructure.mail.domain.repository.MailRepository
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service
import java.security.SecureRandom

@Service
class MailSendService(
    private val mailSender: JavaMailSender,
    private val mailRepository: MailRepository
) {
    fun generateVerificationCode(): String {
        val char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
        val random = SecureRandom()
        val codeBuilder = StringBuilder(6)
        for (i in 0..5) {
            val index = random.nextInt(char.length)
            codeBuilder.append(char[index])
        }
        return codeBuilder.toString()
    }

    fun send(email: String): String {
        mailRepository.deleteAll()
        val verificationCode = generateVerificationCode()
        val message = SimpleMailMessage()
        message.setTo(email)
        val mail = Mail(
            email = email,
            emailCode = verificationCode
        )
        mailSender.send(message)

        mailRepository.save(mail)
        return verificationCode
    }
}
