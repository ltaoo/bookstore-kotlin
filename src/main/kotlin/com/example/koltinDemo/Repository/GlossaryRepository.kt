package com.example.koltinDemo.Repository

import com.example.koltinDemo.Entity.Glossary
import org.springframework.data.jpa.repository.JpaRepository

interface GlossaryRepository : JpaRepository<Glossary, Long> {
    // fun findByLastName(name: String): List<Customer>
}