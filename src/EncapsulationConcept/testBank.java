package EncapsulationConcept;

public class testBank {

	public static void main(String[] args) {
		// Bank is from another class to access the private variable through from public method that is encapsulation
		
		Bank b= new Bank();
		b.setName("Naveen");
		//b.setAge(12);
		b.setAge(21);// here age is below 15 should nt allow to create bank account so goto setAge method
		b.setAadhar("51546511165615");
		b.setPhone("95165486321");
		
		if (b.getAge()>=15) {
			System.out.println("Account successfully created mentioned below details");
		//System.out.println("Name :"+b.getName()+" "+"age: "+ b.getAge()+" "+"aadhar no: "+b.getAadhar()+" "+"Phone no: "+b.getPhone()); // b id object for public methods from that we can access private variables and private methods also
		System.out.println("Name:"+b.getName());
		System.out.println("Age :"+b.getAge());
		System.out.println("aadhar no :"+b.getAadhar());
		System.out.println("Phone no: "+b.getPhone());
		}
		else
		{
			System.out.println("age is below 15 so account will not create");
		}
		
		
		
	}

}
