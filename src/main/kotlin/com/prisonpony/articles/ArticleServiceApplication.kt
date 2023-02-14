package com.prisonpony.articles

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ArticleServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(ArticleServiceApplication::class.java, *args)
}