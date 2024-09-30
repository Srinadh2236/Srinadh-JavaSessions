package ThrowKeyword;

public class amazon {
	
	//throws: exception throws to from one method to another method.
	
	//what is a throw: manually i want to throw an exception "user defined exceptions"  to exit the exception from there . it means next line code will not run or not executed.
		 //ex: if in case file is missing i dnt want to run nxt lines of code . at that time we will use throw exception.
	
	
	public void login() {
		System.out.println("logged in ");
		addtoCart();
	}
	
	public void addtoCart()
	{
		System.out.println("added to the cart");
		try {
		doPayment(); // exception throws here to the caller method from dopayment
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(" arth exception comming");
			
		}
	}
	
	//this method handling the 3rd party app .and it throwing error arithmetic exception error .
	public void doPayment() throws ArithmeticException { // actually exception comming this method but it throws exception to the another method.
		
		int c =9/0;
	}

	public static void main(String[] args) {
		
		amazon an = new amazon();
		an.login();
		
		System.out.println("bye!!!");
		
	}

}
