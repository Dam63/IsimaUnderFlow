package fr.isima.isimaUnderFlow

import java.util.Date;

class Publication {

	Profile author
	String content

	Date publishDate

	Integer votes = 0
	
	/**
	 * Comment can have comments, so be sure that the hierarchy overflow
	 * (many recursive comment) are handled
	 */
	static hasMany = [
		comments:Comment
	]
	
    static constraints = {
		
    }
}
