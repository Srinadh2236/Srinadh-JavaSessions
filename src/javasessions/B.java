package javasessions;

public class B {

	public static void main(String[] args) {
		System.out.println("B-- method");
		// what if we again calling A method from B method ,  A calling B and B calling A , it will call stack memory cross untill ,
		//once stack memory full error will come stack over flow error message. 
		A.main(args);

	}

}
