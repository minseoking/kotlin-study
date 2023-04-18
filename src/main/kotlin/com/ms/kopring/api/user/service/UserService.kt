package com.ms.kopring.api.user.service

import com.ms.kopring.api.user.domain.User

interface UserService {
    fun getUserInfo(id: Long): User?
}