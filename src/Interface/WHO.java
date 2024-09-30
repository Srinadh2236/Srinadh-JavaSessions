package Interface;

public interface WHO  {
			   //WHO extends UN	
	// try UN is parent of WHO 
	// in JAVA interface cant be parent it will not allowed.
	
	// who is parent interface for us,uk,indian
	
			//USMedical --interface parent
			// UKMedical---interface parent
			// indianMedical--interface parent
			
			//fortisHospital --- child class 
			
			//testHospital ---caller class
			
			//Medical --- parent of fortisHospotal
	
	//NOTE:
	//class -- class : extends
	//interface --interface :extends
	//class---interface : implements
	//interface ---class : not allowed (for interface class can't be a parent)
	
	public void covidVaccsination();

}
