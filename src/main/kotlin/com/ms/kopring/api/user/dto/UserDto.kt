package com.ms.kopring.api.user.dto

import com.ms.kopring.api.user.domain.User

data class UserDto(
    var id: Long? = null,
    var name: String? = null,){
    companion object {
        fun of(user: User): UserDto {
            return UserDto(
                id = user.id,
                name = user.name,
            )
        }
    }
}