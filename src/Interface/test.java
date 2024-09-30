package Interface;

public class test {

	public static void main(String[] args) {
		

		//germany interface parent
		//hospital is class child
		//test class is called id with main method
		
		
		Hospital hs = new Hospital();
		hs.germanMedical();
		
		// static method : method hiding
		Hospital.germanOrtho();
		
		// default
		
		hs.germanNuro();
		
		
		
		// german parent is parentInterface
		
		hs.parentMedical();
		
		// we are calling with interface name 
		System.out.println(germany.examFee);
		System.out.println(Hospital.examFee);
		
	
		// it is in final nature we cant manipulate
		
		//germany.examFee=444;
		
		// static mehtodL: calling
		germany.germanOrtho();
		
	// top casting 
		
		germany g1 = new  Hospital();
		
		g1.germanMedical();
		g1.germanNuro();
		
	// down casting not allowed in interfaces
		
		
	}

}
