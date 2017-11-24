package com.example.koltinDemo

import com.example.koltinDemo.Entity.Customer
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class KoltinDemoApplication {
    @Bean
    open fun init(repository: CustomerRepository): CommandLineRunner {
        return CommandLineRunner {
            repository.save(Customer("Jack", "Bauer"))
            repository.save(Customer("Chloe", "O'Brian"))
            repository.save(Customer("Kim", "Bauer"))
            repository.save(Customer("David", "Palmer"))
            repository.save(Customer("Michelle", "Dessler"))
        }
    }
}
fun main(args: Array<String>) {
    SpringApplication.run(KoltinDemoApplication::class.java, *args)
}
