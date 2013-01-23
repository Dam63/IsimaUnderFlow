package fr.isima.isimaUnderFlow

class PublicationController {

    def show = {
		if(Question.get(params.id) != null) redirect(controller:"question", action:"show", params:params)
		else if(Answer.get(params.id) != null) redirect(controller:"answer", action:"show", params:params)
		else {
			log.error "This publicationId : ${params.id} has a unknown type."
			redirect(controller:"error", action:"notFound")
		}
	}
}
