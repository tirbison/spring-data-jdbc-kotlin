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