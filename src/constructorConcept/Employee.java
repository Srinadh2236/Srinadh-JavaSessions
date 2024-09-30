package constructorConcept;

public class Employee {

	String name;
	int age;
	double sal;
	char gen;
	String dob;
	boolean isperm;

	// Constructor name will be same as the class name -- function name anything
	// its look like a funtion but not function
	// bcz of it cant be return anything -- there is no return type --- both function can return may maynot retrun based on void return type or business logic
	// avoid writing business logics ---we can wright logics
	// main purpose of constructor unnesarary not allowing to create objects
	// cons.. is used to intaillze the values(instance varia) by using this keyword
	// cons.. its can be overload -- function also overloaded 
	// cons.. it will call automaticaly when we create object for the class. --but function will called using object reference obj.m1() like this we can call. 
	
	// interview question
	// constructor vs function
//	
//	public void Employee() { // this function because of void is there we should not create with class name for function 
//		
//	}
//	
//	public Employee() { // 0 param  defualt cons...
//		System.out.println("Default constructor....");
//	}
//	
//	public Employee( int a) {// 1 param cons...
//		System.out.println("1 param cons.... " + a);
//	}
//	
//	public Employee( double a) {// 1 param cons...
//		System.out.println("1 param cons.... " + a);
//	}

	public Employee(String name, int age) {// local variables assign to the global variables by using the this keyword
		// Gobal=Local
		this.name = name; // global.name = local.name
		this.age = age; // global.age =local.age
	}

	public Employee(String name, int age, char gen, boolean isperm) {

		this.name = name;
		this.age = age;
		this.gen = gen;
		this.isperm = isperm;
	}

	public Employee(String name, int age, double sal,char gen,String dob, boolean isperm) {

		this.name = name;
		this.age = age;
		this.sal=sal;
		this.gen = gen;
		this.dob=dob;
		this.isperm = isperm;
	}
	public Employee(String name, int age, double sal, char gen, String dob) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.gen = gen;
		this.dob = dob;
	}
	public static void main(String[] args) {

		// Employee obj= new Employee();
		// Employee obj= new Employee(10); // 2nd cons calling
		// Employee obj= new Employee(10.122);

		Employee e1 = new Employee("Alice", 30);// new employee having only two details name and age

		System.out.println(e1.name + " " + e1.age + " " + e1.sal + " " + e1.gen + " " + e1.dob + " " + e1.isperm);

		Employee e2 = new Employee("kite", 27, 'm', true);// here we are having name age gen isperm
		System.out.println(e2.name + " " + e2.age + " " + e2.sal + " " + e2.gen + " " + e2.dob + " " + e2.isperm);

		// one more employee having all details
		Employee e3 = new Employee("upstock",33,25.55,'m',"01-01-2021",true);
		System.out.println(e3.name + " " + e3.age + " " + e3.sal + " " + e3.gen + " " + e3.dob + " " + e3.isperm);

		//here when we try to create  object it restrict the object lets try
		
		//Employee e4 = new Employee(); // because of there is no default constructor with zero parameter 
		// so it will restrict the e4 object creation
		// 3 format constructor created 
			//1.when we have name and age 
			//2.name and age and gen and isperm
			//3.having all details 
		// we will use asper 
		
		// constructor shotcut --> right click-->sourse---> generate constructor using  fields click and slect respective fields
		
		// Employee e4 = new Employee(); 
		
		//Employee();  is object will go the heap memory
		// e4 object reference will go the stack memory
		// consturctor will go the class loader
	}

	

}
