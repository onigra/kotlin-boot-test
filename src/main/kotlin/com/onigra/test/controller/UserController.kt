package com.onigra.test.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController {
    @GetMapping("{id}")
    fun show(@PathVariable("id") id: Int): String {
        return id.toString()
    }
}