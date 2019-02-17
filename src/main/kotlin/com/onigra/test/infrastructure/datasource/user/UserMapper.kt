package com.onigra.test.infrastructure.datasource.user

import org.apache.ibatis.annotations.Mapper
import com.onigra.test.model.User

@Mapper
interface UserMapper {
    fun findBy(id: Int): User
}