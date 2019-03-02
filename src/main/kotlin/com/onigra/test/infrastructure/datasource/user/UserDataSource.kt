package com.onigra.test.infrastructure.datasource.user

import org.springframework.stereotype.Repository
import com.onigra.test.model.User
import com.onigra.test.model.UserRepository

@Repository
class UserDataSource(private var userMapper: UserMapper): UserRepository {
    override fun all(): List<User> {
        return userMapper.all()
    }

    override fun findBy(id: Int): User {
        return userMapper.findBy(id)
    }
}