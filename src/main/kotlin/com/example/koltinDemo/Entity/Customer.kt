package com.example.koltinDemo.Entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by ltaoo on 2017/11/25.
 */
@Entity
data class Customer(
        var firstName: String = "",
        var lastName: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)
