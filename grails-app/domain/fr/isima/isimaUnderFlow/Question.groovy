package fr.isima.isimaUnderFlow

class Question extends Publication {
	
	String title
	
	Answer bestAnswer = null
	
	static oneToMany = [
		Answer answers,
		Tag tags
	]
	
    static constraints = {
		bestAnswer nullable:true
    }
}
