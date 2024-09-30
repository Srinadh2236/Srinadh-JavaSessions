package inheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		
		// what is main use of inheritance is reusebility 
		// caller class method or 
		
		BMW b = new BMW();
		
		//overridden method is start();
		b.start();// start(); method is child class method  and parent class having same method priority from child class only. 
		
		//inherited stop and refuel
		b.stop();// b is ref for BMW  and in this there is no stop method so its taking from parent class b.stop(); method is inheritance from car parent class
		b.refuel();// refuel also taking from parent class
		
		// Individual method 
		b.autoParking();
		
		// static method so calling with class name
		BMW.billing(); 
		
		// variable calling from parent  int speed =100;
		System.out.println("BMW speed :"+b.speed);
		
		// vehicle engine method calling
		
		b.engine();
		
		
		
	//----------------------------------------
		
		System.out.println("-------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		//c.auto is not allowing access from child... this is reverse inheritance 
		
		//static method 
		Car.billing();
	
		// private method cnt be overridden
		
		
		System.out.println("Car speed :"+c.speed);

		// vehicle method calling
		
		c.engine();
		
		
		///====================================
		
		// top casting
		
		
		
		Car c1 = new BMW();

	c1.start(); // this is Overridden method
	c1.stop();  // this is inherited 
	c1.refuel();// this is inherited 
	//c1.autoparking.. ./// it cant be acccess individuals 
	
	
	
		///-------------------
		
		Audi au = new Audi();
		
		au.start();
		au.stop();
		au.refuel();
		au.theftSafety();
		
		
		//au.autoparking() // methhod cant be availbe  child cnt access there own methods cnt be inheritance from each  other 
	}

}
