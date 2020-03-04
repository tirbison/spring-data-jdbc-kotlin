package com.example.demo

import com.example.demo.domain.model.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private lateinit var gameRepository: GameRepository

    @Test
    fun `Should save game and return it with an id`() {
        gameRepository.deleteAll()
        val game = Game("game 1", listOf(
                Rule("rule 1", listOf(
                        RuleValue("value 1")
                ))))
        val savedGame = gameRepository.save(game)
        assertNotNull(savedGame.id)
        assertEquals(savedGame.name, game.name)
        assertEquals(savedGame.rules, game.rules)
        assertEquals(savedGame.gameState, game.gameState)
    }

    @Test
    fun `Should find by id`() {
        gameRepository.deleteAll()
        val game = Game("game 1", listOf(
                Rule("rule 1", listOf(
                        RuleValue("value 1")
                ))))
        val savedGame = gameRepository.save(game)
        val foundGame = gameRepository.findById(savedGame.id!!).get()
        assertEquals(foundGame.name, game.name)
        assertEquals(foundGame.rules, game.rules)
        assertEquals(foundGame.gameState, game.gameState)
        assertNotNull(foundGame.id)
    }

    @Test
    fun `Should find the game by state`() {
        gameRepository.deleteAll()
        val gameRunning = Game(
                name = "game 1",
                rules = listOf(
                        Rule("rule 1", listOf(
                                RuleValue("value 1")
                        ))),
                gameState = GameState.RUNNING
        )
        val savedGameRunning = gameRepository.save(gameRunning)
        val foundGameRunning = gameRepository.findAllByGameState(gameRunning.gameState).first()
        assertEquals(foundGameRunning.id, savedGameRunning.id)
    }

    @Test
    fun `Should find the game by state name`() {
        gameRepository.deleteAll()
        val gameRunning = Game(
                name = "game 1",
                rules = listOf(
                        Rule("rule 1", listOf(
                                RuleValue("value 1")
                        ))),
                gameState = GameState.RUNNING
        )
        val savedGameRunning = gameRepository.save(gameRunning)
        val foundGameRunning = gameRepository.findAllByGameStateName(gameRunning.gameState.name).first()
        assertEquals(foundGameRunning.id, savedGameRunning.id)
    }
}
