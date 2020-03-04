package com.example.demo.domain.model

import org.springframework.data.annotation.Id

class Game(
        val name: String,
        val rules: List<Rule> = emptyList(),
        val gameState: GameState = GameState.IDLE
) {
    @Id
    var id: Long? = null

    override fun toString(): String {
        return "Game(name='$name', rules=$rules, gameState=$gameState, id=$id)"
    }
}