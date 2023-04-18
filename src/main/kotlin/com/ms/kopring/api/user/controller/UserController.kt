package com.ms.kopring.api.user.controller

import com.ms.kopring.api.user.dto.UserDto
import com.ms.kopring.api.user.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(
    private val userService: UserService
) {


    @GetMapping("/{id}")
    fun main(@PathVariable id: Long): ResponseEntity<UserDto?> {

        return ResponseEntity.ok(UserDto.of(userService.getUserInfo(id)!!));
    }
}