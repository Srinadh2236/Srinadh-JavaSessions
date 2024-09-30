package Interface;

public interface UKMedical extends WHO {
	
	
	// who is parent interface for us,uk,indian
	
			//USMedical --interface parent
			// UKMedical---interface parent
			// indianMedical--interface parent
			
			//fortisHospital --- child class 
			
			//testHospital ---caller class
			
	public void entServices();
	public void pediaServices();
	public void dermaServices();
	
	// common method

	public void emergencyServices();
	
	

}
