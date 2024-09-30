package Interface;

public interface germany extends parentInterface {
	
	
	
	//germany interface parent
	//hospital is class child
	//test class is called id with main method
	 // static and final nature lets find out
	int examFee =555;
	
	public void germanMedical();
	
	
	//private  methods cant be created interfaces 
	
		//even if we have public non static methods there is no method body right we cant call .
	
	//private void germanResults();


	//in java after 1.8 jdk we can create with body in static way 
	
	// we want to over ride in static that is called as method hiding
	public static void germanOrtho() {
	System.out.println("GermanOrtho");
	}
	
	// in default way also we can create method body
	
	default void germanNuro() {
		
		System.out.println("Gemnam---Nuro__default");
	}
	
	
	
}
