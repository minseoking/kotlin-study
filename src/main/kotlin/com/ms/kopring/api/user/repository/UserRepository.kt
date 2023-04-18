package com.ms.kopring.api.user.repository

import com.ms.kopring.api.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
}