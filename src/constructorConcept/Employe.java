package constructorConcept;

public class Employe {

	// const.. will be same as the function but const.. name is with class name
	// only..
	// const...cant return anything it is non void type . there is no use to create
	// business logics in const..
	// const.. it can be overload
	//// Usually main method default const.. with zero parameters...
	// const.. look like same as the function but not function.
	// here main useage of const... is to restrict object unnecessary

	// simple way of creation of constructor is right click--->Source---> Generate
	// constructor using fields..

	// interview question
	// constructor vs function
	// could be name anything
	// function may or may not return
	// function have business logics
	// can be also overaloaded
	// using the object name or static with class name
	// we are not calling any const,,, by creating the object it self constuctor
	// calling
	// const,, cant be static are not allowed
	// const... will go the class loader...

//	public void Employe() { // what is this . this is function because of void is there but ugly code because write with class name .

//		
//	}
//	

//	public Employe() {
//		
//		System.out.println("Default const...");
//	}

//	public Employe(int a) {
//		
//		System.out.println("1 param ...."+a);
//	}
//	public Employe(String Name) { // it allow only object creation name only.
//		
//		System.out.println("1 param ...."+Name);
//	}
//	public  Employe( int a,int b)	{// 2 param and it will only two ints to add only
//		
//		System.out.println("sum of a and b is :"+(a+b));
//		
//	}
//	
	String name;
	int age;
	double sal;
	char gen;
	boolean isperm;
	static String company = "IBM";

	public Employe(String name, int age) {// name and age both are local variables so name="Naveen" age=30 still yet
											// assigned to global variable use this key word to assign

		// Global =local

		this.name = name;
		this.age = age;

		// no need to use this key word for static variables becaue its common for all
		// we cann print directly with clas name

		// System.out.println(Employe.company);

	}

	public Employe(String name, double sal, boolean isperm) {

		this.name = name;
		this.sal = sal;
		this.isperm = true;

	}

	public Employe(String name, int age, char gen, double sal, boolean isperm) { // i have all details

		this.name = name;
		this.sal = sal;
		this.isperm = true;
		this.age = age;
		this.gen = gen;

	}

	//

	public static void main(String[] args) {

		// Employe e1= new Employe();
		// e1.Employe();// Normally we call e1.method name but here by default call
		// default const.. with zero param..

//		Employe e1= new Employe(555);// jvm will check which const,,, having 1 param.. int 
//		
//		Employe e2 = new Employe("Naveen");// 
//		
//		Employe e3 = new Employe(10,20); 
//	

		// if employe having only name and age use this const....
		Employe c1 = new Employe("Naveen", 30);// it pass the values to the const,.. variable not to the global variable
												// for that we need to use "this" keyword

		System.out.println(c1.name + " " + c1.age);
		// if employe having some name and sal and ispem use this const....

		Employe c2 = new Employe("Alice", 80000, true);
		System.out.println(c2.name + " " + c2.sal + " " + c2.isperm);

		// if employee having all details so use 3 const....
		Employe c3 = new Employe("Upstock", 30, 'M', 8000, true);
		System.out.println(c3.name + " " + c3.age + " " + c3.gen + " " + c3.sal + " " + c3.isperm);
	}

}
