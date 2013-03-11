package fr.isima.isimaUnderFlow

class ProfileController {

   	//static scaffold = true // Render dynamically
	   
	   def add() {
		   def existed = false;
		   Profile p = new Profile([name:params.name])
		   for (Profile p1 : Profile.getAll()) {
			   if(p1.name == p.name){
			   		params.message = "This Profile already exists"
					existed = true
					break
			   }
		   }
		   
		   if(!existed) {
		   	p.save(flush:true, failOnError:true)
			params.message = "Profile created"
		   }
	   
		   redirect(action: "create", params:params)
	   }
	   
	   
	   def create() {
		   render(view:"newProfile", params:params)
	   }
}
