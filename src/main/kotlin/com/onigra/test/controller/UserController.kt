package com.onigra.test.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.onigra.test.model.User
import com.onigra.test.model.UserRepository
import com.onigra.test.view.json.UserJson
import org.springframework.http.MediaType

@RestController
@RequestMapping("users")
class UserController(
    private val users: UserRepository
) {
    /*
    * GET /users
    */
    @GetMapping("", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun index(): List<UserJson> {
        val users = users.all()!!.map { user -> UserJson(user!!) }
        return users
    }

    /*
    * GET /users/{id}
    */
    @GetMapping("{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun show(@PathVariable("id") id: Int): UserJson {
        val user = users.findBy(id)
        return UserJson(user!!)
    }
}
