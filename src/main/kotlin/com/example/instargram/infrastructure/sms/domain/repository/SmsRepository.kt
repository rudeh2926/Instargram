package com.example.instargram.infrastructure.sms.domain.repository

import com.example.instargram.infrastructure.sms.domain.Sms
import org.springframework.data.repository.CrudRepository

interface SmsRepository : CrudRepository<Sms, String> {
}
