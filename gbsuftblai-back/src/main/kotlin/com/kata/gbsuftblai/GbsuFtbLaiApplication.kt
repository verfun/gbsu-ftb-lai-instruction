package com.kata.gbsuftblai

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
class GbsuFtbLaiApplication

fun main(args: Array<String>) {
    runApplication<GbsuFtbLaiApplication>(*args)
}
