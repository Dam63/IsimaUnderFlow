package fr.isima.isimaUnderFlow

class DisplayQuestionController {

    def show() {
		render(view:"question", model:[question:Question.get(params.id)])
	}
	
	def addVote() {
		Publication pub = Publication.get(params.id)
		pub.votes++
		pub.save(flush:true)
		
		params.message = "Vote +"
		redirect(action: "show", params:params)
	}
	
	def minusVote() {
		Publication pub = Publication.get(params.id)
		pub.votes--
		pub.save(flush:true)
		
		params.message = "Vote -"
		redirect(action: "show", params:params)
	}
	
	def addAnswer() {
		Answer answer = new Answer([content:params.content, author:params.author, question:Question.get(params.id)])
		
		if(answer.hasErrors()) {
			params.message = "There is error : " + answer.errors
		}
		else {
			answer.save(flush:true)
			params.message = "Answer saved"
		}
		
		redirect(action: "show", params:params)
	}
}
