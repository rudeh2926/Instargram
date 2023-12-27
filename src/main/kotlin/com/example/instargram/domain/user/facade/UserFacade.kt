package com.example.instargram.domain.user.facade

import com.example.instargram.domain.user.domain.User
import com.example.instargram.domain.user.domain.repository.UserRepository
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
class UserFacade(
    private val userRepository: UserRepository
) {
    fun getCurrentUser(): User {
        val email = SecurityContextHolder.getContext().authentication.name
        return getUserByEmail(email)
    }

    fun getUserByEmail(email: String): User =
        userRepository.findByEmail(email)
}
