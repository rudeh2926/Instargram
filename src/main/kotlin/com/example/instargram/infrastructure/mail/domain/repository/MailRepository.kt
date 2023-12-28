package com.example.instargram.infrastructure.mail.domain.repository

import com.example.instargram.infrastructure.mail.domain.Mail
import org.springframework.data.jpa.repository.JpaRepository

interface MailRepository: JpaRepository<Mail, String> {
}
