package com.example.demo

import com.example.demo.domain.model.Permission
import com.example.demo.domain.model.Role
import com.example.demo.domain.model.RoleRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private lateinit var roleRepository: RoleRepository

    @Test
    fun contextLoads() {
        val game = Role("game 1", listOf(Permission.READ, Permission.EXECUTE))
        val savedGame = roleRepository.save(game)
        val foundGame = roleRepository.findById(savedGame.id!!).get()
        assertEquals(foundGame.name, game.name)
        assertEquals(foundGame.permissions.first(), Permission.READ)
        assertEquals(foundGame.permissions[1], Permission.EXECUTE)
    }

}
