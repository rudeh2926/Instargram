package com.example.instargram.domain.user.service

import com.example.instargram.domain.user.domain.User
import com.example.instargram.domain.user.domain.repository.UserRepository
import com.example.instargram.domain.user.presentation.dto.request.SignupRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserSignupService(
    private val userRepository: UserRepository
) {
    @Transactional
    fun execute(request: SignupRequest) {
        val user = User(
            info = request.info,
            password = request.password,
            accountId = request.accountId,
            name = request.name,
            year = request.year,
            month = request.month,
            day = request.day
        )
        userRepository.save(user)
    }
}
