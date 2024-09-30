package javasessions;

public class MethodChaing {
	
	public void m1() {// actually for non static need to create object but all are in obj so no need create object they can talk each other
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() { // m3 wants to call static t1()
		System.out.println("m3 method");
		MethodChaing.t1();
	}
	public void m4() {
		System.out.println("Bye m4 method");
	}
	public static void t1() {
		System.out.println("t1 method");
		MethodChaing.t2();
	
	}
	
	public static void t2() {
		System.out.println("t2 method");
		MethodChaing.t3();
	}
	public static void t3() { // want to call m4 non static method so need to create one more object static to non static
		System.out.println("t3 method");
		MethodChaing obj1 = new MethodChaing();
		obj1.m4();
	}
	
	//non static method - non static method  : calling  directly  m1(); m2(); like
	//static method --static method : direct or /by using class name MethodChaing.t1(); MethodChaing.t2(); like wise we call 
	//non static method--- static method: direct/class name
	//static method --- non static method // create object and then call it
	
	//NS--NS : calling directly (no object required )
	//s---s : directly/class name
	//NS--s : directly/class name
	//s--NS :create object and then call it
	public static void main(String[] args) {
		
		MethodChaing obj =new MethodChaing();
		obj.m1();
		
		MethodChaing.t1();
		
	}

}
