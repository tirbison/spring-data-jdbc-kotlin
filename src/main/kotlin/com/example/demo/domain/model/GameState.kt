package com.example.demo.domain.model

enum class GameState {
    IDLE,
    RUNNING;

    override fun toString(): String {
        return name
    }

}