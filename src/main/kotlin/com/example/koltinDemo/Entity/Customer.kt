package com.example.koltinDemo.Entity

import javax.persistence.*

/**
 * Created by ltaoo on 2017/11/25.
 */
@Entity
@Table(name = "user")
data class Customer(
        var firstName: String = "",
        var lastName: String = "",

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)
