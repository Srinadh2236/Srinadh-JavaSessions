package ExceptionHandling;

public class exceptionHandle {
	
	
	public  void m1() {
		System.out.println("m1 method calling..");
		m2();
	}
	public void m2() {
		System.out.println("m2 method calling...");
		m1();
	}
	
	public int add(int a, int b) {
		int c =a/b;
		
		return c;
	}

	public static void main(String[] args) {
		
		exceptionHandle eh =new exceptionHandle();
		
		try {
		eh.m1();
		}
		catch(StackOverflowError e) {
			System.out.println("stack over flow error...");
			e.printStackTrace();
		}
		catch(Throwable e) {
			System.out.println("stack over flow error...");
			e.printStackTrace();
		}
		
		System.out.println("next line ececuting");
		
		System.out.println("hi");
		
		System.out.println("bye");
		
		//-------------------
		try {
		System.out.println(eh.add(10, 0));// here calling method and while passing the error in valid data by in case passing wrong values and i dnt want stop at error and i need to expection the error and after that excecute the next line also
		
		}
		catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException error is coming");
			e.printStackTrace();
		}
		
		System.out.println("handled .. the error");
		
		System.out.println("arithm....");
		
	}

}
