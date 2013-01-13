package fr.isima.isimaUnderFlow

class Question extends Publication {
	
	String title
	
	Answer bestAnswer
	
	static oneToMany = [
		Answer answers,
		Tag tags
	]
	
    static constraints = {
		
    }
}
