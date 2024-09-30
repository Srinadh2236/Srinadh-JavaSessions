package SuperKeyword;

public class car extends Vehicle {
	
	int speed =100;
	
	public car() {
		System.out.println("car --- default ---const...");
	}
	public car(int a) {
		System.out.println("car ---const..."+ a);
	}
	public car(int a, int b) {
		System.out.println("car ---const..."+ (a+b));
	}
	
	public void start() {
		System.out.println("car --- start");
	}

	public void stop() {
		System.out.println("car ----- stop");
		
	}
	
	public static void testing() {
		System.out.println(" car --- testing ");
	}
}
