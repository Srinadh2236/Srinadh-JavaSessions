package Assignments;

public class myClass {
	public int num;
	
	
	public myClass(int a) {
		//this();// calling default const.. with no parameter
		setvalue(a);// calling setter for this const...
	
	}
	public myClass() {
		
		System.out.println("no argument constructor");
		
	}
	
	public void setvalue(int num) {
		this.num=num; 
	}
	
	public int getvalue() {
		return num;
	}
	
	public static void main(String[] args) {
		
		myClass mc =new myClass(10);
		
		System.out.println("value :"+mc.getvalue());
		
		myClass mc1 = new myClass(20);
		
		System.out.println("value :"+mc1.getvalue());
		
	}

}
