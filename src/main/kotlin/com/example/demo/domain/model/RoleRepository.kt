package com.example.demo.domain.model

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : CrudRepository<Role, Long>