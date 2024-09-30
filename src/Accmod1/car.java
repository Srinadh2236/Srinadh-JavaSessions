package Accmod1;

public class car {
	
	// *** image downloaded in desktop  in JAVA folder. as a access modifier .***//
	
	// public we can access any were .
	//private we can access only with in the class.
	//protected we can access with in class and same package with subclass and diff package with subclass
				// only we cant access differnt package with non sub class.
	// default  we cann access with in class and same package with subclass and same packge with non subclass also we access
				// but we cant access diff package with sub class and diff package with non sub classs.
	
	
	//simple way 
				// public we can access any were
				// private we can acces only with in class .
				// protected we cann access any were but diff pack with non sub class will not access
				// default we can access only with in same package only.
	
	String name; // Default access modifier 
	public  int price;
	protected String color;
	private String chasis;

	
			void m1Default() {
		System.out.println(" m1Default method");
	}
	 public void m2Public() {
		 System.out.println("m2Public method");
	 }
	 protected void m3Protected () {
		 System.out.println("m3Protected method");
	 }
	 private void m4Private() {
		 System.out.println("m4Private method");
	 }
	
	 
	 //let try 
	 
	 protected car() {
		 
	 }

	public static void main(String[] args) {
		
		// default ,public , private, protected  
			
		//with in the same class. we can access .
		car c = new car();
		
		c.name="Brezza"; // so here iam able to access all access modifier public private protected and default.
		c.price=15;
		c.color="blue";
		c.chasis="765";
		
		// with in same class calling all methods
		
		c.m1Default();
		c.m2Public();
		c.m3Protected();
		c.m4Private(); // i can access only with in the same class. for private variables and methods also.
		
		
		
		
		
	}

}
