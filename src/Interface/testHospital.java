package Interface;

public class testHospital {

	public static void main(String[] args) {
		// who is parent interface for us,uk,indian
		
		//USMedical --interface parent
		// UKMedical---interface parent
		// indianMedical--interface parent
		
		//fortisHospital --- child class 
		
		//testHospital ---caller class
		
		
		fortisHospital fh= new fortisHospital();
		
		//
		fh.physioServices();
		fh.oncologyServices();
		fh.dentalServices();
		
		fh.entServices();
		fh.pediaServices();
		fh.dermaServices();
		
		fh.cardioServices();
		fh.orthoServices();
		fh.nuroServices();
		
		//individual methods	
		fh.medicalTraining();
		fh.pathalogyServices();
		
		
		// common method
		
		fh.emergencyServices();
		
		// default method 
		fh.medicaInsurance();
		
		System.out.println(fh.fee);
		
		//grand parent method inheritance from child
		fh.covidVaccsination();
		
		fh.medicalNews();
		
		
		fh.medicalRD();
		
		//interface object creation: no allowed
			//USMedical um=new USMedical();
		
		//top casting:child class object can be refered by parent interface ref variable
		// what are methods available in parent and child matched  methods only passed .
		
	
		USMedical us = new fortisHospital();
		
		us.dentalServices(); // reference type check passed 
		us.oncologyServices();// reference type check passed 
		us.physioServices();// reference type check passed  
		
		//us.nuroServices();// reference type check failed  in us and Fortishospital 
		
		us.emergencyServices();
		
		// down casting : not allowed
		 //fortisHospital f1 = new USMedical();
		
		
		us.medicaInsurance();
		
		// static method body 
		USMedical.billing();
		
		System.out.println(USMedical.Fee);// calling with interface USMedical.variable name 	
		
		//USMedical.Fee=100;// by default in static nature so we cant manipulate variable because of in final nature
		
		fortisHospital.billing();// method hiding
		
	}

}
