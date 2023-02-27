package com.github.jvalentino.golf

import com.github.jvalentino.golf.GolfApp
import org.springframework.boot.SpringApplication
import spock.lang.Specification

class GolfAppTest extends Specification {

    def setup() {
        GroovyMock(SpringApplication, global:true)
    }

    def "test main"() {
        when:
        GolfApp.main(null)

        then:
        1 * SpringApplication.run(GolfApp, null)
    }

}
