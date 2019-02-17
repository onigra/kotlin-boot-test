package com.onigra.test.infrastructure.datasource.user

import org.springframework.stereotype.Repository
import com.onigra.test.model.User
import com.onigra.test.model.UserRepository

@Repository
class UserDataSource(private val userMapper: UserMapper): UserRepository {
    override fun findBy(id: Int): User {
        return userMapper.findBy(id)
    }
}