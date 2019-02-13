package com.onigra.test.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.onigra.test.model.User
import com.onigra.test.view.json.UserJson
import org.springframework.http.MediaType

@RestController
@RequestMapping("users")
class UserController {
    @GetMapping("{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun show(@PathVariable("id") id: Int): UserJson {
        val user = User("yudai", id)
        return UserJson(user)
    }
}