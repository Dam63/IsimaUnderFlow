package fr.isima.isimaUnderFlow

import grails.plugins.springsecurity.Secured

@Secured(['ROLE_ADMIN'])
class SecureController {
    def index() { render "secure access" }
}

