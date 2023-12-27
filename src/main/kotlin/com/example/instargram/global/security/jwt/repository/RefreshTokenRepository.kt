package com.example.instargram.global.security.jwt.repository

import com.example.instargram.global.security.jwt.entity.RefreshToken
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface RefreshTokenRepository: JpaRepository<RefreshToken, Long> {
}
