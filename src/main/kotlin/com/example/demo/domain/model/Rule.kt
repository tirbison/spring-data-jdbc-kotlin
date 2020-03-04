package com.example.demo.domain.model

import org.springframework.data.annotation.Id

data class Rule(val name:String, val ruleValues:List<RuleValue> = emptyList()) {
    @Id
    var id: Long? = null
}
