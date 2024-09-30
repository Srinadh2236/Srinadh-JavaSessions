package EncapsulationConcept;

public class employee {

	private String name;
	private int age;
	private double sal;
	private boolean isperm;
	
	private void m1() {
		
	 System.out.println("Name");
	 
	}
	
	private void  m2() {
	
		System.out.println("m2 method");
		
	}
	
	private void m3() {
	
		System.out.println("m3 method");
		
		
	}
	
	public void t1() {
	System.out.println("T1 method calling");
	m1();
	m2();
	m3();
	
	}
	
	}


