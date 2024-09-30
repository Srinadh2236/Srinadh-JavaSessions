package ThrowKeyword;

public class Browser {

	// mainly i don't want stop the code at middle and continue to execute the nxt after exception at that time we use to catch the exceptions with thre TRY CATCH blocks
	// ***
	// throws not handling the exceptions it throws the exceptions passing from one
	// method to another caller method.
	// only try and catch block will handle the exceptions.

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() throws ArithmeticException {// this method also throwing the exception to an other method m1();
		System.out.println("m2 method");
		m3();
	}

	public void m3() throws ArithmeticException {// best way exception handling in m3() method line 19.
		System.out.println("m3 method");
		try {
			int x = 9 / 0; // actually exception throws line 15 but i dont want to handle im troughing to
							// and another method to m2();
		} catch (Exception e) {
			System.out.println("ArithmeticException comming");
		}
	}

	// example amazon

	public void login() {
		System.out.println("Login method");
		search();
	}

	public void search() {
		System.out.println("Search the products");
		cart();
	}

	public void cart() { // exception will handle here. at line 35.
		System.out.println("cart method");
		try {
		bankPayment(); // this method responsibility to handle the exception. if bankPayment method 3rd
		}// party any other imp methods.
	catch(ArithmeticException e) {
		System.out.println("ArithmeticException is comming move to my nxt code is bye ");
	}
	}

	// coming from some third party system.HDFC application payment.
	// ***
	// actually exception coming from bank side we wnt to change in there
	// apllication methods we just throws the error to an other method whos calling
	// the bankmethod.
	// cart is calling exception throws to the cart method .

	// any 3rd party applications and we dnt want touch some particular methods at time( 3 year old code)
	// we use to throws the exception from method. to our caller method
	// and identification purpose also.
	public void bankPayment() throws ArithmeticException {
		System.out.println("bankPayment method.");
		int c = 9 / 0;
	}

	// caller method:used to call methods we should never add TRY CATCH blocks in
	// main method.
	public static void main(String[] args) {

		Browser br = new Browser();
		br.m1();
		// who will throw the exception

		// example amazon
		br.login();

		System.out.println("bye!!!");
	}

}
