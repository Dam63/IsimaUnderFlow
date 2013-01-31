package fr.isima.isimaUnderFlow

import com.sun.xml.internal.ws.client.sei.ResponseBuilder.StringBuilder;

class TagsTagLib {
	def questionMini = { attrs, body ->
		out << body() << render(template: "/tagsLib/questionMini", model: [question: attrs.question]);//"<div><div></div>" //(attrs.happy == 'true' ? " :-)" : " :-(")
	}
	
	def login = { attrs, body ->
		out << body() << render(template: "/tagsLib/login");
	 }
}
