 package Accmod1;

public class BMW extends car {

	public static void main(String[] args) {
		
		
		// same package accmod1 but sub class it mean child class.
		
		// trying to access the car properties. 
		
		BMW b = new BMW();
		
		b.name="Brezza"; // i can access all but except private
		b.color="blue";
		b.price=15;
		//b.chasis  its we cant access the because it is in private  
		
		// same package with subclass it mean child is BMW and parent is car 
		
		b.m1Default();
		b.m2Public();
		b.m3Protected();
		//b.m4pub      // private we cant access in same package with subclass 
		
	}

}
