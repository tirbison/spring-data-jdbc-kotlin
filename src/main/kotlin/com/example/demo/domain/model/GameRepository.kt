package com.example.demo.domain.model

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : CrudRepository<Game, Long> {
    @Query("select * from game where game_state=:gameState")
    fun findAllByGameState(@Param("gameState") gameState: GameState): List<Game>

    @Query("select * from game where game_state=:gameState")
    fun findAllByGameStateName(@Param("gameState") gameState: String): List<Game>
}