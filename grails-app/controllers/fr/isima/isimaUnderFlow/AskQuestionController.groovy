package fr.isima.isimaUnderFlow

class AskQuestionController {

    def show() {
		render(view:"askQuestion", params:params)
	}
	
	def add() {
		//Profile p = Profile.findWhere(name:params.author)
		Question q = new Question([title:params.title, content:params.question, publishDate:new Date(), author:params.author])
		q.save(flush:true, failOnError:true)
		redirect(action: "show", params:params)
	}
}
