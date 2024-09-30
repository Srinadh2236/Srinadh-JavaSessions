package javasessions;

public class TestingStack {

	public void m1() {
		System.out.println("m1 method ");
		m2();
	} //line 23
	public void m2() {
		System.out.println("m2 method ");
		m3();
		System.out.println("bye");////once completed the m2 method will go to the line 8
	}
	public void m3() {
		System.out.println("m3 method ");// once completed the m3 method will go to the line 12
	}
	
	// recursion --or recursive 
	//example
	public static void getNumber() {// its really doesn't matter static function or non static function 
		System.out.println(" Get number");
		// iam calling same function 
		getNumber(); // this stack over flow because of main function call getnumbers again inside getnumber will reapt again again. 
		
	}
	
	
	public static void main(String[] args) {

		
		TestingStack obj= new TestingStack();
		obj.m1();
		
		
		
		//----------------
		//m3 deallocate first and m2,m2 and main (stack concept LIFO last in first out)
		
		
		TestingStack.getNumber();
		
		
	}

}
