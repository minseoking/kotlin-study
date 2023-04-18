package com.ms.kopring.api.user.service

import com.ms.kopring.api.user.domain.User
import com.ms.kopring.api.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {

    override fun getUserInfo(id: Long): User? {
        return userRepository.findById(id).get() // null 에러처리
    }
}