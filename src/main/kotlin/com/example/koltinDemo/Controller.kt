package com.example.koltinDemo

import com.example.koltinDemo.Entity.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by ltaoo on 2017/11/25.
 */
@RestController
class CustomerController
    @Autowired constructor(val repository: CustomerRepository) {

    @RequestMapping("/")
    fun findAll() = repository.findAll()

    @RequestMapping("/{name}", method = arrayOf(RequestMethod.GET))
    fun findByLastName(@PathVariable name: String) = repository.findByLastName(name)

    @RequestMapping("/create")
    @ResponseBody
    fun create(firstname: String?, lastname: String?) {
        print(firstname);
        var newUser = Customer("li", "tao")
        repository.save(newUser)
    }
}
