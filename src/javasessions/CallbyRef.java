package javasessions;

public class CallbyRef {

	String name;
	int age;
	public void m1( int a) {
		System.out.println(a);
	}
	
	public static void t1() {
		
		// calling m1 method is non static so actually need to create one object right.
		
		CallbyRef obj1 = new CallbyRef();
		obj1.m1(20);
	 // this how we actually calling static to non static method if we have another static method to call non static again we need to create one more objects 
	// so we will use call by reference to avoid more no of objects 
		
	}
	public static void k1( CallbyRef u1) {
		// i want to call m1()  non static method 
		// k1( CallbyRef u1)  CallbyRef is class name  u1 is any name , so (u1=obj) here object and u1 both are reference obj
		u1.m1(99);
		
	}
	
	public void m2(int a, int b) {
		int c= a+b;
		System.out.println("sum of a and b : "+c);
		// calling m1 method  
		m1(999);
		k3();
		
	}
	public static void k2( CallbyRef u2) {
		// calling m2 
		u2.m2(200, 200);
	}
	
	public static void k3() {
		System.out.println("k3");
	}
	
	public static void main(String[] args) {
		
		CallbyRef obj = new CallbyRef();
		//obj.m1(10);// here we are passing a value here so it call bye value/ or call  bye argument
		
		// calling m1 method
		
		obj.m1(10);
		
		//calling t1 method static so call by class name
		
		CallbyRef.t1();
		
		
		// calling k1 static  method  
		
		CallbyRef.k2(obj);
		
		// calling k2 static  method 
		
	}

}
