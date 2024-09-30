package Abstraction;

public abstract class Page {

	
	// page is parent abstract class and login is child class
	
	// when you create constructor in child it will come to the const.. and dnt go to the in side body 
	
		// and it will check in parent constructor as a default , must .and then run the child const body executed.
	
		//1. fist parent const... and then run child const....
	
		// object creation not allowed
	//but constructor  will allow for abstract class: allowed 
	// and will call when we create object of child class it call 
	
	public Page() {
		
		System.out.println("Page constructor --- default");
	}
	
	
	
	// abstract method: no method body (if in abstract class methods must be in abstract ) for interface not mandatory 
		public abstract void title();
		public abstract void url();

	
	// non abstract method : with method body
		public void loading() {
			System.out.println("page Loading in 20sec");
		}
		// final canrt be overridden 
		public  final void dispalyLog() {
			System.out.println("MY logo.jpj");
		}
}
