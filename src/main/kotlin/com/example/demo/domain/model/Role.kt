package com.example.demo.domain.model

import org.springframework.data.annotation.Id

class Role(
        val name: String,
        val permissions: List<Permission> = emptyList()
) {
    @Id
    var id: Long? = null
}