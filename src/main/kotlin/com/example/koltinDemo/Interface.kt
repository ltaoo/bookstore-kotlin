package com.example.koltinDemo

import com.example.koltinDemo.Entity.Customer
import org.springframework.data.jpa.repository.JpaRepository


interface CustomerRepository : JpaRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
}