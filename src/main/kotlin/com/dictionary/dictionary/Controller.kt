package com.dictionary.dictionary

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by ltaoo on 2017/11/24.
 */
@RestController
@RequestMapping("/api/users")
open class UserApi {
    @RequestMapping("/{id}",  method = arrayOf(RequestMethod.GET))
    open fun get(@PathVariable id: Long) = "User(id=$id, name=admin, password=123)"
}