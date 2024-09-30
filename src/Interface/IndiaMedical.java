package Interface;

public interface IndiaMedical extends WHO {
	// who is parent interface for us,uk,indian
	
			//USMedical --interface parent
			// UKMedical---interface parent
			// indianMedical--interface parent
			
			//fortisHospital --- child class 
			
			//testHospital ---caller class
			
	
	public void cardioServices();
	public void orthoServices();
	public void nuroServices();
	
	// common method
	public void emergencyServices();

}
