package com.example.instargram.domain.user.domain

import com.example.instargram.global.entity.BaseUUIDEntity
import java.util.UUID
import javax.persistence.Entity

@Entity
class User(
    id: UUID? = null,
    val accountId: String,
    val email: String,
    val phoneNumber: String,
    val password: String
): BaseUUIDEntity(id) {
}
