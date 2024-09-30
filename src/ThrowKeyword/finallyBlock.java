package ThrowKeyword;

public class finallyBlock {

	public static void main(String[] args) {
		// try{}
		// catch(){}
		// finally{}

		System.out.println("A");
		System.out.println("A");

		try {
			int c = 9 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println("AE is comming...");
		}
			catch (Throwable e) {
				System.out.println("AE is comming...");
		} finally {
			System.out.println("i'm in finally block..");
		}

		try {
			int c = 9 / 3;
		} catch (ArithmeticException e) {
			System.out.println("AE is comming...");
		} finally {
			System.out.println("i'm in finally block..");
		}
	
		
		
		// it is possible try alwways looking for finally block
		try {
			int c = 9 / 3;
		} 
		finally {
			System.out.println("i'm in finally block..");
		}
	
		try {
			int c = 9 / 0; // exception throwing but we are not catching .. finally block execute with or with out catch block.
		} 
		finally {
			System.out.println("i'm in finally block..");
		}
	
	
		
	}

}
