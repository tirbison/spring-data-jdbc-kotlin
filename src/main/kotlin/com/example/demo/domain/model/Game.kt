package com.example.demo.domain.model

import org.springframework.data.annotation.Id

class Game(
        val name: String,
        val rules: List<Rule> = emptyList(),
        val types: List<GameType> = emptyList()
) {
    @Id
    var id: Long? = null

    override fun toString(): String {
        return "Game(name='$name', list=$rules, id=$id)"
    }
}