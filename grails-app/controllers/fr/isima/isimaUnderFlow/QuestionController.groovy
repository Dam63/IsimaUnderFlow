package fr.isima.isimaUnderFlow
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_ADMIN'])
class QuestionController {
	
	static scaffold = true // Render dynamically
	
	
	def springSecurityService
	// Jquery UI missing !
	
}
