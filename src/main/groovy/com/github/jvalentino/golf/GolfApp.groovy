package com.github.jvalentino.golf

import groovy.transform.CompileDynamic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Main application
 */
@SpringBootApplication
@CompileDynamic
class GolfApp {

    static void main(String[] args) {
        SpringApplication.run(GolfApp, args)
    }

}
