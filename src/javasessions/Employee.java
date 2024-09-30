package javasessions;

public class Employee {
	
	//class:category/template/Blueprint
	//Object:physical entity
	
	
	//class variables/template variables/Global variables
	String name;
	int age;
	double sal;
	boolean ispermnt;
	char gender;
	
	public static void main(String[] args) {

		//create the object :using new keyword
		//new Employee(); This is the object /instance of the class
		//Employee : is class
		
		Employee obj =new Employee();
		System.out.println(obj.name);//by default string value is null
		System.out.println(obj.sal);// 0.0 default value for double
		System.out.println(obj.ispermnt);//for boolean default value is false 
		System.out.println(obj.gender);// for char default value is space
		//here we are assigning /defining the values
		obj.name="Naveen";
		obj.age=30;
		obj.sal=90;
		obj.ispermnt=true;
		obj.gender='m';
		
		System.out.println(obj.name+" "+obj.age+" "+obj.sal+" "+obj.ispermnt+" "+obj.gender);
		
		//here i am creating the another object ...n no of objects create under class .
		
		Employee e1 =new Employee(); // name of the object is e1  
		
		e1.name="Tom";
		e1.sal=90;
		//e1.ispermnt=true;
		//e1.gender='m';
		//System.out.println(e1.name);
		//System.out.println(e1.sal);
		//System.out.println(e1.ispermnt);
		//System.out.println(e1.gender);
		System.out.println(e1.name+" "+e1.age+" "+e1.sal+" "+e1.ispermnt+" "+e1.gender);
		e1.gender='m';// here i am updating the gender.
		System.out.println(e1.name+" "+e1.age+" "+e1.sal+" "+e1.ispermnt+" "+e1.gender);
		
		//no reference object
		new Employee();// new memory created fo this object but no reference for this
		// class all five name sal gender all variables available in employee but no reference (obj,e1) for this no
		
		// how to call object with out reference
		
		
		new Employee().name="Ravi"; // it will create new object in only name 
		
		new Employee().age=30; //// it will create another separate  object in only age
		
		
		// null pointer  object reference 
		Employee t1 = new Employee();
		t1=null;// t1 is null (earthing )
		
		t1.name="naveen";//NPE
		t1.age=30;
		System.out.println(t1.name);//null pointer exception because of t1 is null.
		
		
		// heap          |      stack 
		
		// in heap memory back to back we created objects some of the having reference some not having, some null 
		// so heap memory full my hardware is my hw instructing memory full
		
		// jvm monitoring the heap memory once its full Garbage collector will activate. which are not referanceing  and null referenced it will destroy from the heap memory
		
		
		System.gc();// calling the garbage collector .there is no gaurantee will destroying or active no reference objects JVM only the GC
		
		
		//---------------
		
		Employee p1; //local variable reference created in stack memory but not referenceing to any object.
		
		p1=new Employee(); // here new Employee is object created referencing to p1
		
		
		
	}

}