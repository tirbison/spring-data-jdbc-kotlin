package com.example.demo

import com.example.demo.domain.model.Game
import com.example.demo.domain.model.GameRepository
import com.example.demo.domain.model.Rule
import com.example.demo.domain.model.RuleValue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Assertions.assertEquals as assertEquals

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private lateinit var gameRepository: GameRepository

    @Test
    fun contextLoads() {
        val game = Game("game 1", listOf(
                Rule("rule 1", listOf(
                        RuleValue("value 1")
                ))))
        val savedGame = gameRepository.save(game)
        gameRepository.findById(savedGame.id!!)
        assertEquals(savedGame.name, game.name)
		assertEquals(savedGame.rules, game.rules)
    }

}
