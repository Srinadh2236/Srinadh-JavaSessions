package javasessions;

public class mainMethodOverLoading {

	// JVM always checking main method
	// PSVM String array parameter
	
	//interview question 
	// why main method always static 
	// because of JVM no need to create object it can call directly (in static main method in CMA memory )
	//why void in main method 
	// because of main cannot be return anything  so  we never write any business logic. its in always void nature..
	
	
	public static void main(String a[] ) { // 1 method calling always PSVM static array

		System.out.println(a.length); // jvm supply anything length should be there ,here length is 0 not supplying blank array .
		System.out.println("Hello");
		// main(10);
		mainMethodOverLoading.main(10);
	}

	public static void main(int a) {

		System.out.println("Hi : a is " + a); // a is 10  from first main method
		// main(20,20);
		mainMethodOverLoading.main(a, 20);// a is 10
	}

	public static void main(int a, int b) {

		System.out.println("Bye sum of a and b is : " + (a + b));

	}
}
