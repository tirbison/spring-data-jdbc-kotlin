package com.example.demo.domain.model

import org.springframework.data.annotation.Id

data class RuleValue(val value: String) {
    @Id
    var id: Long? = null
}
