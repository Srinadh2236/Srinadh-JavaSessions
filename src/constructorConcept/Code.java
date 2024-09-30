package constructorConcept;

import java.util.Arrays;

public class Code {

	String name;
	int age;
	static String company;

	public void m1() {

		System.out.println("m1 method");
		// t1();

		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");

	}

	public static void t1() {
		System.out.println(" t1 static method");
		t2();
	}

	public static void t2() {

		System.out.println(" t2 static methos");

		Code obj = new Code();
		obj.m1();
	}
	
	public boolean browser(String name) {
		
		
		boolean flag=true;
		
		switch (name.toLowerCase().trim()) {
		case "chrome":
		{
			System.out.println("Chrome launched");
			break;
		}
			
		case "firefox":
		{
			System.out.println("Firefox launched");
			break;
		}
			
		case "safai":
		{
			System.out.println("Safari launched");
			break;
		}
			
		case "opera":
		{
			System.out.println("Opera launched");
		
			break;
			}
			
		default:
		{
			System.out.println("Please pass the valid browser: "+name);
			flag=false;
			break;
		}
		
		
		}
		return flag;
	}

	public static void main(String[] args) {

		// Code.t1();
		
		
		Code obj =new Code();
		boolean flg=obj.browser("Chrome");
		System.out.println(flg);
		
		if (flg=true) {
			System.out.println("browser launched");
		}
		
				
	}
}
