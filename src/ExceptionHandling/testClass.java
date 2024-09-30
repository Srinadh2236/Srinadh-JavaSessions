package ExceptionHandling;

import ThrowKeyword.myExceptions;

public class testClass {

	public static int getStudentMarks(String name) {

		System.out.println("get stundent marks :"+name);
		
		if (name.equals("Naveen")) {
			return 100;
		}
		else if(name.equals("Alice")) {
			return 90;
			
		}
		else if (name.equals("tom")) {
			return 80;
			
		}
		else {
			System.out.println("please pass the correct student name:"+name);
			return -1;
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws Throwable {
		
		
		int c=testClass.getStudentMarks("Naveen");
		
		System.out.println("marks: "+c);
		String Browser = "fe";
		
		switch (Browser) {
		case "chrome":
			System.out.println("chrome launch");
			break;
		case "firefox":
			System.out.println("firefox launch");
			break;
		case "safari":
			System.out.println("safari launch");
			break;
		case "ie":
			System.out.println("ie launch");
			break;
		default:
			System.out.println("please pass the right browser "+ Browser);
			
			//throw new myExceptions("===================Wrong browser=========");
			
			throw new Throwable("=========Wrong browser==========");
			
		}
		
		System.out.println("launch url");
		System.out.println("login to app");
		System.out.println("shop a product");
		System.out.println("close browser");
		
	}

}
