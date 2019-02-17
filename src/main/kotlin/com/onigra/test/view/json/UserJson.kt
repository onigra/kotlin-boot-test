package com.onigra.test.view.json

import com.onigra.test.model.User

data class UserJson(val id: Int, val name: String, val age: Int) {
  constructor(user: User) : this (
    user.id,
    user.name,
    user.age
  )
}