package com.onigra.test.model

interface UserRepository {
    fun findBy(id: Int): User?
}
