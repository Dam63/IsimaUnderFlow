package fr.isima.isimaUnderFlow

class TagsTagLib {
	
	def questionMini = { attrs, body ->
		out << body() << render(template: "/tagsLib/questionMini", model: [question: attrs.question]);
	}
	
	def login = { attrs, body ->
		out << body() << render(template: "/tagsLib/login");
	 }
	
	def question = { attrs, body ->
		out << body() << render(template: "/tagsLib/question", model: [question: attrs.question]);
	}
	
	def answer = { attrs, body ->
		out << body() << render(template: "/tagsLib/answer", model: [answer: attrs.answer]);
	}
	
	def profileMini = { attrs, body ->
		out << body() << render(template: "/tagsLib/profileMini", model: [profile: attrs.profile]);
	}
	
	def comment = { attrs, body ->
		out << body() << render(template: "/tagsLib/comment", model: [comment: attrs.comment]);
	}
}
