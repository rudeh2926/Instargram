package com.example.buildsrc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BuildSrcApplication

fun main(args: Array<String>) {
	runApplication<BuildSrcApplication>(*args)
}
