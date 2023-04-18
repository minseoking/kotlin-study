package com.ms.kopring.api.user.domain

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(name = "name")
    var name: String? = null,
) : BaseDomain()