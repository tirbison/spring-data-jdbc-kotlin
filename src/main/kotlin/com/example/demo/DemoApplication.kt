package com.example.demo

import com.example.demo.domain.model.Game
import com.example.demo.domain.model.GameRepository
import com.example.demo.domain.model.Rule
import com.example.demo.domain.model.RuleValue
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories
import org.springframework.stereotype.Component

@SpringBootApplication
@EnableJdbcRepositories
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}


@Component
class ExperimentLoader(val gameRepository: GameRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        val game = Game("game 1", listOf(
                Rule("rule 1", listOf(
                        RuleValue("value 1")
                ))))
		val savedGame = gameRepository.save(game)
		gameRepository.findById(savedGame.id!!)
        println(savedGame)
    }
}