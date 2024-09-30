package SuperKeyword;

public class Audi extends car {
	
	
	public Audi() {// we are calling parent const...by using 
		super();// it will call parent default const,,,
		System.out.println("Audi --- default ---const...");
	   // super();// we cant call const... second statement it always first statement.  and we can call one parent const.. only
		//super(10);// we cant call more than one parent constructor..and that is the first statement.always..
	}
	public Audi(int a) {
		super(100);// it will call parent 1 param consta,,,
		System.out.println("Audi ---const..."+ a);
	}
	public Audi(int a, int b) {
		super(10,20);
		System.out.println("Audi ---const..."+ (a+b));
		System.out.println(super.speed);// parent speed 100
		super.start();
		//super.testing();// no prblm with static method child from parent but static methods and variable are always call with class name it good see while codding
		car.testing();// by seening it self we can identified as static method it is class.method
	}

	public void billing() {
		//super(10);// we cant call const.. with in methods ..
					//Constructor call must be the first statement in a constructor
		
	}
}
