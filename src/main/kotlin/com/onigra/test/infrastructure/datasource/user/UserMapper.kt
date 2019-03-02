package com.onigra.test.infrastructure.datasource.user

import org.apache.ibatis.annotations.Mapper
import com.onigra.test.model.User
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {
    @Select("SELECT * FROM users")
    fun all(): List<User>

    @Select("SELECT * FROM users WHERE id = #{id}")
    fun findBy(id: Int): User
}