package javasessions;

public class Static_Final {

	String name;
	int age;
	static  Double sal;// 
	char gender;
	static final int wheels=4; // when we user static for class variables it wnt create object in class variablle (only name age gender in object)
	
	public static void main(String[] args) {
		
		Static_Final sf =new Static_Final();
		sf.name="naveen";
		sf.age=30;
		Static_Final.sal=90.0;
		sf.gender='m';
		//Static_Final.wheels=5;
		
		System.out.println(Static_Final.wheels);
		
		//Static_Final().wheels only we can call in any object these are fixed values 
		
		//static final int wheels=4; // final are we cant manipulate values in middle oder code.

	}

}
