package com.example.instargram

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class InstargramApplication

fun main(args: Array<String>) {
	runApplication<InstargramApplication>(*args)
}
