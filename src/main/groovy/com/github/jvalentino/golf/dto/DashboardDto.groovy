package com.github.jvalentino.golf.dto

import com.github.jvalentino.golf.entity.Doc
import groovy.transform.CompileDynamic

/**
 * Represents the content for the dashboard
 * @author john.valentino
 */
@CompileDynamic
class DashboardDto {

    List<Doc> documents = []

}
