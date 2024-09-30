package javasessions;

public class StaticMethodsCalling {
	
	public void getNumbers() {
		System.out.println("Non Static Method calling");
	}
//	public  static void getNumbers() { //duplicate  method even if we have static or non static 
//		System.out.println("Non Static Method calling");
//	}

	public static void getNumberStstic() {
		System.out.println("Static method calling");
		
	}
	public static void main(String[] args) {
		
		//calling static methods
		//by using class name  getNumberStstic is class name
		
		StaticMethodsCalling.getNumberStstic();

		//or calling directly
		getNumberStstic();
		
		// how to call non static method
		
		StaticMethodsCalling obj =new StaticMethodsCalling();
		
		obj.getNumbers();
		 // we
		obj.getNumberStstic(); // but warking this not correct way to call by using class name only we can call that the good way
		
		
		
	}

}
