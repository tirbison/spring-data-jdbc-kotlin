package com.example.demo.domain.model

import org.springframework.data.annotation.Id

class Game(val name: String, val list: List<Rule> = emptyList()) {
    @Id
    var id: Long? = null

    override fun toString(): String {
        return "Game(name='$name', list=$list, id=$id)"
    }

}