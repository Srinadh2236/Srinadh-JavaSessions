package Assignments;

public class personEncap {

	private String name;
	private int age;
	private String gender;

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {

		this.gender = gender;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public void printInfo(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	public static void main(String[] args) {

		personEncap pe = new personEncap();
		pe.printInfo("Naveen", 30, "Male");

		System.out.println(pe.getName() + " " + pe.getAge() + " " + pe.getGender());
		//manipulated by using setter
		pe.setName("Alice");
		pe.setAge(35);
		pe.setGender("Female");

		System.out.println(pe.getName() + " " + pe.getAge() + " " + pe.getGender());
		
		personEncap pe1 = new personEncap();
		pe1.printInfo("Naveen", 33, "Male");

		System.out.println(pe1.getName() + " " + pe1.getAge() + " " + pe1.getGender());

		
		
	}

}
