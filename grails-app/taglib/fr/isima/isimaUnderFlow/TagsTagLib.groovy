package fr.isima.isimaUnderFlow

class TagsTagLib {
	def questionMini = { attrs, body ->
		out << body() << render(template: "/tagsLib/questionMini", model: [question: attrs.question]);//"<div><div></div>" //(attrs.happy == 'true' ? " :-)" : " :-(")
	}
	
	def login = { attrs, body ->
		out << body() << render(template: "/tagsLib/login");
	 }
}
