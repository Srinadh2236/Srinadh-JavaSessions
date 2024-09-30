package Assignments;

public class person {
	
	
	String name;
	int age;
	char gen;
	double height;
	//constructor 
	public person(String name,int age,char gen,double height) {
		this.name=name;
		this.age=age;
		this.gen=gen;
		this.height=height;
		
		System.out.println(name +" "+age+" "+gen+" "+height);
	}
	
	
	
	public void getInfo(String name,int age) {
	
		
	}
	
	

	public static void main(String[] args) {
	
		person p =new person("Naveen", 30, 'm', 5.10);
		
		
		
	}

}
