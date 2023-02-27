package com.github.jvalentino.golf.rest

import com.github.jvalentino.golf.service.DocService
import com.github.jvalentino.golf.dto.DashboardDto
import groovy.transform.CompileDynamic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Rest endpoint for the dashboard
 * @john.valentino
 */
@CompileDynamic
@RestController
@Slf4j
class DashboardRest {

    @Autowired
    DocService docService

    @GetMapping('/dashboard')
    DashboardDto dashboard() {
        log.info('Rendering dashboard')

        DashboardDto dashboard = new DashboardDto()
        dashboard.with {
            documents = docService.allDocs()
        }

        dashboard
    }

}
