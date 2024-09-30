package Assignments;

public class Student {
	String name;
	int age;

	public static void main(String[] args) {
        // q1: Create two Student objects and initialize their properties.

		int totalstudents =0;
		Student s1 =new Student();
		
		s1.name="Naveen";
		s1.age=30;
		totalstudents++;
		Student s2 =new Student();
		s2.name="Tom";
		s2.age=35;
		totalstudents++;
        // q2: Print the details of each student and the total number of students.
 
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		System.out.println("Total number of students:"+ totalstudents );
        // q3: Modify the age of one student and print the updated details.

		System.out.println("----------age updated------------");
		s2.age=50;
		System.out.println(s2.name+" "+s2.age);
        // q4: Create another Student object and update the total number of students.

		System.out.println("-----New student added---------");
		Student s3 =new Student();
		
		s3.name="Alice";
		s3.age=25;
		totalstudents++;
		
		System.out.println("New Student name:"+s3.name+"," +s3.age);
		System.out.println("Updated Total number of students:"+ totalstudents );
		
		
	}

}
