package Interface;

public class fortisHospital extends Medical implements USMedical,UKMedical,IndiaMedical {

	int fee =1000;
	
	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH---oncologyServices");
				
	}

	@Override
	public void dentalServices() {
		System.out.println("FH---dentalServices");
				
	}

	@Override
	public void entServices() {
	System.out.println("FH----entServices");	
	}

	@Override
	public void pediaServices() {
		System.out.println("FH----pediaServices");	
		
	}

	@Override
	public void dermaServices() {
		System.out.println("FH----dermaServices");	
		
	}

	@Override
	public void cardioServices() {
System.out.println("FH---cardioServices");		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH---orthoServices");		
		
	}

	@Override
	public void nuroServices() {
		System.out.println("FH---nuroServices");		
		
	}

	//individual methods
	public void medicalTraining() {
		
		
		System.out.println("FH--medicalTraining");
	}
	
	public void pathalogyServices() {
		
		System.out.println("FH---pathalogyServices");
	}
	
// common method
	@Override
	public void emergencyServices() {
		System.out.println("FH---emergencyServices");	
	}
	
	// static method: method hidding
	public static void billing() {
		
		System.out.println("Fh-hospital billing");	
		}
	// try to default method overriding 
	@Override
	public void medicaInsurance() {
		System.out.println("FH --default method--medical insurance");
	}

	
	// grand parent interface
	@Override
	public void covidVaccsination() {
		
		System.out.println("WHO__fh---covid vaccsination");
		
	}
	@Override
	public void medicalRD() {
		System.out.println("FH---Medical R&D");
	}
	
	
}
