package com.example.koltinDemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by ltaoo on 2017/11/25.
 */
@RestController
class CustomerController @Autowired constructor(val repository: CustomerRepository) {
    @RequestMapping("/")
    fun findAll() = repository.findAll()
    @RequestMapping("/{name}")
    fun findByLastName(@PathVariable name: String) = repository.findByLastName(name)
}
