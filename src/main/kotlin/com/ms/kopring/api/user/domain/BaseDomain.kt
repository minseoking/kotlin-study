package com.ms.kopring.api.user.domain

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseDomain {
    @CreatedDate
    @Column(name = "create_at", nullable = false, updatable = false)
    protected open var createAt: LocalDateTime = LocalDateTime.MIN

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    protected open var updatedAt: LocalDateTime? = LocalDateTime.MIN
}