package com.example.demo

import com.example.demo.domain.model.Game
import com.example.demo.domain.model.GameRepository
import com.example.demo.domain.model.GameType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private lateinit var gameRepository: GameRepository

    @Test
    fun contextLoads() {
        val game = Game("game 1", listOf(GameType.ONE, GameType.THREE))
        val savedGame = gameRepository.save(game)
        val foundGame = gameRepository.findById(savedGame.id!!).get()
        assertEquals(foundGame.name, game.name)
        assertEquals(foundGame.types.first(), GameType.ONE)
        assertEquals(foundGame.types[1], GameType.THREE)
    }

}
