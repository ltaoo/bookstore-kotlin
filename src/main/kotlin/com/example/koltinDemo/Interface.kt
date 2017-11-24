package com.example.koltinDemo

import com.example.koltinDemo.Entity.Customer

import org.springframework.data.repository.CrudRepository

/**
 * Created by ltaoo on 2017/11/25.
 */
interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
}