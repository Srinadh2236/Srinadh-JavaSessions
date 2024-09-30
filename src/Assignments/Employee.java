package Assignments;

public class Employee {
	String name;
	int age;
	double sal;

	public static void main(String[] args) {

		// Create three Employee objects and initialize their properties with different
		// values.
		double totalsal = 0;
		Employee e1 = new Employee();
		e1.name = "Naveen";
		e1.age = 30;
		e1.sal = 90.30;

		Employee e2 = new Employee();
		e2.name = "Mark";
		e2.age = 32;
		e2.sal = 70.70;

		Employee e3 = new Employee();
		e3.name = "Alice";
		e3.age = 35;
		e3.sal = 50.50;

		// Print the details of each employee and the total salary of all employees.

		System.out.println(e1.name + " , " + e1.age + " , " + e1.sal);
		System.out.println(e2.name + " , " + e2.age + " , " + e2.sal);
		System.out.println(e3.name + " , " + e3.age + " , " + e3.sal);

		System.out.println("Total salary of all employees LPA:" + (e1.sal + e2.sal + e3.sal));
		// Give a raise to one employee by increasing their salary, and update the total
		// salary accordingly

		e2.sal = 75.70;
		System.out.println(e2.name + " , " + e2.age + " , " + e2.sal);
		System.out.println("Total salary of all employees LPA:" + (e1.sal + e2.sal + e3.sal));

		//Create another Employee object with a different salary and update the total salary of all employees.
		
		Employee e4 = new Employee();
		e4.name = "Angle";
		e4.age = 36;
		e4.sal = 40.80;

		System.out.println("Total salary of all employees LPA:" + (e1.sal + e2.sal + e3.sal+e4.sal));

		//print the details of the new employee and the updated total salary of all employees.
		System.out.println(e4.name + " , " + e4.age + " , " + e4.sal);
		System.out.println("Total salary of all employees LPA:" + (e1.sal + e2.sal + e3.sal+e4.sal));


		
	}

}
