package javasessions;

public class A {

	public static void main(String[] args) {
		
		System.out.println(" A--- method");
		// i want  to call B class main method
		// main method in static so we defently use class name .
		// className.main();
		
		B.main(args);
		
	}

}
