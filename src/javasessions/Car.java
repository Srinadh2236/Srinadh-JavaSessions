package javasessions;

public class Car {

	String name;
	int price;
	String modelnumber;
	static int wheels;
	
	
	
	public static void main(String[] args) {
	
		Car c1=new Car();
		c1.name="BMW";
		c1.price=90;
		c1.modelnumber="x3";//object only hold non static properties
		//c1.wheels=4; // this is  static property
		
		Car c2=new Car();
		c2.name="Audi";
		c2.price=60;
		c2.modelnumber="Q3";
		//c2.wheels=4;
		
		Car c3=new Car();
		c3.name="Honda";
		c3.price=20;
		c3.modelnumber="Civic";
		//c3.wheels=4; 
		
		
		

	}

}
