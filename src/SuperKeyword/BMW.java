package SuperKeyword;

public class BMW extends car {
 int speed =300;
	@Override
	public void start() {
		System.out.println("BMW --- start");
		super.start();// parent overridden method calling to implement overridden method in child class
		// start();// it will call with in the class methods and it will stack overflow or recursion (Loop)
		super.stop();// non overridden methods also we can call with super keyword.
		
		System.out.println("speed: "+speed);
		System.out.println("speed : "+ super.speed);// immediate parent method or variable can access with super keyword.
	}

	public void autoStart() {
		System.out.println("BMW ----autostart");
	}
	
}
