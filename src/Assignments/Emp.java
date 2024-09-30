package Assignments;

public class Emp {

	private String name;
	private int id;
	private double salary;

	public Emp(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;

	}

	public double getSalary() {
		return salary;

	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}

	public static void main(String[] args) {

		Emp e = new Emp("Naveen", 101, 20);

		System.out.println("Employee Information");
		System.out.println("ID: "+ e.getName() );
		System.out.println("NAME :"+e.getId());
		System.out.println("Salary :"+e.getSalary());
		
		// 10% raised salary
		
		double raisedPercent=0.10;	 // intilizatiin
		double newAmount =e.getSalary()*raisedPercent; 
		
		double newSal=e.getSalary()+newAmount;// old + new raised salary
		
		//System.out.println("New sal :"+newSal);
		
		e.setSalary(newSal);// setting new salary in object level
		
		System.out.println("after 10% raised new salary :$" +e.getSalary());
	}

}
