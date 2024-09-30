package Interface;

public interface USMedical extends WHO{
	
	
	
	// who is parent interface for us,uk,indian
	
			//USMedical --interface parent
			// UKMedical---interface parent
			// indianMedical--interface parent
			
			//fortisHospital --- child class 
			
			//testHospital ---caller class
			
	
	//-----------------------------------------------
	
	
	
	//interface there is no method body:abstract method
	
	//i can't create object of interface :
		// assume that in case we are created one object for one interface for that reference we are calling but there is no method body there is no use right...
	// and cnt create constructor also
	
// interface varible are  by default static and final nature
	int  Fee =10;
	
	public void physioServices();
	public void oncologyServices();
	public void dentalServices();
	
	//private non static method :abstact?: not allowed 
	
	//private void freeMedical();
	
	//public final void medicalResults();
	
	
	// common method
	public void emergencyServices();
	
	
	// can i have a method body ?: yes
	//after JDK 1.8
	 	// can we have method body but static method
	
	public static void billing() {
		
	System.out.println("Us-medical billing");	
	}
	
	
	// can we have non static method  body but it should be written with "default" keyword.
	
	default void medicaInsurance() {
		System.out.println("Us-default method--medical insurance");
	}
	
	

	
	
	
	
}
