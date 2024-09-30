package inheritanceConcept;

//public final class Car { //if we keep final in class it cant be inherited and cant be parent  logo and footers
public class Car extends Vehicle{
	
	//What is top casting:or up casting
	
	// it can acccess only Overridden and inheritend only it can't access child individual methods.
	
	
	
	
	
	int speed =100;
	public void start() {
		System.out.println("Car- parent- Start");
	}
	public void stop() {
		System.out.println("Car--parent-Stop");
	}
	public  void refuel() {
		System.out.println("Car--parent--refueal");
	}
	
	
	
		public void applyBreak() {
		System.out.println("Car --parent--applyBreak");
		}
	
	
	// static method  -- methodhiddind in both parent and child have exact same methods is called methodhidding
	public static void billing() {
		System.out.println("Car --parent-- billing");
	}
	
	
	///---------------
	private void getInfo() { //
		
		System.out.println("Car --parent--getInfo");
	}
	
	public void getCarInfo() { // its encapsulation private and public 
		getInfo();
	}
	//--------------------
	
	// no body cant overridden  in any child so we will keep with final keyword in parent class
	
	public final void getDetail() {
		
		System.out.println("Car ----parent---getDetails");
	}
	
	///Top casting
	
	

	
	
	
}
