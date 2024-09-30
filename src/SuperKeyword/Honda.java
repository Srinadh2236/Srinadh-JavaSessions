package SuperKeyword;

public class Honda extends car {
	
	public Honda() {
		this(10);//this keyword always be first statement and we can use as to call with in class constructors.
		System.out.println("Honda --- default ---const...");
	}
	public Honda(int a) {	
		this(10, 20);
		System.out.println("Honda ---const..."+ a);
	}
	public Honda(int a, int b) {
		System.out.println("Honda ---const..."+ (a+b));
	}

	
	// this : this use to intializtion for global variables= local variables
		// 1. always be first statement this();
		// 2. to use call with in class
		// 3.super and this cant be together  at same time we can use only one in const,..
		//4.this cant be called with in same const... looping getting error
		//5.at line 6 it check first parent having default const... and then it will comes into child const...
	//6. parent const.. and then go to line 6: will go to the line 9: agin this(10,20) go to the line 14 it will print 
	
	
	// super : 1. to call parent variables and methods from child class
			//	2.it should be always first  statement
			//3.it is used to called overridden and parent individual methods also
			//4.it will call only immediate parent methods and vairable
			//5. super key word only applicable for child and parent  because calling parent methods and variables
			//6.recursive cant be allowed.
	//****	//7.we can return this keyword from  methods/functions :builder pattern.. 
			//
			//8. we can't call parent  interface variables  from child class with super keyword : not allowed.
			
			// super.methods
			// super(10); //const...
	
	
}
