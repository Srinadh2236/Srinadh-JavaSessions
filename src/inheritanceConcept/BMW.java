package inheritanceConcept;

public class BMW extends Car {
	
	//BMW is child class or sub-class
	//Car is parent class or super class
	
	//Method overridding:poly+ morphism (run time )
	// a method in parent and child having same
	//with same name 
	//with same parameters
	// with the sequence of parameters
	//business logic doent matter
	//with same return type
	
	
	//static methods cant be overridden but overloading is allowed 
	
	int speed =200;
	
	@Override
	public void start() {
		System.out.println("BMW -child-- start");
	}
	
	public void autoParking() {
		System.out.println("BMW --child-- autoParking");
	}
	
	@Override
	public void applyBreak() {
		System.out.println("BMW --child--applyBreak");
		}
	
	
	// method hiding  -- parent and child exact having same static method is called method hiding
	public static void billing() { // static method cant be overridden ,  its called method hiding
		System.out.println("BMW --child-- billing");
	}
	
	
	private void getInfo() { // private method cant be overridden 
		
		System.out.println("BMW --child--getInfo");
	}
	
	
	public void loading() {
		
		// BMW can't access or inheritance from the truck classs so object created : this is called: Compassion
		Truck tr =new Truck(); // it will create object and access the truck cruseControl method
		tr.cruseControl();
	}
	
//	public final void getDetail() { // cnt be overridden with final keyword
//		
//		System.out.println("Car ----parent---getDetails");
//	}
	
	
	//*** use case of final method is company logo cant be overridden and headers and footers also these are final 
	
	
	
	
}
