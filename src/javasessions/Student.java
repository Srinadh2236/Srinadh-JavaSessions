package javasessions;

public class Student {

	// Write a function
	// create a function: getStudentMarks(name) //given studnet name give the marks
	// student name
	// return marks(int)
	public int getStudentMarks(String name) { //  by using if statement
		System.out.println("Studnet name is :" + name);
//		if (name.equals("Naveen")) { //here lower case and spaces missing so we use .trim().lower case also  and equals is ignore case
//			return 90;
//		}
		
		if (name.trim().equalsIgnoreCase("Naveen")) {
			return 90;

		} else if (name.trim().equalsIgnoreCase("Revi")) {
			return 80;
		} else if (name.trim().equalsIgnoreCase("pooja")) {
			return 76;

		} else {
			System.out.println("Please pass valid name.... " + name);
			return -1;
		}

	}

	public int getStudentMarksList(String name) {// by using switch case
		//int mk =0;
		switch (name.toLowerCase().trim()) {
		case "Naveen": {
			System.out.println("Student name is: " + name);
			//return 99;
			mk=99;
		}
		case "Tom": {
			System.out.println("Student name is: " + name);
			//return 88;
		}
		case "Alice": {
			System.out.println("Student name is: " + name);
			return 77;
		}

		default: {
			System.out.println(" Please pass the valid stundet name...." + name);
			return -1;
		}

		}

	}

	public static void main(String[] args) {

		Student obj = new Student();
		
		int marks = obj.getStudentMarks("revi");
		System.out.println("marks: " + marks);

		if (marks > 0) {
			System.out.println("Print the marks sheet");
		}
		
		String n = "Alice";
		int c = obj.getStudentMarksList(n);
		System.out.println(n + " marks : " + c);

		if (marks > 0) {
			System.out.println("Print the marks sheet");
		}

	}

}
