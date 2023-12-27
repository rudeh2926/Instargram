package com.example.instargram.domain.user.domain

import com.example.instargram.domain.user.enums.ProfileType
import com.example.instargram.domain.user.enums.Sex
import com.example.instargram.global.entity.BaseUUIDEntity
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
class User(
    id: UUID? = null,

    @Column(name = "account_id", nullable = false, unique = true)
    val accountId: String,

    @Column(name = "email", nullable = true, unique = true)
    val email: String,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "self_introduce", nullable = true)
    val selfIntroduce: String,

    @Column(name = "phone_number", nullable = true, unique = false)
    val phoneNumber: String,

    @Column(name = "profile_link", nullable = true)
    val profileLink: String,

    @Column(name = "password", nullable = false)
    val password: String,

    @Column(name = "profile_recommend", nullable = false)
    val recommend: Boolean,

    @Enumerated(EnumType.STRING)
    @Column(name = "sex", nullable = false)
    val sex: Sex,

    @Enumerated(EnumType.STRING)
    @Column(name = "profile_type", nullable = false)
    val profileType: ProfileType

): BaseUUIDEntity(id) {
}
