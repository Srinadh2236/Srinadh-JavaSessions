package EncapsulationConcept;

public class Customer {

	private String name;
	private int age;

	public void getCust(String name, int age) {
		System.out.println("Get cust method");
		this.name = name;
		this.age = age;
		
		
		getDetail();// private void getDetail method called.
		//getSum(20, 30); //// private int getsum method called 
		int i=getSum(20, 30); // method is returning the value so stored in int i .
		System.out.println("getsum return value is:"+i);
		getString("naveen@gmail.com", "naveen@123");

	}

	private void getDetail() {

		System.out.println("Getdetails method");
	}

	private int getSum(int a, int b) {
		int c = a + b;
		System.out.println("sum of a and b is :" + c);
		return c;

	}

	private void getString(String username, String password) {

		System.out.println("username :" + username + " " + "password :" + password);

	}

}
