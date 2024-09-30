package javasessions;

public class IfElseConcept_5 {

	public static void main(String[] args) {
		
//		//System.out.println(10==10);
//		
//		int a = 30;
//		int b = 20;
//	
//	//1.
//		if (a>b) {
//			System.out.println("a is  greater than b ");
//		}
//		else {
//			System.out.println("b is greater than a");
//		}
//	//2.
//		if(true) {
//			System.out.println("HIII");
//		}
//		else {
//			System.out.println("BYEE");//Dead code it will never come to else part run any times
//		}
//	//3.	
//		boolean flag = true ;
//		if(flag) {
//			System.out.println("Hello");
//		}
//		else {
//			System.out.println("BYEE");
//		}
//	//4.
//		boolean isheadless = true;
//		if(isheadless) {
//			System.out.println("Run test cases in headless mode");
//		}
//		else
//		{
//			System.out.println("Run TC in normal mode");
//		}
//		
		//Nested if condition 
		
		int marks = 95;
		if (marks<=100) {
			if(marks<=90) {
				System.out.println("GRADE A");
			if (marks>=95)
			{
				System.out.println("100 scrollership");
			}
			}
		}
		else
		{
			System.out.println("Invalid marks");
		}
		
	}
}
