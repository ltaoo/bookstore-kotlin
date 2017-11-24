package com.dictionary.dictionary

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.view.json.MappingJackson2JsonView


@SpringBootApplication
open class Application {
    @Bean
    open fun json(): MappingJackson2JsonView {
        return MappingJackson2JsonView(ObjectMapper())
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}