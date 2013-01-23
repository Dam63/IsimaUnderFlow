package fr.isima.isimaUnderFlow

class Comment extends Publication {

	
	static belongsTo = [
		parent: Publication
	]
	
    static constraints = {
    }
	
	@Override
	public String toString() {
		String subContent = content
		int MAX_CHAR = 30
		int maxLength = (subContent.size() < MAX_CHAR)?subContent.size():MAX_CHAR;
		if(subContent.size() > MAX_CHAR) subContent = subContent.substring(0, maxLength) + " ...";
		
		return "[Comment] ${subContent} ${publishDate}";
	}
}
