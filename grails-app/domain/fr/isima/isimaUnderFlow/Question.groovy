package fr.isima.isimaUnderFlow

class Question extends Publication {
	
	String title
	Answer bestAnswer = null
	Long views = 0;
	
	static hasMany = [
		answers:Answer,
		tags:Tag
	]
	
    static constraints = {
		bestAnswer nullable:true
    }
}