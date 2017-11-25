package com.example.koltinDemo

import com.example.koltinDemo.Entity.Customer
import org.springframework.data.jpa.repository.JpaRepository


/**
 * Created by ltaoo on 2017/11/25.
 */
interface CustomerRepository : JpaRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
}