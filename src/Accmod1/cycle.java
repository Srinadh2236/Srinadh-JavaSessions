package Accmod1;

public class cycle {

	public static void main(String[] args) {
		
		
		// same package but non sub class it means not a child of any class .
		
		// i want access car properties 
		
		car c = new car();
		c.name="brezza";
		c.color="blue";
		c.price=15;
		//c.chasi // it cant access because in private access modifier ..it is child or not doent matter if its in private we cant access .
		
		
		
		//same package with non subclass
		
		c.m1Default();
		c.m2Public();
		c.m3Protected();
		//c.m4priva  // we can't access private methods in same package with non subclas
		
		
		
		
		
		
		
		
		
	}

}
