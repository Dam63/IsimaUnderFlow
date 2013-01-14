package fr.isima.isimaUnderFlow

import java.util.Date;

class Publication {

	Profile author
	String content

	Date publishDate

	Integer mark
	
	/**
	 * Comment can have comments, so be sure that the hierarchy overflow
	 * (many recursive comment) are handled
	 */
	static oneToMany = [
		Comment comments
	]
	
    static constraints = {
		
    }
}
