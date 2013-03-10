package fr.isima.isimaUnderFlow

class Answer extends Publication {
	
	static belongsTo = [
		question:Question
	]
	
    static constraints = {
    }
}
