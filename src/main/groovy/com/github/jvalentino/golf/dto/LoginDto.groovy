package com.github.jvalentino.golf.dto

import groovy.transform.CompileDynamic

/**
 * Response to login
 */
@CompileDynamic
class LoginDto extends ResultDto {

    String sessionId
    String sessionIdBase64

}
