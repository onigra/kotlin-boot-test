package com.onigra.test.model

interface UserRepository {
    fun all(): List<User>?
    fun findBy(id: Int): User?
}
