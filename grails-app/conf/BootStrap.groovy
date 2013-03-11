import fr.isima.isimaUnderFlow.Answer;
import fr.isima.isimaUnderFlow.Comment
import fr.isima.isimaUnderFlow.Profile
import fr.isima.isimaUnderFlow.Question
import fr.isima.isimaUnderFlow.Role
import fr.isima.isimaUnderFlow.User
import fr.isima.isimaUnderFlow.UserRole

class BootStrap {

    def init = { servletContext ->
		
		log.info "Log ready !"
		
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
		def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
  
		def root = new User(username: 'root', enabled: true, password: 'isima')
		root.save(flush: true)
  
		UserRole.create root, adminRole, true
  
		assert User.count() == 1
		assert Role.count() == 2
		assert UserRole.count() == 1
		
		Profile grailsHater = new Profile([name:"grails Hater"]);
		if(!grailsHater.save(flush: true)) log.error grailsHater.errors.toString()
		
		Profile grailsLover = new Profile([name:"grails Lover"]);
		if(!grailsLover.save(flush: true)) log.error grailsLover.errors.toString()
		
		Profile troll = new Profile([name:"Troll"]);
		if(!troll.save(flush: true)) log.error troll.errors.toString()
		
		Question quest1 = new Question([title:"Premiere question",author:grailsHater,content:"Grails est-il vraiment utile dans la vie ?",publishDate:new Date()])
			.addToComments(author:grailsHater,content:"Oups, wrong channel, sorry !",publishDate:new Date())
			.addToComments(author:grailsLover,content:"Grails is Life <3, N00B !",publishDate:new Date())
			.addToTags(label:"GRAILS")
			.addToTags(label:"GROOVY")
		if(!quest1.save(flush: true)) log.error quest1.errors.toString()
				
		Answer answer1_1 = new Answer([question:quest1, author:troll, content:"42",publishDate:new Date()])
		if(!answer1_1.save(flush: true)) log.error answer1_1.errors.toString()
    }
    def destroy = {
    }
}
