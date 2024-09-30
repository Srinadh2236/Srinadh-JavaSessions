package Assignments;

public class pub {

	public static void main(String[] args) {
		
		//throwable,exception,arithmeticException.
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			
		int c =9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Ae is comming");
		}
		
		finally {
			//System.exit(1);
			System.out.println("iam finally block");
		}
		System.out.println("bye");
		
		
		
	}

}
